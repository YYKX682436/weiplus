package os3;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.m f429662d;

    public k(os3.m mVar) {
        this.f429662d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.m mVar = this.f429662d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c = mVar.f429680d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(mVar.f429680d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572604bs5));
        sb6.append(" : ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c2 = mVar.f429680d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c.F;
        sb6.append(activityC16930x4222da3c2.Z6(false));
        dp.a.m125854x26a183b(activityC16930x4222da3c, sb6.toString(), 5000).show();
        mVar.f429680d.b7();
    }
}
