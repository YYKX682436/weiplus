package vw3;

/* loaded from: classes.dex */
public final class n4 implements q01.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI f522574d;

    public n4(com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI repairerResDownloadUI) {
        this.f522574d = repairerResDownloadUI;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        q01.g event = (q01.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI repairerResDownloadUI = this.f522574d;
        repairerResDownloadUI.d.append("========================\n");
        repairerResDownloadUI.d.append("netSceneAction:" + event.f440812a + " errType:" + event.f440813b + " errCode:" + event.f440814c + '\n');
        pm0.v.X(new vw3.m4(repairerResDownloadUI));
    }
}
