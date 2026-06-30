package fn2;

/* loaded from: classes5.dex */
public final class s0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f345918d;

    /* renamed from: e, reason: collision with root package name */
    public final fn2.u1 f345919e;

    /* renamed from: f, reason: collision with root package name */
    public sf2.d3 f345920f;

    /* renamed from: g, reason: collision with root package name */
    public bm2.o6 f345921g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f345922h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f345923i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv f345924m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ScrollView f345925n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.LinearLayout f345926o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ch6 f345927p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f345928q;

    /* renamed from: r, reason: collision with root package name */
    public final r45.in f345929r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s0(android.content.Context r1, android.util.AttributeSet r2, int r3, r45.in r4, int r5, fn2.u1 r6, int r7, p3321xbce91901.jvm.p3324x21ffc6bd.i r8) {
        /*
            r0 = this;
            r8 = r7 & 2
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r7 = r7 & 4
            if (r7 == 0) goto La
            r3 = 0
        La:
            java.lang.String r7 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r7)
            java.lang.String r7 = "tabData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r7)
            java.lang.String r7 = "sourceScene"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r7)
            r0.<init>(r1, r2, r3)
            r0.f345918d = r5
            r0.f345919e = r6
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r0.f345928q = r2
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131496108(0x7f0c0cac, float:1.8615772E38)
            r3 = 1
            r1.inflate(r2, r0, r3)
            r1 = 2131322004(0x7f096494, float:1.8262647E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r0.f345925n = r1
            r3 = 2131312719(0x7f09404f, float:1.8243814E38)
            android.view.View r1 = r1.findViewById(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f345926o = r1
            r1 = 2131321280(0x7f0961c0, float:1.8261178E38)
            android.view.View r1 = r0.findViewById(r1)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            androidx.recyclerview.widget.RecyclerView r1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) r1
            r0.f345923i = r1
            r0.f345929r = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.s0.<init>(android.content.Context, android.util.AttributeSet, int, r45.in, int, fn2.u1, int, kotlin.jvm.internal.i):void");
    }

    public final void a(int i17, int i18, java.lang.String tabName, java.lang.Integer num, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabName, "tabName");
        if (zl2.r4.f555483a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.W1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            jSONObject.put("element", 2);
            jSONObject.put("tab_id", i18);
            jSONObject.put("tab_name", tabName);
            if (num != null) {
                jSONObject.put("tab_sub_id", num.intValue());
            }
            if (str != null) {
                jSONObject.put("tab_sub_name", str);
            }
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f408786o2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", i17);
        jSONObject2.put("element", 2);
        jSONObject2.put("tab_id", i18);
        jSONObject2.put("tab_name", tabName);
        if (num != null) {
            jSONObject2.put("tab_sub_id", num.intValue());
        }
        if (str != null) {
            jSONObject2.put("tab_sub_name", str);
        }
        ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void b(int i17, r45.zw1 zw1Var, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        n3.t1 t1Var = new n3.t1(this.f345926o);
        int i18 = 0;
        while (true) {
            if (!t1Var.hasNext()) {
                r45.in inVar = this.f345929r;
                java.util.LinkedList sub_board_type_info_list = inVar.f458691f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sub_board_type_info_list, "sub_board_type_info_list");
                this.f345927p = (r45.ch6) kz5.n0.a0(sub_board_type_info_list, i17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select sub tab ");
                r45.ch6 ch6Var = this.f345927p;
                sb6.append(ch6Var != null ? ch6Var.f453089e : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongTabView", sb6.toString());
                r45.ch6 ch6Var2 = this.f345927p;
                if (ch6Var2 != null) {
                    int i19 = inVar.f458689d;
                    java.lang.String board_name = inVar.f458690e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(board_name, "board_name");
                    a(2, i19, board_name, java.lang.Integer.valueOf(ch6Var2.f453088d), ch6Var2.f453089e);
                }
                if (y0Var != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new fn2.r0(zw1Var, this, null), 3, null);
                    return;
                }
                return;
            }
            java.lang.Object next = t1Var.next();
            int i27 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View findViewById = ((android.view.View) next).findViewById(com.p314xaae8f345.mm.R.id.s9r);
            android.widget.TextView textView = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
            if (textView != null) {
                if (i17 == i18) {
                    com.p314xaae8f345.mm.ui.fk.a(textView);
                    textView.setTextColor(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
                } else {
                    com.p314xaae8f345.mm.ui.fk.c(textView);
                    textView.setTextColor(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
                }
            }
            i18 = i27;
        }
    }

    /* renamed from: getExposedSet */
    public final java.util.Set<java.lang.String> m129823xfba10318() {
        return this.f345928q;
    }

    /* renamed from: getSongRv */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m129824x2fa4312f() {
        return this.f345923i;
    }
}
