package com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/FLRoomInfo;", "", "roomId", "", "roomKey", "(JJ)V", "getRoomId", "()J", "getRoomKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.flutter_voip.FLRoomInfo */
/* loaded from: classes11.dex */
public final /* data */ class C24114xc9e6bb0f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24114xc9e6bb0f.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24114xc9e6bb0f.Companion(null);
    private final long roomId;
    private final long roomKey;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/FLRoomInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip/FLRoomInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.flutter_voip.FLRoomInfo$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24114xc9e6bb0f m89337xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj2).intValue();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj2).longValue();
            }
            return new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24114xc9e6bb0f(longValue, longValue2);
        }
    }

    public C24114xc9e6bb0f(long j17, long j18) {
        this.roomId = j17;
        this.roomKey = j18;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24114xc9e6bb0f m89327x75149012(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24114xc9e6bb0f c24114xc9e6bb0f, long j17, long j18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = c24114xc9e6bb0f.roomId;
        }
        if ((i17 & 2) != 0) {
            j18 = c24114xc9e6bb0f.roomKey;
        }
        return c24114xc9e6bb0f.m89330x2eaf75(j17, j18);
    }

    /* renamed from: component1, reason: from getter */
    public final long getRoomId() {
        return this.roomId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getRoomKey() {
        return this.roomKey;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24114xc9e6bb0f m89330x2eaf75(long roomId, long roomKey) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24114xc9e6bb0f(roomId, roomKey);
    }

    /* renamed from: equals */
    public boolean m89331xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24114xc9e6bb0f)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24114xc9e6bb0f c24114xc9e6bb0f = (com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24114xc9e6bb0f) other;
        return this.roomId == c24114xc9e6bb0f.roomId && this.roomKey == c24114xc9e6bb0f.roomKey;
    }

    /* renamed from: getRoomId */
    public final long m89332x2defe24c() {
        return this.roomId;
    }

    /* renamed from: getRoomKey */
    public final long m89333x900c6f4e() {
        return this.roomKey;
    }

    /* renamed from: hashCode */
    public int m89334x8cdac1b() {
        return (java.lang.Long.hashCode(this.roomId) * 31) + java.lang.Long.hashCode(this.roomKey);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89335xcc327db9() {
        return kz5.c0.i(java.lang.Long.valueOf(this.roomId), java.lang.Long.valueOf(this.roomKey));
    }

    /* renamed from: toString */
    public java.lang.String m89336x9616526c() {
        return "FLRoomInfo(roomId=" + this.roomId + ", roomKey=" + this.roomKey + ')';
    }
}
