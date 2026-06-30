package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes7.dex */
public final class mp {

    /* renamed from: a, reason: collision with root package name */
    public static final int f131969a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f131970b = 100;

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.mapsdk.internal.mp.a<java.lang.String> f131971c = new com.tencent.mapsdk.internal.mp.a<>();

    /* renamed from: d, reason: collision with root package name */
    private java.util.Hashtable<java.lang.String, java.lang.Integer> f131972d = new java.util.Hashtable<>();

    /* renamed from: e, reason: collision with root package name */
    private java.nio.IntBuffer f131973e;

    public mp() {
        b();
    }

    private synchronized void a(java.lang.String str, int i17) {
        if (this.f131972d.size() == this.f131970b) {
            b();
            if (this.f131973e == null) {
                return;
            }
            com.tencent.mapsdk.internal.mp.a<java.lang.String> aVar = this.f131971c;
            int i18 = aVar.f131977d;
            int i19 = aVar.f131976c;
            java.lang.Object obj = null;
            if (!(i18 == i19)) {
                int i27 = i19 % aVar.f131974a;
                java.lang.Object[] objArr = aVar.f131975b;
                java.lang.Object obj2 = objArr[i27];
                objArr[i27] = null;
                aVar.f131976c = i27 + 1;
                obj = obj2;
            }
            java.lang.Integer remove = this.f131972d.remove((java.lang.String) obj);
            if (this.f131973e.position() < this.f131970b) {
                this.f131973e.put(remove.intValue());
            }
        }
        com.tencent.mapsdk.internal.mp.a<java.lang.String> aVar2 = this.f131971c;
        int i28 = aVar2.f131977d;
        int i29 = aVar2.f131974a;
        if (!((i28 + 1) % i29 == aVar2.f131976c)) {
            int i37 = i28 % i29;
            java.lang.Object[] objArr2 = aVar2.f131975b;
            aVar2.f131977d = i37 + 1;
            objArr2[i37] = str;
        }
        this.f131972d.put(str, java.lang.Integer.valueOf(i17));
    }

    private synchronized void b() {
        if (this.f131973e == null) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f131970b * 4);
            allocateDirect.order(java.nio.ByteOrder.nativeOrder());
            this.f131973e = allocateDirect.asIntBuffer();
        }
    }

    /* loaded from: classes7.dex */
    public static class a<E> {

        /* renamed from: a, reason: collision with root package name */
        int f131974a = 100;

        /* renamed from: b, reason: collision with root package name */
        java.lang.Object[] f131975b = new java.lang.Object[100];

        /* renamed from: d, reason: collision with root package name */
        int f131977d = 0;

        /* renamed from: c, reason: collision with root package name */
        int f131976c = 0;

        private void b() {
            this.f131977d = 0;
            this.f131976c = 0;
        }

        private E c() {
            int i17 = this.f131977d;
            int i18 = this.f131976c;
            if (i17 == i18) {
                return null;
            }
            int i19 = i18 % this.f131974a;
            java.lang.Object[] objArr = this.f131975b;
            E e17 = (E) objArr[i19];
            objArr[i19] = null;
            this.f131976c = i19 + 1;
            return e17;
        }

        private boolean d() {
            return (this.f131977d + 1) % this.f131974a == this.f131976c;
        }

        private boolean e() {
            return this.f131977d == this.f131976c;
        }

        public final void a() {
            b();
            int i17 = 0;
            while (true) {
                java.lang.Object[] objArr = this.f131975b;
                if (i17 >= objArr.length) {
                    return;
                }
                objArr[i17] = null;
                i17++;
            }
        }

        private boolean a(E e17) {
            int i17 = this.f131977d;
            int i18 = this.f131974a;
            if ((i17 + 1) % i18 == this.f131976c) {
                return false;
            }
            int i19 = i17 % i18;
            java.lang.Object[] objArr = this.f131975b;
            this.f131977d = i19 + 1;
            objArr[i19] = e17;
            return true;
        }
    }

    private synchronized void b(javax.microedition.khronos.opengles.GL10 gl10) {
        java.nio.IntBuffer intBuffer = this.f131973e;
        if (intBuffer == null) {
            return;
        }
        int position = intBuffer.position();
        if (position > 0) {
            this.f131973e.rewind();
            gl10.glDeleteTextures(position, this.f131973e);
            this.f131973e.clear();
        }
    }

    private synchronized int a(java.lang.String str) {
        java.lang.Integer num = this.f131972d.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final synchronized void a() {
        this.f131972d.clear();
        this.f131971c.a();
        java.nio.IntBuffer intBuffer = this.f131973e;
        if (intBuffer != null) {
            intBuffer.clear();
        }
    }

    public final synchronized void a(javax.microedition.khronos.opengles.GL10 gl10) {
        if (this.f131973e != null) {
            java.util.Iterator<java.lang.String> it = this.f131972d.keySet().iterator();
            while (it.hasNext()) {
                this.f131973e.put(this.f131972d.get(it.next()).intValue());
            }
            b(gl10);
        }
        this.f131972d.clear();
        this.f131971c.a();
    }
}
