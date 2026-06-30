package co;

/* loaded from: classes.dex */
public class a extends e14.k implements q31.p {

    /* renamed from: d, reason: collision with root package name */
    public final int f43702d;

    public a() {
        int appendAttrs = appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.n(-1, "msgId"), com.tencent.mm.protobuf.i.u(-1, "msgTalker"), com.tencent.mm.protobuf.i.n(-1, "msgsvrid"), com.tencent.mm.protobuf.i.i(-1, "msgType"), com.tencent.mm.protobuf.i.u(-1, "snsId"), com.tencent.mm.protobuf.i.c(-1, "isExternalShare"), com.tencent.mm.protobuf.i.c(-1, "disableContentClick")});
        this.f43702d = appendAttrs;
        set__serialName("previewmsg");
        set__xmlPrefixTag("");
        set__trim(true);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        replaceDefault(appendAttrs, new java.lang.Object[]{0L, "", 0L, 0, "", bool, bool});
    }

    public java.lang.Object clone() {
        return super.clone();
    }
}
