package zl2;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.o0 f555440a = new zl2.o0();

    public final java.lang.Object a(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (z17 && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            dn.m mVar = new dn.m();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload_");
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
            mVar.f69601xaca5bdda = sb6.toString();
            mVar.f69595x6d25b0d9 = str;
            mVar.f69619xe9ed65f6 = str;
            mVar.f69606xccdbf540 = true;
            mVar.f69592xf1ebe47b = 20304;
            mVar.f69580x454032b6 = 292;
            mVar.f69584x89a4c0cf = 2;
            mVar.A = 300;
            mVar.B = 300;
            mVar.f69609xd84b8349 = 2;
            mVar.f323320f = new zl2.l0(rVar);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUploadUtil", "[uploadCryptoImage] upload " + str + " end");
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final java.lang.Object b(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (z17 && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            dn.m mVar = new dn.m();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload_");
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
            mVar.f69601xaca5bdda = sb6.toString();
            mVar.f69595x6d25b0d9 = str;
            mVar.f69619xe9ed65f6 = str;
            mVar.f69606xccdbf540 = true;
            mVar.f69592xf1ebe47b = 20304;
            mVar.f69580x454032b6 = 251;
            mVar.f69584x89a4c0cf = 2;
            mVar.A = 300;
            mVar.B = 300;
            mVar.f69609xd84b8349 = 2;
            mVar.f323320f = new zl2.m0(rVar);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUploadUtil", "[uploadImage] upload " + str + " end");
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }
}
