package ge5;

/* loaded from: classes5.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f352537d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f352538e;

    /* renamed from: f, reason: collision with root package name */
    public final int f352539f;

    public c(java.lang.CharSequence charSequence, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        this.f352537d = charSequence;
        this.f352538e = f9Var;
        this.f352539f = i17;
    }

    public final void a(android.text.Spannable spannable) {
        java.lang.String name;
        java.lang.System.nanoTime();
        java.lang.Object[] spans = spannable.getSpans(0, spannable.length(), java.lang.Object.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        if (spans == null || spans.length == 0) {
            arrayList = null;
        } else {
            for (java.lang.Object obj : spans) {
                if (obj != null && fo3.s.INSTANCE.Hc(obj, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class)) {
                    java.lang.String substring = spannable.toString().substring(spannable.getSpanStart(obj), spannable.getSpanEnd(obj));
                    try {
                        name = new org.json.JSONObject(obj.toString()).optString("type");
                        java.lang.String name2 = obj.getClass().getName();
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (name == null) {
                            name = name2;
                        }
                    } catch (org.json.JSONException unused) {
                        name = obj.getClass().getName();
                    }
                    arrayList.add(new ge5.b(substring, name));
                }
            }
        }
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f352538e.Q0(), this.f352538e.m124847x74d37ac6());
        this.f352538e = Li;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Li.Q0())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f352538e;
            f9Var.f1(f9Var.w0() | 16);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.f352538e.m124847x74d37ac6(), this.f352538e);
        }
        e01.d m17 = c01.d9.b().m();
        m17.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MONITOR_IS_TRIGGERED_BOOLEAN_SYNC;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (!((java.lang.Boolean) p17.m(u3Var, bool)).booleanValue()) {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MONITOR_BANNER_MSG_COME_TIME_TICKS_LONG_SYNC, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            c01.d9.b().p().x(u3Var, java.lang.Boolean.TRUE);
            m17.b();
        }
        e01.d m18 = c01.d9.b().m();
        m18.getClass();
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_BANNER_CLOSED_BOOLEAN_SYNC, bool);
        m18.b();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ge5.b bVar = (ge5.b) it.next();
            java.lang.String str = bVar.f352535a;
            java.lang.String str2 = bVar.f352536b;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(14237, "msg", java.lang.Long.valueOf(this.f352538e.m124847x74d37ac6()), android.os.Build.MANUFACTURER, wo.w0.m(), android.os.Build.VERSION.RELEASE, android.os.Build.VERSION.INCREMENTAL, android.os.Build.DISPLAY, java.lang.Integer.valueOf(this.f352539f), str2);
            g0Var.mo68477x336bdfd8(587L, 0L, 1L, false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.CharSequence charSequence = this.f352537d;
        if (charSequence instanceof android.text.Spannable) {
            try {
                a((android.text.Spannable) charSequence);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
