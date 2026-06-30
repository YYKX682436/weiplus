package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class sw extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "error")
    public int f51556a = Integer.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "info")
    public com.tencent.mapsdk.internal.sv f51557b;

    private int a() {
        return this.f51556a;
    }

    private com.tencent.mapsdk.internal.sv b() {
        return this.f51557b;
    }

    private void a(int i17) {
        this.f51556a = i17;
    }

    private void a(com.tencent.mapsdk.internal.sv svVar) {
        this.f51557b = svVar;
    }
}
