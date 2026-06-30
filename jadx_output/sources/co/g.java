package co;

/* loaded from: classes12.dex */
public class g extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f43708d;

    public g() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "subject"), com.tencent.mm.protobuf.i.u(-1, "contactUsername"), com.tencent.mm.protobuf.i.t(-1, "chatRecords", co.e.class, "")});
        this.f43708d = appendAttrs;
        super.set__serialName("chatRecordsStaging");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f43708d + 2);
    }

    public void k(java.util.LinkedList linkedList) {
        super.set(this.f43708d + 2, linkedList);
    }

    public void l(java.lang.String str) {
        super.set(this.f43708d + 1, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f43708d + 0, str);
    }
}
