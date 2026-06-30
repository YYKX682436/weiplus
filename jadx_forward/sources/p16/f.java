package p16;

/* loaded from: classes14.dex */
public final class f extends java.io.OutputStream {

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f432808i = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public final int f432809d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f432810e;

    /* renamed from: f, reason: collision with root package name */
    public int f432811f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f432812g;

    /* renamed from: h, reason: collision with root package name */
    public int f432813h;

    public f(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("Buffer size < 0");
        }
        this.f432809d = i17;
        this.f432810e = new java.util.ArrayList();
        this.f432812g = new byte[i17];
    }

    public final void a(int i17) {
        this.f432810e.add(new p16.f0(this.f432812g));
        int length = this.f432811f + this.f432812g.length;
        this.f432811f = length;
        this.f432812g = new byte[java.lang.Math.max(this.f432809d, java.lang.Math.max(i17, length >>> 1))];
        this.f432813h = 0;
    }

    public final void b() {
        int i17 = this.f432813h;
        byte[] bArr = this.f432812g;
        int length = bArr.length;
        java.util.ArrayList arrayList = this.f432810e;
        if (i17 >= length) {
            arrayList.add(new p16.f0(this.f432812g));
            this.f432812g = f432808i;
        } else if (i17 > 0) {
            byte[] bArr2 = new byte[i17];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, java.lang.Math.min(bArr.length, i17));
            arrayList.add(new p16.f0(bArr2));
        }
        this.f432811f += this.f432813h;
        this.f432813h = 0;
    }

    public synchronized p16.g c() {
        java.util.ArrayList arrayList;
        b();
        arrayList = this.f432810e;
        if (!(arrayList instanceof java.util.Collection)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((p16.g) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? p16.g.f432816d : p16.g.d(arrayList.iterator(), arrayList.size());
    }

    /* renamed from: toString */
    public java.lang.String m157704x9616526c() {
        int i17;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        synchronized (this) {
            i17 = this.f432811f + this.f432813h;
        }
        objArr[1] = java.lang.Integer.valueOf(i17);
        return java.lang.String.format("<ByteString.Output@%s size=%d>", objArr);
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i17) {
        if (this.f432813h == this.f432812g.length) {
            a(1);
        }
        byte[] bArr = this.f432812g;
        int i18 = this.f432813h;
        this.f432813h = i18 + 1;
        bArr[i18] = (byte) i17;
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i17, int i18) {
        byte[] bArr2 = this.f432812g;
        int length = bArr2.length;
        int i19 = this.f432813h;
        if (i18 <= length - i19) {
            java.lang.System.arraycopy(bArr, i17, bArr2, i19, i18);
            this.f432813h += i18;
        } else {
            int length2 = bArr2.length - i19;
            java.lang.System.arraycopy(bArr, i17, bArr2, i19, length2);
            int i27 = i18 - length2;
            a(i27);
            java.lang.System.arraycopy(bArr, i17 + length2, this.f432812g, 0, i27);
            this.f432813h = i27;
        }
    }
}
