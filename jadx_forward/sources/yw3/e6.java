package yw3;

/* loaded from: classes12.dex */
public final class e6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI f548267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI repairerSerializeClassDemoUI) {
        super(0);
        this.f548267d = repairerSerializeClassDemoUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gx3.a aVar = new gx3.a();
        aVar.n("test1");
        aVar.o(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7.f10219x6e770e02);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        gx3.b bVar = new gx3.b();
        bVar.j("itemString1");
        bVar.k(123123);
        linkedList.add(bVar);
        gx3.b bVar2 = new gx3.b();
        bVar2.j("itemString2");
        bVar2.k(12316);
        linkedList.add(bVar2);
        gx3.b bVar3 = new gx3.b();
        bVar3.j("itemString3");
        bVar3.k(12316);
        linkedList.add(bVar3);
        aVar.p(linkedList);
        aVar.l().add("field7String1");
        aVar.l().add("field7String2");
        aVar.l().add("field7String3");
        aVar.l().add("field7String4");
        aVar.j().add(101);
        aVar.j().add(102);
        aVar.j().add(103);
        aVar.k().j("field15String1");
        aVar.k().k(1920938);
        org.json.JSONObject mo126745xcc31ba03 = aVar.mo126745xcc31ba03();
        aVar.m126746xcc31ba03(false);
        java.lang.String m126747x696739c = aVar.m126747x696739c();
        aVar.m126748x696739c(false);
        aVar.m126749x696739c(true, "wechat.msg");
        pm0.v.X(new yw3.d6(this.f548267d, mo126745xcc31ba03, m126747x696739c));
        return jz5.f0.f384359a;
    }
}
