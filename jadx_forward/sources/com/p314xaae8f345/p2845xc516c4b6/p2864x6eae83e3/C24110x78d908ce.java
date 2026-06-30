package com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/AcceptParams;", "", "needSwitchToVoice", "", "(Z)V", "getNeedSwitchToVoice", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.flutter_voip.AcceptParams */
/* loaded from: classes11.dex */
public final /* data */ class C24110x78d908ce {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24110x78d908ce.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24110x78d908ce.Companion(null);
    private final boolean needSwitchToVoice;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/AcceptParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip/AcceptParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.flutter_voip.AcceptParams$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24110x78d908ce m89294xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24110x78d908ce(((java.lang.Boolean) obj).booleanValue());
        }
    }

    public C24110x78d908ce(boolean z17) {
        this.needSwitchToVoice = z17;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24110x78d908ce m89286x75149012(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24110x78d908ce c24110x78d908ce, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = c24110x78d908ce.needSwitchToVoice;
        }
        return c24110x78d908ce.m89288x2eaf75(z17);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getNeedSwitchToVoice() {
        return this.needSwitchToVoice;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24110x78d908ce m89288x2eaf75(boolean needSwitchToVoice) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24110x78d908ce(needSwitchToVoice);
    }

    /* renamed from: equals */
    public boolean m89289xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24110x78d908ce) && this.needSwitchToVoice == ((com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24110x78d908ce) other).needSwitchToVoice;
    }

    /* renamed from: getNeedSwitchToVoice */
    public final boolean m89290xfbec27f7() {
        return this.needSwitchToVoice;
    }

    /* renamed from: hashCode */
    public int m89291x8cdac1b() {
        return java.lang.Boolean.hashCode(this.needSwitchToVoice);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89292xcc327db9() {
        return kz5.b0.c(java.lang.Boolean.valueOf(this.needSwitchToVoice));
    }

    /* renamed from: toString */
    public java.lang.String m89293x9616526c() {
        return "AcceptParams(needSwitchToVoice=" + this.needSwitchToVoice + ')';
    }
}
