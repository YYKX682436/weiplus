package a83;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        if (a83.f.f2256a.b("rpt_oat_status")) {
            com.tencent.mm.sdk.platformtools.f2 f2Var = new com.tencent.mm.sdk.platformtools.f2();
            for (a83.e eVar : a83.f.f2259d) {
                eVar.a(f2Var);
            }
            java.lang.String a17 = bm5.f1.a();
            java.util.List<java.util.Map.Entry> unmodifiableList = java.util.Collections.unmodifiableList(new java.util.ArrayList(f2Var.f192663a));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(64);
            sb6.append('{');
            if (!unmodifiableList.isEmpty()) {
                boolean z17 = true;
                for (java.util.Map.Entry entry : unmodifiableList) {
                    if (z17) {
                        z17 = false;
                    } else {
                        sb6.append(',');
                    }
                    sb6.append('\"');
                    sb6.append((java.lang.String) entry.getKey());
                    sb6.append("\":");
                    java.lang.Object value = entry.getValue();
                    if ((value == null || (value instanceof java.lang.Boolean) || (value instanceof java.lang.Number)) ? false : true) {
                        sb6.append('\"');
                        sb6.append(value);
                        sb6.append('\"');
                    } else {
                        sb6.append(value);
                    }
                }
            }
            sb6.append('}');
            com.tencent.mm.sdk.platformtools.g2.a(a17, 258, sb6.toString());
        }
    }
}
