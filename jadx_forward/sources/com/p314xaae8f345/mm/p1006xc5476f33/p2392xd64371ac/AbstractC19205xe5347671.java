package com.p314xaae8f345.mm.p1006xc5476f33.p2392xd64371ac;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/webcanvas/WebCanvasView;", "Landroid/widget/FrameLayout;", "", "", "e", "Ljava/lang/String;", "getCanvasId", "()Ljava/lang/String;", "setCanvasId", "(Ljava/lang/String;)V", "canvasId", "Lku4/b;", "getJsEngine", "()Lku4/b;", "jsEngine", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "webview-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webcanvas.WebCanvasView */
/* loaded from: classes2.dex */
public abstract class AbstractC19205xe5347671 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f262932d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public java.lang.String canvasId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC19205xe5347671(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final java.lang.String getCanvasId() {
        return this.canvasId;
    }

    /* renamed from: getJsEngine */
    public abstract ku4.b m74028xbe805661();

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262932d, "onAttachedToWindow#" + this.canvasId);
        getContext();
        super.onAttachedToWindow();
    }

    /* renamed from: setCanvasId */
    public final void m74029x70452715(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.canvasId = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC19205xe5347671(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f262932d = "MicroMsg.WebCanvasView:" + hashCode();
        this.canvasId = "";
    }
}
