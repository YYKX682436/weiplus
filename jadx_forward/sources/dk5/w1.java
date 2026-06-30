package dk5;

/* loaded from: classes9.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f316502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f316503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ot0.q f316505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f316506h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 f316507i;

    public w1(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8, ot0.q qVar, byte[] bArr, java.lang.String str, ot0.q qVar2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f316507i = activityC22567x42e895b8;
        this.f316502d = qVar;
        this.f316503e = bArr;
        this.f316504f = str;
        this.f316505g = qVar2;
        this.f316506h = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ot0.q qVar = this.f316502d;
        boolean r17 = qVar.r();
        byte[] bArr = this.f316503e;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8 = this.f316507i;
        if ((r17 || qVar.f430199i == 93) && bArr == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC22567x42e895b8.f292497q)) {
            java.lang.String str = activityC22567x42e895b8.f292497q;
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(activityC22567x42e895b8.f292497q, new dk5.v1(this));
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f316506h;
        boolean n27 = f9Var.n2();
        java.lang.String str2 = this.f316504f;
        if (!n27) {
            int i17 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.H1;
            activityC22567x42e895b8.e7(str2, this.f316505g, bArr, f9Var);
            return;
        }
        c01.h7 h7Var = new c01.h7();
        h7Var.f118760b = f9Var.m124847x74d37ac6();
        h7Var.f118762d = f9Var.Q0();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        ut.s0 s0Var = new ut.s0(str2, "");
        s0Var.f512256g = h7Var;
        s0Var.f512254e = "forward_file_msg";
        dk5.w.f316499a.c(s0Var);
    }
}
