package bg;

/* loaded from: classes7.dex */
public class f1 extends tf.r0 {

    /* renamed from: e, reason: collision with root package name */
    public pd1.l f19793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg1.g1 f19794f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(bg.g1 g1Var, tf.q qVar, fg1.g1 g1Var2) {
        super(qVar);
        this.f19794f = g1Var2;
        this.f19793e = null;
    }

    @Override // pd1.l
    public pd1.f a() {
        return !this.f19794f.a() ? g().a() : tf.r0.f418842c;
    }

    @Override // pd1.l
    public void b(android.view.View view) {
        if (this.f19794f.a()) {
            return;
        }
        if (view instanceof com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) {
            g().b((com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view);
        } else {
            com.tencent.mars.xlog.Log.w(this.f418844a, "recycleVideoContainerView, view is not instanceof TextureImageViewLikeImpl");
        }
    }

    @Override // tf.r0, pd1.l
    public void c(android.view.View view, java.lang.Runnable runnable) {
        if (this.f19794f.a()) {
            super.c(view, runnable);
            return;
        }
        if (view instanceof com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) {
            g().c((com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view, runnable);
            return;
        }
        java.lang.String str = this.f418844a;
        com.tencent.mars.xlog.Log.w(str, "transferTo, view is not instanceof TextureImageViewLikeImpl");
        if (runnable != null) {
            com.tencent.mars.xlog.Log.i(str, "transferTo, run afterTransferToTask when view is not instanceof TextureImageViewLikeImpl");
            runnable.run();
        }
    }

    @Override // tf.r0, pd1.l
    public void d(android.view.View view, java.lang.Runnable runnable) {
        if (this.f19794f.a()) {
            super.d(view, runnable);
            return;
        }
        if (view instanceof com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) {
            g().d((com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view, runnable);
            return;
        }
        java.lang.String str = this.f418844a;
        com.tencent.mars.xlog.Log.w(str, "transferFrom, view is not instanceof TextureImageViewLikeImpl");
        if (runnable != null) {
            com.tencent.mars.xlog.Log.i(str, "transferFrom, run afterTransferFromTask when view is not instanceof TextureImageViewLikeImpl");
            runnable.run();
        }
    }

    @Override // pd1.l
    public android.view.View e(android.content.Context context) {
        return !this.f19794f.a() ? g().e(context) : new tf.p0(this, context);
    }

    @Override // pd1.l
    public void f(android.view.View view) {
        boolean a17 = this.f19794f.a();
        java.lang.String str = this.f418844a;
        if (a17) {
            com.tencent.mars.xlog.Log.i(str, "onPlayEndWorkaround, view: " + view);
        } else if (view instanceof com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) {
            g().f((com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view);
        } else {
            com.tencent.mars.xlog.Log.w(str, "onPlayEndWorkaround, view is not instanceof TextureImageViewLikeImpl");
        }
    }

    public final pd1.l g() {
        if (this.f19793e == null) {
            this.f19793e = ((bg.c1) bg.e1.f19759c).a(this.f19794f);
        }
        return this.f19793e;
    }
}
