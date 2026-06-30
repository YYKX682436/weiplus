package yt3;

/* loaded from: classes5.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f546958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.ViewGroup viewGroup) {
        super(0);
        this.f546958d = viewGroup;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup = this.f546958d;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new yv3.a(context, viewGroup, true);
    }
}
