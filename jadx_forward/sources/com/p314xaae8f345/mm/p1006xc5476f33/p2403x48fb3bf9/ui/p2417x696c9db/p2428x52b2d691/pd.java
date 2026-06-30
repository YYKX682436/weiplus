package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class pd implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f267974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f267975g;

    public pd(nw4.k kVar, nw4.y2 y2Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17) {
        this.f267972d = kVar;
        this.f267973e = y2Var;
        this.f267974f = h0Var;
        this.f267975g = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        java.lang.String errMsg = (java.lang.String) this.f267974f.f391656d;
        nw4.k env = this.f267972d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        nw4.y2 msg = this.f267973e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        env.f422396d.e(msg.f422546c, msg.f422552i + errMsg, null);
        android.content.Context context = env.f422393a;
        if (this.f267975g && (context instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
    }
}
