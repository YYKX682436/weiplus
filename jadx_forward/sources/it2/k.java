package it2;

/* loaded from: classes7.dex */
public final class k extends lc3.e {

    /* renamed from: d, reason: collision with root package name */
    public final it2.x f376044d;

    public k(it2.x service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f376044d = service;
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        android.widget.FrameLayout frameLayout = this.f376044d.f376066g;
        android.content.Context context = frameLayout != null ? frameLayout.getContext() : null;
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        return null;
    }
}
