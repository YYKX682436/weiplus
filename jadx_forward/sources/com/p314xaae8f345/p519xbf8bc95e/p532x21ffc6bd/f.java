package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class f extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.e {

    /* renamed from: h, reason: collision with root package name */
    public static final int f130958h = 4;

    /* renamed from: i, reason: collision with root package name */
    static java.util.HashMap<java.lang.String, byte[]> f130959i;

    /* renamed from: j, reason: collision with root package name */
    static java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> f130960j;

    /* renamed from: g, reason: collision with root package name */
    protected com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.h f130961g;

    /* renamed from: k, reason: collision with root package name */
    private int f130962k;

    /* renamed from: l, reason: collision with root package name */
    private int f130963l;

    public f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.h hVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.h();
        this.f130961g = hVar;
        this.f130962k = 0;
        this.f130963l = 0;
        hVar.f131230a = (short) 2;
    }

    private int h() {
        return this.f130961g.f131230a;
    }

    private int i() {
        return this.f130962k;
    }

    private void j() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m(this.f130961g.f131236g);
        mVar.a(this.f130615c);
        if (f130959i == null) {
            java.util.HashMap<java.lang.String, byte[]> hashMap = new java.util.HashMap<>();
            f130959i = hashMap;
            hashMap.put("", new byte[0]);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.e) this).f130757e = mVar.a((java.util.Map) f130959i, 0, false);
    }

    private void k() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m(this.f130961g.f131236g);
        mVar.a(this.f130615c);
        if (f130960j == null) {
            f130960j = new java.util.HashMap<>();
            java.util.HashMap<java.lang.String, byte[]> hashMap = new java.util.HashMap<>();
            hashMap.put("", new byte[0]);
            f130960j.put("", hashMap);
        }
        this.f130613a = mVar.a((java.util.Map) f130960j, 0, false);
        this.f130614b = new java.util.HashMap<>();
    }

    private java.lang.String l() {
        return this.f130961g.f131234e;
    }

    private java.lang.String m() {
        return this.f130961g.f131235f;
    }

    private int n() {
        return this.f130961g.f131233d;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f o() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f fVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.h hVar = this.f130961g;
        fVar.f130961g.f131233d = hVar.f131233d;
        fVar.c(hVar.f131234e);
        fVar.d(this.f130961g.f131235f);
        fVar.a(this.f130615c);
        fVar.f130961g.f131230a = this.f130961g.f131230a;
        return fVar;
    }

    private byte[] p() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n(0);
        nVar.a(this.f130615c);
        nVar.a((java.util.Map) this.f130613a, 0);
        byte[] a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(nVar.f132017a);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n(0);
        nVar2.a(this.f130615c);
        nVar2.a(this.f130961g.f131230a, 1);
        nVar2.a(this.f130961g.f131231b, 2);
        nVar2.a(this.f130961g.f131233d, 3);
        nVar2.a(this.f130961g.f131232c, 4);
        nVar2.a(this.f130963l, 5);
        nVar2.a(a17, 6);
        nVar2.a((java.util.Map) this.f130961g.f131239j, 7);
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(nVar2.f132017a);
    }

    private int q() {
        return this.f130963l;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.e, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.c
    public final <T> void a(java.lang.String str, T t17) {
        if (!str.startsWith(".")) {
            super.a(str, (java.lang.String) t17);
            return;
        }
        throw new java.lang.IllegalArgumentException("put name can not startwith . , now is ".concat(str));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.e
    public final void b(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m(bArr, (byte) 0);
                mVar.a(this.f130615c);
                this.f130961g.mo36074xcc442a60(mVar);
                j();
                return;
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        throw new java.lang.IllegalArgumentException("decode package must include size head");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.e
    public final void c(byte[] bArr) {
        if (bArr.length >= 4) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            byte[] bArr2 = new byte[4];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, 4);
            allocate.put(bArr2).flip();
            this.f130962k = allocate.getInt();
            try {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m(bArr, (byte) 0);
                mVar.a(this.f130615c);
                this.f130961g.mo36074xcc442a60(mVar);
                k();
                return;
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        throw new java.lang.IllegalArgumentException("decode package must include size head");
    }

    public final void d(java.lang.String str) {
        this.f130961g.f131235f = str;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.e, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.c
    public final byte[] f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.h hVar = this.f130961g;
        if (hVar.f131230a == 2) {
            java.lang.String str = hVar.f131234e;
            if (str == null || str.equals("")) {
                throw new java.lang.IllegalArgumentException("servantName can not is null");
            }
            java.lang.String str2 = this.f130961g.f131235f;
            if (str2 == null || str2.equals("")) {
                throw new java.lang.IllegalArgumentException("funcName can not is null");
            }
        } else {
            if (hVar.f131234e == null) {
                hVar.f131234e = "";
            }
            if (hVar.f131235f == null) {
                hVar.f131235f = "";
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n(0);
        nVar.a(this.f130615c);
        short s17 = this.f130961g.f131230a;
        if (s17 == 2 || s17 == 1) {
            nVar.a((java.util.Map) this.f130613a, 0);
        } else {
            nVar.a((java.util.Map) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.e) this).f130757e, 0);
        }
        this.f130961g.f131236g = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(nVar.f132017a);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n(0);
        nVar2.a(this.f130615c);
        this.f130961g.mo36076x5f8be6ba(nVar2);
        byte[] a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(nVar2.f132017a);
        int length = a17.length + 4;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length);
        allocate.putInt(length).put(a17).flip();
        return allocate.array();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.e
    public final void g() {
        super.g();
        this.f130961g.f131230a = (short) 3;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.e, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.c
    public final void a(byte[] bArr) {
        if (bArr.length >= 4) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            byte[] bArr2 = new byte[4];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, 4);
            allocate.put(bArr2).flip();
            this.f130962k = allocate.getInt();
            try {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m(bArr, (byte) 0);
                mVar.a(this.f130615c);
                this.f130961g.mo36074xcc442a60(mVar);
                if (this.f130961g.f131230a == 3) {
                    j();
                    return;
                } else {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.e) this).f130757e = null;
                    k();
                    return;
                }
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        throw new java.lang.IllegalArgumentException("decode package must include size head");
    }

    private f(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.h hVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.h();
        this.f130961g = hVar;
        this.f130962k = 0;
        this.f130963l = 0;
        if (z17) {
            g();
        } else {
            hVar.f131230a = (short) 2;
        }
    }

    private void b(int i17) {
        this.f130963l = i17;
    }

    public final void c(java.lang.String str) {
        this.f130961g.f131234e = str;
    }

    private void a(int i17) {
        this.f130961g.f131233d = i17;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        this.f130961g.mo36076x5f8be6ba(nVar);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f130961g.mo36074xcc442a60(mVar);
    }

    private void a(java.lang.StringBuilder sb6, int i17) {
        this.f130961g.mo36080x63a518c2(sb6, i17);
    }
}
