package i45;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f369933a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f369934b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f369935c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f369936d;

    public d(android.view.View view, java.lang.String action, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f369933a = view;
        this.f369934b = action;
        this.f369935c = bundle;
        this.f369936d = view.getContext();
    }

    public static /* synthetic */ void b(i45.d dVar, long j17, java.lang.String str, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = "";
        }
        if ((i17 & 4) != 0) {
            map = null;
        }
        dVar.a(j17, str, map);
    }

    public final void a(long j17, java.lang.String errorMsg, java.util.Map map) {
        android.os.Bundle bundle;
        java.util.Set<java.util.Map.Entry> entrySet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callbackPrivateCommand: errCode=");
        sb6.append(j17);
        sb6.append(", action=");
        java.lang.String str = this.f369934b;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeCommandHandler", sb6.toString());
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f369936d.getSystemService("input_method");
        android.os.Bundle bundle2 = this.f369935c;
        if (inputMethodManager != null) {
            java.lang.String str2 = str == null ? "" : str;
            if (bundle2 != null) {
                bundle2.putLong("command_error_code", j17);
                bundle2.putString("command_error_msg", errorMsg);
                if (map != null && (entrySet = map.entrySet()) != null) {
                    for (java.util.Map.Entry entry : entrySet) {
                        java.lang.Object value = entry.getValue();
                        if (value instanceof java.lang.Boolean) {
                            java.lang.String str3 = (java.lang.String) entry.getKey();
                            java.lang.Object value2 = entry.getValue();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value2, "null cannot be cast to non-null type kotlin.Boolean");
                            bundle2.putBoolean(str3, ((java.lang.Boolean) value2).booleanValue());
                        } else if (value instanceof java.lang.Integer) {
                            java.lang.String str4 = (java.lang.String) entry.getKey();
                            java.lang.Object value3 = entry.getValue();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value3, "null cannot be cast to non-null type kotlin.Int");
                            bundle2.putInt(str4, ((java.lang.Integer) value3).intValue());
                        } else if (value instanceof java.lang.Long) {
                            java.lang.String str5 = (java.lang.String) entry.getKey();
                            java.lang.Object value4 = entry.getValue();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value4, "null cannot be cast to non-null type kotlin.Long");
                            bundle2.putLong(str5, ((java.lang.Long) value4).longValue());
                        } else if (value instanceof java.lang.String) {
                            java.lang.String str6 = (java.lang.String) entry.getKey();
                            java.lang.Object value5 = entry.getValue();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value5, "null cannot be cast to non-null type kotlin.String");
                            bundle2.putString(str6, (java.lang.String) value5);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeCommandHandler", "callbackPrivateCommand value not support " + entry.getValue());
                        }
                    }
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            inputMethodManager.sendAppPrivateCommand(this.f369933a, str2, bundle);
        }
        java.lang.String d17 = i45.j.f369948a.d();
        java.lang.String string = bundle2 != null ? bundle2.getString("i_t", "") : null;
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = bundle2 != null ? bundle2.getString("command_id", "") : null;
        java.lang.String str7 = string2 != null ? string2 : "";
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7146x809743d7 c7146x809743d7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7146x809743d7();
        c7146x809743d7.f144526d = c7146x809743d7.b("CurrentImePackageName", d17, true);
        c7146x809743d7.f144527e = c7146x809743d7.b("Action", str, true);
        c7146x809743d7.f144528f = (int) j17;
        c7146x809743d7.f144529g = c7146x809743d7.b("Token", string, true);
        c7146x809743d7.f144530h = c7146x809743d7.b("CommandId", str7, true);
        c7146x809743d7.k();
        java.lang.String n17 = c7146x809743d7.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeReport", "report%s %s", 29960, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
    }
}
