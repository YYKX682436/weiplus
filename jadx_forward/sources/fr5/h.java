package fr5;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f347483a;

    /* renamed from: b, reason: collision with root package name */
    public final long f347484b;

    /* renamed from: c, reason: collision with root package name */
    public final zq5.e f347485c;

    /* renamed from: d, reason: collision with root package name */
    public final long f347486d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f347487e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f347488f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.OverScroller f347489g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f347490h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f347491i;

    public h(android.view.View view, long j17, zq5.e eVar, long j18, yz5.l onUpdateValue, yz5.a onEnd, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onUpdateValue, "onUpdateValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onEnd, "onEnd");
        this.f347483a = view;
        this.f347484b = j17;
        this.f347485c = eVar;
        this.f347486d = j18;
        this.f347487e = onUpdateValue;
        this.f347488f = onEnd;
        this.f347489g = new android.widget.OverScroller(view.getContext());
        this.f347490h = new fr5.g(this);
    }
}
