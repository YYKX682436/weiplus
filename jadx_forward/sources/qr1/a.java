package qr1;

/* loaded from: classes2.dex */
public final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f447591a;

    public a(yz5.l lVar) {
        this.f447591a = lVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        yz5.l lVar = this.f447591a;
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f152244b.f152233a) == null || !(fVar instanceof r45.t00)) {
            lVar.mo146xb9724478(null);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CheckFansMsgResp");
        r45.t00 t00Var = (r45.t00) fVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t00Var.f467580e)) {
            lVar.mo146xb9724478(null);
        } else {
            lVar.mo146xb9724478(t00Var.f467580e);
        }
    }
}
