package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderExposeChangedEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderExposeInfoChangeEvent;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener */
/* loaded from: classes2.dex */
public abstract class AbstractC15277xde4785e4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32> {
    public AbstractC15277xde4785e4() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f39173x3fe91575 = 1962199586;
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c(long j17);

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32 c5467x4cfefe32) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32 event = c5467x4cfefe32;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.t8(event, this));
        return false;
    }

    /* renamed from: d */
    public abstract java.lang.String getF204194d();

    public abstract void e(long j17, r45.yl2 yl2Var);
}
