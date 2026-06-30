package e00;

/* loaded from: classes9.dex */
public final class c0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00.e0 f327280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.te0 f327281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f327282c;

    public c0(e00.e0 e0Var, bw5.te0 te0Var, long j17) {
        this.f327280a = e0Var;
        this.f327281b = te0Var;
        this.f327282c = j17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RequestShopCardTask", "batchRequestShopCardInfo: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        bw5.ve0 ve0Var = fVar instanceof bw5.ve0 ? (bw5.ve0) fVar : null;
        e00.e0 e0Var = this.f327280a;
        if ((ve0Var == null || (linkedList = ve0Var.f115876d) == null || linkedList.size() != e0Var.c()) ? false : true) {
            java.util.LinkedList linkedList2 = ve0Var.f115876d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList2, "getShops(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList2) {
                if (((bw5.ue0) obj).f115406f == 0) {
                    arrayList.add(obj);
                }
            }
            yz5.l lVar = e0Var.f327292d;
            if (lVar != null) {
                lVar.mo146xb9724478(arrayList);
            }
        } else {
            yz5.l lVar2 = e0Var.f327292d;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(null);
            }
        }
        e00.g.f327305a.i(this.f327281b, java.lang.System.currentTimeMillis() - this.f327282c, i18 == 0 && i17 == 0 ? bw5.f6.RESULT_SUCCESS : bw5.f6.RESULT_FAILED);
    }
}
