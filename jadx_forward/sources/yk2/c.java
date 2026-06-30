package yk2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yk2.e f544315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yk2.e eVar) {
        super(1);
        this.f544315d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        yk2.e eVar = this.f544315d;
        eVar.getClass();
        if (it.f186860a) {
            r45.f03 f03Var = it.f186861b;
            int i17 = f03Var != null ? f03Var.f455421e : 0;
            if ((f03Var != null ? f03Var.f455420d : 0) == 2) {
                android.widget.TextView textView = eVar.f544318g;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("numRedTv");
                    throw null;
                }
                textView.setVisibility(0);
                android.widget.TextView textView2 = eVar.f544318g;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("numRedTv");
                    throw null;
                }
                textView2.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.a(i17));
                android.widget.TextView textView3 = eVar.f544318g;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("numRedTv");
                    throw null;
                }
                android.view.ViewGroup viewGroup = eVar.f544324d;
                textView3.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(viewGroup.getContext(), i17));
                android.widget.TextView textView4 = eVar.f544318g;
                if (textView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("numRedTv");
                    throw null;
                }
                textView4.setTextSize(0, i65.a.f(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(viewGroup.getContext()));
            } else {
                android.widget.TextView textView5 = eVar.f544318g;
                if (textView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("numRedTv");
                    throw null;
                }
                textView5.setVisibility(8);
            }
            eVar.e("LiveMentionLeft", ll2.a.f400657e);
        } else {
            android.widget.TextView textView6 = eVar.f544318g;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("numRedTv");
                throw null;
            }
            textView6.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
