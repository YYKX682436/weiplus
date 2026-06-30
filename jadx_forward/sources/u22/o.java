package u22;

/* loaded from: classes9.dex */
public final class o implements x85.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u22.r f505535a;

    public o(u22.r rVar) {
        this.f505535a = rVar;
    }

    @Override // x85.j
    public void a(int i17, int i18, r45.xh3 xh3Var) {
        u22.r rVar = this.f505535a;
        boolean z17 = false;
        rVar.f505551f = false;
        if (i17 == 4 && i18 == rVar.f505548c && xh3Var != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = xh3Var.f471639d;
            byte[] bArr = gVar != null ? gVar.f273689a : null;
            rVar.f505549d = bArr;
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    z17 = true;
                }
            }
            rVar.f505550e = z17;
            java.util.LinkedList LensList = xh3Var.f471640e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(LensList, "LensList");
            pm0.v.X(new u22.p(rVar, LensList));
        } else if (i17 == 0 && i18 == 0 && xh3Var != null) {
            rVar.f505550e = false;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = xh3Var.f471639d;
            rVar.f505549d = gVar2 != null ? gVar2.f273689a : null;
            java.util.LinkedList LensList2 = xh3Var.f471640e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(LensList2, "LensList");
            pm0.v.X(new u22.p(rVar, LensList2));
        } else {
            pm0.v.X(new u22.p(rVar, kz5.p0.f395529d));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerPanelData", "getLensList onResult: " + rVar.f505551f + ", " + rVar.f505550e);
    }
}
