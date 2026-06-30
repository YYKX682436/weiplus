package e21;

/* loaded from: classes11.dex */
public class i0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f328062d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f328063e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e21.l0 f328064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f328065g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f328066h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f328067i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e21.l0 f328068m;

    public i0(e21.l0 l0Var, java.util.List list, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, e21.l0 l0Var2) {
        this.f328064f = l0Var;
        this.f328065g = list;
        this.f328066h = linkedList;
        this.f328067i = linkedList2;
        this.f328068m = l0Var2;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        java.util.List list = this.f328065g;
        int size = list.size();
        java.util.LinkedList linkedList = this.f328066h;
        int size2 = linkedList.size();
        int i17 = size < size2 ? size : size2;
        if (size != size2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OplogService", "summeroplog oplogSize[%d] not equal to resultSize[%d]! now size[%d] respIndex[%d]", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f328062d));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "RespHandler onTimerExpired respIndex:%d, successCount:%d, size:%d", java.lang.Integer.valueOf(this.f328062d), java.lang.Integer.valueOf(this.f328063e), java.lang.Integer.valueOf(i17));
        int i18 = this.f328062d;
        int i19 = 0;
        e21.l0 l0Var = this.f328064f;
        if (i18 >= i17) {
            l0Var.f328074d = false;
            if (this.f328063e > 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = l0Var.f328082o;
                long j17 = ((lt0.f) l0Var.f328075e).mo143586x35e001() > 0 ? 500L : 0L;
                b4Var.c(j17, j17);
            }
            return false;
        }
        int i27 = i18 + 20;
        if (i27 <= i17) {
            i17 = i27;
        }
        while (true) {
            int i28 = this.f328062d;
            if (i28 >= i17) {
                break;
            }
            int intValue = ((java.lang.Integer) linkedList.get(i28)).intValue();
            xg3.q0 q0Var = (xg3.q0) list.get(this.f328062d);
            int i29 = this.f328062d;
            java.util.LinkedList linkedList2 = this.f328067i;
            r45.g25 g25Var = i29 < linkedList2.size() ? (r45.g25) linkedList2.get(this.f328062d) : null;
            int i37 = q0Var.f535956b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "resp op:%s, result:%d, mapRecentDown: %d", e21.e0.f328043d.a(q0Var), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(((lt0.f) l0Var.f328075e).mo143586x35e001()));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new e21.h0(this, q0Var, intValue, g25Var));
            if (intValue == 0 || intValue == -3400) {
                this.f328063e++;
                arrayList.add(q0Var);
                ((lt0.f) l0Var.f328075e).mo141381xc84af884(java.lang.Integer.valueOf(i37));
            } else if (intValue == -433) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OplogService", "oplog not yet process, id:%d, cmd:%d", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(q0Var.b()));
            } else {
                java.lang.Integer num = (java.lang.Integer) ((lt0.f) l0Var.f328075e).i(java.lang.Integer.valueOf(i37));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OplogService", "summeroplog id:%d, inserttime:%d, mapCnt:%s", java.lang.Integer.valueOf(i37), java.lang.Long.valueOf(q0Var.f535957c), num);
                if (num == null) {
                    ((lt0.f) l0Var.f328075e).j(java.lang.Integer.valueOf(i37), 1);
                } else if (num.intValue() < 2) {
                    ((lt0.f) l0Var.f328075e).j(java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(num.intValue() + 1));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OplogService", "summeroplog LRUMap Max now id:%d, inserttime:%d", java.lang.Integer.valueOf(i37), java.lang.Long.valueOf(q0Var.f535957c));
                    arrayList.add(q0Var);
                }
            }
            l0Var.f328080m.a(q0Var, intValue);
            this.f328062d++;
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            gm0.j1.i();
            long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            while (i19 < size3) {
                xg3.q0 q0Var2 = (xg3.q0) arrayList.get(i19);
                int m126807x7444f759 = l0Var.b().m126807x7444f759();
                int m07 = l0Var.b().m0(q0Var2);
                l0Var.f328080m.b(q0Var2, (java.lang.Integer) ((lt0.f) l0Var.f328075e).get(java.lang.Integer.valueOf(q0Var2.f535956b)), m126807x7444f759);
                ((lt0.f) l0Var.f328075e).mo141381xc84af884(java.lang.Integer.valueOf(q0Var2.f535956b));
                i19++;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogService", "delete oplog %d/%d id:%d, cmd:%d, res:%s opt", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(size3), java.lang.Integer.valueOf(q0Var2.f535956b), java.lang.Integer.valueOf(q0Var2.b()), java.lang.Integer.valueOf(m07));
            }
            gm0.j1.i();
            gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
        }
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m126804x9616526c() {
        return super.toString() + "|RespHandler";
    }
}
