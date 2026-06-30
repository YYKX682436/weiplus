package ws2;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.y f530678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ws2.y yVar) {
        super(0);
        this.f530678d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        ws2.y yVar = this.f530678d;
        if (((ct2.j) yVar.c(ct2.j.class)).T6() && mm2.g0.Q6((mm2.g0) yVar.c(mm2.g0.class), null, 1, null)) {
            linkedList.add(new jz5.l(1, null));
        }
        java.lang.String str = (java.lang.String) new ws2.v(yVar).mo152xb9724478();
        if (str.length() > 0) {
            linkedList.add(new jz5.l(2, str));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = yVar.f530694i;
        if (khVar != null) {
            khVar.K0(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar2 = yVar.f530694i;
        if (khVar2 != null) {
            khVar2.A1(linkedList, false, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = yVar.f530696k;
        if (mgVar != null) {
            java.util.List list = ((mm2.x4) yVar.c(mm2.x4.class)).f411061f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.U1(mgVar, list, false, false, null, 14, null);
        }
        return jz5.f0.f384359a;
    }
}
