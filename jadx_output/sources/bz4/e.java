package bz4;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().D0(new bz4.d(this, ((com.tencent.mm.autogen.events.DeleteFavItemEvent) iEvent).f54083g.f8169a));
        return true;
    }
}
