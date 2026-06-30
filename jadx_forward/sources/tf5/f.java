package tf5;

/* loaded from: classes11.dex */
public final class f extends in5.r {
    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        return android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569521de, (android.view.ViewGroup) recyclerView, false);
    }

    @Override // in5.r
    public in5.s0 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.View convertView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        return new tf5.e(this, convertView);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        tf5.g item = (tf5.g) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        long c17 = c01.id.c();
        tf5.e eVar = (tf5.e) holder;
        boolean z18 = item.f500516i;
        android.widget.RelativeLayout relativeLayout = eVar.f500502s;
        if (z18) {
            relativeLayout.setBackground(null);
        } else {
            relativeLayout.setBackground(com.p314xaae8f345.mm.ui.zk.d(eVar.f374654e, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559855gp));
        }
        boolean z19 = item.f500514g;
        android.widget.TextView textView = eVar.f500497n;
        android.widget.RelativeLayout relativeLayout2 = eVar.f500503t;
        if (z19) {
            relativeLayout2.setVisibility(0);
            textView.setText(item.f500515h);
            textView.setVisibility(0);
        } else {
            relativeLayout2.setVisibility(8);
            textView.setVisibility(8);
        }
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = item.f500511d;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai(eVar.f500500q, z3Var.d1(), null);
        boolean m47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1());
        android.widget.TextView textView2 = eVar.f500501r;
        if (m47) {
            textView2.setText(item.f500520p);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        java.lang.CharSequence charSequence = item.f500518n;
        android.widget.TextView textView3 = eVar.f500498o;
        textView3.setText(charSequence);
        java.lang.CharSequence charSequence2 = item.f500519o;
        boolean J0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence2);
        android.widget.TextView textView4 = eVar.f500499p;
        if (J0) {
            textView4.setVisibility(8);
        } else {
            textView4.setText(charSequence2);
            textView4.setVisibility(0);
        }
        boolean Di = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(z3Var.d1());
        android.widget.ImageView imageView = eVar.f500505v;
        if (Di) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).pj(textView3, z3Var.d1(), bi4.c.CONTACT_LIST, bi4.d.OUTLINED);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.AddressItemConvert", "onBindViewHolder " + (c01.id.c() - c17));
        android.view.View view = eVar.f3639x46306858;
        if (view == null) {
            return;
        }
        android.content.Context context = view.getContext();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "addressbook_cell");
        aVar.fk(view, "addressbook_cell_type", 13);
        aVar.Ai(view, new tf5.k(context));
        aVar.ik(view, 8, 33926);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
