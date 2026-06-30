package zi2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f554634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f554635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.ViewGroup viewGroup, zi2.w wVar) {
        super(0);
        this.f554634d = viewGroup;
        this.f554635e = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f554634d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new ni2.w(context, this.f554635e);
    }
}
