package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.uic;

/* renamed from: com.tencent.mm.plugin.gallery.ui.uic.ImagePreviewEventUIC */
/* loaded from: classes10.dex */
public final class C15668x4eca9882 extends i33.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.uic.C15669x2ab06e2d f220179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.gallery.ui.uic.ImagePreviewEventUIC$livePhotoUseStateEventListener$1] */
    public C15668x4eca9882(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f220179d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a>(activity, this) { // from class: com.tencent.mm.plugin.gallery.ui.uic.ImagePreviewEventUIC$livePhotoUseStateEventListener$1

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.uic.C15668x4eca9882 f220180d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activity);
                this.f220180d = this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                this.f39173x3fe91575 = -826057574;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a c5683x770cde8a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a event = c5683x770cde8a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new i33.s1(event, this.f220180d));
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewEventUIC", "onCreate");
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewEventUIC", "onDestroy");
        mo48814x2efc64();
    }
}
