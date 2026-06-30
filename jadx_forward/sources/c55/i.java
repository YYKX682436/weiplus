package c55;

/* loaded from: classes12.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a f120270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f120271e;

    public i(com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f120270d = activityC19821xb90ad83a;
        this.f120271e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a = this.f120270d;
        android.widget.TextView textView = activityC19821xb90ad83a.f273723g;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveLogToDownloadDirStatus");
            throw null;
        }
        textView.setText(this.f120271e.f391656d != null ? activityC19821xb90ad83a.getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46224xc7f2a39b) : activityC19821xb90ad83a.getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46221xb5024505));
        textView.setTextColor(activityC19821xb90ad83a.getColor(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25470x5a72f63.f46192x16288635));
        android.widget.TextView textView2 = activityC19821xb90ad83a.f273724h;
        if (textView2 != null) {
            textView2.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveLogToDownloadDirError");
            throw null;
        }
    }
}
