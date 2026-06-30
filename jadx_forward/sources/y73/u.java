package y73;

/* loaded from: classes11.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xv.m0 f541296g;

    public u(y73.q qVar, java.lang.String str, java.lang.String str2, java.lang.String str3, xv.m0 m0Var) {
        this.f541293d = str;
        this.f541294e = str2;
        this.f541295f = str3;
        this.f541296g = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        try {
            java.lang.String apkFilePath = this.f541293d;
            java.lang.String cPatchPath = this.f541294e;
            java.lang.String outPatchFilePath = this.f541295f;
            y73.s sVar = new y73.s(this);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apkFilePath, "apkFilePath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cPatchPath, "cPatchPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outPatchFilePath, "outPatchFilePath");
            i17 = t95.f.f498123a.a(apkFilePath, cPatchPath, outPatchFilePath, sVar);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.HotPatchApplyService", e17, "", new java.lang.Object[0]);
            i17 = -1;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new y73.t(this, i17));
    }
}
