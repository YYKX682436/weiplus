package c55;

/* loaded from: classes12.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a f120272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120273e;

    public j(com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a, java.lang.String str) {
        this.f120272d = activityC19821xb90ad83a;
        this.f120273e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a = this.f120272d;
        android.widget.TextView textView = activityC19821xb90ad83a.f273723g;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveLogToDownloadDirStatus");
            throw null;
        }
        textView.setText(activityC19821xb90ad83a.getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46223x4a6103be));
        textView.setTextColor(activityC19821xb90ad83a.getColor(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25470x5a72f63.f46193x4d19443));
        android.widget.TextView textView2 = activityC19821xb90ad83a.f273724h;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveLogToDownloadDirError");
            throw null;
        }
        textView2.setText(this.f120273e);
        textView2.setVisibility(0);
    }
}
