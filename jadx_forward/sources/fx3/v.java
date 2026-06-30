package fx3;

/* loaded from: classes10.dex */
public final /* synthetic */ class v extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public v(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorUI.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/monitor/RepairerMonitorState;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fx3.r p07 = (fx3.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorUI repairerMonitorUI = (com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorUI) this.f72685xcfcbe9ef;
        int i17 = com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorUI.d;
        repairerMonitorUI.getClass();
        j75.d dVar = p07.f379599d;
        if (dVar != null && (dVar instanceof fx3.g)) {
            repairerMonitorUI.mo54450xbf7c1df6(p07.f348681e);
        }
        j75.d dVar2 = p07.f379599d;
        if (dVar2 != null && (dVar2 instanceof fx3.i)) {
            android.widget.Toast.makeText((android.content.Context) repairerMonitorUI, (java.lang.CharSequence) ("RepairerMonitor(" + ((fx3.i) dVar2).f348673b.f348670d + ")Click"), 0).show();
        }
        j75.d dVar3 = p07.f379599d;
        if (dVar3 != null && (dVar3 instanceof fx3.k)) {
            android.widget.Toast.makeText((android.content.Context) repairerMonitorUI, (java.lang.CharSequence) ("RepairerMonitor(" + ((fx3.k) dVar3).f348674b.f348670d + ")LongClick"), 0).show();
        }
        return jz5.f0.f384359a;
    }
}
