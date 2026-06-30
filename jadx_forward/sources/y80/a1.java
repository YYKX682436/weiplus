package y80;

@j95.b
/* loaded from: classes2.dex */
public final class a1 extends i95.w implements z80.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f541358d = "MicroMsg.NavigationPOIDataLogicService";

    public boolean wi(android.content.Context context, z80.r0 jumpData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpData, "jumpData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        if (h6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f541358d, "jumpNavigation: failed");
            return false;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = jumpData.f552199a;
        b1Var.f398549c = 0;
        b1Var.f398555f = jumpData.f552200b;
        b1Var.f398565k = jumpData.f552201c;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(context, b1Var);
        return true;
    }
}
