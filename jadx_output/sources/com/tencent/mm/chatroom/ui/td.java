package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class td implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.wd f64558e;

    public td(com.tencent.mm.chatroom.ui.wd wdVar, java.lang.String str) {
        this.f64558e = wdVar;
        this.f64557d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.chatroom.ui.wd wdVar = this.f64558e;
        wdVar.notifyDataSetChanged();
        java.util.List list = wdVar.f64630h;
        if (list == null || list.size() != 0) {
            wdVar.f64633n.f63988d.setVisibility(0);
            wdVar.f64633n.f63996o.setVisibility(8);
            str = "1";
        } else {
            wdVar.f64633n.f63988d.setVisibility(8);
            com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI selectServiceNotifySenderUI = wdVar.f64633n;
            android.widget.TextView textView = selectServiceNotifySenderUI.f63996o;
            java.lang.String string = selectServiceNotifySenderUI.getString(com.tencent.mm.R.string.icq);
            java.lang.String string2 = wdVar.f64633n.getString(com.tencent.mm.R.string.icp);
            java.lang.String str2 = this.f64557d;
            textView.setText(o13.q.d(string, string2, p13.i.a(str2, str2, false, false)).f351105a);
            wdVar.f64633n.f63996o.setVisibility(0);
            str = "0";
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23903, 8, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), str, 2, wdVar.f64633n.f63995n);
    }
}
