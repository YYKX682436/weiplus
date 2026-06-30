package jp3;

/* loaded from: classes12.dex */
public final class i implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382536b;

    public i(java.lang.String str, java.lang.String str2) {
        this.f382535a = str;
        this.f382536b = str2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        byte[] m75962x8b6d8abc;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        jp3.t tVar = jp3.t.f382562a;
        java.lang.String str = this.f382535a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f152149b);
        java.lang.String str2 = fVar.f152150c;
        r45.ru6 ru6Var = (r45.ru6) fVar.f152151d;
        tVar.c("uploadonlineopenresource", str, valueOf, str2, (ru6Var == null || (m75962x8b6d8abc = ru6Var.m75962x8b6d8abc()) == null) ? null : java.lang.Integer.valueOf(m75962x8b6d8abc.length));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintLogic", "[doUploadFailResult] cgi resp: " + fVar);
        java.lang.String str3 = this.f382536b;
        if (str3 == null || str3.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "[deleteFile] error, path is empty!");
        } else if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            com.p314xaae8f345.mm.vfs.w6.h(str3);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "[deleteFile] error, file is not exits, path: " + str3 + '!');
        }
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintLogic", "[doUploadFailResult] cgi failed, errCode: " + fVar.f152149b);
        }
        return jz5.f0.f384359a;
    }
}
