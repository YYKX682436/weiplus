package j03;

/* loaded from: classes10.dex */
public final class a implements com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960
    /* renamed from: createDirectory */
    public void mo91175x6f4bf8d1(java.lang.String path, boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!com.p314xaae8f345.mm.vfs.w6.u(path)) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("Unable to create directory: ".concat(path))))));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(path, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(i17)));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960
    /* renamed from: createFile */
    public void mo91176x51962c98(java.lang.String path, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!com.p314xaae8f345.mm.vfs.w6.e(path)) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("Unable to create file: ".concat(path))))));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(path, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(i17)));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960
    /* renamed from: getDefaultImageCacheDirectory */
    public java.lang.String mo91177x3530073b() {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("flutter/cached_images_default"), false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterFilePlugin", "getDefaultImageCacheDirectory: " + i17 + ' ' + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir().getAbsolutePath());
        if (i17 != null) {
            return i17;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir().getAbsolutePath() + "/flutter/cached_images_default";
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960
    /* renamed from: getGeneralCacheDirectory */
    public java.lang.String mo91178x4ba7d25d() {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("flutter_temp"), false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        return i17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960
    /* renamed from: getMemoryDirectory */
    public java.lang.String mo91179x29bf6436() {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("flutter_snapshot"), true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterFilePlugin", "getMemoryDirectory: ".concat(i17));
        return i17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960
    /* renamed from: getRealPath */
    public java.lang.String mo91180x48937059(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(path, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        return i17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960
    /* renamed from: getStreamProfilerDirectory */
    public java.lang.String mo91181x2bc030ae(boolean z17) {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c(z17 ? "flutterPrivate/profiler" : "flutter/profiler"), true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        return i17;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960.Companion.m91183x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24589x1102b960.Companion.m91183x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }
}
