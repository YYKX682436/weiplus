package qg5;

/* loaded from: classes.dex */
public final class l4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f444596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f444597e;

    public l4(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        this.f444596d = c0Var;
        this.f444597e = r2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f444596d.f391645d = true;
        p3325xe03a0797.p3326xc267989b.p2.a(this.f444597e, null, 1, null);
    }
}
