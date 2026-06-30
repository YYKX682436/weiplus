package o23;

@j95.b
/* loaded from: classes10.dex */
public final class i extends i95.w implements e60.b1 {
    public void Ai(android.widget.ImageView imageView, int i17, java.lang.String thumbFilePath, java.lang.String orgFilePath, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFilePath, "thumbFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orgFilePath, "orgFilePath");
        e33.m6.c(imageView, i17, thumbFilePath, orgFilePath, j17, -1, null, null, j18);
    }

    public int Bi(java.lang.String str) {
        return (c01.e2.G(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.u3().contains(str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("weixin", str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) ? 26214400 : 1073741824;
    }

    public java.lang.Object Di(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c, int i17, java.util.ArrayList arrayList, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        if (arrayList.isEmpty()) {
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new qc0.m1(-1, -1, 0, null, null, null, 0, 124, null)));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            o23.h hVar = new o23.h(activityC0053x3d3f670c, valueOf, h0Var, rVar);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.GalleryFeatureService", "optLaunch ui:" + activityC0053x3d3f670c, new java.lang.Object[0]);
            p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c e17 = activityC0053x3d3f670c.mo2507xfe541f5f().e(valueOf, new o23.g(i17, i18), hVar);
            h0Var.f391656d = e17;
            e17.a(arrayList, new z2.i(z2.l.a()));
            activityC0053x3d3f670c.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public void wi(android.widget.ImageView imageView, int i17, java.lang.String thumbFilePath, java.lang.String orgFilePath, long j17, int i18, f60.a aVar, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFilePath, "thumbFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orgFilePath, "orgFilePath");
        e33.m6.b(imageView, i17, thumbFilePath, orgFilePath, j17, i18, aVar, j18);
    }
}
