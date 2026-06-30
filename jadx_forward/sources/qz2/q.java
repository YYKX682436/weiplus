package qz2;

/* loaded from: classes9.dex */
public class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f449435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a f449436e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a, android.widget.CheckBox checkBox) {
        this.f449436e = activityC15523xe4f09a5a;
        this.f449435d = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a.V6(this.f449436e, this.f449435d.isChecked());
    }
}
