package hr3;

/* loaded from: classes5.dex */
public final class pe extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f365420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(hr3.pf pfVar) {
        super(1);
        this.f365420d = pfVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            hr3.pf pfVar = this.f365420d;
            pfVar.f365431q = null;
            android.widget.Button button = (android.widget.Button) ((jz5.n) pfVar.f365425h).mo141623x754a37bb();
            if (button != null && r26.n0.N(pfVar.S6().m79028xfb85ada3())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "sendSayHiBtn disable");
                button.setEnabled(false);
            }
        }
        return jz5.f0.f384359a;
    }
}
