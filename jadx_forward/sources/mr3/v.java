package mr3;

/* loaded from: classes5.dex */
public final class v extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f412438e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f412439f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f412440g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f412441h;

    public v(p3325xe03a0797.p3326xc267989b.y0 scope, boolean z17, yz5.l onDelete, yz5.l onClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDelete, "onDelete");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        this.f412438e = scope;
        this.f412439f = z17;
        this.f412440g = onDelete;
        this.f412441h = onClick;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e3u;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        mr3.l item = (mr3.l) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) holder.p(com.p314xaae8f345.mm.R.id.f566854ha5);
        if (c22628xfde5d61d == null) {
            return;
        }
        c22628xfde5d61d.setVisibility(4);
        holder.o().post(new mr3.o(holder, c22628xfde5d61d));
        java.lang.String str = item.f412412h;
        if (str == null) {
            return;
        }
        if (!item.o()) {
            c22628xfde5d61d.setBackgroundColor(i65.a.d(holder.f374654e, com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
            return;
        }
        android.content.Context context = holder.f374654e;
        p3325xe03a0797.p3326xc267989b.l.d(this.f412438e, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new mr3.q(str, c22628xfde5d61d, null), 2, null);
        if (!this.f412439f) {
            c22628xfde5d61d.setOnLongClickListener(new mr3.t(context, c22628xfde5d61d, this, item, holder));
        }
        c22628xfde5d61d.setOnClickListener(new mr3.u(this, item));
    }
}
