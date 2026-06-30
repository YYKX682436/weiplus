package vd2;

@j95.b
/* loaded from: classes3.dex */
public final class j1 extends i95.w implements zy2.x7 {

    /* renamed from: d, reason: collision with root package name */
    public int f517303d = 60;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f517304e = new java.util.concurrent.ConcurrentHashMap();

    public void wi(java.lang.String username, java.lang.String noticeId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        vd2.i1 i1Var = (vd2.i1) this.f517304e.get(new vd2.h1(username, noticeId));
        r45.h32 h32Var = i1Var != null ? i1Var.f517294a : null;
        if (h32Var == null) {
            return;
        }
        h32Var.set(1, java.lang.Integer.valueOf(!z17 ? 1 : 0));
    }
}
