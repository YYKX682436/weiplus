package pk2;

/* loaded from: classes3.dex */
public final class p5 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v65.n f437683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f437684c;

    public p5(pk2.o9 o9Var, v65.n nVar, long j17) {
        this.f437682a = o9Var;
        this.f437683b = nVar;
        this.f437684c = j17;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        pk2.o9 o9Var = this.f437682a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "switchDesignedGift-callBack-onFail anchorStatus=" + j17 + ", errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(this.f437684c);
        this.f437683b.a(java.lang.Boolean.FALSE);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        pk2.o9 o9Var = this.f437682a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "switchDesignedGift-callBack-onSuccess anchorStatus=" + j17);
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(j17);
        ((mm2.c1) o9Var.c(mm2.c1.class)).Z9(j17);
        this.f437683b.a(java.lang.Boolean.TRUE);
    }
}
