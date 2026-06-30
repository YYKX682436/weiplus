package fz4;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f348829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f348830e;

    public b(android.app.Activity activity, int i17) {
        this.f348829d = activity;
        this.f348830e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        android.app.Activity activity = this.f348829d;
        if (activity == null || (str = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cds, java.lang.Integer.valueOf(this.f348830e))) == null) {
            str = "";
        }
        dp.a.m125854x26a183b(activity, str, 1).show();
    }
}
