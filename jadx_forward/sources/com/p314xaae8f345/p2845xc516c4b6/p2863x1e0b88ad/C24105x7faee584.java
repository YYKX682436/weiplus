package com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetMuteParams;", "", "playerId", "", "mute", "", "(JZ)V", "getMute", "()Z", "getPlayerId", "()J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams */
/* loaded from: classes9.dex */
public final /* data */ class C24105x7faee584 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584.Companion(null);
    private final boolean mute;
    private final long playerId;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetMuteParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetMuteParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams$Companion, reason: from kotlin metadata */
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584 m89228xb5cc5768(java.util.List<? extends java.lang.Object> list) {
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584(longValue, ((java.lang.Boolean) obj2).booleanValue());
        }
    }

    public C24105x7faee584(long j17, boolean z17) {
        this.playerId = j17;
        this.mute = z17;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584 m89218x75149012(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584 c24105x7faee584, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = c24105x7faee584.playerId;
        }
        if ((i17 & 2) != 0) {
            z17 = c24105x7faee584.mute;
        }
        return c24105x7faee584.m89221x2eaf75(j17, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMute() {
        return this.mute;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584 m89221x2eaf75(long playerId, boolean mute) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584(playerId, mute);
    }

    /* renamed from: equals */
    public boolean m89222xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584 c24105x7faee584 = (com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584) other;
        return this.playerId == c24105x7faee584.playerId && this.mute == c24105x7faee584.mute;
    }

    /* renamed from: getMute */
    public final boolean m89223xfb82ba8f() {
        return this.mute;
    }

    /* renamed from: getPlayerId */
    public final long m89224xebddad52() {
        return this.playerId;
    }

    /* renamed from: hashCode */
    public int m89225x8cdac1b() {
        return (java.lang.Long.hashCode(this.playerId) * 31) + java.lang.Boolean.hashCode(this.mute);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89226xcc327db9() {
        return kz5.c0.i(java.lang.Long.valueOf(this.playerId), java.lang.Boolean.valueOf(this.mute));
    }

    /* renamed from: toString */
    public java.lang.String m89227x9616526c() {
        return "TPPlayerSetMuteParams(playerId=" + this.playerId + ", mute=" + this.mute + ')';
    }
}
