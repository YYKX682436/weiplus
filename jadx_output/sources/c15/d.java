package c15;

/* loaded from: classes.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f37943d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "template_show_type")});
        this.f37943d = appendAttrs;
        super.set__serialName("template_detail");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0});
    }

    public int j() {
        return super.getInteger(this.f37943d + 0);
    }
}
