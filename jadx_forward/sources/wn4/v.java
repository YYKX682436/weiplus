package wn4;

/* loaded from: classes11.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xv.m0 f529102g;

    public v(java.lang.String str, java.lang.String str2, java.lang.String str3, xv.m0 m0Var) {
        this.f529099d = str;
        this.f529100e = str2;
        this.f529101f = str3;
        this.f529102g = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = -1;
        try {
            java.lang.String apkFilePath = this.f529099d;
            java.lang.String cPatchPath = this.f529100e;
            java.lang.String outPatchFilePath = this.f529101f;
            wn4.t tVar = new wn4.t();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apkFilePath, "apkFilePath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cPatchPath, "cPatchPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outPatchFilePath, "outPatchFilePath");
            f0Var.f391649d = t95.f.f498123a.a(apkFilePath, cPatchPath, outPatchFilePath, tVar);
        } catch (java.lang.Exception e17) {
            wn4.x xVar = wn4.x.f529104a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Updater.ManualUpdaterProcessor", e17, "", new java.lang.Object[0]);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new wn4.u(this.f529102g, f0Var));
    }
}
