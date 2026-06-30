package cw1;

/* loaded from: classes3.dex */
public final class j2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f304553d;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d) {
        this.f304553d = activityC13111x890e232d;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ((com.p314xaae8f345.mm.app.y7) f14.g.b()).d(new android.content.Intent().putExtra("Intro_Need_Clear_Top ", true), this.f304553d.mo55332x76847179());
    }
}
