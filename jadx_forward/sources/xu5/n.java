package xu5;

/* loaded from: classes12.dex */
public class n implements wu5.j, wu5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f538855d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Message f538856e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f538857f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f538858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xu5.o f538859h;

    public n(xu5.o oVar, android.os.Message message) {
        this.f538859h = oVar;
        if (message == null) {
            throw new java.lang.NullPointerException("msg is null");
        }
        this.f538856e = message;
        this.f538857f = oVar.f538863d + "#" + oVar.mo50281xa5c8d9fc(message);
        this.f538858g = oVar;
    }

    @Override // wu5.f
    public boolean a() {
        return this.f538859h.f538861b;
    }

    public boolean b() {
        xu5.o oVar = this.f538859h;
        android.os.Message message = this.f538856e;
        oVar.getClass();
        if (message != null) {
            try {
                zu5.b bVar = oVar.f538866g;
                java.lang.Object[] objArr = new java.lang.Object[0];
                synchronized (bVar) {
                    bVar.a(message, false, objArr);
                }
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        return this.f538855d.cancel(false);
    }

    @Override // wu5.d
    public void f(java.util.concurrent.Future future) {
        this.f538855d = future;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return this.f538857f;
    }

    @Override // java.lang.Runnable
    public void run() {
        xu5.o oVar = this.f538859h;
        boolean z17 = oVar.f538862c.get();
        java.lang.String str = this.f538857f;
        if (z17) {
            this.f538855d.cancel(false);
            ku5.o.f394132c.w("SerialHandler", java.lang.String.format("this handler has quit! %s", str), new java.lang.Object[0]);
            return;
        }
        android.os.Message message = this.f538856e;
        if (message.getTarget() == null && message.obj == null && message.what == 0) {
            this.f538855d.cancel(false);
            ku5.o.f394132c.w("SerialHandler", java.lang.String.format("maybe it's removed before! %s", str), new java.lang.Object[0]);
            return;
        }
        android.os.Handler target = message.getTarget();
        java.util.Objects.requireNonNull(target, "target is null!");
        target.dispatchMessage(message);
        try {
            zu5.b bVar = oVar.f538866g;
            java.lang.Object[] objArr = new java.lang.Object[0];
            synchronized (bVar) {
                bVar.a(message, false, objArr);
            }
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
