package com.tencent.mm.plugin.finder.live.box;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0004\u001b\t\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\"\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004J\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/box/DammakuLayout;", "Landroid/widget/FrameLayout;", "", "VH", "Lde2/a;", "adapter", "Ljz5/f0;", "setAdapter", "getAdapter", "Lde2/d;", "parameter", "setAnimParam", "", "isInit", "Z", "()Z", "setInit", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "de2/c", "de2/e", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DammakuLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final de2.c f111504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DammakuLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111504d = new de2.c(this);
    }

    public final de2.a getAdapter() {
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        de2.c cVar = this.f111504d;
        cVar.f229374d.post(new de2.b(cVar));
        com.tencent.mars.xlog.Log.i("DammakuLayout", "reset: cancel");
        oz5.l lVar = ((kotlinx.coroutines.internal.h) cVar.f229371a).f310496d;
        kotlinx.coroutines.q2 q2Var = kotlinx.coroutines.q2.f310571d;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) lVar.get(q2Var);
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = (kotlinx.coroutines.r2) ((kotlinx.coroutines.internal.h) cVar.f229372b).f310496d.get(q2Var);
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        cVar.f229371a = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);
        cVar.f229372b = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a);
    }

    public final <VH> void setAdapter(de2.a adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        throw null;
    }

    public final void setAnimParam(de2.d parameter) {
        kotlin.jvm.internal.o.g(parameter, "parameter");
        this.f111504d.getClass();
        new java.util.HashMap().put(0, new de2.e(0, 0, false, 4, null));
    }

    public final void setInit(boolean z17) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DammakuLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111504d = new de2.c(this);
    }
}
