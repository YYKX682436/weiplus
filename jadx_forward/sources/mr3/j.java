package mr3;

/* loaded from: classes5.dex */
public final class j extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f412402e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f412403f;

    /* renamed from: g, reason: collision with root package name */
    public final mr3.d f412404g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f412405h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f412406i;

    public j(p3325xe03a0797.p3326xc267989b.y0 scope, yz5.l onClickRecommendImage, mr3.d addClicker, yz5.a shouldHighlight) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickRecommendImage, "onClickRecommendImage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addClicker, "addClicker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shouldHighlight, "shouldHighlight");
        this.f412402e = scope;
        this.f412403f = onClickRecommendImage;
        this.f412404g = addClicker;
        this.f412405h = shouldHighlight;
        this.f412406i = true;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e3t;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        mr3.l item = (mr3.l) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.uxb);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.uxa);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) holder.p(com.p314xaae8f345.mm.R.id.uxc);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.cdj);
        linearLayout3.setVisibility(4);
        holder.o().post(new mr3.e(holder, linearLayout3, linearLayout2));
        if (((java.lang.Boolean) this.f412405h.mo152xb9724478()).booleanValue() && this.f412406i) {
            sa5.d.e(linearLayout3, i65.a.h(holder.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
        }
        this.f412406i = false;
        linearLayout3.setOnClickListener(new mr3.f(holder, this));
        if (!item.o()) {
            linearLayout.setVisibility(8);
            return;
        }
        java.lang.String str = item.f412412h;
        if (str == null) {
            return;
        }
        linearLayout.setVisibility(0);
        p3325xe03a0797.p3326xc267989b.l.d(this.f412402e, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new mr3.h(str, c22628xfde5d61d, null), 2, null);
        linearLayout2.setOnClickListener(new mr3.i(this, item));
    }
}
