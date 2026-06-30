package co;

/* loaded from: classes12.dex */
public class f extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f43707d;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "subject"), com.tencent.mm.protobuf.i.u(-1, "contactUsername"), com.tencent.mm.protobuf.i.t(-1, "chatRecords", co.d.class, "chatRecord")});
        this.f43707d = appendAttrs;
        super.set__serialName("chatRecordsStaging");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f43707d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f43707d + 1);
    }

    public java.lang.String l() {
        return super.getString(this.f43707d + 0);
    }

    public void n(java.util.LinkedList linkedList) {
        super.set(this.f43707d + 2, linkedList);
    }

    public void o(java.lang.String str) {
        super.set(this.f43707d + 1, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f43707d + 0, str);
    }
}
