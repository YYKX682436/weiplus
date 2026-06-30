package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class qr extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f185950d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f185951e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f185952f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f185953g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f185954h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f185955i;

    /* renamed from: m, reason: collision with root package name */
    public final int f185956m;

    /* renamed from: n, reason: collision with root package name */
    public final int f185957n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wr f185958o;

    public qr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wr wrVar, android.content.Context context, int i17, int i18, java.lang.Object obj, java.lang.String wording, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        this.f185958o = wrVar;
        this.f185950d = context;
        this.f185951e = obj;
        this.f185952f = wording;
        this.f185953g = gVar;
        this.f185954h = new java.util.ArrayList();
        this.f185955i = new java.util.ArrayList();
        int i19 = ((com.p314xaae8f345.mm.ui.bh.a(context).f278668a - (i18 * 2)) - (i17 * 2)) / 3;
        this.f185956m = i19;
        this.f185957n = (i19 * 4) / 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f185954h).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        java.lang.String sb6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sr holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sr) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((java.util.ArrayList) this.f185954h).get(i17);
        int intValue = ((java.lang.Number) ((java.util.ArrayList) this.f185955i).get(i17)).intValue();
        int l17 = nv2.n1.f422084h.l(c19792x256d2725);
        java.lang.String g17 = l17 > 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(2, l17) : "0";
        android.widget.TextView textView = holder.f186105e;
        if (textView != null) {
            textView.setText(g17);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        if (m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && m76962x74cd162e.size() > 0) {
            java.lang.String m76585x66e287ae = m76962x74cd162e.get(0).m76585x66e287ae();
            if (m76585x66e287ae == null || m76585x66e287ae.length() == 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(m76962x74cd162e.get(0).m76623xd93f812f());
                java.lang.String m76624x4c9b7dca = m76962x74cd162e.get(0).m76624x4c9b7dca();
                sb7.append(m76624x4c9b7dca != null ? m76624x4c9b7dca : "");
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(m76962x74cd162e.get(0).m76585x66e287ae());
                java.lang.String m76587x815afa6b = m76962x74cd162e.get(0).m76587x815afa6b();
                sb8.append(m76587x815afa6b != null ? m76587x815afa6b : "");
                sb6 = sb8.toString();
            }
            android.widget.ImageView imageView = holder.f186104d;
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                g1Var.e().b(new mn2.q3(sb6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411503x)).c(imageView);
            }
        }
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pr(intValue, this, i17, this.f185958o, c19792x256d2725));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b4n, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.RelativeLayout) inflate).getLayoutParams();
        layoutParams.width = this.f185956m;
        int i18 = this.f185957n;
        layoutParams.height = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sr srVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sr(this.f185958o, inflate);
        android.widget.ImageView imageView = srVar.f186104d;
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = i18;
        }
        return srVar;
    }
}
