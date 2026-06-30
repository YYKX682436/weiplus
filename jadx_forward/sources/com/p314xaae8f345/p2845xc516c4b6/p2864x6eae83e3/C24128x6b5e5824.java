package com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/SnsPostLaunchRequest;", "", dm.i4.f66875xa013b0d5, "", dm.i4.f66867x2a5c95c7, "(Ljava/lang/String;Ljava/lang/String;)V", "getLocalId", "()Ljava/lang/String;", "getUsername", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.flutter_voip.SnsPostLaunchRequest */
/* loaded from: classes9.dex */
public final /* data */ class C24128x6b5e5824 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824.Companion(null);
    private final java.lang.String localId;
    private final java.lang.String username;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/SnsPostLaunchRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip/SnsPostLaunchRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.flutter_voip.SnsPostLaunchRequest$Companion, reason: from kotlin metadata */
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824 m89434xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824((java.lang.String) obj, (java.lang.String) obj2);
        }
    }

    public C24128x6b5e5824(java.lang.String username, java.lang.String localId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
        this.username = username;
        this.localId = localId;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824 m89424x75149012(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824 c24128x6b5e5824, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = c24128x6b5e5824.username;
        }
        if ((i17 & 2) != 0) {
            str2 = c24128x6b5e5824.localId;
        }
        return c24128x6b5e5824.m89427x2eaf75(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLocalId() {
        return this.localId;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824 m89427x2eaf75(java.lang.String username, java.lang.String localId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
        return new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824(username, localId);
    }

    /* renamed from: equals */
    public boolean m89428xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824 c24128x6b5e5824 = (com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.username, c24128x6b5e5824.username) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.localId, c24128x6b5e5824.localId);
    }

    /* renamed from: getLocalId */
    public final java.lang.String m89429x51f8f5b0() {
        return this.localId;
    }

    /* renamed from: getUsername */
    public final java.lang.String m89430x6c03c64c() {
        return this.username;
    }

    /* renamed from: hashCode */
    public int m89431x8cdac1b() {
        return (this.username.hashCode() * 31) + this.localId.hashCode();
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89432xcc327db9() {
        return kz5.c0.i(this.username, this.localId);
    }

    /* renamed from: toString */
    public java.lang.String m89433x9616526c() {
        return "SnsPostLaunchRequest(username=" + this.username + ", localId=" + this.localId + ')';
    }
}
