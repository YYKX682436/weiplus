package ln4;

@j95.b
/* loaded from: classes4.dex */
public class g extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final pn4.q1 f401441d = pn4.o1.f438697a;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f401442e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(5, "ProcessTranslatedMessage", 1, android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final pn4.n1 f401443f = new ln4.f(this);

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f401444g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        pn4.n1 n1Var = this.f401443f;
        pn4.q1 q1Var = this.f401441d;
        if (n1Var == null) {
            q1Var.getClass();
            return;
        }
        java.util.ArrayList arrayList = q1Var.f438732c;
        if (arrayList.contains(n1Var)) {
            return;
        }
        arrayList.add(n1Var);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        pn4.n1 n1Var = this.f401443f;
        pn4.q1 q1Var = this.f401441d;
        if (n1Var != null) {
            java.util.ArrayList arrayList = q1Var.f438732c;
            if (arrayList.contains(n1Var)) {
                arrayList.remove(n1Var);
            }
        } else {
            q1Var.getClass();
        }
        pn4.e2[] e2VarArr = q1Var.f438731b;
        if (e2VarArr != null) {
            for (pn4.e2 e2Var : e2VarArr) {
                if (e2Var != null) {
                    c01.d9.e().q(631, e2Var);
                    if (e2Var.f438629f != null) {
                        e2Var.f438632i.d();
                        c01.d9.e().d(e2Var.f438629f);
                    }
                    e2Var.f438629f = null;
                    e2Var.f438628e = false;
                    e2Var.f438627d = null;
                }
            }
        }
        q1Var.f438734e.clear();
        ((java.util.LinkedList) q1Var.f438733d).clear();
        q1Var.f438732c.clear();
        q1Var.f438730a = 0;
    }
}
