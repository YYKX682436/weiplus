package com.tencent.mapsdk.internal;

/* loaded from: classes7.dex */
public final class mp {

    /* renamed from: a, reason: collision with root package name */
    public static final int f50436a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f50437b = 100;

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.mapsdk.internal.mp.a<java.lang.String> f50438c = new com.tencent.mapsdk.internal.mp.a<>();

    /* renamed from: d, reason: collision with root package name */
    private java.util.Hashtable<java.lang.String, java.lang.Integer> f50439d = new java.util.Hashtable<>();

    /* renamed from: e, reason: collision with root package name */
    private java.nio.IntBuffer f50440e;

    public mp() {
        b();
    }

    private synchronized void a(java.lang.String str, int i17) {
        if (this.f50439d.size() == this.f50437b) {
            b();
            if (this.f50440e == null) {
                return;
            }
            com.tencent.mapsdk.internal.mp.a<java.lang.String> aVar = this.f50438c;
            int i18 = aVar.f50444d;
            int i19 = aVar.f50443c;
            java.lang.Object obj = null;
            if (!(i18 == i19)) {
                int i27 = i19 % aVar.f50441a;
                java.lang.Object[] objArr = aVar.f50442b;
                java.lang.Object obj2 = objArr[i27];
                objArr[i27] = null;
                aVar.f50443c = i27 + 1;
                obj = obj2;
            }
            java.lang.Integer remove = this.f50439d.remove((java.lang.String) obj);
            if (this.f50440e.position() < this.f50437b) {
                this.f50440e.put(remove.intValue());
            }
        }
        com.tencent.mapsdk.internal.mp.a<java.lang.String> aVar2 = this.f50438c;
        int i28 = aVar2.f50444d;
        int i29 = aVar2.f50441a;
        if (!((i28 + 1) % i29 == aVar2.f50443c)) {
            int i37 = i28 % i29;
            java.lang.Object[] objArr2 = aVar2.f50442b;
            aVar2.f50444d = i37 + 1;
            objArr2[i37] = str;
        }
        this.f50439d.put(str, java.lang.Integer.valueOf(i17));
    }

    private synchronized void b() {
        if (this.f50440e == null) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f50437b * 4);
            allocateDirect.order(java.nio.ByteOrder.nativeOrder());
            this.f50440e = allocateDirect.asIntBuffer();
        }
    }

    /* loaded from: classes7.dex */
    public static class a<E> {

        /* renamed from: a, reason: collision with root package name */
        int f50441a = 100;

        /* renamed from: b, reason: collision with root package name */
        java.lang.Object[] f50442b = new java.lang.Object[100];

        /* renamed from: d, reason: collision with root package name */
        int f50444d = 0;

        /* renamed from: c, reason: collision with root package name */
        int f50443c = 0;

        private void b() {
            this.f50444d = 0;
            this.f50443c = 0;
        }

        private E c() {
            int i17 = this.f50444d;
            int i18 = this.f50443c;
            if (i17 == i18) {
                return null;
            }
            int i19 = i18 % this.f50441a;
            java.lang.Object[] objArr = this.f50442b;
            E e17 = (E) objArr[i19];
            objArr[i19] = null;
            this.f50443c = i19 + 1;
            return e17;
        }

        private boolean d() {
            return (this.f50444d + 1) % this.f50441a == this.f50443c;
        }

        private boolean e() {
            return this.f50444d == this.f50443c;
        }

        public final void a() {
            b();
            int i17 = 0;
            while (true) {
                java.lang.Object[] objArr = this.f50442b;
                if (i17 >= objArr.length) {
                    return;
                }
                objArr[i17] = null;
                i17++;
            }
        }

        private boolean a(E e17) {
            int i17 = this.f50444d;
            int i18 = this.f50441a;
            if ((i17 + 1) % i18 == this.f50443c) {
                return false;
            }
            int i19 = i17 % i18;
            java.lang.Object[] objArr = this.f50442b;
            this.f50444d = i19 + 1;
            objArr[i19] = e17;
            return true;
        }
    }

    private synchronized void b(javax.microedition.khronos.opengles.GL10 gl10) {
        java.nio.IntBuffer intBuffer = this.f50440e;
        if (intBuffer == null) {
            return;
        }
        int position = intBuffer.position();
        if (position > 0) {
            this.f50440e.rewind();
            gl10.glDeleteTextures(position, this.f50440e);
            this.f50440e.clear();
        }
    }

    private synchronized int a(java.lang.String str) {
        java.lang.Integer num = this.f50439d.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final synchronized void a() {
        this.f50439d.clear();
        this.f50438c.a();
        java.nio.IntBuffer intBuffer = this.f50440e;
        if (intBuffer != null) {
            intBuffer.clear();
        }
    }

    public final synchronized void a(javax.microedition.khronos.opengles.GL10 gl10) {
        if (this.f50440e != null) {
            java.util.Iterator<java.lang.String> it = this.f50439d.keySet().iterator();
            while (it.hasNext()) {
                this.f50440e.put(this.f50439d.get(it.next()).intValue());
            }
            b(gl10);
        }
        this.f50439d.clear();
        this.f50438c.a();
    }
}
