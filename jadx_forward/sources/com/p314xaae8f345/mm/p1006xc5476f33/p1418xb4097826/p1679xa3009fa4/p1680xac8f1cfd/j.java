package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f216314d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f216315e;

    /* renamed from: f, reason: collision with root package name */
    public final int f216316f;

    /* renamed from: g, reason: collision with root package name */
    public final int f216317g;

    /* renamed from: h, reason: collision with root package name */
    public int f216318h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s f216319i;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s sVar, android.content.Context context, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f216319i = sVar;
        this.f216314d = context;
        this.f216315e = new java.util.ArrayList();
        int i27 = (((com.p314xaae8f345.mm.ui.bh.a(context).f278668a - (i18 * 2)) - (i17 * 2)) - (i19 * 2)) / 3;
        this.f216316f = i27;
        this.f216317g = (i27 * 4) / 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f216315e).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        java.lang.String sb6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((java.util.ArrayList) this.f216315e).get(i17);
        android.widget.TextView textView = holder.f216533e;
        if (textView != null) {
            textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(2, c19792x256d2725.m76791xf4204902()));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f216534f;
        if (c22699x3dcdb352 != null) {
            android.content.Context context = this.f216314d;
            c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79777xe843128, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
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
            android.widget.ImageView imageView = holder.f216532d;
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(sb6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411499t));
                b17.f529407e = null;
                b17.c(imageView);
            }
        }
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i(c19792x256d2725, this, holder, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ade, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.RelativeLayout) inflate).getLayoutParams();
        layoutParams.width = this.f216316f;
        int i18 = this.f216317g;
        layoutParams.height = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l(this.f216319i, inflate);
        android.widget.ImageView imageView = lVar.f216532d;
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = i18;
        }
        return lVar;
    }
}
