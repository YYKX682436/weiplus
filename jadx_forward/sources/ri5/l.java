package ri5;

/* loaded from: classes.dex */
public final class l extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570866el4;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ri5.j item = (ri5.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View view = holder.f3639x46306858;
        em.n2 n2Var = new em.n2(view);
        n2Var.a().setText(holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572908nm2));
        if (item.f477651o) {
            n2Var.b().setVisibility(0);
            n2Var.a().setText(item.f477652p);
            if (item.f477654r) {
                com.p314xaae8f345.mm.ui.bk.s0(n2Var.a().getPaint());
            }
        } else {
            n2Var.b().setVisibility(8);
        }
        if (item.f477653q != 0) {
            n2Var.b().setBackgroundColor(item.f477653q);
            n2Var.a().setBackgroundColor(item.f477653q);
        }
        java.lang.CharSequence charSequence = item.f477645g;
        if (n2Var.f336174c == null) {
            n2Var.f336174c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence, n2Var.f336174c);
        java.lang.CharSequence charSequence2 = item.f477650n;
        if (n2Var.f336173b == null) {
            n2Var.f336173b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cut);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence2, n2Var.f336173b);
        super.h(holder, item, i17, i18, z17, list);
    }
}
