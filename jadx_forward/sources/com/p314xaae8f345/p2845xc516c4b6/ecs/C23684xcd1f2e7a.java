package com.p314xaae8f345.p2845xc516c4b6.ecs;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsNativeRouterRequest;", "", "type", "", "params", "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getParams", "()Ljava/lang/String;", "getType", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/tencent/pigeon/ecs/EcsNativeRouterRequest;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.ecs.EcsNativeRouterRequest */
/* loaded from: classes9.dex */
public final /* data */ class C23684xcd1f2e7a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a.Companion(null);
    private final java.lang.String params;
    private final java.lang.Long type;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsNativeRouterRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ecs/EcsNativeRouterRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.ecs.EcsNativeRouterRequest$Companion, reason: from kotlin metadata */
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a m87732xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.lang.String) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C23684xcd1f2e7a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a m87722x75149012(com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a c23684xcd1f2e7a, java.lang.Long l17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = c23684xcd1f2e7a.type;
        }
        if ((i17 & 2) != 0) {
            str = c23684xcd1f2e7a.params;
        }
        return c23684xcd1f2e7a.m87725x2eaf75(l17, str);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getParams() {
        return this.params;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a m87725x2eaf75(java.lang.Long type, java.lang.String params) {
        return new com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a(type, params);
    }

    /* renamed from: equals */
    public boolean m87726xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a c23684xcd1f2e7a = (com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.type, c23684xcd1f2e7a.type) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.params, c23684xcd1f2e7a.params);
    }

    /* renamed from: getParams */
    public final java.lang.String m87727x29c21c7c() {
        return this.params;
    }

    /* renamed from: getType */
    public final java.lang.Long m87728xfb85f7b0() {
        return this.type;
    }

    /* renamed from: hashCode */
    public int m87729x8cdac1b() {
        java.lang.Long l17 = this.type;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.String str = this.params;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m87730xcc327db9() {
        return kz5.c0.i(this.type, this.params);
    }

    /* renamed from: toString */
    public java.lang.String m87731x9616526c() {
        return "EcsNativeRouterRequest(type=" + this.type + ", params=" + this.params + ')';
    }

    public C23684xcd1f2e7a(java.lang.Long l17, java.lang.String str) {
        this.type = l17;
        this.params = str;
    }

    public /* synthetic */ C23684xcd1f2e7a(java.lang.Long l17, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : str);
    }
}
