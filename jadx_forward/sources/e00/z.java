package e00;

/* loaded from: classes9.dex */
public final class z implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00.b0 f327368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.oe0 f327369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f327370c;

    public z(e00.b0 b0Var, bw5.oe0 oe0Var, long j17) {
        this.f327368a = b0Var;
        this.f327369b = oe0Var;
        this.f327370c = j17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RequestProductCardTask", "batchRequestProductCardInfo: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        java.util.ArrayList arrayList = null;
        bw5.re0 re0Var = fVar instanceof bw5.re0 ? (bw5.re0) fVar : null;
        e00.b0 b0Var = this.f327368a;
        if ((re0Var == null || (linkedList = re0Var.f114033d) == null || linkedList.size() != b0Var.c()) ? false : true) {
            yz5.l lVar = b0Var.f327276d;
            if (lVar != null) {
                java.util.LinkedList linkedList2 = re0Var.f114033d;
                if (linkedList2 != null) {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : linkedList2) {
                        if (((bw5.qe0) obj).f113594f == 0) {
                            arrayList.add(obj);
                        }
                    }
                }
                lVar.mo146xb9724478(arrayList);
            }
        } else {
            yz5.l lVar2 = b0Var.f327276d;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(null);
            }
        }
        e00.g.f327305a.h(this.f327369b, java.lang.System.currentTimeMillis() - this.f327370c, i18 == 0 && i17 == 0 ? bw5.f6.RESULT_SUCCESS : bw5.f6.RESULT_FAILED);
    }
}
