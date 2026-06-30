package at2;

/* loaded from: classes3.dex */
public final class y0 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f95311m;

    /* renamed from: n, reason: collision with root package name */
    public if2.d0 f95312n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f95311m = new java.util.ArrayList();
    }

    public static final void Z6(at2.y0 y0Var) {
        if2.d0 d0Var = y0Var.f95312n;
        if (d0Var != null) {
            d0Var.d(8);
        }
        ((mm2.c1) y0Var.m56788xbba4bfc0(mm2.c1.class)).N1 = false;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
        y0Var.X6(qo0.b.Z2, bundle);
    }

    public final void a7() {
        if2.d0 d0Var = this.f95312n;
        if (d0Var == null) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f95311m).iterator();
        while (it.hasNext()) {
            android.widget.TextView textView = (android.widget.TextView) it.next();
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(textView.getTag(), java.lang.Float.valueOf(((ct2.j) m56788xbba4bfc0(ct2.j.class)).B));
            android.view.View view = d0Var.f372638a;
            if (b17) {
                textView.setTextColor(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            } else {
                textView.setTextColor(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        dt2.a0 a0Var;
        android.view.View findViewById;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.f567866kx5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        this.f95312n = new if2.d0(viewGroup, this);
        if (viewGroup.getContext().getResources().getConfiguration().orientation != 2 && (findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566775h03)) != null) {
            findViewById.setOnClickListener(new at2.w0(this));
        }
        viewGroup.setOnClickListener(new at2.x0(this));
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.nep);
        textView.setTag(java.lang.Float.valueOf(0.5f));
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f95311m;
        arrayList.add(textView);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.neu);
        textView2.setTag(java.lang.Float.valueOf(1.0f));
        arrayList.add(textView2);
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ner);
        textView3.setTag(java.lang.Float.valueOf(1.25f));
        arrayList.add(textView3);
        android.widget.TextView textView4 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.nes);
        textView4.setTag(java.lang.Float.valueOf(1.5f));
        arrayList.add(textView4);
        android.widget.TextView textView5 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.net);
        textView5.setTag(java.lang.Float.valueOf(2.0f));
        arrayList.add(textView5);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.widget.TextView) it.next()).setOnClickListener(new at2.v0(this, viewGroup));
        }
        a7();
        float f17 = ((ct2.j) m56788xbba4bfc0(ct2.j.class)).B;
        ((ct2.j) m56788xbba4bfc0(ct2.j.class)).B = f17;
        at2.u1 u1Var = (at2.u1) R6(at2.u1.class);
        if (u1Var != null && (a0Var = u1Var.f95295q) != null) {
            a0Var.f324691a.m58794xeb2d9731(f17);
        }
        a7();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        if2.d0 d0Var = this.f95312n;
        if (d0Var != null) {
            d0Var.d(8);
        }
        ((java.util.ArrayList) this.f95311m).clear();
    }
}
