package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.JSONMethodCodec */
/* loaded from: classes13.dex */
public final class C28684x5180d5ad implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95 {

    /* renamed from: INSTANCE */
    public static final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28684x5180d5ad f71608x4fbc8495 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28684x5180d5ad();

    private C28684x5180d5ad() {
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: decodeEnvelope */
    public java.lang.Object mo138424x529d37de(java.nio.ByteBuffer byteBuffer) {
        try {
            java.lang.Object mo138407x37439e39 = io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28683x71412957.f71607x4fbc8495.mo138407x37439e39(byteBuffer);
            if (mo138407x37439e39 instanceof org.json.JSONArray) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) mo138407x37439e39;
                if (jSONArray.length() == 1) {
                    return m138430xdf003a8a(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    java.lang.Object obj = jSONArray.get(0);
                    java.lang.Object m138430xdf003a8a = m138430xdf003a8a(jSONArray.opt(1));
                    java.lang.Object m138430xdf003a8a2 = m138430xdf003a8a(jSONArray.opt(2));
                    if ((obj instanceof java.lang.String) && (m138430xdf003a8a == null || (m138430xdf003a8a instanceof java.lang.String))) {
                        throw new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28682xb75f5bb3((java.lang.String) obj, (java.lang.String) m138430xdf003a8a, m138430xdf003a8a2);
                    }
                }
            }
            throw new java.lang.IllegalArgumentException("Invalid envelope: " + mo138407x37439e39);
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e17);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: decodeMethodCall */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff mo138425x5f71c36d(java.nio.ByteBuffer byteBuffer) {
        try {
            java.lang.Object mo138407x37439e39 = io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28683x71412957.f71607x4fbc8495.mo138407x37439e39(byteBuffer);
            if (mo138407x37439e39 instanceof org.json.JSONObject) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) mo138407x37439e39;
                java.lang.Object obj = jSONObject.get(ya.b.f77491x8758c4e1);
                java.lang.Object m138430xdf003a8a = m138430xdf003a8a(jSONObject.opt("args"));
                if (obj instanceof java.lang.String) {
                    return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff((java.lang.String) obj, m138430xdf003a8a);
                }
            }
            throw new java.lang.IllegalArgumentException("Invalid method call: " + mo138407x37439e39);
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e17);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: encodeErrorEnvelope */
    public java.nio.ByteBuffer mo138426x515fc382(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28683x71412957.f71607x4fbc8495.mo138408x6b057511(new org.json.JSONArray().put(str).put(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138432x37d04a(str2)).put(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138432x37d04a(obj)));
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: encodeErrorEnvelopeWithStacktrace */
    public java.nio.ByteBuffer mo138427x435a9545(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3) {
        return io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28683x71412957.f71607x4fbc8495.mo138408x6b057511(new org.json.JSONArray().put(str).put(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138432x37d04a(str2)).put(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138432x37d04a(obj)).put(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138432x37d04a(str3)));
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: encodeMethodCall */
    public java.nio.ByteBuffer mo138428x69ba5d95(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.f77491x8758c4e1, c28687x4bb242ff.f71610xbfc5d0e1);
            jSONObject.put("args", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138432x37d04a(c28687x4bb242ff.f71609x86ac7956));
            return io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28683x71412957.f71607x4fbc8495.mo138408x6b057511(jSONObject);
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e17);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: encodeSuccessEnvelope */
    public java.nio.ByteBuffer mo138429xf780cbfd(java.lang.Object obj) {
        return io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28683x71412957.f71607x4fbc8495.mo138408x6b057511(new org.json.JSONArray().put(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138432x37d04a(obj)));
    }

    /* renamed from: unwrapNull */
    public java.lang.Object m138430xdf003a8a(java.lang.Object obj) {
        if (obj == org.json.JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
