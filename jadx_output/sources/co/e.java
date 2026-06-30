package co;

/* loaded from: classes12.dex */
public class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f43706d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "plainText"), com.tencent.mm.protobuf.i.u(-1, "fileId"), com.tencent.mm.protobuf.i.u(-1, "fileLocalPath")});
        this.f43706d = appendAttrs;
        super.set__serialName("chatRecord");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", null, null});
    }

    public void j(java.lang.String str) {
        super.set(this.f43706d + 1, str);
    }

    public void k(java.lang.String str) {
        super.set(this.f43706d + 2, str);
    }

    public void l(java.lang.String str) {
        super.set(this.f43706d + 0, str);
    }
}
