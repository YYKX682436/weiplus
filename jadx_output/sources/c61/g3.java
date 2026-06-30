package c61;

/* loaded from: classes2.dex */
public final class g3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f38994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f38995e;

    public g3(android.app.Activity activity, zy2.i5 i5Var) {
        this.f38994d = activity;
        this.f38995e = i5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) c17).bl(this.f38994d, null);
        zy2.i5 i5Var = this.f38995e;
        if (i5Var != null) {
            i5Var.a(java.lang.Boolean.TRUE);
        }
        com.tencent.mm.plugin.finder.report.p2.f125237a.C(7, null);
    }
}
