package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderProcessBar;", "Lcom/tencent/mm/ui/widget/MMProcessBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderProcessBar */
/* loaded from: classes10.dex */
public final class C15338xa845bc0a extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 {

    /* renamed from: f, reason: collision with root package name */
    public final long f212968f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15338xa845bc0a(android.content.Context context, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(context);
        j17 = (i17 & 2) != 0 ? 500L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212968f = 500L;
        this.f292871e.setDuration(500L);
        this.f212968f = j17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4
    public void a(float f17, float f18) {
        e();
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 360.0f, f17, f18);
        this.f292871e = rotateAnimation;
        rotateAnimation.setRepeatMode(-1);
        this.f292871e.setRepeatCount(-1);
        this.f292871e.setDuration(this.f212968f);
        this.f292871e.setInterpolator(new android.view.animation.LinearInterpolator());
        if (getVisibility() == 0) {
            d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15338xa845bc0a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212968f = 500L;
        this.f292871e.setDuration(500L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15338xa845bc0a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212968f = 500L;
        this.f292871e.setDuration(500L);
    }
}
