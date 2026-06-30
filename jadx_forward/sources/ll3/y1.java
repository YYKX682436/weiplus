package ll3;

/* loaded from: classes10.dex */
public final class y1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f400792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b21.r f400793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.hf2 f400794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 f400795d;

    public y1(android.content.Context context, b21.r rVar, r45.hf2 hf2Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var) {
        this.f400792a = context;
        this.f400793b = rVar;
        this.f400794c = hf2Var;
        this.f400795d = a5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var = this.f400795d;
        try {
            ll3.h2.f400713a.c(this.f400792a, this.f400793b, this.f400794c);
            if (a5Var != null) {
                a5Var.a(true, false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MusicUIUtil", e17, "launchQQMusic exception", new java.lang.Object[0]);
            if (a5Var != null) {
                a5Var.a(false, false);
            }
        }
    }
}
