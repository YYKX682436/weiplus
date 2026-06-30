package jn2;

/* loaded from: classes5.dex */
public final class f0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public sf2.x f382131d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f382132e;

    /* renamed from: f, reason: collision with root package name */
    public jn2.c1 f382133f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f382134g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f382135h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ScrollView f382136i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.LinearLayout f382137m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ch6 f382138n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f382139o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f382140p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.in f382141q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f382142r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f382143s;

    /* renamed from: t, reason: collision with root package name */
    public int f382144t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Set f382145u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0(android.content.Context r1, android.util.AttributeSet r2, int r3, r45.in r4, int r5, p3321xbce91901.jvm.p3324x21ffc6bd.i r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r3 = 0
        La:
            java.lang.String r5 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r5)
            java.lang.String r5 = "tabData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r5)
            r0.<init>(r1, r2, r3)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r0.f382145u = r2
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131495342(0x7f0c09ae, float:1.8614218E38)
            r3 = 1
            r1.inflate(r2, r0, r3)
            r1 = 2131322003(0x7f096493, float:1.8262645E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r0.f382136i = r1
            r3 = 2131312662(0x7f094016, float:1.8243699E38)
            android.view.View r1 = r1.findViewById(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f382137m = r1
            r1 = 2131297278(0x7f0903fe, float:1.8212496E38)
            android.view.View r1 = r0.findViewById(r1)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            androidx.recyclerview.widget.RecyclerView r1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) r1
            r0.f382135h = r1
            r1 = 2131300724(0x7f091174, float:1.8219486E38)
            android.view.View r1 = r0.findViewById(r1)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) r1
            r0.f382139o = r1
            r1 = 2131323426(0x7f096a22, float:1.826553E38)
            android.view.View r1 = r0.findViewById(r1)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f382140p = r1
            r0.f382141q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.f0.<init>(android.content.Context, android.util.AttributeSet, int, r45.in, int, kotlin.jvm.internal.i):void");
    }

    public final void a(int i17, r45.zw1 zw1Var, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        n3.t1 t1Var = new n3.t1(this.f382137m);
        int i18 = 0;
        while (true) {
            if (!t1Var.hasNext()) {
                java.util.LinkedList sub_board_type_info_list = this.f382141q.f458691f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sub_board_type_info_list, "sub_board_type_info_list");
                this.f382138n = (r45.ch6) kz5.n0.a0(sub_board_type_info_list, i17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select sub tab ");
                r45.ch6 ch6Var = this.f382138n;
                sb6.append(ch6Var != null ? ch6Var.f453089e : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSingSongAddPanelTabView", sb6.toString());
                this.f382145u.clear();
                if (y0Var != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jn2.d0(zw1Var, this, null), 3, null);
                    return;
                }
                return;
            }
            java.lang.Object next = t1Var.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View findViewById = ((android.view.View) next).findViewById(com.p314xaae8f345.mm.R.id.vhl);
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
            i18 = i19;
        }
    }

    /* renamed from: getSongRv */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m141173x2fa4312f() {
        return this.f382135h;
    }
}
