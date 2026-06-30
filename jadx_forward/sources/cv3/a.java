package cv3;

/* loaded from: classes5.dex */
public final class a implements uu3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu3.h f304099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cv3.c f304100b;

    public a(vu3.h hVar, cv3.c cVar) {
        this.f304099a = hVar;
        this.f304100b = cVar;
    }

    @Override // uu3.g
    public android.graphics.Rect a(uu3.u drawer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View a17 = this.f304099a.a();
        if (a17 != null) {
            a17.getGlobalVisibleRect(rect);
        }
        java.lang.String str = this.f304100b.f304105g;
        rect.toString();
        return rect;
    }
}
