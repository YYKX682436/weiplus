package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99;

/* loaded from: classes8.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.ActivityC18501x74118907 f253654d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.ActivityC18501x74118907 activityC18501x74118907) {
        this.f253654d = activityC18501x74118907;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.ActivityC18501x74118907 activityC18501x74118907 = this.f253654d;
        if (activityC18501x74118907.getIntent() == null || activityC18501x74118907.getIntent().getExtras() == null) {
            str = "";
            str2 = null;
        } else {
            str2 = activityC18501x74118907.getIntent().getExtras().getString("alertjumpurl");
            str = activityC18501x74118907.getIntent().getExtras().getString("alert_activityid");
        }
        if (str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi().f253666b) && com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().bj()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().wi();
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Ai();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            intent.putExtra("useJs", true);
            intent.putExtra("vertical_scroll", true);
            j45.l.j(activityC18501x74118907, "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11179, str2, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi().f253666b, 5);
        }
        activityC18501x74118907.finish();
    }
}
