package c55;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f120255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f120256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a f120257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120258g;

    public c(android.widget.TextView textView, android.widget.TextView textView2, com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a, java.lang.String str) {
        this.f120255d = textView;
        this.f120256e = textView2;
        this.f120257f = activityC19821xb90ad83a;
        this.f120258g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46223x4a6103be;
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a = this.f120257f;
        java.lang.String string = activityC19821xb90ad83a.getString(i17);
        android.widget.TextView textView = this.f120255d;
        textView.setText(string);
        textView.setTextColor(activityC19821xb90ad83a.getColor(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25470x5a72f63.f46193x4d19443));
        java.lang.String str = this.f120258g;
        android.widget.TextView textView2 = this.f120256e;
        textView2.setText(str);
        textView2.setVisibility(0);
    }
}
