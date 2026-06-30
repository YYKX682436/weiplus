package qs3;

/* loaded from: classes3.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f447873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f447874e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.app.Activity activity, int i17) {
        super(0);
        this.f447873d = activity;
        this.f447874e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f447873d.findViewById(this.f447874e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type T of com.tencent.mm.plugin.radar.ui.ViewBindKt.bind");
        return findViewById;
    }
}
