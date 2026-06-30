package tc5;

/* loaded from: classes10.dex */
public final class a implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 f499085a;

    public a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3) {
        this.f499085a = activityC21814x1938a8b3;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        e3.d a17 = insets.a(7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getInsets(...)");
        int i17 = this.f499085a.D;
        view.setPadding(a17.f328577a + i17, a17.f328578b, a17.f328579c + i17, a17.f328580d);
        return n3.g3.f415870b;
    }
}
