package cp2;

/* loaded from: classes2.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155 f302481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155 c14501x9975155) {
        super(2);
        this.f302481d = c14501x9975155;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj;
        java.lang.String username = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        cq2.s sVar = cq2.s.f302978a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155 c14501x9975155 = this.f302481d;
        abstractActivityC21394xb3d2c0cf = c14501x9975155.baseContext;
        i17 = c14501x9975155.commentScene;
        sVar.a(abstractActivityC21394xb3d2c0cf, finderItem, username, i17);
        return jz5.f0.f384359a;
    }
}
