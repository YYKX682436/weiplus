package jt5;

/* loaded from: classes13.dex */
public class g implements jt5.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f383204a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.regex.Pattern f383205b = java.util.regex.Pattern.compile("^/system/xbin/ku\\.sud$|^daemonsu:|^k_worker/[1-9]\\d*:[1-9]\\d*$|^kr_worker/[1-9]\\d*:[1-9]\\d*$|^km_worker/[1-9]\\d*:[1-9]\\d*$|^tworker/[1-9]\\d*:[1-9]\\d*$|^tu_worker/[1-9]\\d*:[1-9]\\d*$|^tq_worker/[1-9]\\d*:[1-9]\\d*$|^kworker/[1-9]\\d{2}$|^permmgrd$|^360sguard$|^/data/data/[\\w\\-\\.]+/");

    @Override // jt5.b
    public void a(kt5.d dVar) {
        if (dVar.f393587c == 0 && dVar.f393586b == 1) {
            ((java.util.ArrayList) this.f383204a).add(dVar);
        }
    }

    @Override // jt5.b
    public boolean b() {
        java.util.Iterator it = ((java.util.ArrayList) this.f383204a).iterator();
        while (it.hasNext()) {
            kt5.d dVar = (kt5.d) it.next();
            ot5.g.c("RiskScanner", "SingleProcessAnalyzer : " + dVar.m144387x9616526c());
            java.lang.String str = dVar.f393588d;
            if (str != null && this.f383205b.matcher(str).find()) {
                ot5.g.b("SingleProcessAnalyzer match : " + dVar.m144387x9616526c());
                return true;
            }
        }
        return false;
    }
}
