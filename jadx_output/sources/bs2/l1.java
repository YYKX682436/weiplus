package bs2;

/* loaded from: classes2.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.c3 f23881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(db2.c3 c3Var) {
        super(0);
        this.f23881d = c3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.util.LinkedList list = this.f23881d.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(pm0.v.u(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()).concat("\n"));
        }
        java.lang.String obj = arrayList.toString();
        u1Var.g(obj);
        u1Var.u("Debug(推荐流预加载feedId)");
        u1Var.n("复制");
        u1Var.l(new bs2.k1(obj, u1Var));
        u1Var.j("取消");
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
