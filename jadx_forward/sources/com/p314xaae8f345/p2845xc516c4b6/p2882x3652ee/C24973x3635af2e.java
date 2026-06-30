package com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/ting/TingADResult;", "", com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, "", "(Ljava/lang/Long;)V", "getErrorCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/tencent/pigeon/ting/TingADResult;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.ting.TingADResult */
/* loaded from: classes11.dex */
public final /* data */ class C24973x3635af2e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e.Companion(null);
    private final java.lang.Long errorCode;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingADResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/TingADResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.ting.TingADResult$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e m92622xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C24973x3635af2e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e m92614x75149012(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e c24973x3635af2e, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = c24973x3635af2e.errorCode;
        }
        return c24973x3635af2e.m92616x2eaf75(l17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e m92616x2eaf75(java.lang.Long errorCode) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e(errorCode);
    }

    /* renamed from: equals */
    public boolean m92617xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.errorCode, ((com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e) other).errorCode);
    }

    /* renamed from: getErrorCode */
    public final java.lang.Long m92618x130a215f() {
        return this.errorCode;
    }

    /* renamed from: hashCode */
    public int m92619x8cdac1b() {
        java.lang.Long l17 = this.errorCode;
        if (l17 == null) {
            return 0;
        }
        return l17.hashCode();
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m92620xcc327db9() {
        return kz5.b0.c(this.errorCode);
    }

    /* renamed from: toString */
    public java.lang.String m92621x9616526c() {
        return "TingADResult(errorCode=" + this.errorCode + ')';
    }

    public C24973x3635af2e(java.lang.Long l17) {
        this.errorCode = l17;
    }

    public /* synthetic */ C24973x3635af2e(java.lang.Long l17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : l17);
    }
}
