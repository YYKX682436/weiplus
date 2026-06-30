package gq2;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f356083a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f356084b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f356085c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f356086d;

    /* renamed from: e, reason: collision with root package name */
    public final gq2.c f356087e;

    public d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, android.view.View rootView, java.util.ArrayList data, gq2.j parent, yz5.l onClickTabBlock) {
        oa.i k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickTabBlock, "onClickTabBlock");
        this.f356083a = context;
        this.f356084b = rootView;
        this.f356085c = onClickTabBlock;
        this.f356087e = new gq2.c(this);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) rootView.findViewById(com.p314xaae8f345.mm.R.id.nv8);
        this.f356086d = c2718xca2902ff;
        if (data.size() <= 0) {
            if (c2718xca2902ff == null) {
                return;
            }
            c2718xca2902ff.setVisibility(8);
            return;
        }
        if (c2718xca2902ff != null) {
            c2718xca2902ff.setVisibility(0);
        }
        if (c2718xca2902ff != null) {
            c2718xca2902ff.n();
            int i17 = 0;
            for (java.lang.Object obj : data) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                hq2.a aVar = (hq2.a) obj;
                gq2.a aVar2 = new gq2.a(this, this.f356083a, c2718xca2902ff.l(), true);
                java.lang.String m75945x2fec8307 = aVar.f364738d.m75945x2fec8307(1);
                m75945x2fec8307 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                android.widget.TextView textView = aVar2.f356079d;
                if (textView != null) {
                    textView.setText(m75945x2fec8307);
                }
                aVar2.f356078c = i17;
                aVar.f364738d.m75939xb282bd08(0);
                int size = data.size();
                android.content.Context context2 = aVar2.f356076a;
                int b17 = i65.a.b(context2, 12);
                int b18 = i65.a.b(context2, 8);
                int b19 = i65.a.b(context2, 12);
                int b27 = i65.a.b(context2, 8);
                int i19 = aVar2.f356078c;
                if (i19 == 0) {
                    b17 = i65.a.b(context2, 16);
                } else if (i19 == size - 1) {
                    b19 = i65.a.b(context2, 16);
                }
                oa.i iVar = aVar2.f356077b;
                oa.k kVar = iVar.f425318h;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.v0.k(kVar, b17, b18, b19, b27);
                c2718xca2902ff.d(iVar, false);
                i17 = i18;
            }
            c2718xca2902ff.K.clear();
            c2718xca2902ff.a(this.f356087e);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2 = this.f356086d;
            if (c2718xca2902ff2 == null || (k17 = c2718xca2902ff2.k(0)) == null || k17.a()) {
                return;
            }
            k17.b();
        }
    }
}
