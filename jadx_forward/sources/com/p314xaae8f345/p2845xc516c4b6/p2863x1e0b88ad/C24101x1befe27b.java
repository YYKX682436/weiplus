package com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSeekParams;", "", "playerId", "", "timeMs", "isManualSeek", "", "(JJZ)V", "()Z", "getPlayerId", "()J", "getTimeMs", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams */
/* loaded from: classes9.dex */
public final /* data */ class C24101x1befe27b {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b.Companion(null);
    private final boolean isManualSeek;
    private final long playerId;
    private final long timeMs;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSeekParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSeekParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams$Companion, reason: from kotlin metadata */
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b m89152xb5cc5768(java.util.List<? extends java.lang.Object> list) {
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
            long j17 = longValue;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj2).intValue();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj2).longValue();
            }
            java.lang.Object obj3 = list.get(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b(j17, longValue2, ((java.lang.Boolean) obj3).booleanValue());
        }
    }

    public C24101x1befe27b(long j17, long j18, boolean z17) {
        this.playerId = j17;
        this.timeMs = j18;
        this.isManualSeek = z17;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b m89140x75149012(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b c24101x1befe27b, long j17, long j18, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = c24101x1befe27b.playerId;
        }
        long j19 = j17;
        if ((i17 & 2) != 0) {
            j18 = c24101x1befe27b.timeMs;
        }
        long j27 = j18;
        if ((i17 & 4) != 0) {
            z17 = c24101x1befe27b.isManualSeek;
        }
        return c24101x1befe27b.m89144x2eaf75(j19, j27, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimeMs() {
        return this.timeMs;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsManualSeek() {
        return this.isManualSeek;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b m89144x2eaf75(long playerId, long timeMs, boolean isManualSeek) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b(playerId, timeMs, isManualSeek);
    }

    /* renamed from: equals */
    public boolean m89145xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b c24101x1befe27b = (com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b) other;
        return this.playerId == c24101x1befe27b.playerId && this.timeMs == c24101x1befe27b.timeMs && this.isManualSeek == c24101x1befe27b.isManualSeek;
    }

    /* renamed from: getPlayerId */
    public final long m89146xebddad52() {
        return this.playerId;
    }

    /* renamed from: getTimeMs */
    public final long m89147x31040049() {
        return this.timeMs;
    }

    /* renamed from: hashCode */
    public int m89148x8cdac1b() {
        return (((java.lang.Long.hashCode(this.playerId) * 31) + java.lang.Long.hashCode(this.timeMs)) * 31) + java.lang.Boolean.hashCode(this.isManualSeek);
    }

    /* renamed from: isManualSeek */
    public final boolean m89149x2e37d428() {
        return this.isManualSeek;
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89150xcc327db9() {
        return kz5.c0.i(java.lang.Long.valueOf(this.playerId), java.lang.Long.valueOf(this.timeMs), java.lang.Boolean.valueOf(this.isManualSeek));
    }

    /* renamed from: toString */
    public java.lang.String m89151x9616526c() {
        return "TPPlayerSeekParams(playerId=" + this.playerId + ", timeMs=" + this.timeMs + ", isManualSeek=" + this.isManualSeek + ')';
    }
}
