package c15;

/* loaded from: classes12.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f37940d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "category", c15.b.class), com.tencent.mm.protobuf.i.r(-1, "template_detail", c15.d.class)});
        this.f37940d = appendAttrs;
        super.set__serialName("mmreader");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null});
    }

    public c15.b j() {
        return (c15.b) super.getCustom(this.f37940d + 0);
    }

    public c15.d k() {
        return (c15.d) super.getCustom(this.f37940d + 1);
    }
}
