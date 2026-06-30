package com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/TingPlayerLaunchRequest;", "", "tingItemData", "", "autoPlay", "", "([BZ)V", "getAutoPlay", "()Z", "getTingItemData", "()[B", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.mm_foundation.TingPlayerLaunchRequest */
/* loaded from: classes11.dex */
public final /* data */ class C24703x7626cc0d {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d.Companion(null);
    private final boolean autoPlay;
    private final byte[] tingItemData;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/TingPlayerLaunchRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/TingPlayerLaunchRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.mm_foundation.TingPlayerLaunchRequest$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d m91549xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            java.lang.Object obj2 = list.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d((byte[]) obj, ((java.lang.Boolean) obj2).booleanValue());
        }
    }

    public C24703x7626cc0d(byte[] tingItemData, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        this.tingItemData = tingItemData;
        this.autoPlay = z17;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d m91539x75149012(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d c24703x7626cc0d, byte[] bArr, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bArr = c24703x7626cc0d.tingItemData;
        }
        if ((i17 & 2) != 0) {
            z17 = c24703x7626cc0d.autoPlay;
        }
        return c24703x7626cc0d.m91542x2eaf75(bArr, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getTingItemData() {
        return this.tingItemData;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d m91542x2eaf75(byte[] tingItemData, boolean autoPlay) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        return new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d(tingItemData, autoPlay);
    }

    /* renamed from: equals */
    public boolean m91543xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d c24703x7626cc0d = (com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24703x7626cc0d) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.tingItemData, c24703x7626cc0d.tingItemData) && this.autoPlay == c24703x7626cc0d.autoPlay;
    }

    /* renamed from: getAutoPlay */
    public final boolean m91544xd199aaf9() {
        return this.autoPlay;
    }

    /* renamed from: getTingItemData */
    public final byte[] m91545xd85898e1() {
        return this.tingItemData;
    }

    /* renamed from: hashCode */
    public int m91546x8cdac1b() {
        return (java.util.Arrays.hashCode(this.tingItemData) * 31) + java.lang.Boolean.hashCode(this.autoPlay);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m91547xcc327db9() {
        return kz5.c0.i(this.tingItemData, java.lang.Boolean.valueOf(this.autoPlay));
    }

    /* renamed from: toString */
    public java.lang.String m91548x9616526c() {
        return "TingPlayerLaunchRequest(tingItemData=" + java.util.Arrays.toString(this.tingItemData) + ", autoPlay=" + this.autoPlay + ')';
    }
}
