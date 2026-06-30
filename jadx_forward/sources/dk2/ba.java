package dk2;

/* loaded from: classes.dex */
public final class ba extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314780e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(java.lang.String str, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f314779d = str;
        this.f314780e = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.ba(this.f314779d, this.f314780e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.ba) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.z2 m17;
        java.lang.String str = this.f314779d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = false;
        try {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveKTVReplayDownloadManager", e17, "saveVideoToAlbum error", new java.lang.Object[0]);
        }
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayDownloadManager", "saveVideoToAlbum: file not exists: " + str);
            return java.lang.Boolean.FALSE;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context context = this.f314780e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((yb0.g) b0Var).Bi((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context, str, new dk2.aa(c0Var, countDownLatch));
        countDownLatch.await();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "saveVideoToAlbum: result=" + c0Var.f391645d + ", filePath=" + str);
        z17 = c0Var.f391645d;
        return java.lang.Boolean.valueOf(z17);
    }
}
