package uo1;

/* loaded from: classes.dex */
public final class a implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f511075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f511076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f511077c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f511078d;

    public a(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, yz5.l lVar) {
        this.f511075a = i17;
        this.f511076b = f0Var;
        this.f511077c = g0Var;
        this.f511078d = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2
    /* renamed from: onDismiss */
    public final void mo51018xb349b3ab() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OnDismiss, originOption=");
        sb6.append(this.f511075a);
        sb6.append(" option=");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f511076b;
        sb6.append(f0Var.f391649d);
        sb6.append(", restartTime=");
        sb6.append(this.f511077c.f391654d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BackupUIUtils", sb6.toString());
        this.f511078d.mo146xb9724478(java.lang.Integer.valueOf(f0Var.f391649d));
    }
}
