package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AutoRegisterPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lju3/d0;", "Lkotlinx/coroutines/y0;", "Loz5/l;", "getCoroutineContext", "()Loz5/l;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.AutoRegisterPluginLayout */
/* loaded from: classes5.dex */
public abstract class AbstractC17008x93d612ef extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce implements ju3.d0, p3325xe03a0797.p3326xc267989b.y0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f237303h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC17008x93d612ef(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237303h = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    @Override // ju3.d0
    public void f(yt3.r2 plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        m67975xd72b7a67().add(plugin);
    }

    @Override // p3325xe03a0797.p3326xc267989b.y0
    /* renamed from: getCoroutineContext */
    public oz5.l getF93115e() {
        return ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) this.f237303h).f392029d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        super.mo9065x41012807();
        p3325xe03a0797.p3326xc267989b.z0.c(this, null);
    }
}
