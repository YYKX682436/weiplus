package kf3;

/* loaded from: classes5.dex */
public class o0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc f388940d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc) {
        this.f388940d = activityC16486x3260b8cc;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc.f230058q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc = this.f388940d;
        activityC16486x3260b8cc.getClass();
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.jci);
        if (findViewById == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendHistoryUI", "showLongClickMenu, not clicking contentArea, position: " + i17);
        } else {
            rl5.r rVar = new rl5.r(activityC16486x3260b8cc.mo55332x76847179(), view);
            rVar.C = true;
            rVar.f478888y = new kf3.p0(activityC16486x3260b8cc);
            rVar.f478887x = new kf3.s0(activityC16486x3260b8cc, i17);
            int[] iArr = new int[2];
            findViewById.getLocationInWindow(iArr);
            rVar.n((iArr[0] + findViewById.getWidth()) / 2, iArr[1]);
        }
        return false;
    }
}
