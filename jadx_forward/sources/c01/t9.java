package c01;

/* loaded from: classes11.dex */
public class t9 {

    /* renamed from: b, reason: collision with root package name */
    public static c01.t9 f118999b;

    /* renamed from: a, reason: collision with root package name */
    public c01.s9 f119000a;

    public static c01.t9 e() {
        synchronized (c01.t9.class) {
            if (f118999b == null) {
                f118999b = new c01.t9();
            }
        }
        return f118999b;
    }

    public c01.r9 a() {
        c01.r9 r9Var = c01.r9.NO_INIT;
        try {
            java.lang.String str = (java.lang.String) c01.d9.b().p().l(4097, "");
            java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(6, "");
            boolean z17 = (c01.z1.p() & 131072) == 0;
            c01.z1.p();
            if (str == null || str.length() <= 0) {
                str = null;
            }
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            return (str == null && str2 == null) ? r9Var : (str == null || str2 != null) ? z17 ? c01.r9.SUCC : c01.r9.SUCC_UNLOAD : c01.r9.SET_MOBILE;
        } catch (java.lang.Exception unused) {
            return r9Var;
        }
    }

    public void b(int i17, int i18) {
        android.content.SharedPreferences D = c01.d9.b().D("banner");
        if (D == null) {
            return;
        }
        android.content.SharedPreferences.Editor edit = D.edit();
        if (i18 == 1) {
            edit.remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
        } else if (i18 == 2) {
            edit.remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
            java.util.ArrayList arrayList = (java.util.ArrayList) c("HistoryInfo");
            if (!arrayList.contains(java.lang.Integer.valueOf(i17))) {
                arrayList.add(java.lang.Integer.valueOf(i17));
            }
            f("HistoryInfo", arrayList);
        } else if (i18 == 3 && i17 == 3) {
            edit.remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
        }
        c01.s9 s9Var = this.f119000a;
        if (s9Var != null) {
            ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.r) s9Var).a();
        }
    }

    public final java.util.List c(java.lang.String str) {
        android.content.SharedPreferences D = c01.d9.b().D("banner");
        if (D == null) {
            return null;
        }
        int i17 = D.getInt(str + "ArraySize", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(java.lang.Integer.valueOf(D.getInt(str + i18, 0)));
        }
        return arrayList;
    }

    public c01.q9 d() {
        android.content.SharedPreferences D = c01.d9.b().D("banner");
        if (D == null) {
            return null;
        }
        int i17 = D.getInt("CurrentType", -1);
        int i18 = D.getInt("CurrentShowType", -1);
        java.lang.String string = D.getString("CurrentData", "");
        if (i17 != -1) {
            c01.r9 r9Var = c01.r9.SUCC;
            if (i17 == 1) {
                c01.r9 a17 = a();
                if (a17 == r9Var || a17 == c01.r9.SUCC_UNLOAD) {
                    d01.f.wi().getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MainFrameBannerStorage", "already Bind the Mobile");
                } else {
                    d01.f.wi().getClass();
                }
            } else if (i17 != 2) {
                if (i17 == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MainFrameBannerStorage", "avatar already existed");
                    return null;
                }
                if (i17 == 11 || i17 == 10000 || i17 == 57005) {
                    return null;
                }
            } else {
                if (a() == r9Var) {
                    d01.f.wi().getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MainFrameBannerStorage", "already upload the contacts");
                    return null;
                }
                d01.f.wi().getClass();
            }
            return new c01.q9(i17, i18, string);
        }
        return null;
    }

    public final boolean f(java.lang.String str, java.util.List list) {
        android.content.SharedPreferences D = c01.d9.b().D("banner");
        if (D == null) {
            return false;
        }
        android.content.SharedPreferences.Editor edit = D.edit();
        edit.putInt(str + "ArraySize", list.size());
        for (int i17 = 0; i17 < list.size(); i17++) {
            edit.putInt(str + i17, ((java.lang.Integer) list.get(i17)).intValue());
        }
        return edit.commit();
    }

    public boolean g(c01.q9 q9Var) {
        android.content.SharedPreferences D;
        if (q9Var == null) {
            return false;
        }
        int i17 = q9Var.f118932a;
        if (i17 == 10000) {
            android.content.SharedPreferences D2 = c01.d9.b().D("banner");
            if (D2 != null) {
                D2.edit().clear().commit();
            }
            c01.s9 s9Var = this.f119000a;
            if (s9Var != null) {
                ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.r) s9Var).a();
            }
            return true;
        }
        if (i17 == 57005 || (D = c01.d9.b().D("banner")) == null) {
            return false;
        }
        android.content.SharedPreferences.Editor edit = D.edit();
        c01.q9 d17 = d();
        boolean contains = true ^ ((java.util.ArrayList) c("HistoryInfo")).contains(java.lang.Integer.valueOf(i17));
        if (d17 != null && d17.f118933b == 2) {
            java.util.List c17 = c("HistoryInfo");
            int i18 = d17.f118932a;
            java.util.ArrayList arrayList = (java.util.ArrayList) c17;
            if (!arrayList.contains(java.lang.Integer.valueOf(i18))) {
                arrayList.add(java.lang.Integer.valueOf(i18));
            }
            f("HistoryInfo", arrayList);
        }
        if (contains) {
            edit.putInt("CurrentType", i17).putInt("CurrentShowType", q9Var.f118933b).putString("CurrentData", q9Var.f118934c).commit();
        }
        c01.s9 s9Var2 = this.f119000a;
        if (s9Var2 != null) {
            ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.r) s9Var2).a();
        }
        return contains;
    }
}
