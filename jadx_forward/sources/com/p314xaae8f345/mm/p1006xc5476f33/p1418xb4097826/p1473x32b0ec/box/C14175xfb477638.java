package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0004\u001b\t\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\"\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004J\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/box/DammakuLayout;", "Landroid/widget/FrameLayout;", "", "VH", "Lde2/a;", "adapter", "Ljz5/f0;", "setAdapter", "getAdapter", "Lde2/d;", "parameter", "setAnimParam", "", "isInit", "Z", "()Z", "setInit", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "de2/c", "de2/e", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.box.DammakuLayout */
/* loaded from: classes5.dex */
public final class C14175xfb477638 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final de2.c f193037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14175xfb477638(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193037d = new de2.c(this);
    }

    /* renamed from: getAdapter */
    public final de2.a m56765xf939df19() {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        de2.c cVar = this.f193037d;
        cVar.f310907d.post(new de2.b(cVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DammakuLayout", "reset: cancel");
        oz5.l lVar = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) cVar.f310904a).f392029d;
        p3325xe03a0797.p3326xc267989b.q2 q2Var = p3325xe03a0797.p3326xc267989b.q2.f392104d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) lVar.get(q2Var);
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = (p3325xe03a0797.p3326xc267989b.r2) ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) cVar.f310905b).f392029d.get(q2Var);
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        cVar.f310904a = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c);
        cVar.f310905b = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a);
    }

    /* renamed from: setAdapter */
    public final <VH> void m56766x6cab2c8d(de2.a adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        throw null;
    }

    /* renamed from: setAnimParam */
    public final void m56767x9d743aba(de2.d parameter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        this.f193037d.getClass();
        new java.util.HashMap().put(0, new de2.e(0, 0, false, 4, null));
    }

    /* renamed from: setInit */
    public final void m56768x764b9492(boolean z17) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14175xfb477638(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193037d = new de2.c(this);
    }
}
