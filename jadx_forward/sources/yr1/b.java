package yr1;

/* loaded from: classes14.dex */
public final class b implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12995x6d6be93 f546169d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12995x6d6be93 c12995x6d6be93) {
        this.f546169d = c12995x6d6be93;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new yr1.a(this.f546169d));
        ofFloat.start();
    }
}
