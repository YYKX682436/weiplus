package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.ManagerImplLoader */
/* loaded from: classes13.dex */
final class C25547x50069dc0 extends ut5.e {

    /* renamed from: MANAGER_FACTORY_CLASS_NAME */
    private static final java.lang.String f46715xcaacb179 = "com.tencent.shadow.dynamic.impl.ManagerFactoryImpl";

    /* renamed from: REMOTE_PLUGIN_MANAGER_INTERFACES */
    private static final java.lang.String[] f46716x7489281f = {"com.tencent.shadow.core.common", "com.tencent.shadow.dynamic.host"};

    /* renamed from: applicationContext */
    private final android.content.Context f46717x5b0a2e3f;

    /* renamed from: installedApk */
    private final com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 f46718x799de042;

    public C25547x50069dc0(android.content.Context context, java.io.File file) {
        java.lang.String absolutePath = file.getAbsolutePath();
        this.f46717x5b0a2e3f = context.getApplicationContext();
        this.f46718x799de042 = new com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462(absolutePath, (java.lang.String) null, absolutePath + "!/lib/arm64-v8a");
    }

    @Override // ut5.e
    /* renamed from: getCustomWhiteList */
    public java.lang.String[] mo95588x273269c0() {
        return f46716x7489281f;
    }

    /* renamed from: load */
    public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25551xd7f1521a m95592x32c4e6() {
        try {
            com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462 = this.f46718x799de042;
            ut5.b a17 = ut5.b.a(c25507x83693462, m170523xe1753221(c25507x83693462), null);
            try {
                return ((com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25546x354df8bd) com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25546x354df8bd.class.cast(a17.loadClass(f46715xcaacb179).newInstance())).m95590xe67c695f(new ut5.c(this.f46717x5b0a2e3f, this.f46718x799de042.f46642x1b64b1fd, a17), this.f46718x799de042);
            } catch (java.lang.ClassCastException e17) {
                e = e17;
                throw new java.lang.Exception(e);
            } catch (java.lang.ClassNotFoundException e18) {
                e = e18;
                throw new java.lang.Exception(e);
            } catch (java.lang.IllegalAccessException e19) {
                e = e19;
                throw new java.lang.Exception(e);
            } catch (java.lang.InstantiationException e27) {
                e = e27;
                throw new java.lang.Exception(e);
            }
        } catch (java.lang.Exception e28) {
            throw new java.lang.RuntimeException(e28);
        }
    }
}
