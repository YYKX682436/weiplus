package id2;

/* loaded from: classes3.dex */
public final class e4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f372085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.j4 f372086e;

    public e4(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, id2.j4 j4Var) {
        this.f372085d = c0Var;
        this.f372086e = j4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f372085d.f391645d = true;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        id2.v3 v3Var = this.f372086e.O6().f372437g;
        if (v3Var != null) {
            v3Var.a();
        }
    }
}
