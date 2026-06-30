package am2;

/* loaded from: classes3.dex */
public final class h2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.h2 f8680d = new am2.h2();

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        df2.cn cnVar;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar;
        kotlin.jvm.internal.o.g(it, "it");
        r45.qq1 qq1Var = new r45.qq1();
        qq1Var.set(0, new java.util.LinkedList());
        java.util.LinkedList list = qq1Var.getList(0);
        r45.xj5 xj5Var = new r45.xj5();
        xj5Var.set(0, "http://wxapp.tc.qq.com/251/20350/stodownload?m=3160625468244fa280ab0f75cc3d983d&filekey=30340201010420301e020200fb0402535a04103160625468244fa280ab0f75cc3d983d02022809040d00000004627466730000000132&hy=SZ&storeid=5659501fa000782b5be6887ae000000fb00004f7e535a20efa151566414040&dotrans=0&bizid=1023");
        list.add(xj5Var);
        java.util.LinkedList list2 = qq1Var.getList(0);
        r45.xj5 xj5Var2 = new r45.xj5();
        xj5Var2.set(0, "http://wxapp.tc.qq.com/251/20350/stodownload?m=3160625468244fa280ab0f75cc3d983d&filekey=30340201010420301e020200fb0402535a04103160625468244fa280ab0f75cc3d983d02022809040d00000004627466730000000132&hy=SZ&storeid=5659501fa000782b5be6887ae000000fb00004f7e535a20efa151566414040&dotrans=0&bizid=1023");
        list2.add(xj5Var2);
        qq1Var.set(1, "testtest");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, 1000067);
        ch1Var.set(4, new com.tencent.mm.protobuf.g(qq1Var.toByteArray()));
        linkedList.add(new dk2.j(ch1Var));
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.mg.class)) != null) {
            mgVar.I1(linkedList);
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
        if (k0Var2 != null && (cnVar = (df2.cn) k0Var2.getController(df2.cn.class)) != null) {
            cnVar.q7();
        }
        return true;
    }
}
