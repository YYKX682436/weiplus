package nx0;

/* loaded from: classes5.dex */
public final class a implements uu3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu3.h f422593a;

    public a(vu3.h hVar) {
        this.f422593a = hVar;
    }

    @Override // uu3.g
    public android.graphics.Rect a(uu3.u drawer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View a17 = this.f422593a.a();
        if (a17 != null) {
            a17.getGlobalVisibleRect(rect);
        }
        return rect;
    }
}
