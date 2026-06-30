package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class c5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f261706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19115x62a5592d f261707e;

    public c5(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19115x62a5592d activityC19115x62a5592d, int i17) {
        this.f261707e = activityC19115x62a5592d;
        this.f261706d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19115x62a5592d activityC19115x62a5592d = this.f261707e;
        boolean z17 = activityC19115x62a5592d.f261538d;
        int i18 = this.f261706d;
        if (z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd c6273xbf9150fd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd();
            c6273xbf9150fd.f136522g.f89222a = i18;
            c6273xbf9150fd.e();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
        java.lang.String str = activityC19115x62a5592d.f261542h;
        am.s10 s10Var = c6249x2aa12f2e.f136498g;
        s10Var.f89397d = str;
        s10Var.f89396c = i18;
        c6249x2aa12f2e.e();
        activityC19115x62a5592d.setResult(i18);
        activityC19115x62a5592d.finish();
    }
}
