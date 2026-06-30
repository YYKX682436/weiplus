package cj5;

/* loaded from: classes.dex */
public final class x3 implements com.tencent.mm.pluginsdk.ui.b2, com.tencent.mm.pluginsdk.ui.c2, com.tencent.mm.pluginsdk.ui.a2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k4 f42271d;

    public x3(cj5.k4 k4Var) {
        this.f42271d = k4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.c2
    public void J3(boolean z17) {
        j75.f Q6;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactSearchMvvmListUIC", "onFoucusChange " + z17);
        cj5.k4 k4Var = this.f42271d;
        j75.f Q62 = k4Var.Q6();
        if (Q62 != null) {
            java.lang.String searchContent = k4Var.U6().b().getSearchContent();
            if (searchContent == null || (str = r26.n0.u0(searchContent).toString()) == null) {
                str = "";
            }
            Q62.B3(new wi5.w(z17, str, new cj5.v3(k4Var)));
        }
        if (!z17 || (Q6 = k4Var.Q6()) == null) {
            return;
        }
        Q6.B3(new wi5.k());
    }

    @Override // com.tencent.mm.pluginsdk.ui.b2
    public void L(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactSearchMvvmListUIC", "onSearchTextChange " + str);
        if (str == null || (str2 = r26.n0.u0(str).toString()) == null) {
            str2 = "";
        }
        java.lang.String str3 = c01.id.c() + '_' + str2;
        cj5.k4 k4Var = this.f42271d;
        j75.f Q6 = k4Var.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.y(str3, str2, new cj5.w3(k4Var)));
        }
        j75.f Q62 = k4Var.Q6();
        if (Q62 != null) {
            Q62.B3(new wi5.k());
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        j75.f Q6;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactSearchMvvmListUIC", "onSelectChange " + i17 + ' ' + str);
        if (i17 != 1 || str == null || (Q6 = this.f42271d.Q6()) == null) {
            return;
        }
        Q6.B3(new wi5.x0(str));
    }
}
