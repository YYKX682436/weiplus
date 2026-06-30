package com.tencent.mm.plugin.appbrand.jsapi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m7 implements com.tencent.mm.plugin.appbrand.jsapi.media.l7 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.m7[] f81942e;

    /* renamed from: d, reason: collision with root package name */
    public final int f81943d;

    static {
        com.tencent.mm.plugin.appbrand.jsapi.media.m7[] m7VarArr = {new com.tencent.mm.plugin.appbrand.jsapi.media.m7("IMAGE", 0, 1), new com.tencent.mm.plugin.appbrand.jsapi.media.m7("VIDEO", 1, 2)};
        f81942e = m7VarArr;
        rz5.b.a(m7VarArr);
    }

    public m7(java.lang.String str, int i17, int i18) {
        this.f81943d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.media.m7 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.jsapi.media.m7) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.jsapi.media.m7.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.media.m7[] values() {
        return (com.tencent.mm.plugin.appbrand.jsapi.media.m7[]) f81942e.clone();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.l7
    public /* bridge */ /* synthetic */ java.lang.String getName() {
        return name();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.l7
    public int h() {
        return this.f81943d;
    }
}
