package yw3;

/* loaded from: classes11.dex */
public final /* synthetic */ class f7 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public f7(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoUI.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSvgDemoState;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yw3.b7 p07 = (yw3.b7) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoUI repairerSvgDemoUI = (com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoUI) this.f72685xcfcbe9ef;
        int i17 = com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoUI.d;
        repairerSvgDemoUI.getClass();
        j75.d dVar = p07.f379599d;
        if (dVar != null && (dVar instanceof yw3.r6)) {
            repairerSvgDemoUI.mo54450xbf7c1df6(p07.f548236e);
        }
        j75.d dVar2 = p07.f379599d;
        if (dVar2 != null && (dVar2 instanceof yw3.t6)) {
            android.widget.Toast.makeText((android.content.Context) repairerSvgDemoUI, (java.lang.CharSequence) ("RepairerSvgDemo(" + ((yw3.t6) dVar2).f548427b.f548414d + ")Click"), 0).show();
        }
        j75.d dVar3 = p07.f379599d;
        if (dVar3 != null && (dVar3 instanceof yw3.v6)) {
            android.widget.Toast.makeText((android.content.Context) repairerSvgDemoUI, (java.lang.CharSequence) ("RepairerSvgDemo(" + ((yw3.v6) dVar3).f548446b.f548414d + ")LongClick"), 0).show();
        }
        return jz5.f0.f384359a;
    }
}
