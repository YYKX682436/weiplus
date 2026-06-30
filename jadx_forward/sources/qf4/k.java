package qf4;

/* loaded from: classes4.dex */
public final class k extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f444241d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f444242e;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f444241d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        qf4.i holder = (qf4.i) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        qf4.k kVar = holder.f444239g;
        java.lang.Object obj = kVar.f444241d.get(i17);
        android.widget.ImageView imageView = holder.f444236d;
        imageView.setTag(obj);
        java.util.ArrayList arrayList = kVar.f444241d;
        r45.lf6 y07 = ((nf4.h) arrayList.get(i17)).f418387p.y0();
        java.util.LinkedList linkedList = y07.f460965h.f463738e;
        if (!linkedList.isEmpty()) {
            ef4.v vVar = ef4.w.f334001t;
            vo0.d m17 = vVar.m();
            java.lang.Object obj2 = linkedList.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            hf4.e eVar = new hf4.e((r45.xe6) obj2, y07.f460962e, com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276844o);
            hf4.a[] aVarArr = hf4.a.f362753d;
            gm0.j1.b().c();
            if (vVar.c().f334012o == null) {
                vVar.c().f334012o = new hf4.f();
            }
            hf4.f fVar = vVar.c().f334012o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
            m17.c(eVar, imageView, fVar.f362761b);
        }
        int i18 = ((nf4.h) arrayList.get(i17)).f69195x28f0318a;
        android.widget.TextView textView = holder.f444238f;
        android.widget.ImageView imageView2 = holder.f444237e;
        if (i18 <= 1) {
            imageView2.setVisibility(8);
            textView.setVisibility(8);
        } else {
            imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView2.getContext(), com.p314xaae8f345.mm.R.raw.f79860xdff15ccf, android.graphics.Color.parseColor("#FFFFFF")));
            imageView2.setVisibility(8);
            textView.setText(java.lang.String.valueOf(((nf4.h) arrayList.get(i17)).f69195x28f0318a));
            textView.setVisibility(0);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571075cw4, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        qf4.i iVar = new qf4.i(this, inflate);
        iVar.f444236d.setOnClickListener(new qf4.j(this));
        return iVar;
    }
}
