package e33;

/* loaded from: classes10.dex */
public class o2 implements y51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f328955a;

    public o2(e33.v2 v2Var) {
        this.f328955a = v2Var;
    }

    @Override // y51.f
    public void a() {
    }

    @Override // y51.f
    public int b() {
        e33.v2 v2Var = this.f328955a;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(v2Var.f329032g);
        if (com.p314xaae8f345.mm.ui.b4.c(v2Var.f329032g)) {
            c17 = 0;
        }
        int i17 = com.p314xaae8f345.mm.ui.bh.a(v2Var.f329032g).f278669b - c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "onGetViewMaxHeightLocation >> maxHeight: %d, navBarHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c17));
        return i17;
    }

    @Override // y51.f
    public int c() {
        e33.r2 r2Var = this.f328955a.f329042t;
        int i17 = 0;
        if (r2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = ((e33.C28274x625d445) r2Var).f328928a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "bottomHeightGetCallback >> titleFooterVisible: %b selectItemSize: %d", java.lang.Boolean.valueOf(activityC15656x6f26b561.f220106J), java.lang.Integer.valueOf(activityC15656x6f26b561.f220125n.size()));
            if (activityC15656x6f26b561.f220106J) {
                int f17 = i65.a.f(activityC15656x6f26b561, com.p314xaae8f345.mm.R.C30860x5b28f31.f561456j2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "operateBarHeight visible its height: %d", java.lang.Integer.valueOf(f17));
                if (activityC15656x6f26b561.f220114f.getVisibility() == 0) {
                    i17 = activityC15656x6f26b561.f220114f.getHeight();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "mPreviewRecyclerView visible its height: %d", java.lang.Integer.valueOf(i17));
                }
                i17 += f17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "onGetLocationCallback >> heightFromCallback: %d", java.lang.Integer.valueOf(i17));
        return i17;
    }
}
