package zh1;

/* loaded from: classes8.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 f554438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f554439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 f554440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 f554441g;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2) {
        this.f554438d = h6Var;
        this.f554439e = context;
        this.f554440f = c12473xe2bfc4b5;
        this.f554441g = c12475x7cfc32b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "itemClickAction, launch appBrand");
        l81.b1 b1Var = new l81.b1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2 = this.f554441g;
        b1Var.f398547b = c12475x7cfc32b2.f167795d;
        b1Var.f398549c = c12475x7cfc32b2.f167796e;
        b1Var.f398555f = c12475x7cfc32b2.f167797f;
        b1Var.f398565k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.r0.f34312x366c91de;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = this.f554440f;
        java.lang.String mimeType = c12473xe2bfc4b5.f167782d.f167802d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mimeType, "mimeType");
        java.lang.String materialPath = c12473xe2bfc4b5.f167782d.f167804f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialPath, "materialPath");
        b1Var.f398561i = new bi1.e(mimeType, materialPath, null, 0, 12, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) this.f554438d).bj(this.f554439e, b1Var);
        ai1.p pVar = ai1.p.f86635b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 materialModel = c12473xe2bfc4b5.f167782d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialModel, "materialModel");
        ((ku5.t0) ku5.t0.f394148d).k(new ai1.o(materialModel), 5000L);
    }
}
