package i05;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f368113a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f368114b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f368115c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f368116d;

    public j(android.view.View view, java.lang.String action, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f368113a = view;
        this.f368114b = action;
        this.f368115c = bundle;
        this.f368116d = view.getContext();
    }

    public static /* synthetic */ void b(i05.j jVar, long j17, java.lang.String str, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = "";
        }
        if ((i17 & 4) != 0) {
            map = null;
        }
        jVar.a(j17, str, map);
    }

    public final void a(long j17, java.lang.String errorMsg, java.util.Map map) {
        java.util.Set<java.util.Map.Entry> entrySet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callbackPrivateCommand: errCode=");
        sb6.append(j17);
        sb6.append(", action=");
        java.lang.String str = this.f368114b;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeCommandHandler", sb6.toString());
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f368116d.getSystemService("input_method");
        if (inputMethodManager != null) {
            android.os.Bundle bundle = this.f368115c;
            if (bundle != null) {
                bundle.putLong("command_error_code", j17);
                bundle.putString("command_error_msg", errorMsg);
                if (map != null && (entrySet = map.entrySet()) != null) {
                    for (java.util.Map.Entry entry : entrySet) {
                        java.lang.Object value = entry.getValue();
                        if (value instanceof java.lang.Boolean) {
                            java.lang.String str2 = (java.lang.String) entry.getKey();
                            java.lang.Object value2 = entry.getValue();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value2, "null cannot be cast to non-null type kotlin.Boolean");
                            bundle.putBoolean(str2, ((java.lang.Boolean) value2).booleanValue());
                        } else if (value instanceof java.lang.Integer) {
                            java.lang.String str3 = (java.lang.String) entry.getKey();
                            java.lang.Object value3 = entry.getValue();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value3, "null cannot be cast to non-null type kotlin.Int");
                            bundle.putInt(str3, ((java.lang.Integer) value3).intValue());
                        } else if (value instanceof java.lang.Long) {
                            java.lang.String str4 = (java.lang.String) entry.getKey();
                            java.lang.Object value4 = entry.getValue();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value4, "null cannot be cast to non-null type kotlin.Long");
                            bundle.putLong(str4, ((java.lang.Long) value4).longValue());
                        } else if (value instanceof java.lang.String) {
                            java.lang.String str5 = (java.lang.String) entry.getKey();
                            java.lang.Object value5 = entry.getValue();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value5, "null cannot be cast to non-null type kotlin.String");
                            bundle.putString(str5, (java.lang.String) value5);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeCommandHandler", "callbackPrivateCommand value not support " + entry.getValue());
                        }
                    }
                }
            } else {
                bundle = null;
            }
            inputMethodManager.sendAppPrivateCommand(this.f368113a, str, bundle);
        }
    }
}
