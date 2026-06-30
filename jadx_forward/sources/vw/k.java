package vw;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 f522201a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 f522202b;

    /* renamed from: c, reason: collision with root package name */
    public r45.kl f522203c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f522204d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f522205e;

    public k() {
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1 t1Var = com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1.f299325c;
        this.f522201a = t1Var.a().b();
        this.f522202b = t1Var.f().b();
        this.f522204d = "isNeedFetchProfileInfo";
        this.f522205e = jz5.h.b(new vw.j(this));
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 a(int i17) {
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 p1Var = this.f522201a;
        if (i17 == 1) {
            return p1Var;
        }
        if (i17 == 2) {
            return this.f522202b;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizProfileDraftDataUtil", "Unknown bizType: " + i17);
        return p1Var;
    }
}
