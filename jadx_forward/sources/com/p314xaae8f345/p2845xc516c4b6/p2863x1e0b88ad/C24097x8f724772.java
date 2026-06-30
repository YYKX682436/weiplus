package com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerPreloadParams;", "", "commentScene", "", "mediaProto", "", "(J[B)V", "getCommentScene", "()J", "getMediaProto", "()[B", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams */
/* loaded from: classes11.dex */
public final /* data */ class C24097x8f724772 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772.Companion(null);
    private final long commentScene;
    private final byte[] mediaProto;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerPreloadParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerPreloadParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772 m89094xb5cc5768(java.util.List<? extends java.lang.Object> list) {
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
            return new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772(longValue, (byte[]) obj2);
        }
    }

    public C24097x8f724772(long j17, byte[] mediaProto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaProto, "mediaProto");
        this.commentScene = j17;
        this.mediaProto = mediaProto;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772 m89084x75149012(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772 c24097x8f724772, long j17, byte[] bArr, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = c24097x8f724772.commentScene;
        }
        if ((i17 & 2) != 0) {
            bArr = c24097x8f724772.mediaProto;
        }
        return c24097x8f724772.m89087x2eaf75(j17, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCommentScene() {
        return this.commentScene;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getMediaProto() {
        return this.mediaProto;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772 m89087x2eaf75(long commentScene, byte[] mediaProto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaProto, "mediaProto");
        return new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772(commentScene, mediaProto);
    }

    /* renamed from: equals */
    public boolean m89088xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772 c24097x8f724772 = (com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772) other;
        return this.commentScene == c24097x8f724772.commentScene && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.mediaProto, c24097x8f724772.mediaProto);
    }

    /* renamed from: getCommentScene */
    public final long m89089x8fadefe3() {
        return this.commentScene;
    }

    /* renamed from: getMediaProto */
    public final byte[] m89090x610c705a() {
        return this.mediaProto;
    }

    /* renamed from: hashCode */
    public int m89091x8cdac1b() {
        return (java.lang.Long.hashCode(this.commentScene) * 31) + java.util.Arrays.hashCode(this.mediaProto);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89092xcc327db9() {
        return kz5.c0.i(java.lang.Long.valueOf(this.commentScene), this.mediaProto);
    }

    /* renamed from: toString */
    public java.lang.String m89093x9616526c() {
        return "TPPlayerPreloadParams(commentScene=" + this.commentScene + ", mediaProto=" + java.util.Arrays.toString(this.mediaProto) + ')';
    }
}
