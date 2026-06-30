package mh2;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f407824a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f407825b;

    public a(android.content.Context context, android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f407824a = context;
        this.f407825b = android.view.LayoutInflater.from(context).inflate(a(), viewGroup, false);
    }

    public abstract int a();

    public final void b(android.widget.ImageView img, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(img, "img");
        zl2.a.f555165a.a(img, c19782x23db1cfa);
    }

    public abstract void c(om2.d0 d0Var);

    public void d(r45.x84 ktvData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ktvData, "ktvData");
    }

    public void e(om2.d0 singState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singState, "singState");
    }
}
