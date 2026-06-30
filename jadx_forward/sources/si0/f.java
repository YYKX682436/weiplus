package si0;

/* loaded from: classes13.dex */
public final class f implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f489600h;

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f489601d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f489602e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f489603f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f489604g = new java.util.HashMap();

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf
    /* renamed from: create */
    public void mo88932xaf65a0fc(com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 info, yz5.l callback) {
        si0.o0 l0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        io.p3284xd2ae381c.Log.i("MicroMsg.FlutterPAGPlugin", "setUseRfxPag:" + f489600h);
        if (f489600h) {
            android.content.Context context = this.f489603f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658 = this.f489601d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC28980x1159d658);
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2 = this.f489602e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC28679x1b8c77f2);
            l0Var = new si0.v(context, interfaceC28980x1159d658, interfaceC28679x1b8c77f2, info.m88906x74f5929b());
        } else {
            android.content.Context context2 = this.f489603f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d6582 = this.f489601d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC28980x1159d6582);
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f22 = this.f489602e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC28679x1b8c77f22);
            l0Var = new si0.l0(context2, interfaceC28980x1159d6582, interfaceC28679x1b8c77f22, info.m88906x74f5929b());
        }
        this.f489604g.put(java.lang.Long.valueOf(info.m88906x74f5929b()), l0Var);
        l0Var.a(info, new si0.c(callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf
    /* renamed from: flush */
    public void mo88933x5d03b04(long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        si0.o0 o0Var = (si0.o0) this.f489604g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new si0.e(o0Var, callback, null), 2, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = flutterPluginBinding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf.Companion.m88942x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        this.f489602e = flutterPluginBinding.m137983x3b5b91dc();
        this.f489601d = flutterPluginBinding.m137988x3128f042();
        this.f489603f = flutterPluginBinding.m137982x6e669035();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = flutterPluginBinding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf.Companion.m88942x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f489601d = null;
        this.f489602e = null;
        this.f489603f = null;
        java.util.HashMap hashMap = this.f489604g;
        java.util.Collection values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            ((si0.o0) it.next()).mo164586x41012807();
        }
        hashMap.clear();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf
    /* renamed from: pagViewRelease */
    public void mo88934xed000f2c(long j17) {
        io.p3284xd2ae381c.Log.i("MicroMsg.FlutterPAGPlugin", "pagViewRelease pagId:" + j17);
        java.util.HashMap hashMap = this.f489604g;
        si0.o0 o0Var = (si0.o0) hashMap.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return;
        }
        o0Var.mo164586x41012807();
        hashMap.remove(java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf
    /* renamed from: pagViewStartPlay */
    public boolean mo88935x28f5749b(long j17) {
        io.p3284xd2ae381c.Log.i("MicroMsg.FlutterPAGPlugin", "pagViewStartPlay pagId:" + j17);
        si0.o0 o0Var = (si0.o0) this.f489604g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return false;
        }
        o0Var.mo164588x8113c2b6();
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf
    /* renamed from: pagViewStop */
    public boolean mo88936xa68bfafd(long j17) {
        io.p3284xd2ae381c.Log.i("MicroMsg.FlutterPAGPlugin", "pagViewStop pagId:" + j17);
        si0.o0 o0Var = (si0.o0) this.f489604g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return false;
        }
        o0Var.mo164589x360802();
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf
    /* renamed from: replaceImage */
    public boolean mo88937x1a429707(long j17, long j18, java.lang.String filepath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filepath, "filepath");
        si0.o0 o0Var = (si0.o0) this.f489604g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return false;
        }
        return o0Var.e((int) j18, filepath);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf
    /* renamed from: replaceText */
    public boolean mo88938x19a3f201(long j17, long j18, com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24031xcb383f47 text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        si0.o0 o0Var = (si0.o0) this.f489604g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return false;
        }
        return o0Var.c((int) j18, text);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf
    /* renamed from: seek */
    public void mo88939x35ce78(long j17, long j18) {
        si0.o0 o0Var = (si0.o0) this.f489604g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return;
        }
        o0Var.mo164587x35ce78(j18);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.InterfaceC24033x4a121bdf
    /* renamed from: setSolidLayerColor */
    public boolean mo88940xcad8e8db(long j17, java.lang.String name, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        si0.o0 o0Var = (si0.o0) this.f489604g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return false;
        }
        return o0Var.d(name, (int) j18);
    }
}
