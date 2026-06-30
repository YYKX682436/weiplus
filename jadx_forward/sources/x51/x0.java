package x51;

/* loaded from: classes8.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x51.x0 f533642a = new x51.x0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f533643b;

    /* renamed from: c, reason: collision with root package name */
    public static final jt0.j f533644c;

    static {
        java.lang.String str = lp0.b.e() + "media_export.proto";
        f533643b = str;
        jt0.j jVar = new jt0.j(500);
        f533644c = jVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaExportLogic", "readFromCache");
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
        jVar.mo143584x5a5b64d();
        if (N != null) {
            if (!(N.length == 0)) {
                try {
                    r45.dj4 dj4Var = new r45.dj4();
                    dj4Var.mo11468x92b714fd(N);
                    java.util.LinkedList<r45.ej4> exportInfoList = dj4Var.f454063d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(exportInfoList, "exportInfoList");
                    for (r45.ej4 ej4Var : exportInfoList) {
                        jVar.put(ej4Var.f455104d, ej4Var);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaExportLogic", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.vfs.w6.h(str);
                }
            }
        }
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        if (str != null && str2 != null) {
            r45.ej4 ej4Var = new r45.ej4();
            ej4Var.f455104d = str;
            ej4Var.f455105e = str2;
            f533644c.put(str, ej4Var);
            b();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaExportLogic", "saveExportUUID " + str + ", " + str2);
    }

    public final void b() {
        java.util.Map l17 = f533644c.l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaExportLogic", "saveToCache " + l17.size());
        r45.dj4 dj4Var = new r45.dj4();
        java.util.Iterator it = l17.entrySet().iterator();
        while (it.hasNext()) {
            dj4Var.f454063d.add(((java.util.Map.Entry) it.next()).getValue());
        }
        try {
            com.p314xaae8f345.mm.vfs.w6.R(f533643b, dj4Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaExportLogic", e17, "", new java.lang.Object[0]);
        }
    }
}
