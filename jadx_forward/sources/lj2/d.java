package lj2;

/* loaded from: classes10.dex */
public final class d implements ai2.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f400371a;

    /* renamed from: b, reason: collision with root package name */
    public final qi2.r1 f400372b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f400373c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f400374d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f400375e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f400376f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f400377g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f400378h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f400379i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f400380j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f400381k;

    /* renamed from: l, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f400382l;

    public d(android.view.ViewGroup root, qi2.r1 service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f400371a = root;
        this.f400372b = service;
        this.f400373c = "FinderLiveBattleResultBarWidget";
        this.f400374d = "finder_live_pk_result_win.pag";
        this.f400375e = "finder_live_pk_result_win_en.pag";
        this.f400376f = "finder_live_pk_result_draw.pag";
        this.f400377g = "finder_live_pk_result_draw_en.pag";
        this.f400378h = "finder_live_pk_result_win_streak.pag";
        this.f400379i = "finder_live_pk_result_win_streak_en.pag";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.eoi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f400380j = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.eog);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f400381k = textView;
        textView.setTextSize(1, 28.0f);
        zl2.r4.f555483a.b3(textView);
    }

    @Override // ai2.a
    public android.view.View h() {
        return this.f400371a;
    }

    @Override // ai2.a
    public void i(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400373c, "battleStart withAnim:" + z17);
        this.f400380j.setVisibility(8);
        this.f400381k.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0136, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0159, code lost:
    
        r2 = r18.f400375e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0156, code lost:
    
        r2 = r18.f400374d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() != false) goto L99;
     */
    @Override // ai2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(boolean r19, dk2.u4 r20) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lj2.d.j(boolean, dk2.u4):void");
    }

    @Override // ai2.a
    /* renamed from: reset */
    public void mo2073x6761d4f() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f400380j;
        c22789xd23e9a9b.n();
        c22789xd23e9a9b.setVisibility(8);
        this.f400381k.setVisibility(8);
        this.f400371a.setVisibility(8);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f400382l;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f400382l = null;
    }
}
