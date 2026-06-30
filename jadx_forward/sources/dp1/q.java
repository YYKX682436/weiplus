package dp1;

/* loaded from: classes14.dex */
public final class q implements dp1.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f323704a = new java.util.HashMap();

    public q(dp1.o oVar) {
    }

    @Override // dp1.m
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        dp1.m mVar = (dp1.m) ((java.util.HashMap) this.f323704a).get(java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d));
        if (mVar == null) {
            return false;
        }
        return mVar.a(c12886x91aa2b6d);
    }

    @Override // dp1.m
    public boolean b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        dp1.m mVar = (dp1.m) ((java.util.HashMap) this.f323704a).get(java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d));
        if (mVar == null) {
            return false;
        }
        return mVar.b(context, c12886x91aa2b6d);
    }

    @Override // dp1.m
    public boolean c(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        dp1.m mVar = (dp1.m) ((java.util.HashMap) this.f323704a).get(java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d));
        if (mVar == null) {
            return false;
        }
        return mVar.c(textView, c12886x91aa2b6d);
    }
}
