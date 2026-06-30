package df2;

/* loaded from: classes3.dex */
public final class tx implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cy f313014d;

    public tx(df2.cy cyVar) {
        this.f313014d = cyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        df2.cy cyVar = this.f313014d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cyVar.f311448m, "showAlertDialog dismiss");
        df2.k kVar = (df2.k) cyVar.m56789x25fe639c(df2.k.class);
        if (kVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f312055m, "notifyWarningDismiss ".concat("showAlertDialog dismiss"));
            kVar.a7("liveWarningEnd", "");
        }
    }
}
