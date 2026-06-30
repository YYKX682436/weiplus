package hr3;

/* loaded from: classes9.dex */
public class f7 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f365077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.z9 f365078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f365079f;

    public f7(boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f365077d = z17;
        this.f365078e = z9Var;
        this.f365079f = u3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int n17 = c01.z1.n();
        boolean z17 = this.f365077d;
        int i17 = z17 ? n17 & (-32769) : n17 | 32768;
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) c01.d9.b().w()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            hr3.h7.c();
        }
        com.p314xaae8f345.mm.ui.z9 z9Var = this.f365078e;
        if (z9Var != null) {
            z9Var.mo735xb0dfc7d8(null, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f365079f;
        if (u3Var == null) {
            return true;
        }
        u3Var.dismiss();
        return true;
    }
}
