package vr1;

/* loaded from: classes8.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f521105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(vr1.o oVar) {
        super(0);
        this.f521105d = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return new xm3.t0(this.f521105d.P6(), new in5.s() { // from class: com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadRvUIC$buildItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                xr1.n nVar = xr1.n.f537736e;
                return type == 1 ? new wr1.a() : new wr1.b();
            }
        }, true);
    }
}
