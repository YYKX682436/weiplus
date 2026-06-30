package gf;

/* loaded from: classes7.dex */
public final class x0 implements com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f352719a;

    public x0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f352719a = service;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.SkylineResourceLoaderImpl", service.mo48798x74292566() + " init " + service);
    }

    @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced
    /* renamed from: loadBitmap */
    public android.graphics.Bitmap mo95912xd586ddb5(java.lang.String str) {
        return null;
    }

    @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced
    /* renamed from: loadBitmapAsync */
    public void mo95913x5e27dc7(java.lang.String str, com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced.BitmapLoadCallback bitmapLoadCallback) {
    }

    @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced
    /* renamed from: loadResource */
    public byte[] mo95914x3830a714(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return new byte[0];
        }
        boolean y17 = r26.i0.y(str, "wxlibfile://", false);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f352719a;
        if (y17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = yVar.x();
            if (x17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.SkylineResourceLoaderImpl", "loadResource fail: " + str + ", libReader is null");
                return new byte[0];
            }
            java.lang.String substring = str.substring(12);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            java.io.InputStream a17 = x17.a(substring);
            if (a17 != null) {
                return ik1.f.b(a17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.SkylineResourceLoaderImpl", "loadResource, fileStream: " + str + " is null");
            return new byte[0];
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = yVar.mo50354x59eafec1();
            java.io.InputStream mo49627xe22f8cb6 = mo50354x59eafec1 != null ? mo50354x59eafec1.mo49627xe22f8cb6(str) : null;
            if (mo49627xe22f8cb6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.SkylineResourceLoaderImpl", "loadResource, fileStream: " + str + " is null");
                return new byte[0];
            }
            byte[] b17 = ik1.f.b(mo49627xe22f8cb6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadResource path:");
            sb6.append(str);
            sb6.append(": ");
            sb6.append(b17 != null ? java.lang.Integer.valueOf(b17.length) : null);
            sb6.append(" success");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.SkylineResourceLoaderImpl", sb6.toString());
            return b17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.SkylineResourceLoaderImpl", "loadResource fail: " + e17 + ", fileStream: " + str);
            return new byte[0];
        }
    }

    @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced
    /* renamed from: loadResourceAsync */
    public void mo95915x850ab7c8(java.lang.String str, com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced.ResourceLoadCallback resourceLoadCallback) {
        ((ku5.t0) ku5.t0.f394148d).a(new gf.w0(this, str, resourceLoadCallback));
    }
}
