package du3;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.m f325171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(du3.m mVar) {
        super(0);
        this.f325171d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        du3.m mVar = this.f325171d;
        android.content.Context context = mVar.f325183f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        android.view.ViewParent viewParent = mVar.f325183f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewParent, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).getViewModel(), new hk0.a0((p012xc85e97e9.p093xedfae76a.y) viewParent)).a(hk0.u0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (hk0.u0) a17;
    }
}
