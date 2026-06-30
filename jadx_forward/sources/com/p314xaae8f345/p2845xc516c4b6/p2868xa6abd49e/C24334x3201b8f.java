package com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveGetBalanceResult;", "", "number", "", ya.b.f77504xbb80cbe3, "", "(Ljava/lang/Long;Ljava/lang/Boolean;)V", "getNumber", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/tencent/pigeon/live_common/LiveGetBalanceResult;", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.live_common.LiveGetBalanceResult */
/* loaded from: classes11.dex */
public final /* data */ class C24334x3201b8f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24334x3201b8f.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24334x3201b8f.Companion(null);
    private final java.lang.Long number;
    private final java.lang.Boolean success;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveGetBalanceResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_common/LiveGetBalanceResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.live_common.LiveGetBalanceResult$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24334x3201b8f m90241xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24334x3201b8f(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.lang.Boolean) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C24334x3201b8f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24334x3201b8f m90231x75149012(com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24334x3201b8f c24334x3201b8f, java.lang.Long l17, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = c24334x3201b8f.number;
        }
        if ((i17 & 2) != 0) {
            bool = c24334x3201b8f.success;
        }
        return c24334x3201b8f.m90234x2eaf75(l17, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getSuccess() {
        return this.success;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24334x3201b8f m90234x2eaf75(java.lang.Long number, java.lang.Boolean success) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24334x3201b8f(number, success);
    }

    /* renamed from: equals */
    public boolean m90235xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24334x3201b8f)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24334x3201b8f c24334x3201b8f = (com.p314xaae8f345.p2845xc516c4b6.p2868xa6abd49e.C24334x3201b8f) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.number, c24334x3201b8f.number) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.success, c24334x3201b8f.success);
    }

    /* renamed from: getNumber */
    public final java.lang.Long m90236x276ffe3f() {
        return this.number;
    }

    /* renamed from: getSuccess */
    public final java.lang.Boolean m90237xce827bcd() {
        return this.success;
    }

    /* renamed from: hashCode */
    public int m90238x8cdac1b() {
        java.lang.Long l17 = this.number;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.Boolean bool = this.success;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m90239xcc327db9() {
        return kz5.c0.i(this.number, this.success);
    }

    /* renamed from: toString */
    public java.lang.String m90240x9616526c() {
        return "LiveGetBalanceResult(number=" + this.number + ", success=" + this.success + ')';
    }

    public C24334x3201b8f(java.lang.Long l17, java.lang.Boolean bool) {
        this.number = l17;
        this.success = bool;
    }

    public /* synthetic */ C24334x3201b8f(java.lang.Long l17, java.lang.Boolean bool, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : bool);
    }
}
