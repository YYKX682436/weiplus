package com.p314xaae8f345.mm.ui.p2712x43ceaabb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0002B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/ui/immersive/ImmersiveBaseChromeView;", "Landroid/widget/FrameLayout;", "Leh5/k;", "e", "Leh5/k;", "getVisibilityController", "()Leh5/k;", "setVisibilityController", "(Leh5/k;)V", "visibilityController", "", "defaultVisibility", "I", "getDefaultVisibility", "()I", "Leh5/a;", "getImmersiveType", "()Leh5/a;", "immersiveType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.immersive.ImmersiveBaseChromeView */
/* loaded from: classes10.dex */
public abstract class AbstractC22433x7fa3716b extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f290477d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public eh5.k visibilityController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC22433x7fa3716b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public abstract android.view.View a();

    /* renamed from: getDefaultVisibility */
    public int mo79669xd98e7f7d() {
        return 0;
    }

    /* renamed from: getImmersiveType */
    public abstract eh5.a mo79662xd03c94df();

    /* renamed from: getVisibilityController */
    public final eh5.k m80726xfc0730c4() {
        eh5.k kVar = this.visibilityController;
        if (kVar != null) {
            return kVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("visibilityController");
        throw null;
    }

    /* renamed from: setVisibilityController */
    public final void m80727x765a5fd0(eh5.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<set-?>");
        this.visibilityController = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC22433x7fa3716b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this)) {
            setVisibility(mo79669xd98e7f7d());
            android.view.View a17 = a();
            this.f290477d = a17;
            if (a17 != null) {
                addView(a17);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                throw null;
            }
        }
        addOnAttachStateChangeListener(new eh5.l(this, this));
    }
}
