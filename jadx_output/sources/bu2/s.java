package bu2;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f24563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.List list) {
        super(1);
        this.f24563d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        r45.p21 item = (r45.p21) obj;
        kotlin.jvm.internal.o.g(item, "item");
        boolean z17 = false;
        if (item.getInteger(5) == 0 && item.getInteger(0) != 2) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) item.getCustom(2);
            if (finderObject == null || (contact = finderObject.getContact()) == null || (str = contact.getUsername()) == null) {
                str = "";
            }
            if (this.f24563d.contains(str)) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
