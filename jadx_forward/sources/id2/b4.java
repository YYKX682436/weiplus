package id2;

/* loaded from: classes3.dex */
public final class b4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.j4 f372029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f372030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f372031f;

    public b4(id2.j4 j4Var, p3325xe03a0797.p3326xc267989b.q qVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f372029d = j4Var;
        this.f372030e = qVar;
        this.f372031f = c0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        id2.j4 j4Var = this.f372029d;
        j4Var.O6().f372436f = false;
        j4Var.f372168h = this.f372030e;
        this.f372031f.f391645d = true;
        id2.v3 v3Var = j4Var.O6().f372437g;
        if (v3Var != null) {
            v3Var.b();
        }
        id2.v3 v3Var2 = j4Var.O6().f372437g;
        if (v3Var2 != null) {
            v3Var2.d();
        }
    }
}
