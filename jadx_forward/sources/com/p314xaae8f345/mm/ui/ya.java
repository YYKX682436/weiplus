package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class ya implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f294113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f294116g;

    public ya(com.p314xaae8f345.mm.ui.ga gaVar, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f294116g = gaVar;
        this.f294113d = z17;
        this.f294114e = str;
        this.f294115f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f294116g;
        android.view.View view = gaVar.f290173e;
        int i17 = this.f294113d ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/MMActivityController$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String string = gaVar.f290205u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573830fz3);
        java.lang.String str = this.f294114e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = gaVar.f290205u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572585bq2);
        }
        if (this.f294115f != null) {
            android.text.SpannableString spannableString = new android.text.SpannableString(str + string);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(-10119449), str.length(), str.length() + string.length(), 33);
            gaVar.f290175f.setText(spannableString);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActivityController", "summerdiz url is null 2");
            gaVar.f290175f.setText(str);
        }
        gaVar.f290173e.invalidate();
        gaVar.f290177g.invalidate();
    }
}
