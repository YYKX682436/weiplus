package vd0;

/* loaded from: classes4.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f517044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f517046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f517047g;

    public t2(android.graphics.Bitmap bitmap, java.lang.String str, android.content.Context context, yz5.a aVar) {
        this.f517044d = bitmap;
        this.f517045e = str;
        this.f517046f = context;
        this.f517047g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (this.f517044d != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            this.f517044d.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            h0Var.f391656d = byteArrayOutputStream.toByteArray();
        }
        java.lang.Object obj = h0Var.f391656d;
        if (obj != null) {
            if (!(((byte[]) obj).length == 0)) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f517045e);
                try {
                    vd0.r2 r2Var = new vd0.r2(h0Var);
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f274597a;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.o0(r6Var.o(), r2Var);
                    ((ku5.t0) ku5.t0.f394148d).B(new vd0.s2(this.f517047g));
                    vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                    java.lang.String o17 = r6Var.o();
                    android.content.Context context = this.f517046f;
                    ((ub0.r) oVar).getClass();
                    q75.c.f(o17, context);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingQRCodeService", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }
}
