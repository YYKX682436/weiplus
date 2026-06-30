package p20;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f432956a;

    public j(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f432956a = url;
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        w20.j jVar = w20.j.f523821a;
        sb6.append((java.lang.String) ((jz5.n) w20.j.f523823c).mo141623x754a37bb());
        sb6.append('/');
        sb6.append(b());
        return sb6.toString();
    }

    public final java.lang.String b() {
        return "ecs_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f432956a);
    }
}
