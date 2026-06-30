package qr3;

/* loaded from: classes9.dex */
public class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 f447651d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323) {
        this.f447651d = activityC16884xbfaa2323;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323 = this.f447651d;
        qk.o oVar2 = activityC16884xbfaa2323.f235709f;
        boolean z17 = oVar2 != null && oVar2.T0();
        java.lang.String d17 = activityC16884xbfaa2323.f235708e.d1();
        ((e21.z0) c01.d9.b().w()).c(new e21.m(d17, ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).r6(d17).I0()));
        activityC16884xbfaa2323.f235723w = false;
        activityC16884xbfaa2323.f235722v = db5.e1.Q(activityC16884xbfaa2323, activityC16884xbfaa2323.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16884xbfaa2323.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new qr3.w(activityC16884xbfaa2323));
        c01.w9.h(d17, new qr3.x(activityC16884xbfaa2323, z17, d17));
        r01.q3.nj().D0(d17);
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I(d17, 15);
        gr3.e.b(activityC16884xbfaa2323.f235708e.d1(), oc1.e.f73030x366c91de, activityC16884xbfaa2323.f235714n, activityC16884xbfaa2323.getIntent(), activityC16884xbfaa2323.f235716p);
        if (activityC16884xbfaa2323.f235708e == null || (oVar = activityC16884xbfaa2323.f235709f) == null || !oVar.Q0()) {
            return;
        }
        r01.q3.Zi().b(activityC16884xbfaa2323.f235708e.d1(), 17, 0, 0.0f, 0.0f, 0, null, 0, activityC16884xbfaa2323.f235724x, null);
    }
}
