package j82;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f379691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.p1412xa3b20de3.ui.ActivityC13547xa84d1ae5 f379692e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.fav.p1412xa3b20de3.ui.ActivityC13547xa84d1ae5 activityC13547xa84d1ae5, android.app.Dialog dialog) {
        this.f379692e = activityC13547xa84d1ae5;
        this.f379691d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f379691d.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.p1412xa3b20de3.ui.ActivityC13547xa84d1ae5 activityC13547xa84d1ae5 = this.f379692e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activityC13547xa84d1ae5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, activityC13547xa84d1ae5, null, null);
    }
}
