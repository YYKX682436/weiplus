package u20;

/* loaded from: classes9.dex */
public final class e implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f505398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u20.i f505399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f505400c;

    public e(java.lang.String str, u20.i iVar, android.content.Context context) {
        this.f505398a = str;
        this.f505399b = iVar;
        this.f505400c = context;
    }

    @Override // r.a
    /* renamed from: apply */
    public java.lang.Object mo1850x58b836e(java.lang.Object obj) {
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        u20.i iVar = this.f505399b;
        if (inputStream == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EcsShareToContactLogicImage", "downloadAndProcessImage, download failed for url: " + this.f505398a);
            iVar.b("Failed to download image");
        } else {
            try {
                java.lang.String str = iVar.f505417g;
                java.lang.String str2 = iVar.f505417g;
                java.io.OutputStream K = com.p314xaae8f345.mm.vfs.w6.K(str, false);
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(K);
                    vz5.a.b(inputStream, K, 0, 2, null);
                    vz5.b.a(K, null);
                    inputStream.close();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicImage", "downloadAndProcessImage, saved to VFSFile: " + str2);
                    iVar.e(this.f505400c, str2);
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsShareToContactLogicImage", e17, "downloadAndProcessImage, write to VFSFile failed", new java.lang.Object[0]);
                com.p314xaae8f345.mm.vfs.w6.h(iVar.f505417g);
                iVar.b("Failed to save downloaded image");
            }
        }
        return null;
    }
}
