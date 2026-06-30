package rp4;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f480150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f480151e;

    public d(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.widget.TextView textView) {
        this.f480150d = h0Var;
        this.f480151e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f480150d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "DEBUG showVideoDebugInfoIfNeed %s", h0Var.f391656d);
        android.widget.TextView textView = this.f480151e;
        textView.setVisibility(0);
        textView.setText((java.lang.CharSequence) h0Var.f391656d);
    }
}
