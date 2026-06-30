package sm2;

/* loaded from: classes3.dex */
public final class c0 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f490922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f490923b;

    public c0(sm2.o4 o4Var, r45.hc1 hc1Var) {
        this.f490922a = o4Var;
        this.f490923b = hc1Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        sm2.o4 o4Var = this.f490922a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f491143f, "share live fail! anchorStatus=" + j17);
        pm0.v.X(new sm2.a0(o4Var, str, i17, i18));
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        sm2.o4 o4Var = this.f490922a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f491143f, "share live success! anchorStatus=" + j17);
        pm0.v.X(new sm2.b0(o4Var, j17, this.f490923b));
    }
}
