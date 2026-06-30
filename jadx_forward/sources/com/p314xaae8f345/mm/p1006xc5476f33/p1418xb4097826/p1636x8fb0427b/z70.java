package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class z70 {

    /* renamed from: e */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k80 f209969e;

    /* renamed from: a */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70 f209965a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70();

    /* renamed from: b */
    public static final jz5.g f209966b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y70.f209882d);

    /* renamed from: c */
    public static final boolean f209967c = kb2.b.f387758a.a();

    /* renamed from: d */
    public static final jz5.g f209968d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x70.f209825d);

    /* renamed from: f */
    public static final jz5.g f209970f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.w70.f209767d);

    public static /* synthetic */ java.lang.Object f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70 z70Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var, java.lang.String str, e42.b0 b0Var, java.lang.Object obj, boolean z17, yz5.a aVar, int i17, java.lang.Object obj2) {
        if ((i17 & 8) != 0) {
            z17 = true;
        }
        return z70Var.e(t70Var, str, b0Var, obj, z17, aVar);
    }

    public final java.lang.Object a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var, java.lang.String title, java.lang.String dyConfigKey, java.lang.Object obj, yz5.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.l80 l80Var;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t70Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dyConfigKey, "dyConfigKey");
        boolean z17 = f209967c;
        if (z17) {
            l80Var = aVar != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.l80) aVar.mo152xb9724478() : null;
            lb2.j a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d90.f208168a.a(title, obj, l80Var);
            if (a17 != null) {
                a17.b(dyConfigKey);
            }
            obj2 = c(title, obj, l80Var);
        } else {
            l80Var = null;
            obj2 = null;
        }
        if (obj2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14991xce12a441 c14991xce12a441 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14991xce12a441) ((jz5.n) f209970f).mo141623x754a37bb();
            c14991xce12a441.getClass();
            java.lang.Object obj3 = c14991xce12a441.c().get(dyConfigKey);
            if (obj3 == null) {
                obj3 = c14991xce12a441.d(dyConfigKey, obj);
            } else if (kb2.b.f387758a.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14991xce12a441.f207901d, "dynamic config " + dyConfigKey + " cache result=" + obj3);
            }
            if (obj3 == null) {
                obj3 = null;
            }
            obj2 = obj3 == null ? obj : obj3;
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("valueFromDynamicConfig ");
                sb6.append(title);
                sb6.append(' ');
                sb6.append(l80Var != null ? l80Var.f208649a : null);
                sb6.append(" config from server value=");
                sb6.append(obj2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigExtension", sb6.toString());
            }
        } else if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("valueFromDynamicConfig ");
            sb7.append(title);
            sb7.append(' ');
            sb7.append(l80Var != null ? l80Var.f208649a : null);
            sb7.append(" config from local value=");
            sb7.append(obj2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigExtension", sb7.toString());
        }
        return obj2 == null ? obj : obj2;
    }

    public final java.lang.Object b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var, java.lang.String title, int i17, java.lang.String exptKey, java.lang.Object obj, yz5.a localSettingParamsCall) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.l80 l80Var;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t70Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exptKey, "exptKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localSettingParamsCall, "localSettingParamsCall");
        boolean z17 = f209967c;
        if (z17) {
            l80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.l80) localSettingParamsCall.mo152xb9724478();
            lb2.j a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d90.f208168a.a(title, obj, l80Var);
            if (a17 != null) {
                a17.g(i17, exptKey);
            }
            obj2 = c(title, obj, l80Var);
        } else {
            l80Var = null;
            obj2 = null;
        }
        if (obj2 == null) {
            if (f209969e == null) {
                synchronized (t70Var) {
                    if (f209969e == null) {
                        f209969e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k80();
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k80 k80Var = f209969e;
            if (k80Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.g80 g80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.g80) k80Var.c().get(exptKey);
                obj2 = g80Var != null ? g80Var.f208350c : null;
                if (obj2 == null) {
                    obj2 = k80Var.d(i17, exptKey, obj);
                } else if (((java.lang.Boolean) ((jz5.n) k80Var.f208588a).mo141623x754a37bb()).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigInitExptData", "cmdId=" + i17 + " (" + exptKey + ") cache result=" + obj2);
                }
                if (obj2 == null) {
                    obj2 = null;
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
            } else {
                obj2 = null;
            }
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("valueFromFinderInitExpt ");
                sb6.append(title);
                sb6.append(' ');
                sb6.append(l80Var != null ? l80Var.f208649a : null);
                sb6.append(" config from server value=");
                sb6.append(obj2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigExtension", sb6.toString());
            }
        } else if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("valueFromFinderInitExpt ");
            sb7.append(title);
            sb7.append(' ');
            sb7.append(l80Var != null ? l80Var.f208649a : null);
            sb7.append(" config from local value=");
            sb7.append(obj2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigExtension", sb7.toString());
        }
        return obj2 == null ? obj : obj2;
    }

    public final java.lang.Object c(java.lang.String str, java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.l80 l80Var) {
        java.lang.String str2;
        java.lang.String str3;
        if (!f209967c) {
            return null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f209966b).mo141623x754a37bb();
        java.lang.String str4 = "";
        if (l80Var == null || (str2 = l80Var.f208649a) == null) {
            str2 = "";
        }
        int i17 = o4Var.getInt(str2, -1);
        java.util.List list = l80Var != null ? l80Var.f208650b : null;
        java.lang.Object obj2 = (list == null || i17 < 0 || i17 >= list.size()) ? null : list.get(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (l80Var != null && (str3 = l80Var.f208653e) != null) {
            str4 = str3;
        }
        sb6.append(str4);
        sb6.append(" valueFromLocalSetting ");
        sb6.append(str);
        sb6.append(" mmkvKey ");
        sb6.append(l80Var != null ? l80Var.f208649a : null);
        sb6.append(" index ");
        sb6.append(i17);
        sb6.append(" result=");
        sb6.append(obj2);
        sb6.append(" defValue:");
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigExtension", sb6.toString());
        return obj2;
    }

    public final java.lang.Object d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var, java.lang.String title, java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.l80 localSettingParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t70Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localSettingParams, "localSettingParams");
        java.lang.Object c17 = c(title, obj, localSettingParams);
        if (c17 == null) {
            c17 = obj;
        }
        if (f209967c) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d90.f208168a.a(title, obj, localSettingParams);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigExtension", "valueFromSetting " + title + ' ' + localSettingParams.f208649a + " config value=" + c17);
        }
        return c17;
    }

    public final java.lang.Object e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var, java.lang.String title, e42.b0 xLabKey, java.lang.Object obj, boolean z17, yz5.a localSettingParamsCall) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.l80 l80Var;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t70Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xLabKey, "xLabKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localSettingParamsCall, "localSettingParamsCall");
        boolean z18 = f209967c;
        if (z18) {
            l80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.l80) localSettingParamsCall.mo152xb9724478();
            lb2.j a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d90.f208168a.a(title, obj, l80Var);
            if (a17 != null) {
                a17.c(xLabKey, z17);
            }
            obj2 = c(title, obj, l80Var);
        } else {
            l80Var = null;
            obj2 = null;
        }
        if (obj2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14993xc432da87 c14993xc432da87 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14993xc432da87) ((jz5.n) f209968d).mo141623x754a37bb();
            c14993xc432da87.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.m80 m80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.m80) c14993xc432da87.c().get(xLabKey.mo122878x337a8b());
            java.lang.Object obj3 = m80Var != null ? m80Var.f208711b : null;
            if (obj3 == null) {
                obj3 = c14993xc432da87.d(xLabKey, obj, z17);
            } else if (kb2.b.f387758a.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14993xc432da87.f207903d, xLabKey + " cache result=" + obj3);
            }
            if (obj3 == null) {
                obj3 = null;
            }
            obj2 = obj3 == null ? obj : obj3;
            if (z18) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("valueFromXLab ");
                sb6.append(title);
                sb6.append('(');
                sb6.append(l80Var != null ? l80Var.f208649a : null);
                sb6.append(") config from server value=");
                sb6.append(obj2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigExtension", sb6.toString());
            }
        } else if (z18) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("valueFromXLab ");
            sb7.append(title);
            sb7.append('(');
            sb7.append(l80Var != null ? l80Var.f208649a : null);
            sb7.append(")  config from local value=");
            sb7.append(obj2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigExtension", sb7.toString());
        }
        return obj2 == null ? obj : obj2;
    }
}
