package vw3;

/* loaded from: classes10.dex */
public final /* synthetic */ class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public t0(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerFileState;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ix3.a2 p07 = (ix3.a2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = (com.tencent.mm.plugin.repairer.ui.RepairerFileListUI) this.f72685xcfcbe9ef;
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.f;
        repairerFileListUI.getClass();
        j75.d dVar = p07.f379599d;
        if (dVar != null && (dVar instanceof ix3.k1)) {
            repairerFileListUI.mo54450xbf7c1df6(p07.f376893e);
            em.z2 V6 = repairerFileListUI.V6();
            if (V6.f336518b == null) {
                V6.f336518b = (android.widget.TextView) V6.f336517a.findViewById(com.p314xaae8f345.mm.R.id.f566617rq4);
            }
            V6.f336518b.setText("文件夹路径：" + p07.f376894f);
        }
        j75.d dVar2 = p07.f379599d;
        if (dVar2 != null && (dVar2 instanceof ix3.m1)) {
            ix3.m1 m1Var = (ix3.m1) dVar2;
            com.p314xaae8f345.mm.vfs.x1 x1Var = m1Var.f377027b.f377012d;
            if (x1Var.f294769f) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(p07.f376894f, x1Var.f294765b);
                android.content.Intent intent = new android.content.Intent((android.content.Context) repairerFileListUI, (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
                intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, m1Var.f377027b.f377012d.f294765b);
                intent.putExtra("dirPath", r6Var.o());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(repairerFileListUI, arrayList.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerFileListUI", "observeState", "(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerFileState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                repairerFileListUI.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(repairerFileListUI, "com/tencent/mm/plugin/repairer/ui/RepairerFileListUI", "observeState", "(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerFileState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        j75.d dVar3 = p07.f379599d;
        if (dVar3 != null && (dVar3 instanceof ix3.o1)) {
            ix3.o1 o1Var = (ix3.o1) dVar3;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) repairerFileListUI.mo55332x76847179(), 0, false);
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(p07.f376894f, o1Var.f377047b.f377012d.f294765b);
            k0Var.f293405n = new vw3.k0(repairerFileListUI, r6Var2);
            k0Var.f293414s = new vw3.q0(r6Var2, repairerFileListUI, o1Var, p07);
            k0Var.v();
        }
        return jz5.f0.f384359a;
    }
}
