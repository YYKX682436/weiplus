package p14;

/* loaded from: classes4.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae f432775d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae activityC17369x698c24ae) {
        this.f432775d = activityC17369x698c24ae;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17369x698c24ae activityC17369x698c24ae = this.f432775d;
        byte[] bArr = activityC17369x698c24ae.f241656g;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
        sb6.append(q75.c.d());
        sb6.append("mmqrcode");
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(".png");
        java.lang.String sb7 = sb6.toString();
        java.io.OutputStream outputStream = null;
        try {
            try {
                outputStream = com.p314xaae8f345.mm.vfs.w6.K(sb7, false);
                outputStream.write(bArr);
                dp.a.m125854x26a183b(activityC17369x698c24ae, activityC17369x698c24ae.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573837g00, q75.c.c(sb7)), 1).show();
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                q75.c.f(sb7, activityC17369x698c24ae);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShowQRCodeStep1UI", e17, "", new java.lang.Object[0]);
                if (outputStream == null) {
                    return;
                }
            }
            try {
                outputStream.close();
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th6) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
    }
}
