package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class gg {
    public static final com.tencent.mm.plugin.appbrand.page.v5 a(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        if (lVar == null) {
            return null;
        }
        if (lVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            return (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        }
        if (lVar instanceof com.tencent.mm.plugin.appbrand.e9) {
            return ((com.tencent.mm.plugin.appbrand.e9) lVar).V0();
        }
        return null;
    }

    public static final com.tencent.mm.plugin.appbrand.e9 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        if (lVar == null) {
            return null;
        }
        if (lVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            return ((com.tencent.mm.plugin.appbrand.page.v5) lVar).v3();
        }
        if (lVar instanceof com.tencent.mm.plugin.appbrand.e9) {
            return (com.tencent.mm.plugin.appbrand.e9) lVar;
        }
        return null;
    }
}
