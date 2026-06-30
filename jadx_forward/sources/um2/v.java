package um2;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f510517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f510518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f510519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f510520h;

    public v(um2.x5 x5Var, android.view.View view, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2) {
        this.f510516d = x5Var;
        this.f510517e = view;
        this.f510518f = z17;
        this.f510519g = f0Var;
        this.f510520h = f0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f510516d.S(this.f510517e, this.f510518f, this.f510519g.f391649d, this.f510520h.f391649d);
    }
}
