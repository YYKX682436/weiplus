package com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerScaleTypeParams;", "", "playerId", "", "scaleType", "(JJ)V", "getPlayerId", "()J", "getScaleType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.flutter_thumb_player.TPPlayerScaleTypeParams */
/* loaded from: classes11.dex */
public final /* data */ class C24100x1a34bc0d {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d.Companion(null);
    private final long playerId;
    private final long scaleType;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerScaleTypeParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerScaleTypeParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.flutter_thumb_player.TPPlayerScaleTypeParams$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d m89138xb5cc5768(java.util.List<? extends java.lang.Object> list) {
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
            return new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d(longValue, longValue2);
        }
    }

    public C24100x1a34bc0d(long j17, long j18) {
        this.playerId = j17;
        this.scaleType = j18;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d m89128x75149012(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d c24100x1a34bc0d, long j17, long j18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = c24100x1a34bc0d.playerId;
        }
        if ((i17 & 2) != 0) {
            j18 = c24100x1a34bc0d.scaleType;
        }
        return c24100x1a34bc0d.m89131x2eaf75(j17, j18);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getScaleType() {
        return this.scaleType;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d m89131x2eaf75(long playerId, long scaleType) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d(playerId, scaleType);
    }

    /* renamed from: equals */
    public boolean m89132xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d c24100x1a34bc0d = (com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d) other;
        return this.playerId == c24100x1a34bc0d.playerId && this.scaleType == c24100x1a34bc0d.scaleType;
    }

    /* renamed from: getPlayerId */
    public final long m89133xebddad52() {
        return this.playerId;
    }

    /* renamed from: getScaleType */
    public final long m89134x8f7ec8ee() {
        return this.scaleType;
    }

    /* renamed from: hashCode */
    public int m89135x8cdac1b() {
        return (java.lang.Long.hashCode(this.playerId) * 31) + java.lang.Long.hashCode(this.scaleType);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89136xcc327db9() {
        return kz5.c0.i(java.lang.Long.valueOf(this.playerId), java.lang.Long.valueOf(this.scaleType));
    }

    /* renamed from: toString */
    public java.lang.String m89137x9616526c() {
        return "TPPlayerScaleTypeParams(playerId=" + this.playerId + ", scaleType=" + this.scaleType + ')';
    }
}
