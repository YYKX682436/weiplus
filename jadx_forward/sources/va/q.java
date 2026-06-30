package va;

/* loaded from: classes16.dex */
public final class q implements va.i {

    /* renamed from: a, reason: collision with root package name */
    public static final va.q f515735a = new va.q();

    @Override // va.i
    public va.h a(va.m mVar, java.lang.Object obj, int i17, va.h hVar) {
        return new va.r(obj, i17, (va.r) hVar);
    }

    @Override // va.i
    public void b(va.m mVar, va.h hVar, java.lang.Object obj) {
        va.r rVar = (va.r) hVar;
        java.lang.ref.ReferenceQueue referenceQueue = ((va.s) mVar).f515737n;
        va.w wVar = rVar.f515736d;
        rVar.f515736d = new va.x(referenceQueue, obj, rVar);
        wVar.mo171333x5a5b64d();
    }

    @Override // va.i
    public va.p c() {
        return va.p.f515733d;
    }

    @Override // va.i
    public va.h d(va.m mVar, va.h hVar, va.h hVar2) {
        va.s sVar = (va.s) mVar;
        va.r rVar = (va.r) hVar;
        va.r rVar2 = (va.r) hVar2;
        int i17 = va.m.f515726m;
        if (rVar.mo171335x754a37bb() == null) {
            return null;
        }
        java.lang.ref.ReferenceQueue referenceQueue = sVar.f515737n;
        va.r rVar3 = new va.r(rVar.f515713a, rVar.f515714b, rVar2);
        rVar3.f515736d = rVar.f515736d.a(referenceQueue, rVar3);
        return rVar3;
    }

    @Override // va.i
    public va.m e(va.z zVar, int i17, int i18) {
        return new va.s(zVar, i17, i18);
    }
}
