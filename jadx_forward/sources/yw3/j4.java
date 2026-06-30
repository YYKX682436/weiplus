package yw3;

/* loaded from: classes4.dex */
public final class j4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI f548311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
        super(0);
        this.f548311d = repairerMvvmListDemoUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI = this.f548311d;
        java.util.List list = (java.util.List) ((jz5.n) repairerMvvmListDemoUI.e).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            arrayList.add(new yw3.g(intValue, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28 + intValue));
        }
        return new xm3.t0(new ym3.h(arrayList), repairerMvvmListDemoUI, new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16719xcd1e3852(yw3.h.class), false);
    }
}
