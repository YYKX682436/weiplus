package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/applet/CdnImageViewWithCompletion;", "Lcom/tencent/mm/pluginsdk/ui/applet/CdnImageView;", "Landroid/graphics/Bitmap;", "bitmap", "Ljz5/f0;", "setImageBitmapCompleted", "Ljava/lang/Runnable;", "q", "Ljava/lang/Runnable;", "getCallback", "()Ljava/lang/Runnable;", "setCallback", "(Ljava/lang/Runnable;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "common-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.applet.CdnImageViewWithCompletion */
/* loaded from: classes9.dex */
public final class C19660xbb17a935 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public java.lang.Runnable callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19660xbb17a935(android.content.Context context, android.util.AttributeSet attr) {
        super(context, attr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attr, "attr");
    }

    public final java.lang.Runnable getCallback() {
        return this.callback;
    }

    /* renamed from: setCallback */
    public final void m75399x6c4ebec7(java.lang.Runnable runnable) {
        this.callback = runnable;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913
    /* renamed from: setImageBitmapCompleted */
    public void mo65185x405ec283(android.graphics.Bitmap bitmap) {
        super.mo65185x405ec283(bitmap);
        java.lang.Runnable runnable = this.callback;
        if (runnable != null) {
            runnable.run();
        }
    }
}
