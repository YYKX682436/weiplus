package mf3;

/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.p f407648a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f407649b;

    public q(mf3.p apiCenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f407648a = apiCenter;
        this.f407649b = new java.util.ArrayList();
    }

    public final void a(java.lang.Class apiClz, mf3.n holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiClz, "apiClz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ((java.util.ArrayList) this.f407649b).add(holder);
        this.f407648a.d(apiClz, holder);
    }
}
