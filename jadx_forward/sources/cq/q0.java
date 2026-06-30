package cq;

/* loaded from: classes8.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f302794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f302796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(yz5.q qVar, int i17, yz5.q qVar2) {
        super(1);
        this.f302794d = qVar;
        this.f302795e = i17;
        this.f302796f = qVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar != null) {
            boolean b17 = fVar.b();
            int i17 = this.f302795e;
            if (b17) {
                yz5.q qVar = this.f302794d;
                if (qVar != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152153f.f152179f.f152243a.f152217a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = fVar.f152153f.f152179f.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
                    qVar.mo147xb9724478(valueOf, (r45.zy2) fVar2, (r45.az2) fVar3);
                }
            } else {
                yz5.q qVar2 = this.f302796f;
                if (qVar2 != null) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = fVar.f152153f.f152179f.f152243a.f152217a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar5 = fVar.f152153f.f152179f.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
                    qVar2.mo147xb9724478(valueOf2, (r45.zy2) fVar4, (r45.az2) fVar5);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
