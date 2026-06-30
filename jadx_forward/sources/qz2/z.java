package qz2;

/* loaded from: classes9.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f449462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 f449463f;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 activityC15524xc77ba000, java.lang.String str, int i17) {
        this.f449463f = activityC15524xc77ba000;
        this.f449461d = str;
        this.f449462e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f449461d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = this.f449463f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_k);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 activityC15524xc77ba000 = this.f449463f;
        db5.e1.E(activityC15524xc77ba000, str, "", activityC15524xc77ba000.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), false, new qz2.y(this));
    }
}
