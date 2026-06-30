package p01;

/* loaded from: classes12.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final p01.d f431895d = new p01.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = pu5.h.f440005b;
        android.os.HandlerThread a17 = pu5.f.a("NewInitThread", 5);
        a17.setPriority(10);
        a17.start();
        p01.f.f431899c = true;
        return a17;
    }
}
