package n8;

/* loaded from: classes13.dex */
public final class x implements n8.f {

    /* renamed from: b, reason: collision with root package name */
    public int f417120b;

    /* renamed from: c, reason: collision with root package name */
    public int f417121c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f417122d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f417123e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f417124f;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.ByteBuffer f417125g;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.ByteBuffer f417126h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f417127i;

    public x() {
        java.nio.ByteBuffer byteBuffer = n8.f.f417052a;
        this.f417125g = byteBuffer;
        this.f417126h = byteBuffer;
        this.f417120b = -1;
        this.f417121c = -1;
    }

    @Override // n8.f
    public boolean a() {
        return this.f417123e;
    }

    @Override // n8.f
    public void b(java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f417120b * 2)) * this.f417124f.length * 2;
        if (this.f417125g.capacity() < length) {
            this.f417125g = java.nio.ByteBuffer.allocateDirect(length).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.f417125g.clear();
        }
        while (position < limit) {
            for (int i17 : this.f417124f) {
                this.f417125g.putShort(byteBuffer.getShort((i17 * 2) + position));
            }
            position += this.f417120b * 2;
        }
        byteBuffer.position(limit);
        this.f417125g.flip();
        this.f417126h = this.f417125g;
    }

    @Override // n8.f
    public int c() {
        int[] iArr = this.f417124f;
        return iArr == null ? this.f417120b : iArr.length;
    }

    @Override // n8.f
    public int d() {
        return 2;
    }

    @Override // n8.f
    public void e() {
        this.f417127i = true;
    }

    @Override // n8.f
    public java.nio.ByteBuffer f() {
        java.nio.ByteBuffer byteBuffer = this.f417126h;
        this.f417126h = n8.f.f417052a;
        return byteBuffer;
    }

    @Override // n8.f
    /* renamed from: flush */
    public void mo149201x5d03b04() {
        this.f417126h = n8.f.f417052a;
        this.f417127i = false;
    }

    @Override // n8.f
    public boolean g(int i17, int i18, int i19) {
        boolean z17 = !java.util.Arrays.equals(this.f417122d, this.f417124f);
        int[] iArr = this.f417122d;
        this.f417124f = iArr;
        if (iArr == null) {
            this.f417123e = false;
            return z17;
        }
        if (i19 != 2) {
            throw new n8.e(i17, i18, i19);
        }
        if (!z17 && this.f417121c == i17 && this.f417120b == i18) {
            return false;
        }
        this.f417121c = i17;
        this.f417120b = i18;
        this.f417123e = i18 != iArr.length;
        int i27 = 0;
        while (true) {
            int[] iArr2 = this.f417124f;
            if (i27 >= iArr2.length) {
                return true;
            }
            int i28 = iArr2[i27];
            if (i28 >= i18) {
                throw new n8.e(i17, i18, i19);
            }
            this.f417123e = (i28 != i27) | this.f417123e;
            i27++;
        }
    }

    @Override // n8.f
    public boolean h() {
        return this.f417127i && this.f417126h == n8.f.f417052a;
    }

    @Override // n8.f
    /* renamed from: reset */
    public void mo149202x6761d4f() {
        mo149201x5d03b04();
        this.f417125g = n8.f.f417052a;
        this.f417120b = -1;
        this.f417121c = -1;
        this.f417124f = null;
        this.f417123e = false;
    }
}
