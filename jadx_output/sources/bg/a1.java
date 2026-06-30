package bg;

/* loaded from: classes7.dex */
public class a1 extends tf.i {

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f19741h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bg.b1 f19742i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(bg.b1 b1Var, com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl textureImageViewLikeImpl, java.lang.Runnable runnable) {
        super(b1Var, textureImageViewLikeImpl, runnable);
        this.f19742i = b1Var;
        this.f19741h = null;
    }

    @Override // tf.i
    public void b() {
        this.f19742i.h(null);
    }

    @Override // tf.i
    public boolean c(android.view.Surface surface, int i17, int i18) {
        android.view.Surface surface2 = this.f19741h;
        if (surface2 != null && surface2 == surface) {
            return true;
        }
        try {
            boolean T = this.f19742i.f19744g.f261868a.T(surface);
            if (T) {
                this.f19741h = surface;
            }
            return T;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
