package c55;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f120251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f120252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.io.File f120253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a f120254g;

    public b(android.widget.TextView textView, android.widget.TextView textView2, java.io.File file, com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a) {
        this.f120251d = textView;
        this.f120252e = textView2;
        this.f120253f = file;
        this.f120254g = activityC19821xb90ad83a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.io.File file = this.f120253f;
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a = this.f120254g;
        java.lang.String string = file != null ? activityC19821xb90ad83a.getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46224xc7f2a39b) : activityC19821xb90ad83a.getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46221xb5024505);
        android.widget.TextView textView = this.f120251d;
        textView.setText(string);
        textView.setTextColor(activityC19821xb90ad83a.getColor(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25470x5a72f63.f46192x16288635));
        this.f120252e.setVisibility(8);
    }
}
