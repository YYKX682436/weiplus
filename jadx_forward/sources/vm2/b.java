package vm2;

/* loaded from: classes3.dex */
public final class b extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aps;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        vm2.d item = (vm2.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.grn);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.grl);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.grc);
        r45.kv1 a17 = vm2.d.f519620f.a(item);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        java.lang.String str2 = "";
        if (a17 == null || (str = a17.m75945x2fec8307(2)) == null) {
            str = "";
        }
        mn2.q3 q3Var = new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f411487e));
        r45.yp1 yp1Var = item.f519621d;
        java.lang.String m75945x2fec83072 = yp1Var.m75945x2fec8307(1);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        textView.setText(m75945x2fec83072);
        if (!((yp1Var.m75939xb282bd08(3) & 2) > 0)) {
            textView2.setText("");
            return;
        }
        r45.qa0 qa0Var = item.f519622e;
        if (qa0Var != null && (m75945x2fec8307 = qa0Var.m75945x2fec8307(2)) != null) {
            str2 = m75945x2fec8307;
        }
        if (str2.length() == 0) {
            str2 = holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ddk);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
        }
        textView2.setText(str2);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
