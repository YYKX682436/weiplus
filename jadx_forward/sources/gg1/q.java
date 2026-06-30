package gg1;

/* loaded from: classes7.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gg1.w f353152c;

    public q(gg1.w wVar) {
        this.f353152c = wVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc
    public boolean a(android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (1 == event.getAction()) {
            return false;
        }
        gg1.w wVar = this.f353152c;
        yz5.p pVar = wVar.f353182v;
        if (pVar != null) {
        }
        wVar.e();
        return true;
    }
}
