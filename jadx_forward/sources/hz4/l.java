package hz4;

/* loaded from: classes12.dex */
public abstract class l {
    public static o72.r2 a(long j17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
    }

    public static java.lang.String b(java.lang.String str, int i17) {
        return kk.k.g((str + i17 + java.lang.System.currentTimeMillis()).getBytes());
    }

    public static java.lang.String c(r45.gp0 gp0Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 27;
        z9Var.f90066f = gp0Var;
        c5432x35bb364f.e();
        return c5432x35bb364f.f135777h.f87669c;
    }

    public static java.lang.String d(float f17) {
        return f17 < 1024.0f ? java.lang.String.format("%.1fB", java.lang.Float.valueOf(f17)) : f17 < 1048576.0f ? java.lang.String.format("%.1fKB", java.lang.Float.valueOf(f17 / 1024.0f)) : f17 < 1.0737418E9f ? java.lang.String.format("%.1fMB", java.lang.Float.valueOf((f17 / 1024.0f) / 1024.0f)) : java.lang.String.format("%.1fGB", java.lang.Float.valueOf(((f17 / 1024.0f) / 1024.0f) / 1024.0f));
    }

    public static java.lang.String e(r45.gp0 gp0Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 27;
        z9Var.f90066f = gp0Var;
        c5432x35bb364f.e();
        return c5432x35bb364f.f135777h.f87670d;
    }

    public static float f(long j17) {
        float f17 = ((float) j17) / 1000.0f;
        if (f17 < 1.0f) {
            f17 = 1.0f;
        }
        return java.lang.Math.round(f17);
    }

    public static void g(r45.bq0 bq0Var, long j17, java.lang.String str) {
        java.lang.String group;
        int indexOf;
        int i17;
        int indexOf2;
        int indexOf3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() == 0) {
            return;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("<object[^>]*>", 2).matcher(str);
        while (matcher.find() && (indexOf = (group = matcher.group()).indexOf("WeNote_")) != -1 && (indexOf2 = group.indexOf("\"", (i17 = indexOf + 1))) != -1 && (indexOf3 = group.indexOf(" ", i17)) != -1) {
            if (indexOf2 >= indexOf3) {
                indexOf2 = indexOf3;
            }
            arrayList.add(group.substring(indexOf, indexOf2));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = bq0Var.f452497f.iterator();
        int i18 = 0;
        int i19 = 0;
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (i18 == 0) {
                gp0Var.t0("WeNoteHtmlFile");
                i18++;
                linkedList.add(gp0Var);
            } else {
                if (gp0Var.I == 1) {
                    gp0Var.t0("-1");
                } else {
                    gp0Var.t0((java.lang.String) arrayList.get(i19));
                    i19++;
                }
                linkedList.add(gp0Var);
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 33;
        z9Var.f90064d = bq0Var;
        bq0Var.f452497f = linkedList;
        z9Var.f90065e = j17;
        c5432x35bb364f.e();
    }

    public static void h(long j17, java.lang.String str) {
        java.util.LinkedList linkedList;
        if (j17 <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 34;
        z9Var.f90065e = j17;
        c5432x35bb364f.e();
        r45.bq0 bq0Var = z9Var.f90064d;
        if (bq0Var != null && (linkedList = bq0Var.f452497f) != null && linkedList.size() > 1 && ((r45.gp0) z9Var.f90064d.f452497f.get(0)).P1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteFavLogic", "Note: Htmlid is null,  do updateFavItemHtmlIdStorage");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                return;
            }
            try {
                g(z9Var.f90064d, j17, com.p314xaae8f345.mm.vfs.w6.M(str));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteFavLogic", "Note: FileNotFoundException :%s", e17.getMessage());
            }
        }
    }
}
