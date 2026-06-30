package u4;

/* loaded from: classes13.dex */
public class m1 {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f506048b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f506047a = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f506049c = new java.util.ArrayList();

    /* renamed from: equals */
    public boolean m167515xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof u4.m1)) {
            return false;
        }
        u4.m1 m1Var = (u4.m1) obj;
        return this.f506048b == m1Var.f506048b && this.f506047a.equals(m1Var.f506047a);
    }

    /* renamed from: hashCode */
    public int m167516x8cdac1b() {
        return (this.f506048b.hashCode() * 31) + this.f506047a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167517x9616526c() {
        java.lang.String str = (("TransitionValues@" + java.lang.Integer.toHexString(m167516x8cdac1b()) + ":\n") + "    view = " + this.f506048b + "\n") + "    values:";
        java.util.Map map = this.f506047a;
        for (java.lang.String str2 : ((java.util.HashMap) map).keySet()) {
            str = str + "    " + str2 + ": " + ((java.util.HashMap) map).get(str2) + "\n";
        }
        return str;
    }
}
