package dy3;

/* loaded from: classes.dex */
public final class s extends in5.r {
    @Override // in5.r
    public int e() {
        return i65.a.D(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? com.p314xaae8f345.mm.R.C30864xbddafb2a.ck7 : com.p314xaae8f345.mm.R.C30864xbddafb2a.ck6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        dy3.p item = (dy3.p) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f3639x46306858.getContext();
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.mie);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.odf);
        android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.cut);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = item.f326129e;
        java.lang.String d17 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        if (d17.length() > 0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, z3Var.d1(), 0.1f);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        }
        checkBox.setVisibility(8);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d18 = z3Var.d1();
        ((sg3.a) v0Var).getClass();
        android.text.SpannableString bj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, c01.a2.e(d18), i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        p13.i iVar = new p13.i();
        iVar.f432626a = bj6;
        iVar.f432627b = item.f326131g;
        iVar.f432628c = false;
        iVar.f432629d = false;
        iVar.f432633h = textView2.getPaint();
        java.lang.CharSequence charSequence = o13.q.e(iVar).f432638a;
        ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence, textView);
        ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(null, textView2);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
