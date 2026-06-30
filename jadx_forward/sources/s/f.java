package s;

/* loaded from: classes16.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {
    public final /* synthetic */ s.i C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s.i iVar) {
        super(0);
        this.C = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        s.i iVar = this.C;
        if (iVar.f483371h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCLoadingUI", "notifyDismissEvent: already released");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCLoadingUI", "notifyDismissEvent");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.r rVar = iVar.f483365b;
            if (rVar != null) {
                rVar.H();
            }
        }
        return jz5.f0.f384359a;
    }
}
