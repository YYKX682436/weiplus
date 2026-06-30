package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.JSONMessageCodec */
/* loaded from: classes13.dex */
public final class C28683x71412957 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> {

    /* renamed from: INSTANCE */
    public static final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28683x71412957 f71607x4fbc8495 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28683x71412957();

    private C28683x71412957() {
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f
    /* renamed from: decodeMessage */
    public java.lang.Object mo138407x37439e39(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            org.json.JSONTokener jSONTokener = new org.json.JSONTokener(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28693x7d6ca65.f71639x4fbc8495.mo138407x37439e39(byteBuffer));
            java.lang.Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new java.lang.IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e17);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f
    /* renamed from: encodeMessage */
    public java.nio.ByteBuffer mo138408x6b057511(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        java.lang.Object m138432x37d04a = io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138432x37d04a(obj);
        return m138432x37d04a instanceof java.lang.String ? io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28693x7d6ca65.f71639x4fbc8495.mo138408x6b057511(org.json.JSONObject.quote((java.lang.String) m138432x37d04a)) : io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28693x7d6ca65.f71639x4fbc8495.mo138408x6b057511(m138432x37d04a.toString());
    }
}
