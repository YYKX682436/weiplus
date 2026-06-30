package xt2;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14975x15ef5b10 f538588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.o45 f538589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.p45 f538590f;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14975x15ef5b10 c14975x15ef5b10, r45.o45 o45Var, r45.p45 p45Var) {
        this.f538588d = c14975x15ef5b10;
        this.f538589e = o45Var;
        this.f538590f = p45Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14975x15ef5b10 c14975x15ef5b10 = this.f538588d;
        android.view.ViewGroup viewGroup = c14975x15ef5b10.f207826e;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        r45.o45 o45Var = this.f538589e;
        layoutParams.height = (int) ((o45Var.m75939xb282bd08(1) / o45Var.m75939xb282bd08(2)) * c14975x15ef5b10.getWidth());
        layoutParams.width = (int) ((o45Var.m75939xb282bd08(2) / o45Var.m75939xb282bd08(1)) * c14975x15ef5b10.getHeight());
        viewGroup.setLayoutParams(layoutParams);
        java.util.LinkedList<r45.q45> m75941xfb821914 = o45Var.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getLabel_list(...)");
        for (r45.q45 q45Var : m75941xfb821914) {
            android.content.Context context = c14975x15ef5b10.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14974x21b19514 c14974x21b19514 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14974x21b19514(context);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q45Var);
            c14974x21b19514.f207824d.setText(q45Var.m75945x2fec8307(3));
            c14974x21b19514.setOnClickListener(new xt2.u(q45Var, c14974x21b19514, this.f538590f));
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            float f17 = 0.0f;
            float m75942xfb822ef2 = q45Var.m75942xfb822ef2(0) > 0 ? ((float) q45Var.m75942xfb822ef2(0)) / 100.0f : 0.0f;
            if (q45Var.m75942xfb822ef2(1) > 0) {
                f17 = ((float) q45Var.m75942xfb822ef2(1)) / 100.0f;
            }
            layoutParams2.setMarginStart((int) (m75942xfb822ef2 * c14975x15ef5b10.getWidth()));
            layoutParams2.topMargin = (int) (f17 * c14975x15ef5b10.getHeight());
            c14974x21b19514.setLayoutParams(layoutParams2);
            c14975x15ef5b10.f207826e.addView(c14974x21b19514);
        }
    }
}
