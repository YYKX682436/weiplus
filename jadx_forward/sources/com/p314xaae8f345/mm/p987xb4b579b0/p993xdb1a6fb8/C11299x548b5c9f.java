package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXWeWorkObject */
/* loaded from: classes9.dex */
public class C11299x548b5c9f implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: SUB_TYPE_MSG_MULTI */
    public static final int f33239xd56987f5 = 2;

    /* renamed from: SUB_TYPE_MSG_RECORD */
    public static final int f33240xdf6a10f5 = 1;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXWeWorkObject";

    /* renamed from: data */
    public byte[] f33241x2eefaa;

    /* renamed from: extInfo */
    public java.lang.String f33242xb2206a6f;

    /* renamed from: subType */
    public int f33243x90a0a19a;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putByteArray("_wxenterprise_object_data", this.f33241x2eefaa);
        bundle.putString("_wxenterprise_object_extinfo", this.f33242xb2206a6f);
        bundle.putInt("_wxenterprise_object_subType", this.f33243x90a0a19a);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 49;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33241x2eefaa = bundle.getByteArray("_wxenterprise_object_data");
        this.f33242xb2206a6f = bundle.getString("_wxenterprise_object_extinfo");
        this.f33243x90a0a19a = bundle.getInt("_wxenterprise_object_subType");
    }
}
