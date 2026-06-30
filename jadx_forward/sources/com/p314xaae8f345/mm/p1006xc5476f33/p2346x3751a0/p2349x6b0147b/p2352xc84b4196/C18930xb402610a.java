package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/voip/video/render/VoIPRenderTextureView;", "Landroid/view/TextureView;", "", "isFullScreen", "Z", "()Z", "setFullScreen", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-voip_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView */
/* loaded from: classes5.dex */
public class C18930xb402610a extends android.view.TextureView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18930xb402610a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(boolean z17) {
        if (z17) {
            setAlpha(0.0f);
        } else {
            setAlpha(1.0f);
        }
    }

    public final void b() {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.addRule(10);
            layoutParams2.addRule(21);
            layoutParams2.width = i65.a.b(getContext(), 16);
            layoutParams2.height = i65.a.b(getContext(), 24);
            layoutParams2.topMargin = i65.a.b(getContext(), 4);
            layoutParams2.rightMargin = i65.a.b(getContext(), 4);
            setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: setFullScreen */
    public final void m72912xec596ddd(boolean z17) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18930xb402610a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
