package ft4;

/* loaded from: classes14.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f348114d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f348115e;

    /* renamed from: f, reason: collision with root package name */
    public final ft4.u f348116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f348114d = root;
        android.view.View findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.q2m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f348115e = findViewById;
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f348116f = new ft4.u(context, findViewById);
    }
}
