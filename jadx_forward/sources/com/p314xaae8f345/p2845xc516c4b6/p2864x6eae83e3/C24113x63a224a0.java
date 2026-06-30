package com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/EventParams;", "", "type", "", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "", "(JLjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getType", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.flutter_voip.EventParams */
/* loaded from: classes9.dex */
public final /* data */ class C24113x63a224a0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0.Companion(null);
    private final java.lang.String message;
    private final long type;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/EventParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip/EventParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.flutter_voip.EventParams$Companion, reason: from kotlin metadata */
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0 m89325xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            java.lang.Object obj2 = list.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0(longValue, (java.lang.String) obj2);
        }
    }

    public C24113x63a224a0(long j17, java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        this.type = j17;
        this.message = message;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0 m89315x75149012(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0 c24113x63a224a0, long j17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = c24113x63a224a0.type;
        }
        if ((i17 & 2) != 0) {
            str = c24113x63a224a0.message;
        }
        return c24113x63a224a0.m89318x2eaf75(j17, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0 m89318x2eaf75(long type, java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        return new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0(type, message);
    }

    /* renamed from: equals */
    public boolean m89319xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0 c24113x63a224a0 = (com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0) other;
        return this.type == c24113x63a224a0.type && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.message, c24113x63a224a0.message);
    }

    /* renamed from: getMessage */
    public final java.lang.String m89320x76b83bd1() {
        return this.message;
    }

    /* renamed from: getType */
    public final long m89321xfb85f7b0() {
        return this.type;
    }

    /* renamed from: hashCode */
    public int m89322x8cdac1b() {
        return (java.lang.Long.hashCode(this.type) * 31) + this.message.hashCode();
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89323xcc327db9() {
        return kz5.c0.i(java.lang.Long.valueOf(this.type), this.message);
    }

    /* renamed from: toString */
    public java.lang.String m89324x9616526c() {
        return "EventParams(type=" + this.type + ", message=" + this.message + ')';
    }
}
