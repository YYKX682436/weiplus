package p61;

/* loaded from: classes5.dex */
public class k2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f433835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 f433836e;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 activityC11366xcba74a33, java.lang.String str) {
        this.f433836e = activityC11366xcba74a33;
        this.f433835d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 activityC11366xcba74a33 = this.f433836e;
        s61.m1 m1Var = activityC11366xcba74a33.f154569m;
        java.lang.String str = this.f433835d;
        if (m1Var == null) {
            activityC11366xcba74a33.f154569m = new s61.m1(s61.l1.BINDMOBILE, activityC11366xcba74a33, new p61.q2(activityC11366xcba74a33, str));
        }
        activityC11366xcba74a33.f154569m.d(str);
        if (activityC11366xcba74a33.A) {
            activityC11366xcba74a33.f154569m.f484910n = false;
        }
    }
}
