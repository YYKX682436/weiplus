package hr3;

/* loaded from: classes11.dex */
public class l1 extends wu5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365272d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2, java.lang.String str) {
        this.f365272d = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.String str = this.f365272d;
        qk.o b17 = r01.z.b(str);
        if (b17 != null) {
            if (b17.F0()) {
                return "_EnterpriseChat";
            }
            if (b17.I0()) {
                return "_EnterpriseFatherBiz";
            }
            if (b17.G0()) {
                return "_EnterpriseChildBiz";
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            return "_chatroom";
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str)) {
            return "_bottle";
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(str)) {
            return "_QQ";
        }
        if (!c01.e2.D(str)) {
            return "";
        }
        return "_" + str;
    }
}
