package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class y3 implements u1.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f10821d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f10822e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Float f10823f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Float f10824g;

    /* renamed from: h, reason: collision with root package name */
    public y1.j f10825h;

    /* renamed from: i, reason: collision with root package name */
    public y1.j f10826i;

    public y3(int i17, java.util.List allScopes, java.lang.Float f17, java.lang.Float f18, y1.j jVar, y1.j jVar2) {
        kotlin.jvm.internal.o.g(allScopes, "allScopes");
        this.f10821d = i17;
        this.f10822e = allScopes;
        this.f10823f = f17;
        this.f10824g = f18;
        this.f10825h = jVar;
        this.f10826i = jVar2;
    }

    @Override // u1.s1
    public boolean isValid() {
        return this.f10822e.contains(this);
    }
}
