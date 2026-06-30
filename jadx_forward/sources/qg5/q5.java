package qg5;

/* loaded from: classes8.dex */
public final class q5 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.v5 f444682a;

    public q5(qg5.v5 v5Var) {
        this.f444682a = v5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public final void mo2069x63a3b28a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("YuanBaoSummarizeTosDialog", "Dialog is dismissed");
        qg5.v5 v5Var = this.f444682a;
        if (v5Var.f444763e) {
            qg5.v5.a(v5Var, 2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("YuanBaoSummarizeTosDialog", "User rejected TOS");
        qg5.v5.a(v5Var, 1);
        yz5.a aVar = v5Var.f444761c;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
