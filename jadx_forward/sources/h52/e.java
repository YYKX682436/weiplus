package h52;

/* loaded from: classes15.dex */
public abstract class e {
    public static r45.x35 a() {
        byte[] a17 = c52.c.a("mmkv_key_page_se_dao");
        if (a17 == null || a17.length <= 0) {
            return null;
        }
        r45.x35 x35Var = new r45.x35();
        try {
            x35Var.mo11468x92b714fd(a17);
            return x35Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.PageStateDao", e17, "PageStateDao _doRead parse", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String b(int i17) {
        java.lang.String str;
        r45.x35 a17 = a();
        if (a17 == null) {
            return null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.util.Iterator it = a17.f471287d.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            r45.p44 p44Var = (r45.p44) it.next();
            if (p44Var != null && valueOf.equals(p44Var.f464280d)) {
                str = p44Var.f464281e;
                break;
            }
        }
        if (str == null || str.equals("")) {
            return null;
        }
        java.lang.String[] split = str.split("\\|");
        if (split.length != 3) {
            return null;
        }
        return split[0];
    }

    public static nm5.c c(int i17) {
        java.lang.String str;
        r45.x35 a17 = a();
        if (a17 == null) {
            return null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.util.Iterator it = a17.f471287d.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            r45.p44 p44Var = (r45.p44) it.next();
            if (p44Var != null && valueOf.equals(p44Var.f464280d)) {
                str = p44Var.f464281e;
                break;
            }
        }
        if (str == null || str.equals("")) {
            return null;
        }
        java.lang.String[] split = str.split("\\|");
        if (split.length != 3) {
            return null;
        }
        return nm5.j.d(split[0], java.lang.Boolean.valueOf(split[1]), split[2]);
    }

    public static void d(java.lang.String str, java.lang.String str2, int i17) {
        java.util.LinkedList linkedList;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 e17;
        if (str == null || str.isEmpty()) {
            return;
        }
        java.lang.String canonicalName = (android.text.TextUtils.isEmpty(str2) && b52.b.k(str) && (e17 = i52.l.e(str)) != null) ? e17.getClass().getCanonicalName() : null;
        if (canonicalName == null) {
            canonicalName = "NULL";
        }
        java.lang.String str3 = str + "|" + (!canonicalName.equals("NULL")) + "|" + canonicalName;
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        r45.x35 a17 = a();
        if (a17 == null) {
            a17 = new r45.x35();
        }
        java.util.Iterator it = a17.f471287d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedList = a17.f471287d;
            if (!hasNext) {
                break;
            }
            r45.p44 p44Var = (r45.p44) it.next();
            if (p44Var != null && valueOf.equals(p44Var.f464280d)) {
                linkedList.remove(p44Var);
                break;
            }
        }
        r45.p44 p44Var2 = new r45.p44();
        p44Var2.f464280d = valueOf;
        p44Var2.f464281e = str3;
        linkedList.add(p44Var2);
        try {
            c52.c.d("mmkv_key_page_se_dao", a17.mo14344x5f01b1f6());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.PageStateDao", e18, "PageStateDao writeBack", new java.lang.Object[0]);
        }
    }
}
