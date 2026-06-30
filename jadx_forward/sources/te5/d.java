package te5;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final te5.d f500155a = new te5.d();

    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, yz5.a onSuccess) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuccess, "onSuccess");
        l70.d U6 = x70.g.f533948f.a().U6(msgInfo, s70.c.f485452g, true);
        if (U6 == null || com.p314xaae8f345.mm.vfs.w6.j(U6.f398338f)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageDownloadHelper", "tryDownloadMidImage: msgId: " + msgInfo.m124847x74d37ac6());
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(onSuccess);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new te5.c(U6, weakReference, null), 1, null);
        }
    }
}
