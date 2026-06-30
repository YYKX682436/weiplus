package ij4;

/* loaded from: classes11.dex */
public final class c extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cyn;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ij4.a item = (ij4.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oku);
        if (textView != null) {
            textView.setOnClickListener(new ij4.b(holder));
            java.lang.String a17 = en1.a.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            qj4.s.f445491a.a(textView, new qj4.l(a17, false, 14L, null, null, null, null, 120, null));
            textView.setVisibility(ai4.m0.f86706a.M(en1.a.a()) != null ? 8 : 0);
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.m8211x9616526c();
    }
}
