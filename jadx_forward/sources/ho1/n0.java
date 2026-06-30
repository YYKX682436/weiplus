package ho1;

/* loaded from: classes5.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364294e;

    public n0(ho1.a1 a1Var, long j17) {
        this.f364293d = a1Var;
        this.f364294e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1.f174447a.c();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (c17 == 1) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n4h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (c17 != 2) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n4i);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            string = kn1.k.z(context);
            if (string == null) {
                string = "Unknown";
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e0 e0Var = this.f364293d.f364156b;
        if (e0Var != null) {
            e0Var.e0(this.f364294e, string);
        }
    }
}
