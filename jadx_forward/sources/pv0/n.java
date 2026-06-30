package pv0;

/* loaded from: classes5.dex */
public final class n implements pv0.b {

    /* renamed from: a, reason: collision with root package name */
    public final pv0.a f440071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pv0.y f440072b;

    public n(pv0.y yVar, pv0.a timbreCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreCallback, "timbreCallback");
        this.f440072b = yVar;
        this.f440071a = timbreCallback;
    }

    public void a(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, java.lang.String roleID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        this.f440071a.a(segmentID, roleID);
        pv0.y yVar = this.f440072b;
        yVar.f440098s.f440073a.decrementAndGet();
        dw0.c l76 = yVar.l7(roleID);
        if (l76 != null) {
            yVar.r7(l76, true);
        }
    }

    public void b(ru0.e roleResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleResult, "roleResult");
        this.f440071a.e(roleResult);
        pv0.y yVar = this.f440072b;
        yVar.f440098s.f440073a.decrementAndGet();
        dw0.c l76 = yVar.l7(roleResult.f481196b);
        if (l76 != null) {
            yVar.r7(l76, false);
        }
    }
}
