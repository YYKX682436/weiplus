package tw2;

/* loaded from: classes2.dex */
public final class g implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb5.e f504003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f504004b;

    public g(eb5.e eVar, r45.mb4 mb4Var) {
        this.f504003a = eVar;
        this.f504004b = mb4Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        long a17 = hq.d.a();
        eb5.e eVar = this.f504003a;
        eVar.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.teh, java.lang.Long.valueOf(a17));
        android.view.View view = eVar.f3639x46306858;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.mb4 mb4Var = this.f504004b;
        sb6.append(mb4Var.m75945x2fec8307(1));
        sb6.append(mb4Var.m75945x2fec8307(19));
        view.setTag(com.p314xaae8f345.mm.R.id.tei, sb6.toString());
        if (bitmap != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5850xbbd634a4 c5850xbbd634a4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5850xbbd634a4();
            int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(((mn2.h3) aVar.f375106a).mo148083xfb83cc9b());
            java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(9);
            am.so soVar = c5850xbbd634a4.f136158g;
            soVar.f89447a = m75945x2fec8307;
            soVar.f89449c = 2;
            soVar.f89450d = k17;
            c5850xbbd634a4.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ImageBannerAdapter", mb4Var.m75945x2fec8307(9) + " [" + bitmap.getWidth() + ':' + bitmap.getHeight() + "] fileLength=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(k17) + " allocationByteCount=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(bitmap.getAllocationByteCount()));
        }
    }
}
