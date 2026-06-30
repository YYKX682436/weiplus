package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.c f235873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f235874e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.c cVar, boolean z17) {
        this.f235873d = cVar;
        this.f235874e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wr3.n0 n0Var;
        r45.s5 s5Var;
        r45.p5 p5Var;
        java.util.LinkedList linkedList;
        yr3.i iVar = (yr3.i) this.f235873d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = iVar.f546382a;
        if (this.f235874e) {
            u3Var.dismiss();
            yr3.w wVar = yr3.w.f546592a;
            yr3.f fVar = iVar.f546383b.f546462e;
            if (fVar == null || (n0Var = fVar.f546337c) == null) {
                n0Var = wr3.n0.f530375f;
            }
            wVar.f(n0Var, iVar.f546384c, iVar.f546385d, (fVar == null || (s5Var = fVar.f546335a) == null || (p5Var = s5Var.f467047i) == null || (linkedList = p5Var.f464287e) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeatureMsgUtil", "success item delete failed");
        u3Var.dismiss();
        android.content.Context context = iVar.f546386e.f546494d;
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572482na5);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var.c();
    }
}
