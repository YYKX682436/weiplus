package b15;

/* loaded from: classes9.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f17125d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "billno"), com.tencent.mm.protobuf.i.i(-1, "newaatype"), com.tencent.mm.protobuf.i.u(-1, "receivertitle"), com.tencent.mm.protobuf.i.u(-1, "launchertitle"), com.tencent.mm.protobuf.i.u(-1, "notinertitle"), com.tencent.mm.protobuf.i.u(-1, "receiverlist"), com.tencent.mm.protobuf.i.u(-1, "payertitle"), com.tencent.mm.protobuf.i.u(-1, "payerlist"), com.tencent.mm.protobuf.i.u(-1, "customize_payerlist"), com.tencent.mm.protobuf.i.u(-1, "outtradeno"), com.tencent.mm.protobuf.i.i(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ), com.tencent.mm.protobuf.i.u(-1, "launcherusername")});
        this.f17125d = appendAttrs;
        super.set__serialName("newaa");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, 0, null, null, null, null, null, null, null, null, 0, null});
    }

    public java.lang.String j() {
        return super.getString(this.f17125d + 8);
    }

    public int k() {
        return super.getInteger(this.f17125d + 1);
    }

    public java.lang.String l() {
        return super.getString(this.f17125d + 7);
    }
}
