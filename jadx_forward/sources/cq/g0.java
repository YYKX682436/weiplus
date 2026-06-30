package cq;

/* loaded from: classes2.dex */
public final class g0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f302730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302731b;

    public g0(yz5.p pVar, yz5.l lVar) {
        this.f302730a = pVar;
        this.f302731b = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (b17) {
            yz5.p pVar = this.f302730a;
            if (pVar != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152153f.f152179f.f152243a.f152217a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListRequest");
                com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
                pVar.mo149xb9724478((r45.k61) fVar2, resp);
                return f0Var;
            }
        } else {
            yz5.l lVar = this.f302731b;
            if (lVar != null) {
                lVar.mo146xb9724478(fVar);
                return f0Var;
            }
        }
        return null;
    }
}
