package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBackgroundView;", "Landroid/widget/RelativeLayout;", "", "disable", "Ljz5/f0;", "setDisableAlphaUpdate", "getDisableAlphaUpdate", "getAnimatingHide", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class FloatBackgroundView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f93439d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93440e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93441f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBackgroundView", "showBackgroundView show: " + z17);
        if (z17) {
            if (getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBackgroundView", "float background already show");
                return;
            } else {
                setVisibility(0);
                return;
            }
        }
        if (getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBackgroundView", "float background already hide");
        } else {
            setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if ((event.getKeyCode() != 4 && event.getKeyCode() != 3 && event.getKeyCode() != 82) || event.getAction() != 0) {
            return super.dispatchKeyEvent(event);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93439d).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.ui.n nVar = ((com.tencent.mm.plugin.ball.ui.l) ((mp1.a) it.next())).f93308a;
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
            if (contentFloatBallView != null) {
                contentFloatBallView.h();
            }
            nVar.n();
        }
        return true;
    }

    /* renamed from: getAnimatingHide, reason: from getter */
    public final boolean getF93441f() {
        return this.f93441f;
    }

    /* renamed from: getDisableAlphaUpdate, reason: from getter */
    public final boolean getF93440e() {
        return this.f93440e;
    }

    public final void setDisableAlphaUpdate(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBackgroundView", "setDisableAlphaUpdate disable: " + z17);
        this.f93440e = z17;
    }

    public /* synthetic */ FloatBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f93439d = new java.util.concurrent.CopyOnWriteArraySet();
        android.view.View.inflate(context, com.tencent.mm.R.layout.f489200ei1, this);
        setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_2));
        setOnClickListener(new rp1.b0(this));
    }
}
