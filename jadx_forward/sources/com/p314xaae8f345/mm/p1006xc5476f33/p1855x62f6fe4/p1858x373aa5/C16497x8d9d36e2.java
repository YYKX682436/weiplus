package com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/media/view/ShrinkBox;", "Landroid/widget/RelativeLayout;", "Lkg3/e;", "", "compressed", "Ljz5/f0;", "setShrunk", "", "d", "I", "getPriority", "()I", "setPriority", "(I)V", com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4, "e", "getViewId", "viewId", "Lkg3/o;", "g", "Lkg3/o;", "getShrinkListener", "()Lkg3/o;", "setShrinkListener", "(Lkg3/o;)V", "shrinkListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.media.view.ShrinkBox */
/* loaded from: classes12.dex */
public class C16497x8d9d36e2 extends android.widget.RelativeLayout implements kg3.e {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int priority;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int viewId;

    /* renamed from: f, reason: collision with root package name */
    public boolean f230108f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public kg3.o shrinkListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16497x8d9d36e2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // kg3.e
    /* renamed from: a, reason: from getter */
    public boolean getF230108f() {
        return this.f230108f;
    }

    @Override // kg3.e
    public int getPriority() {
        return this.priority;
    }

    public kg3.o getShrinkListener() {
        return this.shrinkListener;
    }

    @Override // kg3.e
    public int getViewId() {
        return this.viewId;
    }

    /* renamed from: setPriority */
    public void m66605x311b1826(int i17) {
        this.priority = i17;
    }

    /* renamed from: setShrinkListener */
    public void m66606xd5938adf(kg3.o oVar) {
        this.shrinkListener = oVar;
    }

    @Override // kg3.e
    /* renamed from: setShrunk */
    public void mo66607x2278ca17(boolean z17) {
        this.f230108f = z17;
        kg3.o shrinkListener = getShrinkListener();
        if (shrinkListener != null) {
            shrinkListener.b(z17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16497x8d9d36e2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.viewId = getId();
    }
}
