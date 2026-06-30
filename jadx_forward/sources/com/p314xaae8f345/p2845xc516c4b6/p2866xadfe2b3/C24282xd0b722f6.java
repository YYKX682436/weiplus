package com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetReleaseStoreMessage;", "", "appId", "", "(Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage */
/* loaded from: classes11.dex */
public final /* data */ class C24282xd0b722f6 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24282xd0b722f6.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24282xd0b722f6.Companion(null);
    private final java.lang.String appId;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetReleaseStoreMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetReleaseStoreMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24282xd0b722f6 m89922xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            return new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24282xd0b722f6((java.lang.String) obj);
        }
    }

    public C24282xd0b722f6(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.appId = appId;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24282xd0b722f6 m89914x75149012(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24282xd0b722f6 c24282xd0b722f6, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = c24282xd0b722f6.appId;
        }
        return c24282xd0b722f6.m89916x2eaf75(str);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24282xd0b722f6 m89916x2eaf75(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        return new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24282xd0b722f6(appId);
    }

    /* renamed from: equals */
    public boolean m89917xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24282xd0b722f6) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.appId, ((com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24282xd0b722f6) other).appId);
    }

    /* renamed from: getAppId */
    public final java.lang.String m89918x74292566() {
        return this.appId;
    }

    /* renamed from: hashCode */
    public int m89919x8cdac1b() {
        return this.appId.hashCode();
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89920xcc327db9() {
        return kz5.b0.c(this.appId);
    }

    /* renamed from: toString */
    public java.lang.String m89921x9616526c() {
        return "WxaLiteAppWidgetReleaseStoreMessage(appId=" + this.appId + ')';
    }
}
