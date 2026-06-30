package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseScopePluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lju3/d0;", "Lkotlinx/coroutines/y0;", "h", "Lkotlinx/coroutines/y0;", "getScope", "()Lkotlinx/coroutines/y0;", "scope", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout */
/* loaded from: classes5.dex */
public abstract class AbstractC17011x9ad37dc0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce implements ju3.d0 {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final p3325xe03a0797.p3326xc267989b.y0 scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC17011x9ad37dc0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.scope = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
    }

    public static p3325xe03a0797.p3326xc267989b.r2 y(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17011x9ad37dc0 abstractC17011x9ad37dc0, oz5.l context, p3325xe03a0797.p3326xc267989b.a1 start, yz5.p block, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
        }
        if ((i17 & 1) != 0) {
            context = oz5.m.f431862d;
        }
        if ((i17 & 2) != 0) {
            start = p3325xe03a0797.p3326xc267989b.a1.DEFAULT;
        }
        abstractC17011x9ad37dc0.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        return p3325xe03a0797.p3326xc267989b.l.c(abstractC17011x9ad37dc0.scope, context, start, block);
    }

    public final p3325xe03a0797.p3326xc267989b.y0 getScope() {
        return this.scope;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        super.mo9065x41012807();
        p3325xe03a0797.p3326xc267989b.z0.d(this.scope, this + " release.", null, 2, null);
    }
}
