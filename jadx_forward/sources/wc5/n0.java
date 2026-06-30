package wc5;

/* loaded from: classes10.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f526143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(wc5.y0 y0Var) {
        super(1);
        this.f526143d = y0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        vc5.j filterType = (vc5.j) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterType, "filterType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGallerySearchFilterUIC", "filter selected: " + filterType);
        wc5.y0 y0Var = this.f526143d;
        y0Var.f526198p = filterType;
        if (y0Var.f526192g && (!r26.n0.N(y0Var.f526193h))) {
            y0Var.T6(y0Var.f526193h, false);
        }
        return jz5.f0.f384359a;
    }
}
