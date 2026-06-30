package yt3;

/* loaded from: classes3.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f547027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f547028e;

    public i1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.widget.TextView textView) {
        this.f547027d = h0Var;
        this.f547028e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f547027d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPlayPlugin", "DEBUG showVideoDebugInfoIfNeed %s", h0Var.f391656d);
        android.widget.TextView textView = this.f547028e;
        textView.setVisibility(0);
        textView.setText((java.lang.CharSequence) h0Var.f391656d);
    }
}
