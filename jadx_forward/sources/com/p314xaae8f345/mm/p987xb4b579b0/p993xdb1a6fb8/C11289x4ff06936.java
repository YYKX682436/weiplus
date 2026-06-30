package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject */
/* loaded from: classes9.dex */
public class C11289x4ff06936 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: HD_ALBUM_FILE_LENGTH */
    private static final int f33188x77706c96 = 10485760;

    /* renamed from: LYRIC_LENGTH_LIMIT */
    private static final int f33189x7b207d02 = 32768;

    /* renamed from: STRING_LIMIT */
    private static final int f33190xd990f9ed = 1024;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXMusicVideoObject";

    /* renamed from: URL_LENGTH_LIMIT */
    private static final int f33191xd2fb99f2 = 10240;

    /* renamed from: albumName */
    public java.lang.String f33192xedb9d9a;

    /* renamed from: duration */
    public int f33193x89444d94;

    /* renamed from: hdAlbumThumbFileHash */
    public java.lang.String f33194x4b2cc8d;

    /* renamed from: hdAlbumThumbFilePath */
    public java.lang.String f33195x4b66fa4;

    /* renamed from: identification */
    public java.lang.String f33196x187d426e;

    /* renamed from: issueDate */
    public long f33197xafbf827;

    /* renamed from: musicDataUrl */
    public java.lang.String f33198xc58aab80;

    /* renamed from: musicGenre */
    public java.lang.String f33199xd0293a5e;

    /* renamed from: musicOperationUrl */
    public java.lang.String f33200xa7a65d4d;

    /* renamed from: musicUrl */
    public java.lang.String f33201x324c710a;

    /* renamed from: musicVipInfo */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11290x5453c607 f33202x8b1eb086;

    /* renamed from: singerName */
    public java.lang.String f33203x2b375427;

    /* renamed from: songLyric */
    public java.lang.String f33204x1478a44a;

    /* renamed from: getFileSize */
    private int m48475x50026913(java.lang.String str) {
        return com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.m48581x50026913(str);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33201x324c710a) || this.f33201x324c710a.length() > 10240) {
            str = "musicUrl.length exceeds the limit";
        } else if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33198xc58aab80) || this.f33198xc58aab80.length() > 10240) {
            str = "musicDataUrl.length exceeds the limit";
        } else if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33203x2b375427) || this.f33203x2b375427.length() > 1024) {
            str = "singerName.length exceeds the limit";
        } else if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33204x1478a44a) && this.f33204x1478a44a.length() > 32768) {
            str = "songLyric.length exceeds the limit";
        } else if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33195x4b66fa4) && this.f33195x4b66fa4.length() > 1024) {
            str = "hdAlbumThumbFilePath.length exceeds the limit";
        } else if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33195x4b66fa4) && m48475x50026913(this.f33195x4b66fa4) > f33188x77706c96) {
            str = "hdAlbumThumbFilePath file length exceeds the limit";
        } else if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33199xd0293a5e) && this.f33199xd0293a5e.length() > 1024) {
            str = "musicGenre.length exceeds the limit";
        } else if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33196x187d426e) && this.f33196x187d426e.length() > 1024) {
            str = "identification.length exceeds the limit";
        } else {
            if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33200xa7a65d4d) || this.f33200xa7a65d4d.length() <= 10240) {
                return true;
            }
            str = "musicOperationUrl.length exceeds the limit";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxmusicvideoobject_musicUrl", this.f33201x324c710a);
        bundle.putString("_wxmusicvideoobject_musicDataUrl", this.f33198xc58aab80);
        bundle.putString("_wxmusicvideoobject_singerName", this.f33203x2b375427);
        bundle.putString("_wxmusicvideoobject_songLyric", this.f33204x1478a44a);
        bundle.putString("_wxmusicvideoobject_hdAlbumThumbFilePath", this.f33195x4b66fa4);
        bundle.putString("_wxmusicvideoobject_albumName", this.f33192xedb9d9a);
        bundle.putString("_wxmusicvideoobject_musicGenre", this.f33199xd0293a5e);
        bundle.putLong("_wxmusicvideoobject_issueDate", this.f33197xafbf827);
        bundle.putString("_wxmusicvideoobject_identification", this.f33196x187d426e);
        bundle.putInt("_wxmusicvideoobject_duration", this.f33193x89444d94);
        bundle.putString("_wxmusicvideoobject_musicOperationUrl", this.f33200xa7a65d4d);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11290x5453c607 c11290x5453c607 = this.f33202x8b1eb086;
        if (c11290x5453c607 != null) {
            bundle.putString("_wxmusicvideoobject_musicVipInfo", c11290x5453c607.getClass().getName());
            this.f33202x8b1eb086.mo48442xddd166e0(bundle);
        }
        bundle.putString("_wxmusicvideoobject_hdAlbumThumbFileHash", this.f33194x4b2cc8d);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 76;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33201x324c710a = bundle.getString("_wxmusicvideoobject_musicUrl");
        this.f33198xc58aab80 = bundle.getString("_wxmusicvideoobject_musicDataUrl");
        this.f33203x2b375427 = bundle.getString("_wxmusicvideoobject_singerName");
        this.f33204x1478a44a = bundle.getString("_wxmusicvideoobject_songLyric");
        this.f33195x4b66fa4 = bundle.getString("_wxmusicvideoobject_hdAlbumThumbFilePath");
        this.f33192xedb9d9a = bundle.getString("_wxmusicvideoobject_albumName");
        this.f33199xd0293a5e = bundle.getString("_wxmusicvideoobject_musicGenre");
        this.f33197xafbf827 = bundle.getLong("_wxmusicvideoobject_issueDate", 0L);
        this.f33196x187d426e = bundle.getString("_wxmusicvideoobject_identification");
        this.f33193x89444d94 = bundle.getInt("_wxmusicvideoobject_duration", 0);
        this.f33200xa7a65d4d = bundle.getString("_wxmusicvideoobject_musicOperationUrl");
        java.lang.String string = bundle.getString("_wxmusicvideoobject_musicVipInfo");
        if (string != null) {
            try {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11290x5453c607 c11290x5453c607 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11290x5453c607) java.lang.Class.forName(string).newInstance();
                this.f33202x8b1eb086 = c11290x5453c607;
                c11290x5453c607.mo48443xe1e5b467(bundle);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "get WXSceneDataObject from bundle failed: unknown vipInfoObjectStr " + string + ", ex = " + e17.getMessage());
            }
        }
        this.f33194x4b2cc8d = bundle.getString("_wxmusicvideoobject_hdAlbumThumbFileHash");
    }
}
