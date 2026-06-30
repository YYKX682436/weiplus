package y73;

/* loaded from: classes11.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xv.m0 f541262g;

    public j0(y73.d0 d0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, xv.m0 m0Var) {
        this.f541259d = str;
        this.f541260e = str2;
        this.f541261f = str3;
        this.f541262g = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        try {
            java.lang.String apkFilePath = this.f541259d;
            java.lang.String cPatchPath = this.f541260e;
            java.lang.String outPatchFilePath = this.f541261f;
            y73.h0 h0Var = new y73.h0(this);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apkFilePath, "apkFilePath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cPatchPath, "cPatchPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outPatchFilePath, "outPatchFilePath");
            i17 = t95.f.f498123a.a(apkFilePath, cPatchPath, outPatchFilePath, h0Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.SyncResponseProcessor", e17, "", new java.lang.Object[0]);
            i17 = -1;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new y73.i0(this, i17));
    }
}
