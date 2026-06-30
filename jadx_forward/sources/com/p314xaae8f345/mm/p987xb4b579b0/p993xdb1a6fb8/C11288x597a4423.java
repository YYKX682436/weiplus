package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXMusicObject */
/* loaded from: classes9.dex */
public class C11288x597a4423 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: LENGTH_LIMIT */
    private static final int f33180x94cda102 = 10240;

    /* renamed from: LYRIC_LENGTH_LIMIT */
    private static final int f33181x7b207d02 = 32768;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXMusicObject";

    /* renamed from: musicDataUrl */
    public java.lang.String f33182xc58aab80;

    /* renamed from: musicLowBandDataUrl */
    public java.lang.String f33183xead55f01;

    /* renamed from: musicLowBandUrl */
    public java.lang.String f33184xc6370d0b;

    /* renamed from: musicUrl */
    public java.lang.String f33185x324c710a;

    /* renamed from: songAlbumUrl */
    public java.lang.String f33186x239f8b5;

    /* renamed from: songLyric */
    public java.lang.String f33187x1478a44a;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = this.f33185x324c710a;
        if ((str3 == null || str3.length() == 0) && ((str = this.f33184xc6370d0b) == null || str.length() == 0)) {
            str2 = "both arguments are null";
        } else {
            java.lang.String str4 = this.f33185x324c710a;
            if (str4 == null || str4.length() <= 10240) {
                java.lang.String str5 = this.f33184xc6370d0b;
                if (str5 == null || str5.length() <= 10240) {
                    java.lang.String str6 = this.f33186x239f8b5;
                    if (str6 == null || str6.length() <= 10240) {
                        java.lang.String str7 = this.f33187x1478a44a;
                        if (str7 == null || str7.length() <= 32768) {
                            return true;
                        }
                        str2 = "checkArgs fail, songLyric is too long";
                    } else {
                        str2 = "checkArgs fail, songAlbumUrl is too long";
                    }
                } else {
                    str2 = "checkArgs fail, musicLowBandUrl is too long";
                }
            } else {
                str2 = "checkArgs fail, musicUrl is too long";
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str2);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxmusicobject_musicUrl", this.f33185x324c710a);
        bundle.putString("_wxmusicobject_musicLowBandUrl", this.f33184xc6370d0b);
        bundle.putString("_wxmusicobject_musicDataUrl", this.f33182xc58aab80);
        bundle.putString("_wxmusicobject_musicLowBandDataUrl", this.f33183xead55f01);
        bundle.putString("_wxmusicobject_musicAlbumUrl", this.f33186x239f8b5);
        bundle.putString("_wxmusicobject_musicLyric", this.f33187x1478a44a);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33185x324c710a = bundle.getString("_wxmusicobject_musicUrl");
        this.f33184xc6370d0b = bundle.getString("_wxmusicobject_musicLowBandUrl");
        this.f33182xc58aab80 = bundle.getString("_wxmusicobject_musicDataUrl");
        this.f33183xead55f01 = bundle.getString("_wxmusicobject_musicLowBandDataUrl");
        this.f33186x239f8b5 = bundle.getString("_wxmusicobject_musicAlbumUrl");
        this.f33187x1478a44a = bundle.getString("_wxmusicobject_musicLyric");
    }
}
