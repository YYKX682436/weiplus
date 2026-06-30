package if3;

@j95.b
/* loaded from: classes.dex */
public class k0 extends i95.w implements f90.e {

    /* renamed from: d, reason: collision with root package name */
    public if3.z f372716d;

    /* renamed from: e, reason: collision with root package name */
    public if3.a0 f372717e;

    public static if3.z Ai() {
        gm0.j1.b().c();
        if (wi().f372716d == null) {
            wi().f372716d = new if3.z(c01.d9.b().s());
        }
        return wi().f372716d;
    }

    public static if3.a0 Bi() {
        if (wi().f372717e == null) {
            wi().f372717e = new if3.a0();
            if (Ni()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreMassSend", "Enable MassSend image migration");
                if3.f0.c(false);
            }
        }
        return wi().f372717e;
    }

    public static boolean Ni() {
        boolean equals = "1".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_masssend_image_migration_enabled", "0"));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        java.lang.String str = "masssend_image_migration_enabled_" + gm0.j1.b().h();
        if (equals && !L.getBoolean(str, false)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G(str, true);
        }
        return equals;
    }

    public static if3.k0 wi() {
        return (if3.k0) i95.n0.c(if3.k0.class);
    }

    public void Di(android.content.Context activity) {
        Bi().getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BIZ_SCENE", 7);
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        arrayList.add(5);
        intent.putIntegerArrayListExtra("TAB_LIST", arrayList);
        intent.putExtra("IS_SHOW_MENU_SEARCH", true);
        intent.putExtra("IS_SHOW_MENU_POST", true);
        ((android.app.Activity) activity).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).yj(activity, intent, 10);
    }
}
