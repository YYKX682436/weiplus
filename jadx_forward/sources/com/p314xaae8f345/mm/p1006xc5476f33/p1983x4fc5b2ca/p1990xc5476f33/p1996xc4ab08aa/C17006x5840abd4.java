package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0014R#\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AppBrandRecordPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout;", "", "getLayoutId", "Lcom/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView;", "kotlin.jvm.PlatformType", "C", "Ljz5/g;", "getTopCountdownCover", "()Lcom/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView;", "topCountdownCover", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.AppBrandRecordPluginLayout */
/* loaded from: classes10.dex */
public final class C17006x5840abd4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e {

    /* renamed from: C, reason: from kotlin metadata */
    public final jz5.g topCountdownCover;
    public boolean D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17006x5840abd4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.topCountdownCover = jz5.h.b(new ju3.a(this));
    }

    /* renamed from: getTopCountdownCover */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16553x9b9a9a23 m67946x1ffe005() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16553x9b9a9a23) ((jz5.n) this.topCountdownCover).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e
    /* renamed from: getLayoutId */
    public int mo67947x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f81557if;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17023x788598b, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void m(it3.y navigator, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigator, "navigator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        this.D = configProvider.M.getBoolean("key_show_top_countdown_cover", false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 5) {
            if (getConfigProvider() == null) {
                return;
            }
            if (this.D) {
                m67946x1ffe005().c(r0.f237209n.f152728h);
            }
        } else if (ordinal == 6 && this.D) {
            m67946x1ffe005().b();
        }
        super.w(status, bundle);
    }
}
