package jm3;

/* loaded from: classes3.dex */
public final class f1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b f381850d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b activityC16655xf855844b) {
        this.f381850d = activityC16655xf855844b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f381850d.finish();
    }
}
