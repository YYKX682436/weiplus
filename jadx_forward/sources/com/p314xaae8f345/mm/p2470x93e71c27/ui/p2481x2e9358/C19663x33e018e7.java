package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppGrid */
/* loaded from: classes15.dex */
public class C19663x33e018e7 extends android.widget.GridView {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f f271445d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f271446e;

    /* renamed from: f, reason: collision with root package name */
    public int f271447f;

    /* renamed from: g, reason: collision with root package name */
    public int f271448g;

    /* renamed from: h, reason: collision with root package name */
    public int f271449h;

    /* renamed from: i, reason: collision with root package name */
    public int f271450i;

    /* renamed from: m, reason: collision with root package name */
    public int f271451m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c f271452n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.SharedPreferences f271453o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f271454p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f271455q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f271456r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemLongClickListener f271457s;

    public C19663x33e018e7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f271448g = 0;
        this.f271449h = 0;
        this.f271454p = null;
        this.f271456r = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.a(this);
        this.f271457s = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b(this);
        this.f271446e = context;
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.x xVar) {
        if (xVar == null) {
            return null;
        }
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        return "zh_CN".equals(d17) ? xVar.f272255p2 : "zh_TW".equals(d17) ? xVar.f272257r2 : "zh_HK".equals(d17) ? xVar.f272256q2 : xVar.f272258s2;
    }

    public void c() {
        if (this.f271452n != null) {
            for (final int i17 = 0; i17 < getChildCount(); i17++) {
                final android.view.View childAt = getChildAt(i17);
                if (childAt != null) {
                    final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c cVar = this.f271452n;
                    int i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c.f271735m;
                    cVar.getClass();
                    if (!(j62.e.g().i("clicfg_disable_attachment_rpt", 0, true, true) != 0)) {
                        childAt.post(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.chat.c$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c cVar2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c.this;
                                cVar2.getClass();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rpt exp:");
                                int i19 = i17;
                                sb6.append(i19);
                                sb6.append(":");
                                android.view.View view = childAt;
                                sb6.append(view.hashCode());
                                sb6.append(" ");
                                sb6.append(cVar2.f271741i.f271452n.hashCode());
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppGrid", sb6.toString());
                                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_attachment_item_" + ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e) view.getTag()).f271822p, "view_exp", cVar2.d(i19, (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e) view.getTag()), 36465);
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // android.widget.AdapterView
    public int getCount() {
        return this.f271452n.getCount();
    }

    /* renamed from: getCurPage */
    public int m75401x80e974b9() {
        return this.f271450i;
    }

    /* renamed from: setChattingContextRef */
    public void m75402x8d5f134c(yb5.d dVar) {
        this.f271454p = new java.lang.ref.WeakReference(dVar);
    }

    /* renamed from: setOnAppSelectedListener */
    public void m75403x6640890f(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f fVar) {
        this.f271445d = fVar;
    }

    /* renamed from: setSessionid */
    public void m75404x7ffb73ef(java.lang.String str) {
        this.f271455q = str;
    }

    public C19663x33e018e7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f271448g = 0;
        this.f271449h = 0;
        this.f271454p = null;
        this.f271456r = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.a(this);
        this.f271457s = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b(this);
        this.f271446e = context;
    }
}
