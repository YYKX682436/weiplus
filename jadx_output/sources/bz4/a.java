package bz4;

/* loaded from: classes15.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent = new com.tencent.mm.autogen.events.BannerToAddEvent();
        bannerToAddEvent.f53998g.f7500c = new com.tencent.mm.plugin.wenote.ui.nativenote.j2(((com.tencent.mm.autogen.events.BannerOnInitEvent) iEvent).f53997g.f7384a);
        bannerToAddEvent.e();
        return false;
    }
}
