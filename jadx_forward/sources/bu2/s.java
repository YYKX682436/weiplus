package bu2;

/* loaded from: classes2.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f106096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.List list) {
        super(1);
        this.f106096d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        r45.p21 item = (r45.p21) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z17 = false;
        if (item.m75939xb282bd08(5) == 0 && item.m75939xb282bd08(0) != 2) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) item.m75936x14adae67(2);
            if (c19792x256d2725 == null || (m76760x76845fea = c19792x256d2725.m76760x76845fea()) == null || (str = m76760x76845fea.m76197x6c03c64c()) == null) {
                str = "";
            }
            if (this.f106096d.contains(str)) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
