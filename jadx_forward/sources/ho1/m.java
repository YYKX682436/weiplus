package ho1;

/* loaded from: classes15.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f364285g;

    public m(ho1.v vVar, long j17, java.lang.String str, byte[] bArr) {
        this.f364282d = vVar;
        this.f364283e = j17;
        this.f364284f = str;
        this.f364285g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f364282d;
        java.lang.String str = vVar.f364362a;
        java.lang.Object[] objArr = new java.lang.Object[3];
        long j17 = this.f364283e;
        objArr[0] = java.lang.Long.valueOf(j17);
        java.lang.String str2 = this.f364284f;
        objArr[1] = str2;
        byte[] bArr = this.f364285g;
        objArr[2] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "fileStreamWriteOnceAsync, before open, taskId = %s, remotePath = %s, buf.size = %s", objArr);
        ro1.g gVar = vVar.f364364c;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUDiskChannel");
            throw null;
        }
        java.io.OutputStream h17 = gVar.h(str2);
        if (h17 != null) {
            try {
                h17.write(bArr);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
                if (t0Var != null) {
                    t0Var.T(j17, 0);
                }
                vz5.b.a(h17, null);
                return;
            } catch (java.lang.Throwable th6) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f364362a, th6, "", new java.lang.Object[0]);
                    vz5.b.a(h17, null);
                } catch (java.lang.Throwable th7) {
                    try {
                        throw th7;
                    } catch (java.lang.Throwable th8) {
                        vz5.b.a(h17, th7);
                        throw th8;
                    }
                }
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var2 = vVar.f364369h;
        if (t0Var2 != null) {
            t0Var2.T(j17, -1);
        }
    }
}
