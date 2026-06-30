package co;

/* loaded from: classes12.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f43703d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "fileId"), com.tencent.mm.protobuf.i.u(-1, "url"), com.tencent.mm.protobuf.i.u(-1, "decryptKey")});
        this.f43703d = appendAttrs;
        super.set__serialName("cdnInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", ""});
    }

    public void j(java.lang.String str) {
        super.set(this.f43703d + 2, str);
    }

    public void k(java.lang.String str) {
        super.set(this.f43703d + 0, str);
    }

    public void l(java.lang.String str) {
        super.set(this.f43703d + 1, str);
    }
}
