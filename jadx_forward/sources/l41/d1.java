package l41;

/* loaded from: classes15.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f397329d;

    public d1(l41.j1 j1Var) {
        this.f397329d = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l41.j1 j1Var = this.f397329d;
        boolean z17 = ((java.lang.String) ((jz5.n) j1Var.f397391q).mo141623x754a37bb()).length() > 0;
        android.app.Activity activity = j1Var.f397375a;
        if (z17) {
            dp.a.m125854x26a183b(activity, (java.lang.String) ((jz5.n) j1Var.f397391q).mo141623x754a37bb(), 0).show();
        } else {
            dp.a.m125854x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hew), 0).show();
        }
    }
}
