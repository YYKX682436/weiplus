package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f51564a;

    /* renamed from: com.tencent.mapsdk.internal.t$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements com.tencent.map.tools.Callback<java.lang.Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.ViewGroup f51565a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.TencentMapOptions f51566b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.tools.Callback f51567c;

        public AnonymousClass1(android.view.ViewGroup viewGroup, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, com.tencent.map.tools.Callback callback) {
            this.f51565a = viewGroup;
            this.f51566b = tencentMapOptions;
            this.f51567c = callback;
        }

        private void a() {
            com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy a17 = com.tencent.mapsdk.internal.t.this.a(com.tencent.mapsdk.internal.u.a().f52297b, this.f51565a, this.f51566b);
            com.tencent.map.tools.Callback callback = this.f51567c;
            if (callback != null) {
                callback.callback(a17);
            }
        }

        @Override // com.tencent.map.tools.Callback
        public final /* synthetic */ void callback(java.lang.Void r47) {
            com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy a17 = com.tencent.mapsdk.internal.t.this.a(com.tencent.mapsdk.internal.u.a().f52297b, this.f51565a, this.f51566b);
            com.tencent.map.tools.Callback callback = this.f51567c;
            if (callback != null) {
                callback.callback(a17);
            }
        }
    }

    public t(android.content.Context context) {
        this.f51564a = context.getApplicationContext();
    }

    public final com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy a(com.tencent.mapsdk.internal.s sVar, android.view.ViewGroup viewGroup, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        return sVar.createDelegate(this.f51564a, tencentMapOptions, viewGroup);
    }

    public final com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy a(android.view.ViewGroup viewGroup, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        com.tencent.mapsdk.internal.u.a().a(this.f51564a, a(tencentMapOptions));
        return a(com.tencent.mapsdk.internal.u.a().f52297b, viewGroup, tencentMapOptions);
    }

    private void a(android.view.ViewGroup viewGroup, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, com.tencent.map.tools.Callback<com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy> callback) {
        new java.lang.Thread(new com.tencent.mapsdk.internal.u.AnonymousClass4(this.f51564a, a(tencentMapOptions), new android.os.Handler(android.os.Looper.getMainLooper()), new com.tencent.mapsdk.internal.t.AnonymousClass1(viewGroup, tencentMapOptions, callback)), "tms-plugin").start();
    }

    public final java.lang.String a(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        java.lang.String mapKey = tencentMapOptions.getMapKey();
        if (com.tencent.mapsdk.internal.hr.a(mapKey)) {
            mapKey = com.tencent.mapsdk.internal.hs.a(this.f51564a, "TencentMapSDK");
        }
        java.lang.String customUserId = tencentMapOptions.getCustomUserId();
        if (android.text.TextUtils.isEmpty(customUserId)) {
            customUserId = "undefined";
        }
        return mapKey + "," + customUserId;
    }
}
