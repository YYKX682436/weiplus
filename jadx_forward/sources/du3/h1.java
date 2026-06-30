package du3;

/* loaded from: classes3.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.i1 f325139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(du3.i1 i1Var) {
        super(0);
        this.f325139d = i1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        du3.i1 i1Var = this.f325139d;
        android.content.Context context = i1Var.f325151f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        android.view.ViewParent viewParent = i1Var.f325151f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewParent, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).getViewModel(), new hk0.a0((p012xc85e97e9.p093xedfae76a.y) viewParent)).a(hk0.u0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (hk0.u0) a17;
    }
}
