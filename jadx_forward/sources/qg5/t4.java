package qg5;

/* loaded from: classes8.dex */
public final class t4 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.w4 f444725a;

    public t4(qg5.w4 w4Var) {
        this.f444725a = w4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public final void mo2069x63a3b28a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardChatRecordsTosDialog", "Dialog is dismissed");
        qg5.w4 w4Var = this.f444725a;
        if (w4Var.f444782e) {
            qg5.w4.a(w4Var, 2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardChatRecordsTosDialog", "User rejected TOS");
        qg5.w4.a(w4Var, 1);
        yz5.a aVar = w4Var.f444780c;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
