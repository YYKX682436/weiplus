package com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage;", "", "appUuid", "", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "", "(JLjava/lang/String;)V", "getAppUuid", "()J", "getSessionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage */
/* loaded from: classes11.dex */
public final /* data */ class C24252x83616db8 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8.Companion(null);
    private final long appUuid;
    private final java.lang.String sessionId;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8 m89784xb5cc5768(java.util.List<? extends java.lang.Object> list) {
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8(longValue, (java.lang.String) obj2);
        }
    }

    public C24252x83616db8(long j17, java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        this.appUuid = j17;
        this.sessionId = sessionId;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8 m89774x75149012(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8 c24252x83616db8, long j17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = c24252x83616db8.appUuid;
        }
        if ((i17 & 2) != 0) {
            str = c24252x83616db8.sessionId;
        }
        return c24252x83616db8.m89777x2eaf75(j17, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppUuid() {
        return this.appUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8 m89777x2eaf75(long appUuid, java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8(appUuid, sessionId);
    }

    /* renamed from: equals */
    public boolean m89778xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8 c24252x83616db8 = (com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8) other;
        return this.appUuid == c24252x83616db8.appUuid && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.sessionId, c24252x83616db8.sessionId);
    }

    /* renamed from: getAppUuid */
    public final long m89779xe7b2546() {
        return this.appUuid;
    }

    /* renamed from: getSessionId */
    public final java.lang.String m89780x23a7af9b() {
        return this.sessionId;
    }

    /* renamed from: hashCode */
    public int m89781x8cdac1b() {
        return (java.lang.Long.hashCode(this.appUuid) * 31) + this.sessionId.hashCode();
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89782xcc327db9() {
        return kz5.c0.i(java.lang.Long.valueOf(this.appUuid), this.sessionId);
    }

    /* renamed from: toString */
    public java.lang.String m89783x9616526c() {
        return "WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage(appUuid=" + this.appUuid + ", sessionId=" + this.sessionId + ')';
    }
}
