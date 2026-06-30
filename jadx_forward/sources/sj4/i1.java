package sj4;

/* loaded from: classes10.dex */
public final class i1 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sj4.k1 f490387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(java.lang.String str, sj4.k1 k1Var) {
        super(str);
        this.f490387c = k1Var;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String string;
        pj4.j0 j0Var = this.f102607b;
        if (j0Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "12")) {
            return false;
        }
        java.lang.String str2 = "";
        if (bundle == null || (str = bundle.getString("textStatusModelInfoStr")) == null) {
            str = "";
        }
        if (bundle != null && (string = bundle.getString("clickTagName")) != null) {
            str2 = string;
        }
        this.f490387c.getClass();
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = "gh_390359b3fd13@app";
        b1Var.f398565k = 1190;
        b1Var.f398549c = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.o1.f104252a.b(bm5.h0.RepairerConfig_TextStatus_UsePreviewMiniApp_Int, 0), 1) ? 2 : 0;
        b1Var.f398561i = new sj4.j1(str, str2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
        return true;
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        super.m(str, j0Var);
        this.f490387c.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Rh(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.F);
        long c17 = c01.id.c();
        if (java.lang.Math.abs(c17 - sj4.k1.f490394d) > 3600000) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).h8("gh_390359b3fd13@app", 0);
            sj4.k1.f490394d = c17;
        }
    }

    @Override // bi4.o0
    public void n() {
    }
}
