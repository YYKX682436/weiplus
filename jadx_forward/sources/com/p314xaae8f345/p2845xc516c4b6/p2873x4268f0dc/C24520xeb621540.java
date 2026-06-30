package com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/pigeon/mj_template/AlbumRequest;", "", "buffer", "", "([B)V", "getBuffer", "()[B", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.mj_template.AlbumRequest */
/* loaded from: classes10.dex */
public final /* data */ class C24520xeb621540 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24520xeb621540.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24520xeb621540.Companion(null);
    private final byte[] buffer;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mj_template/AlbumRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mj_template/AlbumRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.mj_template.AlbumRequest$Companion, reason: from kotlin metadata */
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24520xeb621540 m90921xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            return new com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24520xeb621540((byte[]) obj);
        }
    }

    public C24520xeb621540(byte[] buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        this.buffer = buffer;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24520xeb621540 m90913x75149012(com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24520xeb621540 c24520xeb621540, byte[] bArr, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bArr = c24520xeb621540.buffer;
        }
        return c24520xeb621540.m90915x2eaf75(bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getBuffer() {
        return this.buffer;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24520xeb621540 m90915x2eaf75(byte[] buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        return new com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24520xeb621540(buffer);
    }

    /* renamed from: equals */
    public boolean m90916xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24520xeb621540) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.buffer, ((com.p314xaae8f345.p2845xc516c4b6.p2873x4268f0dc.C24520xeb621540) other).buffer);
    }

    /* renamed from: getBuffer */
    public final byte[] m90917x12f2b736() {
        return this.buffer;
    }

    /* renamed from: hashCode */
    public int m90918x8cdac1b() {
        return java.util.Arrays.hashCode(this.buffer);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m90919xcc327db9() {
        return kz5.b0.c(this.buffer);
    }

    /* renamed from: toString */
    public java.lang.String m90920x9616526c() {
        return "AlbumRequest(buffer=" + java.util.Arrays.toString(this.buffer) + ')';
    }
}
