package rn2;

/* loaded from: classes3.dex */
public final class a1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f479174a;

    public a1(rn2.c1 c1Var) {
        this.f479174a = c1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        boolean b17 = ((com.p314xaae8f345.mm.p944x882e457a.f) obj).b();
        rn2.c1 c1Var = this.f479174a;
        if (b17) {
            rn2.g gVar = c1Var.f479200g;
            if (gVar != null) {
                ((rn2.t2) gVar).m162763x5cd39ffa();
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = c1Var.f479197d;
            activityC0065xcd7aa112.setResult(-1, activityC0065xcd7aa112.getIntent());
            activityC0065xcd7aa112.finish();
        } else {
            db5.t7.g(c1Var.f479197d, "保存抽奖失败");
        }
        return jz5.f0.f384359a;
    }
}
