package com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/ting/TingRecordFormat;", "", "sampleRate", "", "bitRate", "channels", "formatId", "(JJJJ)V", "getBitRate", "()J", "getChannels", "getFormatId", "getSampleRate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.ting.TingRecordFormat */
/* loaded from: classes11.dex */
public final /* data */ class C25174x440e05d6 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6.Companion(null);
    private final long bitRate;
    private final long channels;
    private final long formatId;
    private final long sampleRate;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingRecordFormat$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/TingRecordFormat;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.ting.TingRecordFormat$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6 m93076xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
            long longValue3;
            long longValue4;
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
            long j18 = longValue2;
            java.lang.Object obj3 = list.get(2);
            if (obj3 instanceof java.lang.Integer) {
                longValue3 = ((java.lang.Number) obj3).intValue();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                longValue3 = ((java.lang.Long) obj3).longValue();
            }
            long j19 = longValue3;
            java.lang.Object obj4 = list.get(3);
            if (obj4 instanceof java.lang.Integer) {
                longValue4 = ((java.lang.Number) obj4).intValue();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                longValue4 = ((java.lang.Long) obj4).longValue();
            }
            return new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6(j17, j18, j19, longValue4);
        }
    }

    public C25174x440e05d6(long j17, long j18, long j19, long j27) {
        this.sampleRate = j17;
        this.bitRate = j18;
        this.channels = j19;
        this.formatId = j27;
    }

    /* renamed from: component1, reason: from getter */
    public final long getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: component2, reason: from getter */
    public final long getBitRate() {
        return this.bitRate;
    }

    /* renamed from: component3, reason: from getter */
    public final long getChannels() {
        return this.channels;
    }

    /* renamed from: component4, reason: from getter */
    public final long getFormatId() {
        return this.formatId;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6 m93067x2eaf75(long sampleRate, long bitRate, long channels, long formatId) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6(sampleRate, bitRate, channels, formatId);
    }

    /* renamed from: equals */
    public boolean m93068xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6 c25174x440e05d6 = (com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6) other;
        return this.sampleRate == c25174x440e05d6.sampleRate && this.bitRate == c25174x440e05d6.bitRate && this.channels == c25174x440e05d6.channels && this.formatId == c25174x440e05d6.formatId;
    }

    /* renamed from: getBitRate */
    public final long m93069x37a62b57() {
        return this.bitRate;
    }

    /* renamed from: getChannels */
    public final long m93070xd13e6146() {
        return this.channels;
    }

    /* renamed from: getFormatId */
    public final long m93071x981c1ce8() {
        return this.formatId;
    }

    /* renamed from: getSampleRate */
    public final long m93072xf6c809a0() {
        return this.sampleRate;
    }

    /* renamed from: hashCode */
    public int m93073x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.sampleRate) * 31) + java.lang.Long.hashCode(this.bitRate)) * 31) + java.lang.Long.hashCode(this.channels)) * 31) + java.lang.Long.hashCode(this.formatId);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m93074xcc327db9() {
        return kz5.c0.i(java.lang.Long.valueOf(this.sampleRate), java.lang.Long.valueOf(this.bitRate), java.lang.Long.valueOf(this.channels), java.lang.Long.valueOf(this.formatId));
    }

    /* renamed from: toString */
    public java.lang.String m93075x9616526c() {
        return "TingRecordFormat(sampleRate=" + this.sampleRate + ", bitRate=" + this.bitRate + ", channels=" + this.channels + ", formatId=" + this.formatId + ')';
    }
}
