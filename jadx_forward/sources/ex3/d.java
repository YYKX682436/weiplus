package ex3;

/* loaded from: classes.dex */
public final class d extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cfq;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String m75945x2fec8307;
        ex3.e item = (ex3.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.dp5 dp5Var = item.f338742f;
        int i19 = item.f338741e;
        if (i19 == 0) {
            m75945x2fec8307 = "[置顶] " + dp5Var.m75945x2fec8307(1);
        } else {
            m75945x2fec8307 = i19 == 2 ? "配置策略" : i19 == 3 ? "配置值" : dp5Var.m75945x2fec8307(1);
        }
        ((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.odf)).setText(m75945x2fec8307);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.own);
        if (dp5Var.m75939xb282bd08(2) != 3) {
            textView.setVisibility(8);
        } else {
            textView.setText(item.f338743g);
            textView.setVisibility(0);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
