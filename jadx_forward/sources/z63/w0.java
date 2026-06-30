package z63;

/* loaded from: classes5.dex */
public class w0 implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z63.x0 f551980a;

    public w0(z63.x0 x0Var) {
        this.f551980a = x0Var;
    }

    @Override // j45.g
    /* renamed from: onActivityResult */
    public void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3001) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "dealWithRequestCode() REQUEST_CODE_VIEW_GROUP_SOLITATIRE resultCode:%s", java.lang.Integer.valueOf(i18));
            if (-1 == i18) {
                z63.x0 x0Var = this.f551980a;
                z63.e1 e1Var = x0Var.f551982d.f551919g;
                if (e1Var != null) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b2) e1Var).f271718a;
                    c19666xfd6e2f33.D();
                    c19666xfd6e2f33.b1();
                    z63.f1 f1Var = x0Var.f551982d;
                    f1Var.f551922j = "";
                    f1Var.f551930r = null;
                    f1Var.f551924l = null;
                    if (intent != null) {
                        z63.e1 e1Var2 = f1Var.f551919g;
                        java.lang.String stringExtra = intent.getStringExtra("key_group_solitatire_content");
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f332 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b2) e1Var2).f271718a;
                        if (c19666xfd6e2f332.f271623x0 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                            c19666xfd6e2f332.f271623x0.h(stringExtra);
                        }
                    }
                    f1Var.f551921i = true;
                }
            }
        }
    }
}
