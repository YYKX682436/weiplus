package aj5;

/* loaded from: classes.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f86945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(aj5.r0 r0Var) {
        super(0);
        this.f86945d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String stringExtra = this.f86945d.m158359x1e885992().getStringExtra("block_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            hashSet.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra != null ? (java.lang.String[]) new r26.t(",").g(stringExtra, 0).toArray(new java.lang.String[0]) : null));
        }
        return hashSet;
    }
}
