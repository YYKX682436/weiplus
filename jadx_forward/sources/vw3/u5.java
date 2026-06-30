package vw3;

/* loaded from: classes.dex */
public final class u5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI f522678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522679e;

    public u5(com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI repairerShowMsgXmlUI, java.lang.String str) {
        this.f522678d = repairerShowMsgXmlUI;
        this.f522679e = str;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI repairerShowMsgXmlUI = this.f522678d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) repairerShowMsgXmlUI.mo55332x76847179(), 0, false);
        k0Var.f293405n = new vw3.s5(repairerShowMsgXmlUI);
        k0Var.f293414s = new vw3.t5(repairerShowMsgXmlUI, this.f522679e);
        k0Var.v();
        return true;
    }
}
