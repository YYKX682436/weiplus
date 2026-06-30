package fh4;

/* loaded from: classes3.dex */
public class a0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b f344193d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b activityC18551xd77e8c9b) {
        this.f344193d = activityC18551xd77e8c9b;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        c01.d9.b().p().w(144641, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) c01.d9.b().p().l(144641, null), 0) + 1));
        this.f344193d.onBackPressed();
    }
}
