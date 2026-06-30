package o25;

/* loaded from: classes9.dex */
public class p2 extends com.p314xaae8f345.mm.app.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f424105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.e1 f424106e;

    public p2(o25.q2 q2Var, android.content.Context context, l81.e1 e1Var) {
        this.f424105d = context;
        this.f424106e = e1Var;
    }

    @Override // com.p314xaae8f345.mm.app.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (activity == this.f424105d) {
            ((android.app.Application) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).unregisterActivityLifecycleCallbacks(this);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).hj(this.f424106e);
        }
    }
}
