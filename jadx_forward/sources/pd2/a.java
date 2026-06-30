package pd2;

/* loaded from: classes2.dex */
public class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ajn;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18, boolean z17, java.util.List list) {
        r45.mb4 mb4Var;
        r45.mb4 mb4Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.dzu);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.dzy);
        int h17 = item.h();
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (h17 == 4) {
            textView.setVisibility(0);
            r45.mb4 mb4Var3 = (r45.mb4) kz5.n0.Z(item.getFeedObject().m59264x7efe73ec());
            long m75939xb282bd08 = mb4Var3 != null ? mb4Var3.m75939xb282bd08(3) : 0;
            java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(m75939xb282bd08 / 60), java.lang.Long.valueOf(m75939xb282bd08 % 60)}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            textView.setText(format);
            if (!z17 && (mb4Var2 = (r45.mb4) kz5.n0.Z(item.getFeedObject().m59264x7efe73ec())) != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var2.m75945x2fec8307(16))) {
                    mn2.c1 c1Var = new mn2.c1(mb4Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null);
                    vo0.d e17 = g1Var.e();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                    e17.c(c1Var, imageView, g1Var.h(mn2.f1.f411487e));
                } else {
                    mn2.r3 r3Var = new mn2.r3(mb4Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null);
                    vo0.d e18 = g1Var.e();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                    e18.c(r3Var, imageView, g1Var.h(mn2.f1.f411487e));
                }
            }
        } else {
            textView.setVisibility(8);
            if (!z17 && (mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().m59264x7efe73ec())) != null) {
                vo0.d e19 = g1Var.e();
                mn2.c1 c1Var2 = new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                e19.c(c1Var2, imageView, g1Var.h(mn2.f1.f411487e));
            }
        }
        pd2.d dVar = pd2.d.f435078a;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        dVar.a(itemView, item, true, false);
    }
}
