package zv2;

/* loaded from: classes8.dex */
public final /* synthetic */ class i extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public i(java.lang.Object obj) {
        super(0, obj, zv2.m.class, "onClickModify", "onClickModify()V", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.Button button;
        zv2.m mVar = (zv2.m) this.f72685xcfcbe9ef;
        java.lang.String str = mVar.f557945h;
        if (str == null) {
            str = "";
        }
        uc0.v vVar = new uc0.v(str, 0, com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(str, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2) + 1, new zv2.h(mVar));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = mVar.f557928d;
        vVar.f507821h = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.evs);
        vVar.f507822i = 1;
        vVar.f507819f = mVar.f557947m;
        vVar.f507820g = mVar.f557948n;
        vVar.f507824k = new zv2.e(mVar);
        vVar.f507825l = new zv2.d(mVar);
        mVar.f557946i = vVar;
        uc0.q qVar = (uc0.q) i95.n0.c(uc0.q.class);
        uc0.v vVar2 = mVar.f557946i;
        ((tc0.m) qVar).getClass();
        hw3.a.b(activityC0065xcd7aa112, vVar2);
        uc0.v vVar3 = mVar.f557946i;
        if (vVar3 != null && (button = vVar3.f507823j) != null) {
            mVar.n(button, "product_title_finish_button", 8);
        }
        return jz5.f0.f384359a;
    }
}
