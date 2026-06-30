package co;

/* loaded from: classes12.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f43704d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.t(-1, "cdnInfos", co.b.class, "")});
        this.f43704d = appendAttrs;
        super.set__serialName("cdnInfos");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f43704d + 0);
    }

    public void k(java.util.LinkedList linkedList) {
        super.set(this.f43704d + 0, linkedList);
    }
}
