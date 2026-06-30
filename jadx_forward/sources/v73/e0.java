package v73;

/* loaded from: classes9.dex */
public class e0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 f515218d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 activityC16101x10c7b82) {
        this.f515218d = activityC16101x10c7b82;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 activityC16101x10c7b82 = this.f515218d;
        activityC16101x10c7b82.f223864x = activityC16101x10c7b82.f223858r.getText().toString();
        activityC16101x10c7b82.Y6();
    }
}
