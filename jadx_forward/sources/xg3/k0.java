package xg3;

/* loaded from: classes12.dex */
public class k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f535937e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("db_max_id_record");

    /* renamed from: a, reason: collision with root package name */
    public long f535938a;

    /* renamed from: b, reason: collision with root package name */
    public final xg3.j0[] f535939b;

    /* renamed from: c, reason: collision with root package name */
    public final int f535940c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f535941d;

    public k0(int i17, java.lang.String str, xg3.j0[] j0VarArr) {
        iz5.a.g(null, str != null && str.length() > 0);
        this.f535941d = str;
        iz5.a.g(null, j0VarArr.length == 3);
        xg3.j0 j0Var = j0VarArr[0];
        iz5.a.g(null, j0Var.f535936b >= j0Var.f535935a);
        xg3.j0 j0Var2 = j0VarArr[1];
        iz5.a.g(null, j0Var2.f535936b >= j0Var2.f535935a);
        iz5.a.g(null, j0VarArr[1].f535935a >= j0VarArr[0].f535936b);
        xg3.j0 j0Var3 = j0VarArr[2];
        long j17 = j0Var3.f535936b;
        if (j17 != -1 || j0Var3.f535935a != -1) {
            iz5.a.g(null, j17 >= j0Var3.f535935a);
            iz5.a.g(null, j0VarArr[2].f535935a >= j0VarArr[1].f535936b);
        }
        this.f535939b = j0VarArr;
        this.f535940c = i17;
        this.f535938a = j0VarArr[0].f535935a;
    }

    public static xg3.j0[] a(long j17, long j18, long j19, long j27, long j28, long j29) {
        xg3.j0 j0Var = new xg3.j0(null);
        j0Var.f535935a = j17;
        j0Var.f535936b = j18;
        xg3.j0 j0Var2 = new xg3.j0(null);
        j0Var2.f535935a = j19;
        j0Var2.f535936b = j27;
        xg3.j0 j0Var3 = new xg3.j0(null);
        j0Var3.f535935a = j28;
        j0Var3.f535936b = j29;
        return new xg3.j0[]{j0Var, j0Var2, j0Var3};
    }

    public synchronized void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        long j17 = this.f535938a;
        xg3.j0[] j0VarArr = this.f535939b;
        if (j17 == j0VarArr[0].f535936b) {
            this.f535938a = j0VarArr[1].f535935a;
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 251L, 1L, false);
        } else if (j17 == j0VarArr[1].f535936b) {
            this.f535938a = j0VarArr[2].f535935a;
        } else {
            this.f535938a = j17 + 1;
        }
        if (!z65.c.f551991d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgTable", "incMsgLocalId %d  ", java.lang.Long.valueOf(this.f535938a));
        }
        f9Var.m124849x5361953a(this.f535938a);
        f535937e.putLong("msg." + this.f535941d, this.f535938a);
    }

    public boolean c(long j17) {
        for (xg3.j0 j0Var : this.f535939b) {
            if (j17 >= j0Var.f535935a && j17 <= j0Var.f535936b) {
                return true;
            }
        }
        return false;
    }
}
