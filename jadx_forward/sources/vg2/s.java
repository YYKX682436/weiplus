package vg2;

/* loaded from: classes3.dex */
public final class s implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.t f518113d;

    public s(vg2.t tVar) {
        this.f518113d = tVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftActivityJumpToastWidget", "dismiss half dialog");
        this.f518113d.f518118g = null;
    }
}
