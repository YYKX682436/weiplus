package nf;

/* loaded from: classes7.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f418138a = java.util.Arrays.asList("android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_ADVERTISE");

    /* renamed from: b, reason: collision with root package name */
    public static si1.n0 f418139b = null;

    /* renamed from: c, reason: collision with root package name */
    public static nf.v f418140c;

    public static boolean a(android.app.Activity activity, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, final java.lang.String str, final int i17, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        si1.n0 n0Var;
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (!f418138a.contains(str) && (n0Var = f418139b) != null && lVar != null) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j0) n0Var).b(activity, lVar, str)) {
                return true;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j0) f418139b).c(activity, lVar, str, new si1.m0() { // from class: nf.t$$a
                @Override // si1.m0
                public final void a(int i19) {
                    si1.e1.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l.this.mo48798x74292566(), i17, new java.lang.String[]{str}, new int[]{i19}, false);
                }
            });
            return false;
        }
        if (f418140c == null) {
            try {
                if (b3.l.m9698x3fed0563(activity, str) == 0) {
                    return true;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    z2.h.a(activity, new java.lang.String[]{str}, i17);
                } else {
                    nf.u uVar = new nf.u(activity, str, i17);
                    java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhh);
                    java.lang.String string2 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhg);
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
                    builder.setMessage(str3).setTitle(str2).setCancelable(false).setPositiveButton(string, uVar).setNegativeButton(string2, (android.content.DialogInterface.OnClickListener) null);
                    builder.show();
                }
                return false;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.PermissionUtil", "check mpermission exception:%s.", e17);
                return true;
            }
        }
        if (i18 >= 31 && kz5.c0.i("android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_ADVERTISE").contains(str) && (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9)) {
            jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o0.f172054a;
            java.lang.String str5 = cf.c.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar).f158812e;
            java.lang.String str6 = str5 != null ? str5 : "";
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            java.lang.String format = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{str6}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            str4 = format;
        } else {
            str4 = "";
        }
        sb0.f fVar = (sb0.f) ((tb0.j) i95.n0.c(tb0.j.class));
        fVar.getClass();
        boolean d17 = j35.u.d(activity, str, true);
        if (!d17) {
            j35.u.k(activity, i17, new sb0.e(fVar, activity), new java.lang.String[]{str}, str2, str3, str4, null);
        }
        return d17;
    }

    public static boolean b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        si1.n0 n0Var;
        int i17;
        if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE") && android.os.Build.VERSION.SDK_INT > 30) {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        if ("android.permission.READ_EXTERNAL_STORAGE".equals(str) && (i17 = android.os.Build.VERSION.SDK_INT) >= 33) {
            if (i17 < 33 || !(b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_IMAGES") == 0 || b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_VIDEO") == 0)) {
                return (i17 >= 34 && b3.l.m9698x3fed0563(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) || b3.l.m9698x3fed0563(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
            }
            return true;
        }
        if (!f418138a.contains(str) && (n0Var = f418139b) != null && lVar != null) {
            n0Var.getClass();
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j0) f418139b).b(context, lVar, str);
        }
        try {
            return b3.l.m9698x3fed0563(context, str) == 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.PermissionUtil", "check mpermission exception:%s.", e17);
            return false;
        }
    }
}
