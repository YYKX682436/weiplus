package com.tencent.mm.modelstat;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f71590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71591e;

    public v(com.tencent.mm.modelstat.t tVar, int i17, java.lang.String str) {
        this.f71590d = i17;
        this.f71591e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f71591e;
        int i17 = this.f71590d;
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

    public java.lang.String toString() {
        return super.toString() + "|onPreAddMessage";
    }
}
