package jt5;

/* loaded from: classes13.dex */
public class c implements jt5.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f383201a = new java.util.ArrayList();

    @Override // jt5.b
    public void a(kt5.d dVar) {
        if (dVar.f393587c != 0) {
            return;
        }
        java.lang.String str = dVar.f393589e;
        if (android.text.TextUtils.isEmpty(str) || !"u:r:zygote:s0".equals(str)) {
            return;
        }
        java.lang.String str2 = dVar.f393588d;
        if (android.text.TextUtils.isEmpty(str2) || "zygote".equals(str2) || "zygote64".equals(str2)) {
            return;
        }
        ot5.g.b("JavaProcessAnalyzer match : " + dVar.m144387x9616526c());
        ((java.util.ArrayList) this.f383201a).add(dVar);
    }

    @Override // jt5.b
    public boolean b() {
        return ((java.util.ArrayList) this.f383201a).size() > 0;
    }
}
