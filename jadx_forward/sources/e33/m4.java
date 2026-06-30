package e33;

/* loaded from: classes10.dex */
public class m4 implements t23.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b f328893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f328894b;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b) {
        this.f328894b = activityC15656x6f26b561;
        this.f328893a = c15635xf0ea441b;
    }

    @Override // t23.q2
    public void a(t23.r2 r2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f328894b;
        if (r2Var.m165765xb2c87fbf(activityC15656x6f26b561.X.getTag())) {
            activityC15656x6f26b561.X.setTag(null);
        }
        if (r2Var.f496789e != activityC15656x6f26b561.f220126o.intValue()) {
            return;
        }
        activityC15656x6f26b561.A7(activityC15656x6f26b561.f220138x0, activityC15656x6f26b561.B7(r2Var.f496788d, r2Var.f496792h, activityC15656x6f26b561.f220138x0), this.f328893a);
        activityC15656x6f26b561.i7();
    }
}
