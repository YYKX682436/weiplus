package g01;

/* loaded from: classes8.dex */
public class d implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p939x633fb29.p940x30579f.ui.ActivityC11103xcf50d948 f348942a;

    public d(com.p314xaae8f345.mm.p939x633fb29.p940x30579f.ui.ActivityC11103xcf50d948 activityC11103xcf50d948) {
        this.f348942a = activityC11103xcf50d948;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.String str) {
        this.f348942a.runOnUiThread(new g01.b(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public boolean b(android.os.Bundle bundle) {
        this.f348942a.runOnUiThread(new g01.a(this));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public boolean c(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x1
    /* renamed from: callback */
    public boolean mo70210xf5bc2045(int i17, android.os.Bundle bundle) {
        if (i17 == 200) {
            boolean z17 = bundle.getBoolean("OnMPGdprPolicyAgreement_KIsAgree", false);
            java.lang.String str = com.p314xaae8f345.mm.p939x633fb29.p940x30579f.ui.ActivityC11103xcf50d948.f151914i;
            com.p314xaae8f345.mm.p939x633fb29.p940x30579f.ui.ActivityC11103xcf50d948 activityC11103xcf50d948 = this.f348942a;
            android.os.ResultReceiver resultReceiver = activityC11103xcf50d948.f151919h;
            if (resultReceiver != null) {
                resultReceiver.send(z17 ? 1 : -1, null);
            }
            activityC11103xcf50d948.f151919h = null;
            if (z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11103xcf50d948.f151918g) && activityC11103xcf50d948.f151917f.f151904e != 0) {
                com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
                r45.c26 c26Var = new r45.c26();
                c26Var.f452779d = activityC11103xcf50d948.f151918g;
                c26Var.f452780e = activityC11103xcf50d948.f151917f.f151904e;
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = c26Var;
                lVar.f152198b = new r45.d26();
                lVar.f152200d = 2734;
                lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/setgdrpauth";
                iVar.p(lVar.a());
                iVar.l();
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public void d(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.String str) {
        this.f348942a.runOnUiThread(new g01.c(this));
    }
}
