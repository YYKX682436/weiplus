package qs3;

/* loaded from: classes3.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f447875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f447876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(android.view.View view, int i17) {
        super(0);
        this.f447875d = view;
        this.f447876e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f447875d.findViewById(this.f447876e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type T of com.tencent.mm.plugin.radar.ui.ViewBindKt.bind");
        return findViewById;
    }
}
