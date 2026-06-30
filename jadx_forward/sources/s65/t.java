package s65;

/* loaded from: classes11.dex */
public class t implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l f485049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c f485050e;

    public t(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c, com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l lVar) {
        this.f485050e = activityC20972xfb8eac1c;
        this.f485049d = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = this.f485050e;
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c.Q6(activityC20972xfb8eac1c, 11);
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l lVar = this.f485049d;
        if (lVar != null) {
            try {
                java.io.File file = new java.io.File(lVar.d());
                if (file.exists()) {
                    file.delete();
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.GetUpdatePack", "error in deleteTempFile");
            }
        }
        s65.x0 x0Var = activityC20972xfb8eac1c.f273852g;
        x0Var.f485078s = true;
        x0Var.m(false);
    }
}
