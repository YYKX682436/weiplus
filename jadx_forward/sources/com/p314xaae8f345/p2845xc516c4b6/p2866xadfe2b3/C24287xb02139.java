package com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003J+\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetTapEventMessage;", "", "appUuid", "", "params", "", "(JLjava/util/Map;)V", "getAppUuid", "()J", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage */
/* loaded from: classes11.dex */
public final /* data */ class C24287xb02139 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24287xb02139.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24287xb02139.Companion(null);
    private final long appUuid;
    private final java.util.Map<java.lang.Object, java.lang.Object> params;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetTapEventMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetTapEventMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24287xb02139 m90004xb5cc5768(java.util.List<? extends java.lang.Object> list) {
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any?>");
            return new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24287xb02139(longValue, (java.util.Map) obj2);
        }
    }

    public C24287xb02139(long j17, java.util.Map<java.lang.Object, ? extends java.lang.Object> params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.appUuid = j17;
        this.params = params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24287xb02139 m89994x75149012(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24287xb02139 c24287xb02139, long j17, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = c24287xb02139.appUuid;
        }
        if ((i17 & 2) != 0) {
            map = c24287xb02139.params;
        }
        return c24287xb02139.m89997x2eaf75(j17, map);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppUuid() {
        return this.appUuid;
    }

    /* renamed from: component2 */
    public final java.util.Map<java.lang.Object, java.lang.Object> m89996xe55482d5() {
        return this.params;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24287xb02139 m89997x2eaf75(long appUuid, java.util.Map<java.lang.Object, ? extends java.lang.Object> params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        return new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24287xb02139(appUuid, params);
    }

    /* renamed from: equals */
    public boolean m89998xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24287xb02139)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24287xb02139 c24287xb02139 = (com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24287xb02139) other;
        return this.appUuid == c24287xb02139.appUuid && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.params, c24287xb02139.params);
    }

    /* renamed from: getAppUuid */
    public final long m89999xe7b2546() {
        return this.appUuid;
    }

    /* renamed from: getParams */
    public final java.util.Map<java.lang.Object, java.lang.Object> m90000x29c21c7c() {
        return this.params;
    }

    /* renamed from: hashCode */
    public int m90001x8cdac1b() {
        return (java.lang.Long.hashCode(this.appUuid) * 31) + this.params.hashCode();
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m90002xcc327db9() {
        return kz5.c0.i(java.lang.Long.valueOf(this.appUuid), this.params);
    }

    /* renamed from: toString */
    public java.lang.String m90003x9616526c() {
        return "WxaLiteAppWidgetTapEventMessage(appUuid=" + this.appUuid + ", params=" + this.params + ')';
    }
}
