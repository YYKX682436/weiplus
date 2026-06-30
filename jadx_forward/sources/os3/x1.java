package os3;

/* loaded from: classes8.dex */
public class x1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a f429780d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a activityC16934xe33e503a) {
        this.f429780d = activityC16934xe33e503a;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a activityC16934xe33e503a = this.f429780d;
        activityC16934xe33e503a.f236408i = activityC16934xe33e503a.f236406g.e(str.toLowerCase().trim());
        if (activityC16934xe33e503a.f236408i.size() == 0) {
            activityC16934xe33e503a.f236404e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hjs);
            activityC16934xe33e503a.f236404e.setVisibility(0);
            activityC16934xe33e503a.m78501x43e00957(false);
        } else {
            activityC16934xe33e503a.f236404e.setVisibility(8);
            activityC16934xe33e503a.m78501x43e00957(true);
        }
        activityC16934xe33e503a.f236407h.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}
