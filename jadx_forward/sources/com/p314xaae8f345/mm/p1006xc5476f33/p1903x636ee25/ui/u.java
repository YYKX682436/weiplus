package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes11.dex */
public class u extends db5.h implements ll3.p1 {

    /* renamed from: g, reason: collision with root package name */
    public final int f232332g;

    /* renamed from: h, reason: collision with root package name */
    public final int f232333h;

    /* renamed from: i, reason: collision with root package name */
    public int f232334i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f232335m;

    /* renamed from: n, reason: collision with root package name */
    public final ll3.r1 f232336n;

    /* renamed from: o, reason: collision with root package name */
    public int f232337o;

    /* renamed from: p, reason: collision with root package name */
    public final int f232338p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f232339q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f232340r;

    public u(android.content.Context context, int i17, boolean z17) {
        super(context);
        this.f232332g = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 26);
        this.f232333h = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 260);
        this.f232340r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f232335m = new java.util.HashMap();
        ll3.r1 r1Var = new ll3.r1();
        this.f232336n = r1Var;
        r1Var.f400757b = this;
        this.f232338p = i17;
        this.f232339q = z17;
    }

    @Override // db5.h
    public int a() {
        return ((java.util.ArrayList) ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f390389e).size();
    }

    @Override // db5.h
    public android.view.View b(android.view.View view, android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.t tVar;
        if (view == null) {
            view = android.view.LayoutInflater.from(this.f309888d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4e, viewGroup, false);
            tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.t(this);
            tVar.f232313b = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16632x3976002) view.findViewById(com.p314xaae8f345.mm.R.id.jz7);
            tVar.f232318g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jzj);
            tVar.f232320i = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16630x650e2b84) view.findViewById(com.p314xaae8f345.mm.R.id.j7q);
            tVar.f232314c = view.findViewById(com.p314xaae8f345.mm.R.id.f564341of);
            tVar.f232315d = view.findViewById(com.p314xaae8f345.mm.R.id.f564342og);
            tVar.f232316e = view.findViewById(com.p314xaae8f345.mm.R.id.f564343oh);
            tVar.f232317f = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.f564340oe);
            tVar.f232319h = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jzz);
            view.setTag(tVar);
        } else {
            tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.t) view.getTag();
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f390389e;
        int size = (i17 - 100000) % arrayList.size();
        if (size < 0) {
            size += arrayList.size();
        }
        ql3.a y07 = ll3.o2.Ai().y0((java.lang.String) arrayList.get(size));
        this.f232335m.put(java.lang.Integer.valueOf(i17), view);
        tVar.c(y07, false);
        return view;
    }

    @Override // db5.h
    public void c(android.view.View view, int i17) {
        this.f232335m.remove(java.lang.Integer.valueOf(i17));
    }

    public void d(ql3.a aVar, int[] iArr) {
        java.util.Iterator it = this.f232335m.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.t) ((android.view.View) ((java.util.Map.Entry) it.next()).getValue()).getTag();
            if (tVar.f232312a.f66983xc8c6afdb.equals(aVar.f66983xc8c6afdb)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainAdapter", "onColorReady: %s", tVar.f232312a.f67001x79435ae5);
                int i17 = iArr[0];
                int i18 = iArr[1];
                tVar.f232313b.setBackgroundColor(i17);
                tVar.f232320i.m67232xe1418446(i18);
                tVar.f232317f.setBackgroundColor(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p(tVar, i17);
                android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
                paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
                paintDrawable.setShaderFactory(pVar);
                tVar.f232315d.setBackgroundDrawable(paintDrawable);
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.q(tVar, (i17 & 16777215) | 1426063360);
                android.graphics.drawable.PaintDrawable paintDrawable2 = new android.graphics.drawable.PaintDrawable();
                paintDrawable2.setShape(new android.graphics.drawable.shapes.RectShape());
                paintDrawable2.setShaderFactory(qVar);
                tVar.f232316e.setBackgroundDrawable(paintDrawable2);
                tVar.f232318g.setTextColor(i18);
                tVar.f232319h.setTextColor(i18);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872) this.f309888d).V6(aVar);
            }
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f232334i;
    }
}
