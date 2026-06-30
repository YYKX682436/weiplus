package org.p3343x72743996.net.p3356x3927bb2b;

/* renamed from: org.chromium.net.apihelpers.JsonCronetCallback */
/* loaded from: classes13.dex */
public abstract class AbstractC29573xa643924a extends org.p3343x72743996.net.p3356x3927bb2b.AbstractC29572xfe57f028<org.json.JSONObject> {

    /* renamed from: STRING_CALLBACK */
    private static final org.p3343x72743996.net.p3356x3927bb2b.AbstractC29578x2a8741b3 f74369x1e5df0b3 = new org.p3343x72743996.net.p3356x3927bb2b.AbstractC29578x2a8741b3() { // from class: org.chromium.net.apihelpers.JsonCronetCallback.1
        @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
        /* renamed from: shouldFollowRedirect */
        public boolean mo49553xe12ec340(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }
    };

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29572xfe57f028
    /* renamed from: addCompletionListener, reason: avoid collision after fix types in other method */
    public org.p3343x72743996.net.p3356x3927bb2b.AbstractC29573xa643924a mo153714x45901f31(org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<? super org.json.JSONObject> interfaceC29569x80e9f442) {
        super.mo153714x45901f31((org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442) interfaceC29569x80e9f442);
        return this;
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29572xfe57f028
    /* renamed from: transformBodyBytes, reason: avoid collision after fix types in other method */
    public org.json.JSONObject mo153715xf8d119dd(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, byte[] bArr) {
        try {
            return new org.json.JSONObject(f74369x1e5df0b3.mo153715xf8d119dd(abstractC29564x6974077e, bArr));
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Cannot parse the string as JSON!", e17);
        }
    }
}
