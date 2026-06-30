package a83;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        if (a83.f.f83789a.b("rpt_oat_status")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.f2 f2Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.f2();
            for (a83.e eVar : a83.f.f83792d) {
                eVar.a(f2Var);
            }
            java.lang.String a17 = bm5.f1.a();
            java.util.List<java.util.Map.Entry> unmodifiableList = java.util.Collections.unmodifiableList(new java.util.ArrayList(f2Var.f274196a));
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
            com.p314xaae8f345.mm.sdk.p2603x2137b148.g2.a(a17, 258, sb6.toString());
        }
    }
}
