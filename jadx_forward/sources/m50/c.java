package m50;

/* loaded from: classes.dex */
public final class c implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m50.x f405007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f405008b;

    public c(m50.x xVar, java.util.List list) {
        this.f405007a = xVar;
        this.f405008b = list;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        java.util.ArrayList arrayList;
        wi5.n0 n0Var;
        m50.x xVar = this.f405007a;
        j75.f Q6 = xVar.Q6();
        boolean z17 = (Q6 == null || (n0Var = (wi5.n0) Q6.mo140437x75286adb()) == null || !n0Var.G) ? false : true;
        java.util.List<java.lang.String> list = this.f405008b;
        if (!z17) {
            j75.f Q62 = xVar.Q6();
            if (Q62 != null) {
                Q62.B3(new xi5.g(list, intent, i17));
                return;
            }
            return;
        }
        if (i17 == -1) {
            if (intent == null || (str = intent.getStringExtra("Retr_ForwardExtraText")) == null) {
                str = "";
            }
            xVar.f405047f = !r26.n0.N(str);
            if (xVar.U6()) {
                for (java.lang.String str2 : list) {
                    if (!r26.n0.N(str2)) {
                        j75.f Q63 = xVar.Q6();
                        if (Q63 != null) {
                            Q63.B3(new xi5.a(str2));
                        }
                        xVar.o7(str2);
                        if (xVar.f405047f) {
                            ((dk5.s5) tg3.t1.a()).Ui(str, str2);
                        }
                    }
                }
                xVar.n7();
            }
            boolean z18 = list.size() > 1;
            boolean booleanExtra = xVar.m158359x1e885992().getBooleanExtra("msg_forward_exteral", false);
            xVar.Y6(z18, booleanExtra, (!booleanExtra || z18 || (arrayList = xVar.f405046e) == null || arrayList.size() <= 0) ? null : (java.lang.String) xVar.f405046e.get(0));
        }
    }
}
