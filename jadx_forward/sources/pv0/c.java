package pv0;

/* loaded from: classes5.dex */
public final class c implements xu0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pv0.g f440049a;

    public c(pv0.g gVar) {
        this.f440049a = gVar;
    }

    @Override // xu0.a
    public void a(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, java.lang.String roleID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        segmentID.m32424x9616526c();
        ((pv0.n) this.f440049a.f440053a).a(segmentID, roleID);
    }

    @Override // xu0.a
    public void b(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        segmentID.m32424x9616526c();
        pv0.n nVar = (pv0.n) this.f440049a.f440053a;
        nVar.getClass();
        nVar.f440071a.b(segmentID);
    }

    @Override // xu0.a
    public void c(ru0.e roleResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleResult, "roleResult");
        com.p314xaae8f345.mm.vfs.r6 r6Var = roleResult.f481198d;
        if (r6Var != null) {
            r6Var.o();
        }
        ((pv0.n) this.f440049a.f440053a).b(roleResult);
    }
}
