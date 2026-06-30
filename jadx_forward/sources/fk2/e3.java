package fk2;

/* loaded from: classes3.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f344899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f344900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f344901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f344902g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(bm2.h1 h1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f344900e = h1Var;
        this.f344901f = h0Var;
        this.f344902g = h0Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        fk2.e3 e3Var = new fk2.e3(this.f344900e, this.f344901f, this.f344902g, interfaceC29045xdcb5ca57);
        e3Var.f344899d = obj;
        return e3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fk2.e3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean h17 = p3325xe03a0797.p3326xc267989b.z0.h((p3325xe03a0797.p3326xc267989b.y0) this.f344899d);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!h17) {
            return f0Var;
        }
        bm2.h1 h1Var = this.f344900e;
        int m84154x92d2fac5 = h1Var.f103460e.m84154x92d2fac5();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f344902g;
        if (m84154x92d2fac5 > 1) {
            java.lang.CharSequence a17 = h1Var.f103460e.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f344901f;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, h0Var2.f391656d)) {
                java.lang.Object obj2 = h0Var.f391656d;
                ((android.widget.RelativeLayout) obj2).setPadding(0, ((android.widget.RelativeLayout) obj2).getPaddingTop(), 0, ((android.widget.RelativeLayout) h0Var.f391656d).getPaddingBottom());
                h1Var.f103460e.m84182x42191760(5);
                android.text.SpannableStringBuilder valueOf = android.text.SpannableStringBuilder.valueOf((java.lang.CharSequence) h0Var2.f391656d);
                valueOf.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6)), 0, ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0) h0Var2.f391656d).length(), 33);
                h1Var.f103460e.b(valueOf);
                return f0Var;
            }
        }
        java.lang.Object obj3 = h0Var.f391656d;
        ((android.widget.RelativeLayout) obj3).setPadding(0, ((android.widget.RelativeLayout) obj3).getPaddingTop(), ((android.widget.RelativeLayout) h0Var.f391656d).getPaddingRight(), ((android.widget.RelativeLayout) h0Var.f391656d).getPaddingBottom());
        return f0Var;
    }
}
