package a15;

/* loaded from: classes9.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f610d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID), com.tencent.mm.protobuf.i.u(-1, "videourl"), com.tencent.mm.protobuf.i.u(-1, "mpurl"), com.tencent.mm.protobuf.i.u(-1, "thumburl"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "url"), com.tencent.mm.protobuf.i.u(-1, "sourceusername"), com.tencent.mm.protobuf.i.u(-1, "sourcedisplayname"), com.tencent.mm.protobuf.i.g(-1, "duration"), com.tencent.mm.protobuf.i.g(-1, "thumbwidth"), com.tencent.mm.protobuf.i.g(-1, "thumbheight")});
        this.f610d = appendAttrs;
        super.set__serialName("MMBrandMpVideo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, null, null, null, null, valueOf, valueOf, valueOf});
    }

    public float j() {
        return super.getFloat(this.f610d + 8);
    }
}
