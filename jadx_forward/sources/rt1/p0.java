package rt1;

/* loaded from: classes7.dex */
public final class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b f481003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f481004e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b activityC13030x3e5b0a3b, java.lang.String str) {
        this.f481003d = activityC13030x3e5b0a3b;
        this.f481004e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        rt1.z0 z0Var = this.f481003d.f176150f;
        if (z0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        rt1.p1 p1Var = (rt1.p1) z0Var;
        java.lang.String plateNo = this.f481004e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plateNo, "plateNo");
        p3325xe03a0797.p3326xc267989b.l.d(p1Var.a(), null, null, new rt1.g1(plateNo, p1Var, null), 3, null);
    }
}
