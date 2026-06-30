package fh2;

/* loaded from: classes10.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f344172h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f344173i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f344174m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f344175n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f344176o;

    /* renamed from: p, reason: collision with root package name */
    public int f344177p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, gk2.e buContext, yz5.a closeClick) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closeClick, "closeClick");
        this.f344172h = buContext;
        this.f344173i = closeClick;
    }

    public static final void y(fh2.c cVar, int i17) {
        cVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", i17);
        jSONObject.put("type", 2);
        jSONObject.put("status", cVar.f344177p);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408798s2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dqb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.s7e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f344174m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f344175n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.chx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f344176o = (android.widget.TextView) findViewById3;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f344174m;
        if (c22661xa3a2b3c0 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stopCloseBtn");
            throw null;
        }
        c22661xa3a2b3c0.setOnClickListener(new fh2.a(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = this.f344175n;
        if (c22661xa3a2b3c02 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeBtn");
            throw null;
        }
        c22661xa3a2b3c02.setOnClickListener(new fh2.b(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c03 = this.f344175n;
        if (c22661xa3a2b3c03 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeBtn");
            throw null;
        }
        android.content.Context context = this.f199914d;
        c22661xa3a2b3c03.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573352mo4));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c04 = this.f344174m;
        if (c22661xa3a2b3c04 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stopCloseBtn");
            throw null;
        }
        c22661xa3a2b3c04.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqf));
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f569269sa3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/ktv/panel/FinderLiveKTVCloseLinkTipsPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/ktv/panel/FinderLiveKTVCloseLinkTipsPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f344176o;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentText");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        z(1);
        z(2);
    }

    public final void z(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("status", this.f344177p);
        jSONObject.put("type", 1);
        jSONObject.put("element", i17);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408798s2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
