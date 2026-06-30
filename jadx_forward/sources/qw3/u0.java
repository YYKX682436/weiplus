package qw3;

/* loaded from: classes9.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f77 f448744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 f448745e;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7, r45.f77 f77Var) {
        this.f448745e = activityC17105xa1fb9be7;
        this.f448744d = f77Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitMoneyInputUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.f77 f77Var = this.f448744d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", " click option item : %s ,type:%s", f77Var.f455614d, java.lang.Integer.valueOf(f77Var.f455615e.f453742d));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28871, 3, 2);
        r45.d77 d77Var = f77Var.f455615e;
        int i17 = d77Var.f453742d;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", " textInfo.jumpInfo.url ：%s", d77Var.f453743e);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f448745e.mo55332x76847179(), f77Var.f455615e.f453743e, false);
        } else if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", " textInfo.jumpInfo.username ：%s", d77Var.f453744f);
            r45.d77 d77Var2 = f77Var.f455615e;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(d77Var2.f453744f, d77Var2.f453745g, 0, 1000);
        } else if (i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitMoneyInputUI", "unknow text info type");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitMoneyInputUI", " text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitMoneyInputUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
