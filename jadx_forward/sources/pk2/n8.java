package pk2;

/* loaded from: classes3.dex */
public final class n8 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f437574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f437576f;

    public n8(pk2.d9 d9Var, pk2.o9 o9Var, android.app.Activity activity) {
        this.f437574d = d9Var;
        this.f437575e = o9Var;
        this.f437576f = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public final void mo889xb349b3ab() {
        o25.y1 y1Var;
        this.f437574d.f437193c = null;
        pk2.o9 o9Var = this.f437575e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        android.app.Activity activity = this.f437576f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(activity, 14, r45.pk5.class);
        if (pk5Var != null) {
            pk5Var.f464665d = 1;
            pk5Var.f464673o = (int) (c01.id.c() - pk5Var.f464676r);
            pk5Var.f464670i = 8;
            pk2.d9 d9Var = o9Var.f437615f;
            pk5Var.f464669h = (d9Var == null || (y1Var = d9Var.f437199i) == null) ? 0 : ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).f270255e;
        }
        l35.a.f396976a.a(activity);
        qk2.f fVar = o9Var.f437619h;
        if (fVar != null) {
            fVar.d();
        }
        ((mm2.c1) o9Var.c(mm2.c1.class)).f410330e4.mo7808x76db6cb1(java.lang.Boolean.TRUE);
    }
}
