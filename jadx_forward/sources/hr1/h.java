package hr1;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr1.i f364880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364881e;

    public h(hr1.i iVar, java.lang.String str) {
        this.f364880d = iVar;
        this.f364881e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hr1.i iVar = this.f364880d;
        l75.k0 k0Var = iVar.f364885d;
        java.lang.String str = this.f364881e;
        android.database.Cursor B = k0Var.B("SELECT *, rowid \nFROM BizFansConversation \nWHERE selfBiz = ?", new java.lang.String[]{str});
        while (B.moveToNext()) {
            try {
                hr1.e eVar = new hr1.e();
                eVar.mo9015xbf5d97fd(B);
                int i17 = eVar.f66330xa35b5abb;
                eVar.f66330xa35b5abb = 0;
                eVar.f66324x9b4f418d = 1;
                if (i17 != 0) {
                    iVar.m145258xce0038c9(eVar.f72763xa3c65b86, eVar, false);
                }
                iVar.L0(eVar);
            } finally {
            }
        }
        vz5.b.a(B, null);
        hr1.e eVar2 = new hr1.e();
        eVar2.f66325xea7a0fe2 = str;
        iVar.mo142179xf35bbb4("", 8, eVar2);
    }
}
