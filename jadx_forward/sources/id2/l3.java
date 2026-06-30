package id2;

/* loaded from: classes2.dex */
public final class l3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f372190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f372191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f372192f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(android.widget.TextView textView, android.widget.TextView textView2, java.lang.String str) {
        super(1);
        this.f372190d = textView;
        this.f372191e = textView2;
        this.f372192f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = it.f186860a;
        android.widget.TextView textView = this.f372190d;
        android.widget.TextView textView2 = this.f372191e;
        if (z17) {
            r45.f03 f03Var = it.f186861b;
            if (f03Var != null && f03Var.f455420d == 3) {
                textView.setVisibility(0);
                java.lang.String str2 = f03Var != null ? f03Var.f455422f : null;
                if (!(str2 == null || str2.length() == 0)) {
                    textView2.setVisibility(0);
                    i95.m c17 = i95.n0.c(zy2.s6.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    textView2.setText(zy2.s6.H3((zy2.s6) c17, (f03Var == null || (str = f03Var.f455422f) == null) ? "" : str, (int) textView2.getTextSize(), false, 4, null));
                }
                ll2.e eVar = ll2.e.f400666a;
                ll2.b[] bVarArr = ll2.b.f400661d;
                java.lang.String valueOf = java.lang.String.valueOf(14);
                ll2.a aVar = ll2.a.f400657e;
                eVar.n(valueOf, this.f372192f, 1, "");
                return jz5.f0.f384359a;
            }
        }
        textView.setVisibility(8);
        textView2.setVisibility(8);
        return jz5.f0.f384359a;
    }
}
