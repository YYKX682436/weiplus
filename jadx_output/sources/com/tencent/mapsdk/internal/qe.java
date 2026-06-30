package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qe {
    private static void a(final android.content.Context context, final java.lang.String str, final com.tencent.map.tools.Callback<java.lang.Boolean> callback) {
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.qe.1
            private java.lang.Boolean a() {
                com.tencent.mapsdk.internal.qe.a(context, str);
                return java.lang.Boolean.TRUE;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                com.tencent.mapsdk.internal.qe.a(context, str);
                return java.lang.Boolean.TRUE;
            }
        }).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) (callback != null ? new com.tencent.mapsdk.internal.ko.a<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.qe.2
            private void a(java.lang.Boolean bool) {
                com.tencent.map.tools.Callback.this.callback(bool);
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
            public final /* bridge */ /* synthetic */ void callback(java.lang.Object obj) {
                com.tencent.map.tools.Callback.this.callback((java.lang.Boolean) obj);
            }
        } : null));
    }

    private static void b(android.content.Context context, java.lang.String str) {
        if (context == null) {
            return;
        }
        java.lang.String a17 = com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a(str);
        com.tencent.mapsdk.internal.my a18 = com.tencent.mapsdk.internal.my.a(context);
        a(a18);
        int b17 = com.tencent.mapsdk.internal.hn.b(com.tencent.mapsdk.internal.hn.n(), a18.a(com.tencent.mapsdk.internal.er.f49386e));
        com.tencent.mapsdk.internal.mv a19 = com.tencent.mapsdk.internal.mx.a(context, str);
        com.tencent.mapsdk.internal.mw.b(a19, a17);
        com.tencent.mapsdk.internal.mw.a(context, a19, a17, com.tencent.mapsdk.internal.ep.f49356a);
        if (b17 > 0) {
            a18.a(com.tencent.mapsdk.internal.er.f49386e, com.tencent.mapsdk.internal.hn.n());
        }
    }

    private static void c(android.content.Context context, java.lang.String str) {
        if (context == null) {
            return;
        }
        java.lang.String a17 = com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a(str);
        com.tencent.mapsdk.internal.mv a18 = com.tencent.mapsdk.internal.mx.a(context, str);
        com.tencent.mapsdk.internal.mw.c(a18, a17);
        com.tencent.mapsdk.internal.mw.d(a18, a17);
        com.tencent.mapsdk.internal.mw.a(context, a18, a17, com.tencent.mapsdk.internal.ep.f49359d);
        com.tencent.mapsdk.internal.mw.a(context, a18, a17, com.tencent.mapsdk.internal.ep.f49357b);
        com.tencent.mapsdk.internal.mw.a(context, a18, a17, com.tencent.mapsdk.internal.ep.f49358c);
        com.tencent.mapsdk.internal.mw.a(context, a18, a17, com.tencent.mapsdk.internal.ep.f49360e);
        com.tencent.mapsdk.internal.mw.a(context, a18, a17, com.tencent.mapsdk.internal.ep.f49361f);
        com.tencent.mapsdk.internal.mw.a(context, a18, a17, com.tencent.mapsdk.internal.ep.f49362g);
        com.tencent.mapsdk.internal.mw.a(context, a18, a17, com.tencent.mapsdk.internal.ep.f49363h);
    }

    public static void a(com.tencent.mapsdk.internal.mv mvVar) {
        if (com.tencent.mapsdk.internal.hn.b(mvVar.a(com.tencent.mapsdk.internal.er.f49386e), "4.0.9.1") < 0) {
            mvVar.a(new java.lang.String[]{com.tencent.mapsdk.internal.er.f49398q, com.tencent.mapsdk.internal.er.f49400s});
        }
    }

    public static void a(android.content.Context context, java.lang.String str) {
        if (context == null) {
            return;
        }
        java.lang.String a17 = com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a(str);
        com.tencent.mapsdk.internal.my a18 = com.tencent.mapsdk.internal.my.a(context);
        a(a18);
        int b17 = com.tencent.mapsdk.internal.hn.b(com.tencent.mapsdk.internal.hn.n(), a18.a(com.tencent.mapsdk.internal.er.f49386e));
        com.tencent.mapsdk.internal.mv a19 = com.tencent.mapsdk.internal.mx.a(context, str);
        com.tencent.mapsdk.internal.mw.a(a19, a17);
        com.tencent.mapsdk.internal.mw.a(context, a19, a17, com.tencent.mapsdk.internal.ep.f49356a);
        com.tencent.mapsdk.internal.mw.a(context, a19, a17, com.tencent.mapsdk.internal.ep.f49359d);
        com.tencent.mapsdk.internal.mw.a(context, a19, a17, com.tencent.mapsdk.internal.ep.f49357b);
        com.tencent.mapsdk.internal.mw.a(context, a19, a17, com.tencent.mapsdk.internal.ep.f49358c);
        com.tencent.mapsdk.internal.mw.a(context, a19, a17, com.tencent.mapsdk.internal.ep.f49360e);
        com.tencent.mapsdk.internal.mw.a(context, a19, a17, com.tencent.mapsdk.internal.ep.f49361f);
        com.tencent.mapsdk.internal.mw.a(context, a19, a17, com.tencent.mapsdk.internal.ep.f49362g);
        com.tencent.mapsdk.internal.mw.a(context, a19, a17, com.tencent.mapsdk.internal.ep.f49363h);
        if (b17 > 0) {
            a18.a(com.tencent.mapsdk.internal.er.f49386e, com.tencent.mapsdk.internal.hn.n());
        }
    }
}
