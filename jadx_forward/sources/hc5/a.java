package hc5;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f361902a;

    public a(yb5.d mChattingContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mChattingContext, "mChattingContext");
        this.f361902a = mChattingContext;
    }

    public abstract int a(java.util.List list);

    public int b() {
        return 0;
    }

    public abstract java.lang.String c();

    public rd5.d d(java.util.List msgInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfos, "msgInfos");
        return (rd5.d) msgInfos.get(b());
    }

    public abstract java.lang.Class e(rd5.d dVar);

    public void f() {
    }

    public void g(java.util.List msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
    }

    public abstract java.lang.String h(rd5.d dVar);
}
