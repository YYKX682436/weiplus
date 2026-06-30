package nr1;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr1.f f420671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420672e;

    public e(nr1.f fVar, java.lang.String str) {
        this.f420671d = fVar;
        this.f420672e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nr1.f fVar = this.f420671d;
        l75.k0 k0Var = fVar.f420681d;
        java.lang.String str = this.f420672e;
        android.database.Cursor B = k0Var.B("SELECT *, rowid \nFROM BizPhotoFansConversation \nWHERE selfBiz = ?", new java.lang.String[]{str});
        while (B.moveToNext()) {
            try {
                hr1.e eVar = new hr1.e();
                eVar.mo9015xbf5d97fd(B);
                int i17 = eVar.f66330xa35b5abb;
                eVar.f66330xa35b5abb = 0;
                eVar.f66324x9b4f418d = 1;
                if (i17 != 0) {
                    fVar.m145258xce0038c9(eVar.f72763xa3c65b86, eVar, false);
                }
                fVar.L0(eVar);
            } finally {
            }
        }
        vz5.b.a(B, null);
        hr1.e eVar2 = new hr1.e();
        eVar2.f66325xea7a0fe2 = str;
        fVar.mo142179xf35bbb4("", 8, eVar2);
    }
}
