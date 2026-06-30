package yx3;

/* loaded from: classes15.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public m8.i0 f549435a;

    public final void a(android.content.Context context, java.lang.String path, int i17, yx3.y yVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TTSFilePlayer", "play Err context:%s listener:%s", context, yVar);
            if (yVar != null) {
                yVar.mo149901xa6db431b();
                return;
            }
            return;
        }
        if (yVar != null) {
            yVar.c();
        }
        m8.i0 i0Var = new m8.i0(new m8.d(context, null, 0), new q9.h(new q9.a(new r9.p())), new m8.c(new r9.o(true, 65536), 15000, 30000, 2500L, 5000L));
        this.f549435a = i0Var;
        i0Var.j(i17);
        java.lang.Object[] objArr = new java.lang.Object[4];
        m8.i0 i0Var2 = this.f549435a;
        objArr[0] = java.lang.Integer.valueOf(i0Var2 != null ? i0Var2.hashCode() : 0);
        objArr[1] = path;
        objArr[2] = context;
        objArr[3] = yVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TTSFilePlayer", "play start mp:%d path:%s context:%s listener:%s ", objArr);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TTSFilePlayer", "play prepare path:".concat(path));
            d9.v vVar = new d9.v(android.net.Uri.parse(com.p314xaae8f345.mm.vfs.w6.i(path, false)), new r9.v(), new q8.c(), null, null);
            m8.i0 i0Var3 = this.f549435a;
            if (i0Var3 != null) {
                i0Var3.g(new yx3.c0(this, yVar));
            }
            m8.i0 i0Var4 = this.f549435a;
            if (i0Var4 != null) {
                i0Var4.e(true);
            }
            m8.i0 i0Var5 = this.f549435a;
            if (i0Var5 != null) {
                i0Var5.k(0);
            }
            m8.i0 i0Var6 = this.f549435a;
            if (i0Var6 != null) {
                ((m8.k) i0Var6.f406094b).j(vVar);
            }
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            m8.i0 i0Var7 = this.f549435a;
            objArr2[0] = java.lang.Integer.valueOf(i0Var7 != null ? i0Var7.hashCode() : 0);
            objArr2[1] = java.lang.Boolean.valueOf(android.os.Looper.myLooper() != null);
            objArr2[2] = java.lang.Boolean.valueOf(android.os.Looper.getMainLooper() != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TTSFilePlayer", "play start mp finish [%d], myLooper[%b] mainLooper[%b]", objArr2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TTSFilePlayer", "play failed pathId:%s e:%s", path, e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TTSFilePlayer", e17, "", new java.lang.Object[0]);
            ((ku5.t0) ku5.t0.f394148d).g(new yx3.d0(this, yVar));
        }
    }
}
