package ms4;

/* loaded from: classes8.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.h f412548a;

    public f(ms4.h hVar) {
        this.f412548a = hVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        r45.fs3 fs3Var = (r45.fs3) fVar.f152151d;
        if (fs3Var == null) {
            return null;
        }
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            return fs3Var;
        }
        this.f412548a.f412563f.mo7808x76db6cb1(java.lang.Long.valueOf(fs3Var.f456118d));
        os4.h.l(fs3Var.f456118d);
        return fs3Var;
    }
}
