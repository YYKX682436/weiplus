package com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/mj_template/MusicPostRequest;", "", "buffer", "", "chooseIdx", "", "([BJ)V", "getBuffer", "()[B", "getChooseIdx", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.mj_template.MusicPostRequest */
/* loaded from: classes10.dex */
public final /* data */ class C24533xf2d7228a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a.Companion(null);
    private final byte[] buffer;
    private final long chooseIdx;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mj_template/MusicPostRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mj_template/MusicPostRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.mj_template.MusicPostRequest$Companion, reason: from kotlin metadata */
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a m90956xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr = (byte[]) obj;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj2).intValue();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj2).longValue();
            }
            return new com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a(bArr, longValue);
        }
    }

    public C24533xf2d7228a(byte[] buffer, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        this.buffer = buffer;
        this.chooseIdx = j17;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a m90946x75149012(com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a c24533xf2d7228a, byte[] bArr, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bArr = c24533xf2d7228a.buffer;
        }
        if ((i17 & 2) != 0) {
            j17 = c24533xf2d7228a.chooseIdx;
        }
        return c24533xf2d7228a.m90949x2eaf75(bArr, j17);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getBuffer() {
        return this.buffer;
    }

    /* renamed from: component2, reason: from getter */
    public final long getChooseIdx() {
        return this.chooseIdx;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a m90949x2eaf75(byte[] buffer, long chooseIdx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        return new com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a(buffer, chooseIdx);
    }

    /* renamed from: equals */
    public boolean m90950xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a c24533xf2d7228a = (com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24533xf2d7228a) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.buffer, c24533xf2d7228a.buffer) && this.chooseIdx == c24533xf2d7228a.chooseIdx;
    }

    /* renamed from: getBuffer */
    public final byte[] m90951x12f2b736() {
        return this.buffer;
    }

    /* renamed from: getChooseIdx */
    public final long m90952x3d1fce70() {
        return this.chooseIdx;
    }

    /* renamed from: hashCode */
    public int m90953x8cdac1b() {
        return (java.util.Arrays.hashCode(this.buffer) * 31) + java.lang.Long.hashCode(this.chooseIdx);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m90954xcc327db9() {
        return kz5.c0.i(this.buffer, java.lang.Long.valueOf(this.chooseIdx));
    }

    /* renamed from: toString */
    public java.lang.String m90955x9616526c() {
        return "MusicPostRequest(buffer=" + java.util.Arrays.toString(this.buffer) + ", chooseIdx=" + this.chooseIdx + ')';
    }
}
