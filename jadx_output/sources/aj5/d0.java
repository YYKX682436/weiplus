package aj5;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(aj5.r0 r0Var) {
        super(0);
        this.f5412d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String stringExtra = this.f5412d.getIntent().getStringExtra("block_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            hashSet.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra != null ? (java.lang.String[]) new r26.t(",").g(stringExtra, 0).toArray(new java.lang.String[0]) : null));
        }
        return hashSet;
    }
}
