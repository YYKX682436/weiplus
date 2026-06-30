package dt0;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f324653a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f324654b;

    /* renamed from: c, reason: collision with root package name */
    public ts0.c f324655c;

    /* renamed from: d, reason: collision with root package name */
    public final dt0.a f324656d;

    public b(android.content.Context ctx, gt0.a process) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(process, "process");
        this.f324654b = ctx;
        this.f324656d = new dt0.a(this, process, ctx);
    }

    public final void a(boolean z17, ts0.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewOrientationFit", "enable :" + z17 + " ,cameraConfig " + cVar);
        android.content.Context context = this.f324654b;
        if (context != null) {
            dt0.a aVar = this.f324656d;
            if (z17) {
                this.f324655c = cVar;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) context).setRequestedOrientation(7);
                aVar.enable();
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).setRequestedOrientation(1);
            aVar.disable();
            this.f324653a = 0;
        }
    }
}
