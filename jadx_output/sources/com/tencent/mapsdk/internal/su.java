package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class su extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "version")
    public int f51544a = 0;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)
    public java.lang.String f51545b;

    private java.lang.String a() {
        return this.f51545b;
    }

    private int b() {
        return this.f51544a;
    }

    private void a(java.lang.String str) {
        this.f51545b = str;
    }

    private void a(int i17) {
        this.f51544a = i17;
    }
}
