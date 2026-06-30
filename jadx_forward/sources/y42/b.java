package y42;

/* loaded from: classes7.dex */
public class b extends x42.a {

    /* renamed from: a, reason: collision with root package name */
    public p42.a f540875a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f540876b = new java.util.HashMap();

    @Override // x42.b
    public java.lang.String a() {
        return "read_edge_db_data";
    }

    @Override // x42.b
    public java.lang.Object b(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        java.util.List<java.util.List> list;
        if (c1469x28b0ccd7 != null && c1469x28b0ccd7.mo16304xbe0e3ae6() >= 1) {
            java.lang.String mo16298x2fec8307 = c1469x28b0ccd7.mo16298x2fec8307(0);
            g42.i.a("EdgeComputingJsApiBase", "[EdgeComputingJsApiReadEdgeDBData] logic, sql : " + mo16298x2fec8307);
            if (u46.l.e(mo16298x2fec8307)) {
                return null;
            }
            java.util.Map map = this.f540876b;
            if (((java.util.HashMap) map).containsKey(mo16298x2fec8307)) {
                list = (java.util.List) ((java.util.HashMap) map).get(mo16298x2fec8307);
            } else {
                if (this.f540875a == null) {
                    this.f540875a = new p42.a();
                }
                list = this.f540875a.b("Edge.db", mo16298x2fec8307);
                ((java.util.HashMap) map).put(mo16298x2fec8307, list);
            }
            if (list != null && list.size() > 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (java.util.List<java.lang.String> list2 : list) {
                    if (list2 != null && list2.size() > 0) {
                        if (sb6.length() > 0) {
                            sb6.append(";");
                        }
                        int i17 = 0;
                        for (java.lang.String str : list2) {
                            if (str == null) {
                                str = "";
                            }
                            if (u46.l.a(str, ",")) {
                                str = u46.l.o(str, ",", "\\#");
                            }
                            if (u46.l.a(str, ";")) {
                                str = u46.l.o(str, ";", "\\$");
                            }
                            sb6.append(str);
                            if (i17 < list2.size() - 1) {
                                sb6.append(",");
                            }
                            i17++;
                        }
                    }
                }
                return sb6.toString();
            }
        }
        return null;
    }

    @Override // x42.b
    /* renamed from: getType */
    public int mo174983xfb85f7b0() {
        return 5;
    }

    @Override // x42.b
    /* renamed from: release */
    public void mo174984x41012807() {
        ((java.util.HashMap) this.f540876b).clear();
        p42.a aVar = this.f540875a;
        if (aVar != null) {
            aVar.c();
            this.f540875a = null;
        }
    }
}
