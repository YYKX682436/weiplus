package com.p314xaae8f345.mm.p1006xc5476f33.fav;

/* loaded from: classes12.dex */
public class i implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavNewXmlConsumer", "consumeNewXml subtype: %s values: %s", str, map.toString());
        str.getClass();
        if (str.equals("resendfavitem")) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var = c5432x35bb364f.f135776g;
            z9Var.f90061a = 39;
            z9Var.f90077q = (java.lang.String) map.get(".sysmsg.favitem.favid");
            z9Var.f90078r = (java.lang.String) map.get(".sysmsg.favitem.dataidlist");
            c5432x35bb364f.b(android.os.Looper.getMainLooper());
            o72.v2.b(0);
            return null;
        }
        if (!str.equals("uploadfavitem")) {
            return null;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var2 = c5432x35bb364f2.f135776g;
        z9Var2.f90061a = 38;
        z9Var2.f90077q = (java.lang.String) map.get(".sysmsg.favids");
        c5432x35bb364f2.b(android.os.Looper.getMainLooper());
        o72.v2.b(1);
        return null;
    }
}
