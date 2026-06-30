package c15;

/* loaded from: classes5.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f37941d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.j(-1, "count"), com.tencent.mm.protobuf.i.r(-1, "item", c15.c.class)});
        this.f37941d = appendAttrs;
        super.set__serialName("category");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, null});
    }

    public c15.c j() {
        return (c15.c) super.getCustom(this.f37941d + 1);
    }
}
