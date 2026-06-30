package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class f extends com.tencent.mapsdk.internal.e {

    /* renamed from: h, reason: collision with root package name */
    public static final int f49425h = 4;

    /* renamed from: i, reason: collision with root package name */
    static java.util.HashMap<java.lang.String, byte[]> f49426i;

    /* renamed from: j, reason: collision with root package name */
    static java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> f49427j;

    /* renamed from: g, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.h f49428g;

    /* renamed from: k, reason: collision with root package name */
    private int f49429k;

    /* renamed from: l, reason: collision with root package name */
    private int f49430l;

    public f() {
        com.tencent.mapsdk.internal.h hVar = new com.tencent.mapsdk.internal.h();
        this.f49428g = hVar;
        this.f49429k = 0;
        this.f49430l = 0;
        hVar.f49697a = (short) 2;
    }

    private int h() {
        return this.f49428g.f49697a;
    }

    private int i() {
        return this.f49429k;
    }

    private void j() {
        com.tencent.mapsdk.internal.m mVar = new com.tencent.mapsdk.internal.m(this.f49428g.f49703g);
        mVar.a(this.f49082c);
        if (f49426i == null) {
            java.util.HashMap<java.lang.String, byte[]> hashMap = new java.util.HashMap<>();
            f49426i = hashMap;
            hashMap.put("", new byte[0]);
        }
        ((com.tencent.mapsdk.internal.e) this).f49224e = mVar.a((java.util.Map) f49426i, 0, false);
    }

    private void k() {
        com.tencent.mapsdk.internal.m mVar = new com.tencent.mapsdk.internal.m(this.f49428g.f49703g);
        mVar.a(this.f49082c);
        if (f49427j == null) {
            f49427j = new java.util.HashMap<>();
            java.util.HashMap<java.lang.String, byte[]> hashMap = new java.util.HashMap<>();
            hashMap.put("", new byte[0]);
            f49427j.put("", hashMap);
        }
        this.f49080a = mVar.a((java.util.Map) f49427j, 0, false);
        this.f49081b = new java.util.HashMap<>();
    }

    private java.lang.String l() {
        return this.f49428g.f49701e;
    }

    private java.lang.String m() {
        return this.f49428g.f49702f;
    }

    private int n() {
        return this.f49428g.f49700d;
    }

    private com.tencent.mapsdk.internal.f o() {
        com.tencent.mapsdk.internal.f fVar = new com.tencent.mapsdk.internal.f();
        com.tencent.mapsdk.internal.h hVar = this.f49428g;
        fVar.f49428g.f49700d = hVar.f49700d;
        fVar.c(hVar.f49701e);
        fVar.d(this.f49428g.f49702f);
        fVar.a(this.f49082c);
        fVar.f49428g.f49697a = this.f49428g.f49697a;
        return fVar;
    }

    private byte[] p() {
        com.tencent.mapsdk.internal.n nVar = new com.tencent.mapsdk.internal.n(0);
        nVar.a(this.f49082c);
        nVar.a((java.util.Map) this.f49080a, 0);
        byte[] a17 = com.tencent.mapsdk.internal.q.a(nVar.f50484a);
        com.tencent.mapsdk.internal.n nVar2 = new com.tencent.mapsdk.internal.n(0);
        nVar2.a(this.f49082c);
        nVar2.a(this.f49428g.f49697a, 1);
        nVar2.a(this.f49428g.f49698b, 2);
        nVar2.a(this.f49428g.f49700d, 3);
        nVar2.a(this.f49428g.f49699c, 4);
        nVar2.a(this.f49430l, 5);
        nVar2.a(a17, 6);
        nVar2.a((java.util.Map) this.f49428g.f49706j, 7);
        return com.tencent.mapsdk.internal.q.a(nVar2.f50484a);
    }

    private int q() {
        return this.f49430l;
    }

    @Override // com.tencent.mapsdk.internal.e, com.tencent.mapsdk.internal.c
    public final <T> void a(java.lang.String str, T t17) {
        if (!str.startsWith(".")) {
            super.a(str, (java.lang.String) t17);
            return;
        }
        throw new java.lang.IllegalArgumentException("put name can not startwith . , now is ".concat(str));
    }

    @Override // com.tencent.mapsdk.internal.e
    public final void b(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                com.tencent.mapsdk.internal.m mVar = new com.tencent.mapsdk.internal.m(bArr, (byte) 0);
                mVar.a(this.f49082c);
                this.f49428g.readFrom(mVar);
                j();
                return;
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        throw new java.lang.IllegalArgumentException("decode package must include size head");
    }

    @Override // com.tencent.mapsdk.internal.e
    public final void c(byte[] bArr) {
        if (bArr.length >= 4) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            byte[] bArr2 = new byte[4];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, 4);
            allocate.put(bArr2).flip();
            this.f49429k = allocate.getInt();
            try {
                com.tencent.mapsdk.internal.m mVar = new com.tencent.mapsdk.internal.m(bArr, (byte) 0);
                mVar.a(this.f49082c);
                this.f49428g.readFrom(mVar);
                k();
                return;
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        throw new java.lang.IllegalArgumentException("decode package must include size head");
    }

    public final void d(java.lang.String str) {
        this.f49428g.f49702f = str;
    }

    @Override // com.tencent.mapsdk.internal.e, com.tencent.mapsdk.internal.c
    public final byte[] f() {
        com.tencent.mapsdk.internal.h hVar = this.f49428g;
        if (hVar.f49697a == 2) {
            java.lang.String str = hVar.f49701e;
            if (str == null || str.equals("")) {
                throw new java.lang.IllegalArgumentException("servantName can not is null");
            }
            java.lang.String str2 = this.f49428g.f49702f;
            if (str2 == null || str2.equals("")) {
                throw new java.lang.IllegalArgumentException("funcName can not is null");
            }
        } else {
            if (hVar.f49701e == null) {
                hVar.f49701e = "";
            }
            if (hVar.f49702f == null) {
                hVar.f49702f = "";
            }
        }
        com.tencent.mapsdk.internal.n nVar = new com.tencent.mapsdk.internal.n(0);
        nVar.a(this.f49082c);
        short s17 = this.f49428g.f49697a;
        if (s17 == 2 || s17 == 1) {
            nVar.a((java.util.Map) this.f49080a, 0);
        } else {
            nVar.a((java.util.Map) ((com.tencent.mapsdk.internal.e) this).f49224e, 0);
        }
        this.f49428g.f49703g = com.tencent.mapsdk.internal.q.a(nVar.f50484a);
        com.tencent.mapsdk.internal.n nVar2 = new com.tencent.mapsdk.internal.n(0);
        nVar2.a(this.f49082c);
        this.f49428g.writeTo(nVar2);
        byte[] a17 = com.tencent.mapsdk.internal.q.a(nVar2.f50484a);
        int length = a17.length + 4;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length);
        allocate.putInt(length).put(a17).flip();
        return allocate.array();
    }

    @Override // com.tencent.mapsdk.internal.e
    public final void g() {
        super.g();
        this.f49428g.f49697a = (short) 3;
    }

    @Override // com.tencent.mapsdk.internal.e, com.tencent.mapsdk.internal.c
    public final void a(byte[] bArr) {
        if (bArr.length >= 4) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            byte[] bArr2 = new byte[4];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, 4);
            allocate.put(bArr2).flip();
            this.f49429k = allocate.getInt();
            try {
                com.tencent.mapsdk.internal.m mVar = new com.tencent.mapsdk.internal.m(bArr, (byte) 0);
                mVar.a(this.f49082c);
                this.f49428g.readFrom(mVar);
                if (this.f49428g.f49697a == 3) {
                    j();
                    return;
                } else {
                    ((com.tencent.mapsdk.internal.e) this).f49224e = null;
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
        com.tencent.mapsdk.internal.h hVar = new com.tencent.mapsdk.internal.h();
        this.f49428g = hVar;
        this.f49429k = 0;
        this.f49430l = 0;
        if (z17) {
            g();
        } else {
            hVar.f49697a = (short) 2;
        }
    }

    private void b(int i17) {
        this.f49430l = i17;
    }

    public final void c(java.lang.String str) {
        this.f49428g.f49701e = str;
    }

    private void a(int i17) {
        this.f49428g.f49700d = i17;
    }

    private void a(com.tencent.mapsdk.internal.n nVar) {
        this.f49428g.writeTo(nVar);
    }

    private void a(com.tencent.mapsdk.internal.m mVar) {
        this.f49428g.readFrom(mVar);
    }

    private void a(java.lang.StringBuilder sb6, int i17) {
        this.f49428g.display(sb6, i17);
    }
}
