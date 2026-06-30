package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class z extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public z(java.lang.Object obj) {
        super(1, obj, mz0.b2.class, "onBottomSheetStateUpdate", "onBottomSheetStateUpdate(Lcom/tencent/mm/mj_template/sns/compose/BottomSheetState;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        kz0.a aVar = (kz0.a) obj;
        mz0.b2 b2Var = (mz0.b2) this.f72685xcfcbe9ef;
        if (b2Var.f414423n != aVar) {
            b2Var.f414423n = aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "onBottomSheetStateUpdate: " + aVar);
        }
        return jz5.f0.f384359a;
    }
}
