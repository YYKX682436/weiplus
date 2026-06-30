package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject */
/* loaded from: classes9.dex */
public class C11291xe63498b8 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: LENGTH_LIMIT */
    private static final int f33207x94cda102 = 102400;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXNativeGamePageObject";

    /* renamed from: isVideo */
    public boolean f33208x7b98c171 = false;

    /* renamed from: shareData */
    public java.lang.String f33209xa1acac29;

    /* renamed from: videoDuration */
    public int f33210x795c1b2f;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        java.lang.String str2 = this.f33209xa1acac29;
        if (str2 == null || str2.length() == 0) {
            str = "checkArgs fail, shareData is empty!";
        } else {
            if (this.f33209xa1acac29.length() <= f33207x94cda102) {
                return true;
            }
            str = "checkArgs fail, shareData is too large";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putBoolean("_wxnativegamepageobject_isvideo", this.f33208x7b98c171);
        bundle.putInt("_wxnativegamepageobject_videoduraion", this.f33210x795c1b2f);
        bundle.putString("_wxnativegamepageobject_sharedata", this.f33209xa1acac29);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 101;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33208x7b98c171 = bundle.getBoolean("_wxnativegamepageobject_isvideo");
        this.f33210x795c1b2f = bundle.getInt("_wxnativegamepageobject_videoduraion");
        this.f33209xa1acac29 = bundle.getString("_wxnativegamepageobject_sharedata");
    }
}
