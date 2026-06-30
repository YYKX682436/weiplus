package qg5;

/* loaded from: classes.dex */
public final class p3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f444664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f444665e;

    public p3(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        this.f444664d = c0Var;
        this.f444665e = r2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f444664d.f391645d = true;
        p3325xe03a0797.p3326xc267989b.p2.a(this.f444665e, null, 1, null);
    }
}
