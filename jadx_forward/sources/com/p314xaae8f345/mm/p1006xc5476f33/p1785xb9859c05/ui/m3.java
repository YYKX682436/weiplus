package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes.dex */
public class m3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 f224474d;

    public m3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980) {
        this.f224474d = activityC16143x7673980;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980 = this.f224474d;
        activityC16143x7673980.finish();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", activityC16143x7673980.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3q));
        intent.putExtra("showShare", false);
        j45.l.j(activityC16143x7673980, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
