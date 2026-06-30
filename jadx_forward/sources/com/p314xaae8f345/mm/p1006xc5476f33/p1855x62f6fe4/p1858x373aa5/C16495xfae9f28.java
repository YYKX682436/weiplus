package com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/media/view/OperationInterceptorLayout;", "Landroid/widget/FrameLayout;", "Lmf3/n;", "d", "Lmf3/n;", "getLayer", "()Lmf3/n;", "setLayer", "(Lmf3/n;)V", "layer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.media.view.OperationInterceptorLayout */
/* loaded from: classes12.dex */
public final class C16495xfae9f28 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public mf3.n layer;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f230104e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f230105f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16495xfae9f28(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final mf3.n getLayer() {
        return this.layer;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        mf3.n nVar = this.layer;
        if ((nVar != null && nVar.n(motionEvent)) && motionEvent.getAction() == 0) {
            mg3.p.a(motionEvent);
            this.f230105f = true;
            return false;
        }
        if (this.f230105f && motionEvent.getAction() == 1) {
            mg3.p.a(motionEvent);
            this.f230105f = false;
            return false;
        }
        if (this.f230105f) {
            mg3.p.a(motionEvent);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f230104e, "shouldDispatchToLayer interrupt");
        return true;
    }

    /* renamed from: setLayer */
    public final void m66601x534b960f(mf3.n nVar) {
        this.layer = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16495xfae9f28(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f230104e = "MediaGallery.OperationInterceptorLayout";
    }
}
