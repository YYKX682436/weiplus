package com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetDestroyMessage;", "", "appUuid", "", "(J)V", "getAppUuid", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage */
/* loaded from: classes11.dex */
public final /* data */ class C24242xf73983a4 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24242xf73983a4.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24242xf73983a4.Companion(null);
    private final long appUuid;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetDestroyMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetDestroyMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24242xf73983a4 m89748xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            return new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24242xf73983a4(longValue);
        }
    }

    public C24242xf73983a4(long j17) {
        this.appUuid = j17;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24242xf73983a4 m89740x75149012(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24242xf73983a4 c24242xf73983a4, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = c24242xf73983a4.appUuid;
        }
        return c24242xf73983a4.m89742x2eaf75(j17);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppUuid() {
        return this.appUuid;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24242xf73983a4 m89742x2eaf75(long appUuid) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24242xf73983a4(appUuid);
    }

    /* renamed from: equals */
    public boolean m89743xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24242xf73983a4) && this.appUuid == ((com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24242xf73983a4) other).appUuid;
    }

    /* renamed from: getAppUuid */
    public final long m89744xe7b2546() {
        return this.appUuid;
    }

    /* renamed from: hashCode */
    public int m89745x8cdac1b() {
        return java.lang.Long.hashCode(this.appUuid);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89746xcc327db9() {
        return kz5.b0.c(java.lang.Long.valueOf(this.appUuid));
    }

    /* renamed from: toString */
    public java.lang.String m89747x9616526c() {
        return "WxaLiteAppWidgetDestroyMessage(appUuid=" + this.appUuid + ')';
    }
}
