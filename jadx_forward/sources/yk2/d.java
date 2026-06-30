package yk2;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yk2.e f544316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yk2.e eVar) {
        super(1);
        this.f544316d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        yk2.e eVar = this.f544316d;
        eVar.getClass();
        if (it.f186860a) {
            boolean z17 = true;
            r45.f03 f03Var = it.f186861b;
            if (f03Var != null && f03Var.f455420d == 3) {
                android.widget.TextView textView = eVar.f544319h;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalRedDotTv");
                    throw null;
                }
                textView.setVisibility(0);
                java.lang.String str2 = f03Var != null ? f03Var.f455422f : null;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    android.widget.TextView textView2 = eVar.f544320i;
                    if (textView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redDotDescTv");
                        throw null;
                    }
                    textView2.setVisibility(0);
                    i95.m c17 = i95.n0.c(zy2.s6.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    zy2.s6 s6Var = (zy2.s6) c17;
                    if (f03Var == null || (str = f03Var.f455422f) == null) {
                        str = "";
                    }
                    java.lang.String str3 = str;
                    android.widget.TextView textView3 = eVar.f544320i;
                    if (textView3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redDotDescTv");
                        throw null;
                    }
                    android.text.SpannableString H3 = zy2.s6.H3(s6Var, str3, (int) textView3.getTextSize(), false, 4, null);
                    android.widget.TextView textView4 = eVar.f544320i;
                    if (textView4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redDotDescTv");
                        throw null;
                    }
                    textView4.setText(H3);
                }
                eVar.e("LiveMentionRight", ll2.a.f400657e);
                return jz5.f0.f384359a;
            }
        }
        android.widget.TextView textView5 = eVar.f544319h;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalRedDotTv");
            throw null;
        }
        textView5.setVisibility(8);
        android.widget.TextView textView6 = eVar.f544320i;
        if (textView6 != null) {
            textView6.setVisibility(8);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redDotDescTv");
        throw null;
    }
}
