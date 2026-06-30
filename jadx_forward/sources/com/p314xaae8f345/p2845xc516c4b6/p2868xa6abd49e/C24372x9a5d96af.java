package com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeSuccessResult;", "", "balance", "", "(Ljava/lang/Long;)V", "getBalance", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeSuccessResult;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult */
/* loaded from: classes11.dex */
public final /* data */ class C24372x9a5d96af {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24372x9a5d96af.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24372x9a5d96af.Companion(null);
    private final java.lang.Long balance;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeSuccessResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeSuccessResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24372x9a5d96af m90511xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24372x9a5d96af(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C24372x9a5d96af() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24372x9a5d96af m90503x75149012(com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24372x9a5d96af c24372x9a5d96af, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = c24372x9a5d96af.balance;
        }
        return c24372x9a5d96af.m90505x2eaf75(l17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getBalance() {
        return this.balance;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24372x9a5d96af m90505x2eaf75(java.lang.Long balance) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24372x9a5d96af(balance);
    }

    /* renamed from: equals */
    public boolean m90506xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24372x9a5d96af) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.balance, ((com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24372x9a5d96af) other).balance);
    }

    /* renamed from: getBalance */
    public final java.lang.Long m90507x2995aaa6() {
        return this.balance;
    }

    /* renamed from: hashCode */
    public int m90508x8cdac1b() {
        java.lang.Long l17 = this.balance;
        if (l17 == null) {
            return 0;
        }
        return l17.hashCode();
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m90509xcc327db9() {
        return kz5.b0.c(this.balance);
    }

    /* renamed from: toString */
    public java.lang.String m90510x9616526c() {
        return "LiveWeCoinConsumeSuccessResult(balance=" + this.balance + ')';
    }

    public C24372x9a5d96af(java.lang.Long l17) {
        this.balance = l17;
    }

    public /* synthetic */ C24372x9a5d96af(java.lang.Long l17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : l17);
    }
}
