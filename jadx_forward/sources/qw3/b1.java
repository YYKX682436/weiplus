package qw3;

/* loaded from: classes9.dex */
public class b1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h7 f448676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ow3.m f448677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 f448678f;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7, r45.h7 h7Var, ow3.m mVar) {
        this.f448678f = activityC17105xa1fb9be7;
        this.f448676d = h7Var;
        this.f448677e = mVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        boolean z17;
        r45.h7 h7Var = this.f448676d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h7Var.f457429h);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7 = this.f448678f;
        if (!K0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h7Var.f457429h)) {
                return;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC17105xa1fb9be7.mo55332x76847179(), h7Var.f457429h, false);
        } else {
            z17 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC17105xa1fb9be7).f39902xe856ec83;
            if (z17) {
                activityC17105xa1fb9be7.mo73913x2b33b77f();
            }
            r45.or5 or5Var = this.f448677e.f430960s;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7.V6(activityC17105xa1fb9be7, or5Var.f463999f, or5Var.f464002i, or5Var.f464003m, or5Var.f464001h);
        }
    }
}
