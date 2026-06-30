package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1618xadde6502;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuSurfaceView;", "Landroid/view/SurfaceView;", "Lxs2/p;", "Landroid/view/View;", "getView", "anchor", "Ljz5/f0;", "setAnchorView", "getAnchorView", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.replay.bullet.LiveDanmakuSurfaceView */
/* loaded from: classes3.dex */
public final class C14934xd342128f extends android.view.SurfaceView implements xs2.p {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: e, reason: collision with root package name */
    public xs2.o f206444e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f206445f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14934xd342128f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.TAG = "LiveDanmakuSurfaceView";
    }

    @Override // xs2.p
    public void b(xs2.o manager, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        this.f206444e = manager;
        if (((xs2.e) manager).f537852f) {
            return;
        }
        manager.d(list);
    }

    @Override // xs2.p
    /* renamed from: getAnchorView, reason: from getter */
    public android.view.View getF206445f() {
        return this.f206445f;
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    @Override // xs2.p
    /* renamed from: getView */
    public android.view.View mo58803xfb86a31b() {
        return this;
    }

    @Override // xs2.p
    /* renamed from: onDetach */
    public void mo58804x3f5eee52() {
        xs2.o oVar = this.f206444e;
        if (oVar != null) {
            oVar.mo175869x3f5eee52();
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo58804x3f5eee52();
    }

    @Override // xs2.p
    /* renamed from: setAnchorView */
    public void mo58805xcf1614fc(android.view.View anchor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        this.f206445f = anchor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14934xd342128f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.TAG = "LiveDanmakuSurfaceView";
    }
}
