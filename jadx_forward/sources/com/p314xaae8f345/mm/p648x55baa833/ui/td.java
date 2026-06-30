package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class td implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.wd f146091e;

    public td(com.p314xaae8f345.mm.p648x55baa833.ui.wd wdVar, java.lang.String str) {
        this.f146091e = wdVar;
        this.f146090d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p648x55baa833.ui.wd wdVar = this.f146091e;
        wdVar.notifyDataSetChanged();
        java.util.List list = wdVar.f146163h;
        if (list == null || list.size() != 0) {
            wdVar.f146166n.f145521d.setVisibility(0);
            wdVar.f146166n.f145529o.setVisibility(8);
            str = "1";
        } else {
            wdVar.f146166n.f145521d.setVisibility(8);
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b activityC10374x1787784b = wdVar.f146166n;
            android.widget.TextView textView = activityC10374x1787784b.f145529o;
            java.lang.String string = activityC10374x1787784b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icq);
            java.lang.String string2 = wdVar.f146166n.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icp);
            java.lang.String str2 = this.f146090d;
            textView.setText(o13.q.d(string, string2, p13.i.a(str2, str2, false, false)).f432638a);
            wdVar.f146166n.f145529o.setVisibility(0);
            str = "0";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23903, 8, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), str, 2, wdVar.f146166n.f145528n);
    }
}
