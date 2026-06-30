package co;

/* loaded from: classes12.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f43705d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "plainText"), com.tencent.mm.protobuf.i.u(-1, "fileId"), com.tencent.mm.protobuf.i.u(-1, "fileLocalPath"), com.tencent.mm.protobuf.i.n(-1, "msgId"), com.tencent.mm.protobuf.i.u(-1, "talker")});
        this.f43705d = appendAttrs;
        super.set__serialName("chatRecord");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", null, null, 0L, ""});
    }

    public java.lang.String getTalker() {
        return super.getString(this.f43705d + 4);
    }

    public java.lang.String j() {
        return super.getString(this.f43705d + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f43705d + 2);
    }

    public long l() {
        return super.getLong(this.f43705d + 3);
    }

    public java.lang.String n() {
        return super.getString(this.f43705d + 0);
    }

    public void o(java.lang.String str) {
        super.set(this.f43705d + 1, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f43705d + 2, str);
    }

    public void q(long j17) {
        super.set(this.f43705d + 3, java.lang.Long.valueOf(j17));
    }

    public void r(java.lang.String str) {
        super.set(this.f43705d + 0, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f43705d + 4, str);
    }
}
