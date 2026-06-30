package q72;

/* loaded from: classes4.dex */
public abstract class d {
    public static void a(java.util.Map map, r45.rq0 rq0Var) {
        java.util.LinkedList linkedList;
        if (map == null || rq0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTagParser", "maps is null or item is null");
            return;
        }
        rq0Var.f466629e.clear();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            linkedList = rq0Var.f466629e;
            if (i18 >= 1024) {
                break;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".favitem.taglist.tag");
            sb6.append(i18 > 0 ? java.lang.Integer.valueOf(i18) : "");
            java.lang.String str = (java.lang.String) map.get(sb6.toString());
            if (str == null) {
                break;
            }
            linkedList.add(str);
            i18++;
        }
        int i19 = 0;
        while (i19 < 1024) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(".favitem.tagidlist.tagid");
            sb7.append(i19 > 0 ? java.lang.Integer.valueOf(i19) : "");
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(sb7.toString()), -1);
            if (P > 0) {
                rq0Var.f466630f.add(java.lang.Integer.valueOf(P));
            }
            i19++;
        }
        linkedList.isEmpty();
        java.util.LinkedList linkedList2 = rq0Var.f466628d;
        linkedList2.clear();
        while (i17 < 1024) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(".favitem.recommendtaglist.tag");
            sb8.append(i17 > 0 ? java.lang.Integer.valueOf(i17) : "");
            java.lang.String str2 = (java.lang.String) map.get(sb8.toString());
            if (str2 == null) {
                break;
            }
            linkedList2.add(str2);
            i17++;
        }
        linkedList2.isEmpty();
    }
}
