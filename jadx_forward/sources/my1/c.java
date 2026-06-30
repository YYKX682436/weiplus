package my1;

/* loaded from: classes13.dex */
public class c implements mk.d {
    public void a(java.lang.Object obj, java.util.Map map) {
        if (obj == null || map == null) {
            return;
        }
        if (!sz1.a.n(obj)) {
            if (sz1.a.m(obj)) {
                java.util.Map bj6 = cy1.a.Ui().bj(obj);
                if (bj6 != null && !bj6.isEmpty()) {
                    map.putAll(bj6);
                }
                java.lang.String[] strArr = {"biz_in", "biz_out", "session_in", "session_out", "page_in", "page_out"};
                for (int i17 = 0; i17 < 6; i17++) {
                    java.util.Map b17 = xy1.a.b(strArr[i17], uy1.a.j(obj, false));
                    if (b17 != null && !((java.util.HashMap) b17).isEmpty()) {
                        map.putAll(b17);
                    }
                }
                return;
            }
            return;
        }
        java.lang.String mj6 = cy1.a.Ui().mj(obj);
        if (!u46.l.e(mj6)) {
            map.put("view_id", mj6);
        }
        java.util.Map bj7 = cy1.a.Ui().bj(obj);
        if (bj7 != null && !bj7.isEmpty()) {
            map.putAll(bj7);
        }
        java.lang.String[] strArr2 = {"view_clk", "view_double_tap", "view_long_press", "view_scroll", "view_exp", "view_unexp"};
        for (int i18 = 0; i18 < 6; i18++) {
            java.util.Map b18 = xy1.b.b(strArr2[i18], uy1.a.l(obj, false));
            if (b18 != null && !((java.util.HashMap) b18).isEmpty()) {
                map.putAll(b18);
            }
        }
    }

    public java.util.List b(java.lang.Object obj) {
        vy1.b j17;
        java.util.Map map = null;
        if (obj == null) {
            return null;
        }
        if (sz1.a.n(obj)) {
            vy1.c l17 = uy1.a.l(obj, false);
            if (l17 != null) {
                map = l17.f522984i;
            }
        } else if (sz1.a.m(obj) && (j17 = uy1.a.j(obj, false)) != null) {
            map = j17.f522966l;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (map != null) {
            java.util.Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                java.util.List<ky1.d> list = (java.util.List) map.get(java.lang.Integer.valueOf(((java.lang.Integer) it.next()).intValue()));
                if (list != null) {
                    for (ky1.d dVar : list) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("route_type", java.lang.Integer.valueOf(dVar.f395032a));
                        hashMap.put("route_rule", java.lang.Integer.valueOf(dVar.f395033b));
                        hashMap.put("is_rt_report", java.lang.Boolean.valueOf(dVar.f395034c));
                        hashMap.put("is_batch_report", java.lang.Boolean.valueOf(dVar.f395035d));
                        arrayList.add(hashMap);
                    }
                }
            }
        }
        return arrayList;
    }

    public java.util.List c() {
        jz1.e Di = jz1.e.Di();
        Di.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        uz1.a aVar = Di.f384172f;
        aVar.iterator();
        while (aVar.hasNext()) {
            arrayList.add((android.view.View) aVar.next());
        }
        return arrayList;
    }
}
