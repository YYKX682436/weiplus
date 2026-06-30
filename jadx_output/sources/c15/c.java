package c15;

/* loaded from: classes5.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f37942d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "itemshowtype"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)});
        this.f37942d = appendAttrs;
        super.set__serialName("item");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, ""});
    }

    public java.lang.String getTitle() {
        return super.getString(this.f37942d + 1);
    }

    public int j() {
        return super.getInteger(this.f37942d + 0);
    }
}
