package as3;

/* loaded from: classes8.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570212a12;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vr3.a item = (vr3.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        n11.a b17 = n11.a.b();
        r45.el5 el5Var = item.f521152d;
        b17.g(el5Var.f455126d.f451602f, (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.ak7));
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ak9)).setText(el5Var.f455126d.f451600d);
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ak8)).setText(el5Var.f455127e);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.ak_);
        int i19 = el5Var.f455126d.f451603g;
        if (i19 == 1) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6r);
        } else if (i19 != 2) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6t);
        }
        cl0.g a17 = item.a();
        a17.o("EventType", 5);
        a17.o("Pos", i17);
        lx3.r rVar = lx3.r.f403646a;
        java.lang.String gVar = a17.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        rVar.a(0, gVar, new vr3.d(item), new vr3.e(item));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }
}
