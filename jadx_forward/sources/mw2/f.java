package mw2;

/* loaded from: classes2.dex */
public final class f implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mw2.j f413246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413247b;

    public f(mw2.j jVar, java.lang.String str) {
        this.f413246a = jVar;
        this.f413247b = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        mw2.j jVar = this.f413246a;
        java.lang.String urlMd5 = this.f413247b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(urlMd5, "$urlMd5");
        synchronized (jVar.f413262h) {
            if (bitmap != null) {
                jVar.f413260f.d(urlMd5, bitmap);
            }
            java.util.List list = (java.util.List) jVar.f413262h.get(urlMd5);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((yz5.l) it.next()).mo146xb9724478(bitmap);
                }
            }
        }
    }
}
