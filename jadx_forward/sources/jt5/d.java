package jt5;

/* loaded from: classes13.dex */
public class d implements jt5.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f383202a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f383203b = new java.util.ArrayList();

    @Override // jt5.b
    public void a(kt5.d dVar) {
        if (dVar.f393587c != 0) {
            return;
        }
        int i17 = dVar.f393586b;
        java.lang.String str = dVar.f393588d;
        if (i17 == 1 && !"/sbin/adbd".equals(str)) {
            ot5.g.c("RiskScanner", "ProcessRelationAnalyzer parent : " + dVar.m144387x9616526c());
            this.f383202a.add(java.lang.Integer.valueOf(dVar.f393585a));
            return;
        }
        if (i17 > 1 && "sh".equals(str) && "/system/bin/sh".equals(str)) {
            ot5.g.c("RiskScanner", "ProcessRelationAnalyzer child : " + dVar.m144387x9616526c());
            ((java.util.ArrayList) this.f383203b).add(dVar);
        }
    }

    @Override // jt5.b
    public boolean b() {
        java.util.Iterator it = ((java.util.ArrayList) this.f383203b).iterator();
        while (it.hasNext()) {
            kt5.d dVar = (kt5.d) it.next();
            if (this.f383202a.contains(java.lang.Integer.valueOf(dVar.f393586b))) {
                ot5.g.b("ProcessRelationAnalyzer match : " + dVar.m144387x9616526c());
                return true;
            }
        }
        return false;
    }
}
