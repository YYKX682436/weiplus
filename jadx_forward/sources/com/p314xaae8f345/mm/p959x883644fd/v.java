package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f153123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153124e;

    public v(com.p314xaae8f345.mm.p959x883644fd.t tVar, int i17, java.lang.String str) {
        this.f153123d = i17;
        this.f153124e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f153124e;
        int i17 = this.f153123d;
        if (i17 == 1) {
            s75.d.c(new x51.k1(gm0.j1.u().d() + str, c01.z1.r(), false, 20003), "StackReportUploader_uploadFileDirect", 1);
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            s75.d.c(new x51.k1(str, c01.z1.r(), false, 20003), "StackReportUploader_uploadFileDirect", 1);
        } else {
            s75.d.c(new x51.k1(gm0.j1.u().h() + str, c01.z1.r(), false, 20003), "StackReportUploader_uploadFileDirect", 1);
        }
    }

    /* renamed from: toString */
    public java.lang.String m48198x9616526c() {
        return super.toString() + "|onPreAddMessage";
    }
}
