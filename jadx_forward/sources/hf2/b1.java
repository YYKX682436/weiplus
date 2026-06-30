package hf2;

/* loaded from: classes10.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.e1 f362538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.content.Context context, hf2.e1 e1Var) {
        super(0);
        this.f362537d = context;
        this.f362538e = e1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        in0.q m129720xd052bc21;
        android.content.Context context = this.f362537d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.efs));
        u1Var.n(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572980d41));
        u1Var.l(hf2.a1.f362531a);
        u1Var.q(false);
        hf2.e1 e1Var = this.f362538e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = e1Var.f362584a.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 v1Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1) ubVar : null;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (v1Var == null || (m129720xd052bc21 = v1Var.m129720xd052bc21()) == null) {
            f0Var = null;
        } else {
            in0.q.d1(m129720xd052bc21, null, false, 2, null);
            f0Var = f0Var2;
        }
        hf2.x xVar = e1Var.f362584a;
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e1Var.f362585b, "uploadSticker reset blend but pluginLayout:" + xVar.f372632e + " get liveCore fail!");
        }
        xVar.t7("uploadSticker_fail", null);
        hf2.b2 h76 = xVar.h7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h76.f362540b, "resetTextBitmap");
        h76.f362545g = null;
        h76.f362546h = 1.0f;
        xVar.h7().e("uploadSticker_fail");
        ((je2.g) xVar.m56788xbba4bfc0(je2.g.class)).V6("uploadSticker_fail", null, false);
        return f0Var2;
    }
}
