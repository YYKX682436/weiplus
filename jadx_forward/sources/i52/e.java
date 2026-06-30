package i52;

/* loaded from: classes11.dex */
public abstract class e {
    public static r45.x35 a() {
        byte[] a17 = c52.c.a("hell_fgm_bun_mmkv_key");
        if (a17 == null || a17.length <= 0) {
            return null;
        }
        r45.x35 x35Var = new r45.x35();
        try {
            x35Var.mo11468x92b714fd(a17);
            return x35Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FragmentBundleDao", e17, "FragmentBundleDao _doRead parse", new java.lang.Object[0]);
            return null;
        }
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        java.util.LinkedList linkedList;
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
            if (p44Var != null && str.equals(p44Var.f464280d)) {
                linkedList.remove(p44Var);
                break;
            }
        }
        r45.p44 p44Var2 = new r45.p44();
        p44Var2.f464280d = str;
        p44Var2.f464281e = str2;
        linkedList.add(p44Var2);
        try {
            c52.c.d("hell_fgm_bun_mmkv_key", a17.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FragmentBundleDao", e17, "FragmentBundleDao writeBack", new java.lang.Object[0]);
        }
    }
}
