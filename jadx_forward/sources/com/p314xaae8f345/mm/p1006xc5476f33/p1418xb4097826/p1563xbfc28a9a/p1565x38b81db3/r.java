package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3;

/* loaded from: classes2.dex */
public final class r extends mo2.q {

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.o f202690u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.o(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c cVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String authorFinderUsername, boolean z17, int i17) {
        super(cVar, activityC0065xcd7aa112, authorFinderUsername, z17, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
    }

    @Override // mo2.q
    public void s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, in5.s0 holder) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e first;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.r87);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.r88);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.r89);
        frameLayout.setVisibility(0);
        frameLayout.setOutlineProvider(this.f411933t);
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().m59264x7efe73ec());
        boolean z17 = this.f411924h;
        if (mb4Var != null) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(16));
            mn2.g1 g1Var = mn2.g1.f411508a;
            if (K0) {
                mn2.c1 c1Var = new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null);
                vo0.d e17 = g1Var.e();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                e17.c(c1Var, imageView, g1Var.h(mn2.f1.B));
            } else {
                mn2.r3 r3Var = new mn2.r3(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null);
                vo0.d e18 = g1Var.e();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                e18.c(r3Var, imageView, g1Var.h(mn2.f1.E));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.o oVar = f202690u;
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.graphics.Rect a17 = oVar.a(context, mb4Var.m75938x746dc8a6(5) > mb4Var.m75938x746dc8a6(4), z17, ((java.lang.Number) ((jz5.n) this.f411927n).mo141623x754a37bb()).intValue());
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = a17.width();
            marginLayoutParams.height = a17.height();
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = item.getFeedObject().getFeedObject().m76802x2dd01666();
        int m76629x36bbd779 = (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (first = m76962x74cd162e.getFirst()) == null) ? 0 : first.m76629x36bbd779();
        if (m76629x36bbd779 > 0) {
            textView.setVisibility(0);
            textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.c(m76629x36bbd779));
        } else {
            textView.setVisibility(8);
        }
        frameLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.p(item, this, holder));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.q(this, holder, item);
        if (!z17) {
            holder.p(com.p314xaae8f345.mm.R.id.pzw).setOnLongClickListener(qVar);
        }
        frameLayout.setOnLongClickListener(qVar);
    }
}
