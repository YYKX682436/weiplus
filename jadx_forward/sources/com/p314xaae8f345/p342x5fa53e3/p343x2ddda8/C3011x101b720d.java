package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.TwoDVideoData */
/* loaded from: classes4.dex */
public class C3011x101b720d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d f10528xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d();

    /* renamed from: encrypt */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 f10529xa0333265;

    /* renamed from: vs, reason: collision with root package name */
    private java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe> f127482vs = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f10530xcb94b041 = new boolean[3];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d m23012xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d m23013x7c90cfc0() {
        return f10528xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d m23014x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d();
    }

    /* renamed from: addAllElementVs */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d m23015xad902979(java.util.Collection<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe> collection) {
        this.f127482vs.addAll(collection);
        this.f10530xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementVs */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d m23016xe85f2738(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe c2978xd57dffe) {
        this.f127482vs.add(c2978xd57dffe);
        this.f10530xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d m23017x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d c3011x101b720d = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d) fVar;
        return n51.f.a(this.f127482vs, c3011x101b720d.f127482vs) && n51.f.a(this.f10529xa0333265, c3011x101b720d.f10529xa0333265);
    }

    /* renamed from: getEncrypt */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m23018xde006e2f() {
        return this.f10530xcb94b041[2] ? this.f10529xa0333265 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893.m22388xaf65a0fc();
    }

    /* renamed from: getVs */
    public java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe> m23019x5db1cb3() {
        return this.f127482vs;
    }

    /* renamed from: hasEncrypt */
    public boolean m23020x1956f66b() {
        return m23021x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m23021x6e095e9(int i17) {
        return this.f10530xcb94b041[i17];
    }

    /* renamed from: hasVs */
    public boolean m23022x5e75ef7() {
        return m23021x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d m23023x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f127482vs);
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 c2971x7865f893 = this.f10529xa0333265;
            if (c2971x7865f893 != null && this.f10530xcb94b041[2]) {
                fVar.i(2, c2971x7865f893.mo75928xcd1e8d8());
                this.f10529xa0333265.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f127482vs) + 0;
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 c2971x7865f8932 = this.f10529xa0333265;
            return (c2971x7865f8932 == null || !this.f10530xcb94b041[2]) ? g17 : g17 + b36.f.i(2, c2971x7865f8932.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f127482vs.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe c2978xd57dffe = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe();
                if (bArr != null && bArr.length > 0) {
                    c2978xd57dffe.mo11468x92b714fd(bArr);
                }
                this.f127482vs.add(c2978xd57dffe);
            }
            this.f10530xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 c2971x7865f8933 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893();
            if (bArr2 != null && bArr2.length > 0) {
                c2971x7865f8933.mo11468x92b714fd(bArr2);
            }
            this.f10529xa0333265 = c2971x7865f8933;
        }
        this.f10530xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setEncrypt */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d m23025x5171bba3(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 c2971x7865f893) {
        this.f10529xa0333265 = c2971x7865f893;
        this.f10530xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setVs */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d m23026x68436bf(java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe> linkedList) {
        this.f127482vs = linkedList;
        this.f10530xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d m23024x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3011x101b720d) super.mo11468x92b714fd(bArr);
    }
}
