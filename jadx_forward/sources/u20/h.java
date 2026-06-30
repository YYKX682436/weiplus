package u20;

/* loaded from: classes9.dex */
public final class h implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f505412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u20.i f505413e;

    public h(int i17, u20.i iVar) {
        this.f505412d = i17;
        this.f505413e = iVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        int i19 = this.f505412d;
        u20.i iVar = this.f505413e;
        if (i19 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicImage", "handleNormalImage, requestCode: " + i17 + " is not match");
            iVar.a();
            return;
        }
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicImage", "handleNormalImage, resultCode is not RESULT_OK: " + i18);
            iVar.a();
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        boolean z17 = true;
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EcsShareToContactLogicImage", "handleNormalImage, toUsers is empty");
            iVar.b("toUsers is empty");
            return;
        }
        if (!(stringArrayListExtra instanceof java.util.Collection) || !stringArrayListExtra.isEmpty()) {
            java.util.Iterator<T> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4((java.lang.String) it.next())) {
                    break;
                }
            }
        }
        z17 = false;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicImage", "handleNormalImage, toUser: " + stringArrayListExtra);
        iVar.d(z17);
    }
}
