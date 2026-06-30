package p12;

/* loaded from: classes10.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f432555a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13258x5720669f f432556b;

    /* renamed from: c, reason: collision with root package name */
    public int f432557c;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f432558d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.Range f432559e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.File f432560f;

    public h(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13258x5720669f previewLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewLayout, "previewLayout");
        this.f432555a = activity;
        this.f432556b = previewLayout;
        this.f432558d = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(new android.util.Size(0, 0));
        this.f432559e = new android.util.Range(0, 0);
    }

    public abstract android.view.View a();

    public abstract void b();

    public abstract java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);
}
