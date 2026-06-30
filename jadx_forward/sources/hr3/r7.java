package hr3;

/* loaded from: classes5.dex */
public class r7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f365474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f365475e;

    public r7(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f365474d = u3Var;
        this.f365475e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f365474d;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f365475e.mo50305x3d8a09a2(0);
        }
    }
}
