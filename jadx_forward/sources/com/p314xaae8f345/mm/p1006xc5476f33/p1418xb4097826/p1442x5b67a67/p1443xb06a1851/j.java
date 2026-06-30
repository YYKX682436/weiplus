package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851;

/* loaded from: classes2.dex */
public final class j extends zx2.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p f186696k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p pVar, java.lang.CharSequence title) {
        super(title);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f186696k = pVar;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ecy;
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p pVar = this.f186696k;
            if (pVar.A) {
                pVar.A = false;
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
            android.content.Context context = tabView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.util.Map c17 = d2Var.c(context);
            r45.qj2 qj2Var = pVar.f186706v;
            c17.put("native_drama_id", pm0.v.u(qj2Var != null ? qj2Var.m75942xfb822ef2(0) : 0L));
            android.app.Activity context2 = pVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            c17.put("feed_id", pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.i) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.i.class)).f186695u));
            hc2.v0.b(tabView, "native_drama_collection_tab", "view_clk", 0, c17, null, 20, null);
        }
    }

    @Override // zx2.k, zx2.i
    public void e(boolean z17) {
        android.widget.TextView textView = this.f558585j;
        if (textView != null) {
            android.content.Context context = textView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            textView.setText(i(context));
            k(z17);
            if (z17) {
                com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
            } else {
                com.p314xaae8f345.mm.ui.bk.t0(textView.getPaint());
            }
        }
    }
}
