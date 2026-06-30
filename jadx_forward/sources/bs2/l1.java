package bs2;

/* loaded from: classes2.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.c3 f105414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(db2.c3 c3Var) {
        super(0);
        this.f105414d = c3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.util.LinkedList m75941xfb821914 = this.f105414d.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            arrayList.add(pm0.v.u(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11()).concat("\n"));
        }
        java.lang.String obj = arrayList.toString();
        u1Var.g(obj);
        u1Var.u("Debug(推荐流预加载feedId)");
        u1Var.n("复制");
        u1Var.l(new bs2.k1(obj, u1Var));
        u1Var.j("取消");
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
