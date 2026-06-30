package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1618xadde6502;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuNativeView;", "Lcom/tencent/mm/danmaku/render/NativeDanmakuView;", "Lxs2/p;", "Landroid/view/View;", "getView", "anchor", "Ljz5/f0;", "setAnchorView", "getAnchorView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.replay.bullet.LiveDanmakuNativeView */
/* loaded from: classes10.dex */
public final class C14933x993fde1f extends com.p314xaae8f345.mm.p672x55b6590f.p673xc84b4196.C10429x362d5b9d implements xs2.p {

    /* renamed from: g, reason: collision with root package name */
    public xs2.o f206441g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f206442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14933x993fde1f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // xs2.p
    public void b(xs2.o manager, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        this.f206441g = manager;
        if (((xs2.e) manager).f537852f) {
            return;
        }
        manager.d(list);
    }

    @Override // xs2.p
    /* renamed from: getAnchorView, reason: from getter */
    public android.view.View getF206442h() {
        return this.f206442h;
    }

    @Override // xs2.p
    /* renamed from: getView */
    public android.view.View mo58803xfb86a31b() {
        return this;
    }

    @Override // xs2.p
    /* renamed from: onDetach */
    public void mo58804x3f5eee52() {
        xs2.o oVar = this.f206441g;
        if (oVar != null) {
            oVar.mo175869x3f5eee52();
        }
    }

    @Override // com.p314xaae8f345.mm.p672x55b6590f.p673xc84b4196.C10429x362d5b9d, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo58804x3f5eee52();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        vp.x b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        boolean z17 = false;
        if (event.getAction() == 0) {
            xs2.o oVar = this.f206441g;
            if ((oVar == null || (b17 = oVar.b()) == null || !b17.y5(new android.graphics.Point((int) event.getX(), ((int) event.getY()) + ((int) getY())), 0)) ? false : true) {
                z17 = true;
            }
        }
        if (z17) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // xs2.p
    /* renamed from: setAnchorView */
    public void mo58805xcf1614fc(android.view.View anchor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        this.f206442h = anchor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14933x993fde1f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
