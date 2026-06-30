package l6;

/* loaded from: classes16.dex */
public class b extends java.lang.Thread {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f398243f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f398241d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f398242e = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f398244g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f398245h = new java.util.ArrayList();

    public b(android.content.Context context) {
        this.f398243f = context;
    }

    public void a(l6.a aVar) {
        synchronized (this.f398241d) {
            aVar.f398239h = aVar.f398234c + l6.c.c(this.f398243f).d(aVar.f398232a);
            aVar.f398237f = 0L;
            synchronized (this.f398242e) {
                if (((java.util.ArrayList) this.f398245h).size() > 0) {
                    ((l6.a) ((java.util.ArrayList) this.f398245h).get(0)).f398238g = false;
                }
                ((java.util.ArrayList) this.f398245h).add(0, aVar);
            }
            try {
                this.f398241d.notify();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e1 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.b.run():void");
    }
}
