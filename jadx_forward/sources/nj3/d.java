package nj3;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final is0.c f419427a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f419428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nj3.j f419429c;

    public d(nj3.j jVar, is0.c textureObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureObj, "textureObj");
        this.f419429c = jVar;
        this.f419427a = textureObj;
        this.f419428b = true;
    }

    public final void a() {
        this.f419428b = false;
        nj3.j jVar = this.f419429c;
        jVar.f419458e.add(this.f419427a);
    }
}
