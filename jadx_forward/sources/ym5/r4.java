package ym5;

/* loaded from: classes10.dex */
public final class r4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f545030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f545031e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(ym5.s3 s3Var, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00) {
        super(0);
        this.f545030d = s3Var;
        this.f545031e = c22801x87cbdc00;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPreFinishLoadMoreSmooth] reason=");
        ym5.s3 s3Var = this.f545030d;
        sb6.append(s3Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RLMoreLayout", sb6.toString());
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f545031e;
        c22801x87cbdc00.m82698x62664cef(false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f545031e;
        ym5.q4 q4Var = new ym5.q4(c22801x87cbdc002, s3Var);
        if (!s3Var.f545054f) {
            c22801x87cbdc002.H(s3Var);
            if (s3Var.f545056h <= 0) {
                ym5.q3 actionCallback = c22801x87cbdc00.getActionCallback();
                if (actionCallback != null) {
                    actionCallback.c(s3Var);
                }
            } else if (s3Var.f545055g) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.f545031e;
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.r(c22801x87cbdc003, false, null, new ym5.o4(q4Var, c22801x87cbdc003, s3Var), 3, null);
            } else {
                q4Var.mo152xb9724478();
                ym5.q3 actionCallback2 = c22801x87cbdc00.getActionCallback();
                if (actionCallback2 != null) {
                    actionCallback2.c(s3Var);
                }
            }
        } else if (s3Var.f545055g) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.r(c22801x87cbdc002, false, null, new ym5.p4(q4Var, c22801x87cbdc002, s3Var), 3, null);
        } else {
            q4Var.mo152xb9724478();
            ym5.q3 actionCallback3 = c22801x87cbdc00.getActionCallback();
            if (actionCallback3 != null) {
                actionCallback3.c(s3Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
