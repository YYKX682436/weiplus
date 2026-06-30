package w11;

/* loaded from: classes12.dex */
public class x0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f523696d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f523697e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f523698f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o45.yh f523699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w11.z0 f523700h;

    public x0(w11.z0 z0Var, o45.yh yhVar) {
        this.f523700h = z0Var;
        this.f523699g = yhVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        r45.c50 c50Var;
        java.util.LinkedList linkedList;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1();
        boolean a17 = gm0.j1.a();
        w11.z0 z0Var = this.f523700h;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(z0Var.f523715d, "syncRespHandler acc is not ready STOP :%s", z0Var.f523732x);
            z0Var.f523732x = null;
            return false;
        }
        if (z0Var.f523730v) {
            a1Var.c(z0Var);
            z0Var.f523732x = null;
            return false;
        }
        o45.yh yhVar = z0Var.f523732x;
        java.lang.String str = z0Var.f523715d;
        if (yhVar == null || (c50Var = yhVar.f424572a.f455292e) == null || (linkedList = c50Var.f452828e) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "syncRespHandler CmdList is null! Stop Processing :%s", yhVar);
            a1Var.c(z0Var);
            z0Var.f523732x = null;
            return false;
        }
        a1Var.b(z0Var);
        this.f523698f++;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (int i19 = 0; i19 < 5; i19 = i18 + 1) {
            if (this.f523696d < linkedList.size()) {
                linkedList.size();
                int i27 = ((r45.b50) linkedList.get(this.f523696d)).f452063d;
                int i28 = ((r45.b50) linkedList.get(this.f523696d)).f452064e.f453372d;
                r45.b50 cmd = (r45.b50) linkedList.get(this.f523696d);
                mm.h hVar = mm.h.f410018a;
                r45.ew4 resp = this.f523699g.f424572a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmd, "cmd");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
                i17 = 5;
                i18 = i19;
                if (!a1Var.d(this.f523700h, this.f523696d, linkedList.size(), cmd, false, com.p314xaae8f345.mm.p642xad8b531f.x1.e(), 4)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "DoCmd Failed index:%d", java.lang.Integer.valueOf(this.f523696d));
                }
                this.f523696d++;
            } else {
                i17 = 5;
                i18 = i19;
            }
            if (this.f523696d >= linkedList.size()) {
                this.f523697e += java.lang.System.currentTimeMillis() - currentTimeMillis;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - z0Var.f523733y;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "syncRespHandler process DONE idx:%d size:%d time[%d,%d] count:%d %s", java.lang.Integer.valueOf(this.f523696d), java.lang.Integer.valueOf(linkedList.size()), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Long.valueOf(this.f523697e), java.lang.Integer.valueOf(this.f523698f), z0Var.f523732x);
                z0Var.I(z0Var.f523732x);
                a1Var.a(z0Var);
                java.lang.Integer[] numArr = new java.lang.Integer[i17];
                numArr[0] = 240;
                numArr[1] = 239;
                numArr[2] = 238;
                numArr[3] = 237;
                numArr[4] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j6.f34370x366c91de);
                int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.A((int) this.f523697e, new int[]{100, 300, 1000, 3000}, numArr));
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.mo68477x336bdfd8(99L, q17, 1L, false);
                java.lang.Integer[] numArr2 = new java.lang.Integer[7];
                numArr2[0] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cd.f33971x366c91de);
                numArr2[1] = 248;
                numArr2[2] = 247;
                numArr2[3] = 246;
                numArr2[4] = 245;
                numArr2[i17] = 244;
                numArr2[6] = 243;
                fVar.mo68477x336bdfd8(99L, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.A(linkedList.size(), new int[]{0, 1, 2, 3, 5, 10}, numArr2)), 1L, false);
                fVar.mo68477x336bdfd8(99L, z65.c.f551988a ? 241L : 242L, 1L, false);
                fVar.mo68477x336bdfd8(99L, z0Var.f523726r, 1L, false);
                fVar.mo68477x336bdfd8(99L, 0L, 1L, false);
                java.lang.Object[] objArr = new java.lang.Object[8];
                objArr[0] = java.lang.Integer.valueOf(linkedList.size());
                objArr[1] = java.lang.Long.valueOf(currentTimeMillis2);
                objArr[2] = java.lang.Integer.valueOf(z0Var.f523726r);
                objArr[3] = java.lang.Integer.valueOf(z0Var.f523732x.f424572a.f455293f);
                objArr[4] = java.lang.Long.valueOf(this.f523697e);
                objArr[i17] = java.lang.Integer.valueOf(this.f523698f);
                objArr[6] = z0Var.f523731w;
                objArr[7] = java.lang.Integer.valueOf(z65.c.f551988a ? 1 : 2);
                fVar.d(12063, objArr);
                z0Var.f523732x = null;
                return false;
            }
            if (java.lang.System.currentTimeMillis() - currentTimeMillis > 500) {
                this.f523697e += java.lang.System.currentTimeMillis() - currentTimeMillis;
                return true;
            }
        }
        this.f523697e += java.lang.System.currentTimeMillis() - currentTimeMillis;
        return true;
    }
}
