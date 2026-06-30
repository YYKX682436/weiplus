package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class d extends com.tencent.mapsdk.internal.f {

    /* renamed from: k, reason: collision with root package name */
    private static final long f49200k = 1;

    public d() {
        com.tencent.mapsdk.internal.h hVar = ((com.tencent.mapsdk.internal.f) this).f49428g;
        hVar.f49697a = (short) 2;
        hVar.f49698b = (byte) 0;
        hVar.f49699c = 0;
        hVar.f49704h = 0;
        hVar.f49703g = new byte[0];
        hVar.f49705i = new java.util.HashMap();
        ((com.tencent.mapsdk.internal.f) this).f49428g.f49706j = new java.util.HashMap();
    }

    private void a(short s17) {
        ((com.tencent.mapsdk.internal.f) this).f49428g.f49697a = s17;
        if (s17 == 3) {
            g();
        }
    }

    private void b(int i17) {
        ((com.tencent.mapsdk.internal.f) this).f49428g.f49704h = i17;
    }

    private void d(byte[] bArr) {
        ((com.tencent.mapsdk.internal.f) this).f49428g.f49703g = bArr;
    }

    private short h() {
        return ((com.tencent.mapsdk.internal.f) this).f49428g.f49697a;
    }

    private byte i() {
        return ((com.tencent.mapsdk.internal.f) this).f49428g.f49698b;
    }

    private int j() {
        return ((com.tencent.mapsdk.internal.f) this).f49428g.f49699c;
    }

    private int k() {
        return ((com.tencent.mapsdk.internal.f) this).f49428g.f49704h;
    }

    private byte[] l() {
        return ((com.tencent.mapsdk.internal.f) this).f49428g.f49703g;
    }

    private java.util.Map<java.lang.String, java.lang.String> m() {
        return ((com.tencent.mapsdk.internal.f) this).f49428g.f49705i;
    }

    private java.util.Map<java.lang.String, java.lang.String> n() {
        return ((com.tencent.mapsdk.internal.f) this).f49428g.f49706j;
    }

    private int o() {
        java.lang.String str = ((com.tencent.mapsdk.internal.f) this).f49428g.f49706j.get("STATUS_RESULT_CODE");
        if (str != null) {
            return java.lang.Integer.parseInt(str);
        }
        return 0;
    }

    private java.lang.String p() {
        java.lang.String str = ((com.tencent.mapsdk.internal.f) this).f49428g.f49706j.get("STATUS_RESULT_DESC");
        return str != null ? str : "";
    }

    private void b(java.util.Map<java.lang.String, java.lang.String> map) {
        ((com.tencent.mapsdk.internal.f) this).f49428g.f49706j = map;
    }

    private void a(byte b17) {
        ((com.tencent.mapsdk.internal.f) this).f49428g.f49698b = b17;
    }

    private void a(int i17) {
        ((com.tencent.mapsdk.internal.f) this).f49428g.f49699c = i17;
    }

    private void a(java.util.Map<java.lang.String, java.lang.String> map) {
        ((com.tencent.mapsdk.internal.f) this).f49428g.f49705i = map;
    }
}
