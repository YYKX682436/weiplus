package qw1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final is0.c f448613a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f448614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qw1.j f448615c;

    public d(qw1.j jVar, is0.c textureObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureObj, "textureObj");
        this.f448615c = jVar;
        this.f448613a = textureObj;
        this.f448614b = true;
    }

    public final void a() {
        this.f448614b = false;
        qw1.j jVar = this.f448615c;
        jVar.f448642e.add(this.f448613a);
    }
}
