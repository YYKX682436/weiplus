package df2;

/* loaded from: classes3.dex */
public final class hi implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wi f311864d;

    public hi(df2.wi wiVar) {
        this.f311864d = wiVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311864d.f313223m, "dialog cancel");
        dialogInterface.dismiss();
    }
}
