package qg5;

/* loaded from: classes8.dex */
public final class x3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.a4 f444787a;

    public x3(qg5.a4 a4Var) {
        this.f444787a = a4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public final void mo2069x63a3b28a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoCopyChatRecordsTosDialog", "Dialog is dismissed");
        qg5.a4 a4Var = this.f444787a;
        if (a4Var.f444444e) {
            ((qg5.e3) a4Var.a()).uj(2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoCopyChatRecordsTosDialog", "User rejected TOS");
        ((qg5.e3) a4Var.a()).uj(1);
        yz5.a aVar = a4Var.f444442c;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
