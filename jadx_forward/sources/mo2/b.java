package mo2;

/* loaded from: classes2.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.CloseDrawerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f411887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f411888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mo2.q f411889c;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, mo2.q qVar) {
        this.f411887a = abstractC14490x69736cb5;
        this.f411888b = s0Var;
        this.f411889c = qVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.CloseDrawerCallback
    public void a(int i17, java.util.List data, boolean z17) {
        int m59216x8ed22866;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        boolean z18 = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.w0().r()).intValue() == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f411887a;
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(abstractC14490x69736cb5.mo2128x1ed62e84());
            m59216x8ed22866 = h17 != null ? h17.m59216x8ed22866() : abstractC14490x69736cb5.getFeedObject().m59216x8ed22866();
        } else {
            m59216x8ed22866 = abstractC14490x69736cb5.getFeedObject().m59216x8ed22866();
        }
        int i18 = m59216x8ed22866;
        in5.s0 s0Var = this.f411888b;
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.c6s);
        if (i18 > 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(hc2.b0.j(abstractC14490x69736cb5, context) ? 1 : 2, i18));
        mo2.q qVar = this.f411889c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f411887a;
        in5.s0 s0Var2 = this.f411888b;
        android.view.View p17 = s0Var2.p(com.p314xaae8f345.mm.R.id.qhs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.qku);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
        qVar.v(abstractC14490x69736cb52, s0Var2, (android.widget.TextView) p17, p18, i18);
    }
}
