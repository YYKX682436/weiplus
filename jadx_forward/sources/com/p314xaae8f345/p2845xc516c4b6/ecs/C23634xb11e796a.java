package com.p314xaae8f345.p2845xc516c4b6.ecs;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsAppPayInfo;", "", "payPackage", "", "orderId", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getPayPackage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.ecs.EcsAppPayInfo */
/* loaded from: classes9.dex */
public final /* data */ class C23634xb11e796a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a.Companion(null);
    private final java.lang.String orderId;
    private final java.lang.String payPackage;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsAppPayInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ecs/EcsAppPayInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.ecs.EcsAppPayInfo$Companion, reason: from kotlin metadata */
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a m87585xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            return new com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a((java.lang.String) list.get(0), (java.lang.String) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C23634xb11e796a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a m87575x75149012(com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a c23634xb11e796a, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = c23634xb11e796a.payPackage;
        }
        if ((i17 & 2) != 0) {
            str2 = c23634xb11e796a.orderId;
        }
        return c23634xb11e796a.m87578x2eaf75(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPayPackage() {
        return this.payPackage;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getOrderId() {
        return this.orderId;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a m87578x2eaf75(java.lang.String payPackage, java.lang.String orderId) {
        return new com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a(payPackage, orderId);
    }

    /* renamed from: equals */
    public boolean m87579xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a c23634xb11e796a = (com.p314xaae8f345.p2845xc516c4b6.ecs.C23634xb11e796a) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.payPackage, c23634xb11e796a.payPackage) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.orderId, c23634xb11e796a.orderId);
    }

    /* renamed from: getOrderId */
    public final java.lang.String m87580xf5da30d3() {
        return this.orderId;
    }

    /* renamed from: getPayPackage */
    public final java.lang.String m87581x48dc4674() {
        return this.payPackage;
    }

    /* renamed from: hashCode */
    public int m87582x8cdac1b() {
        java.lang.String str = this.payPackage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.orderId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m87583xcc327db9() {
        return kz5.c0.i(this.payPackage, this.orderId);
    }

    /* renamed from: toString */
    public java.lang.String m87584x9616526c() {
        return "EcsAppPayInfo(payPackage=" + this.payPackage + ", orderId=" + this.orderId + ')';
    }

    public C23634xb11e796a(java.lang.String str, java.lang.String str2) {
        this.payPackage = str;
        this.orderId = str2;
    }

    public /* synthetic */ C23634xb11e796a(java.lang.String str, java.lang.String str2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2);
    }
}
