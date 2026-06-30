package com.tencent.mm.opensdk.modelmsg;

/* loaded from: classes9.dex */
public class WXMusicVideoObject implements com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject {
    private static final int HD_ALBUM_FILE_LENGTH = 10485760;
    private static final int LYRIC_LENGTH_LIMIT = 32768;
    private static final int STRING_LIMIT = 1024;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXMusicVideoObject";
    private static final int URL_LENGTH_LIMIT = 10240;
    public java.lang.String albumName;
    public int duration;
    public java.lang.String hdAlbumThumbFileHash;
    public java.lang.String hdAlbumThumbFilePath;
    public java.lang.String identification;
    public long issueDate;
    public java.lang.String musicDataUrl;
    public java.lang.String musicGenre;
    public java.lang.String musicOperationUrl;
    public java.lang.String musicUrl;
    public com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo musicVipInfo;
    public java.lang.String singerName;
    public java.lang.String songLyric;

    private int getFileSize(java.lang.String str) {
        return com.tencent.mm.opensdk.utils.d.getFileSize(str);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        java.lang.String str;
        if (com.tencent.mm.opensdk.utils.d.b(this.musicUrl) || this.musicUrl.length() > 10240) {
            str = "musicUrl.length exceeds the limit";
        } else if (com.tencent.mm.opensdk.utils.d.b(this.musicDataUrl) || this.musicDataUrl.length() > 10240) {
            str = "musicDataUrl.length exceeds the limit";
        } else if (com.tencent.mm.opensdk.utils.d.b(this.singerName) || this.singerName.length() > 1024) {
            str = "singerName.length exceeds the limit";
        } else if (!com.tencent.mm.opensdk.utils.d.b(this.songLyric) && this.songLyric.length() > 32768) {
            str = "songLyric.length exceeds the limit";
        } else if (!com.tencent.mm.opensdk.utils.d.b(this.hdAlbumThumbFilePath) && this.hdAlbumThumbFilePath.length() > 1024) {
            str = "hdAlbumThumbFilePath.length exceeds the limit";
        } else if (!com.tencent.mm.opensdk.utils.d.b(this.hdAlbumThumbFilePath) && getFileSize(this.hdAlbumThumbFilePath) > HD_ALBUM_FILE_LENGTH) {
            str = "hdAlbumThumbFilePath file length exceeds the limit";
        } else if (!com.tencent.mm.opensdk.utils.d.b(this.musicGenre) && this.musicGenre.length() > 1024) {
            str = "musicGenre.length exceeds the limit";
        } else if (!com.tencent.mm.opensdk.utils.d.b(this.identification) && this.identification.length() > 1024) {
            str = "identification.length exceeds the limit";
        } else {
            if (com.tencent.mm.opensdk.utils.d.b(this.musicOperationUrl) || this.musicOperationUrl.length() <= 10240) {
                return true;
            }
            str = "musicOperationUrl.length exceeds the limit";
        }
        com.tencent.mm.opensdk.utils.Log.e(TAG, str);
        return false;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(android.os.Bundle bundle) {
        bundle.putString("_wxmusicvideoobject_musicUrl", this.musicUrl);
        bundle.putString("_wxmusicvideoobject_musicDataUrl", this.musicDataUrl);
        bundle.putString("_wxmusicvideoobject_singerName", this.singerName);
        bundle.putString("_wxmusicvideoobject_songLyric", this.songLyric);
        bundle.putString("_wxmusicvideoobject_hdAlbumThumbFilePath", this.hdAlbumThumbFilePath);
        bundle.putString("_wxmusicvideoobject_albumName", this.albumName);
        bundle.putString("_wxmusicvideoobject_musicGenre", this.musicGenre);
        bundle.putLong("_wxmusicvideoobject_issueDate", this.issueDate);
        bundle.putString("_wxmusicvideoobject_identification", this.identification);
        bundle.putInt("_wxmusicvideoobject_duration", this.duration);
        bundle.putString("_wxmusicvideoobject_musicOperationUrl", this.musicOperationUrl);
        com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo wXMusicVipInfo = this.musicVipInfo;
        if (wXMusicVipInfo != null) {
            bundle.putString("_wxmusicvideoobject_musicVipInfo", wXMusicVipInfo.getClass().getName());
            this.musicVipInfo.serialize(bundle);
        }
        bundle.putString("_wxmusicvideoobject_hdAlbumThumbFileHash", this.hdAlbumThumbFileHash);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 76;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(android.os.Bundle bundle) {
        this.musicUrl = bundle.getString("_wxmusicvideoobject_musicUrl");
        this.musicDataUrl = bundle.getString("_wxmusicvideoobject_musicDataUrl");
        this.singerName = bundle.getString("_wxmusicvideoobject_singerName");
        this.songLyric = bundle.getString("_wxmusicvideoobject_songLyric");
        this.hdAlbumThumbFilePath = bundle.getString("_wxmusicvideoobject_hdAlbumThumbFilePath");
        this.albumName = bundle.getString("_wxmusicvideoobject_albumName");
        this.musicGenre = bundle.getString("_wxmusicvideoobject_musicGenre");
        this.issueDate = bundle.getLong("_wxmusicvideoobject_issueDate", 0L);
        this.identification = bundle.getString("_wxmusicvideoobject_identification");
        this.duration = bundle.getInt("_wxmusicvideoobject_duration", 0);
        this.musicOperationUrl = bundle.getString("_wxmusicvideoobject_musicOperationUrl");
        java.lang.String string = bundle.getString("_wxmusicvideoobject_musicVipInfo");
        if (string != null) {
            try {
                com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo wXMusicVipInfo = (com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo) java.lang.Class.forName(string).newInstance();
                this.musicVipInfo = wXMusicVipInfo;
                wXMusicVipInfo.unserialize(bundle);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.opensdk.utils.Log.e(TAG, "get WXSceneDataObject from bundle failed: unknown vipInfoObjectStr " + string + ", ex = " + e17.getMessage());
            }
        }
        this.hdAlbumThumbFileHash = bundle.getString("_wxmusicvideoobject_hdAlbumThumbFileHash");
    }
}
