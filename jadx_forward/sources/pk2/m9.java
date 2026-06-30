package pk2;

/* loaded from: classes3.dex */
public final class m9 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f437550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f437551c;

    public m9(pk2.o9 o9Var, yz5.p pVar, long j17) {
        this.f437549a = o9Var;
        this.f437550b = pVar;
        this.f437551c = j17;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        pk2.o9 o9Var = this.f437549a;
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(this.f437551c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "[modifyAnchorStatusFlagLong] onFail: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        yz5.p pVar = this.f437550b;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
        }
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        pk2.o9 o9Var = this.f437549a;
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(j17);
        ((mm2.c1) o9Var.c(mm2.c1.class)).Z9(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "[modifyAnchorStatusFlagLong] onSuccess: anchorStatus=" + j17);
        yz5.p pVar = this.f437550b;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, cv2Var);
        }
    }
}
