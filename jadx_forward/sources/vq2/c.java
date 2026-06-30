package vq2;

/* loaded from: classes2.dex */
public final class c extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1593xadde6502.C14563x2cd56f15 f520778a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1593xadde6502.C14563x2cd56f15 c14563x2cd56f15) {
        this.f520778a = c14563x2cd56f15;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1593xadde6502.C14563x2cd56f15 c14563x2cd56f15 = this.f520778a;
        if (!z17) {
            zm0.i iVar = c14563x2cd56f15.f203644e;
            if (iVar != null) {
                iVar.d();
                return;
            }
            return;
        }
        zm0.i iVar2 = c14563x2cd56f15.f203644e;
        if (iVar2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LinearBulletManager", "start: isStart=" + iVar2.f555657e);
            if (iVar2.f555657e) {
                return;
            }
            iVar2.f555657e = true;
            android.view.Choreographer.getInstance().postFrameCallback(iVar2.f555661i);
        }
    }
}
