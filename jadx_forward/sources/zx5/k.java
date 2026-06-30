package zx5;

/* loaded from: classes13.dex */
public class k implements zx5.a {
    @Override // zx5.a
    public void a(boolean z17, int i17, int i18, java.util.HashMap hashMap) {
        by5.c4.g("XWebBroadcastListener", "onAudioHAidConfigUpdated, package:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l() + ", process:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464());
        by5.c4.f("XWebAudioHAid", "onAudioHAidConfigChanged.");
        com.p314xaae8f345.p3210x3857dc.s1.b(z17, i17, i18, hashMap);
    }

    @Override // zx5.a
    public void b(int i17) {
    }

    @Override // zx5.a
    public void c() {
        by5.c4.g("XWebBroadcastListener", "onMainCfgUpdated, package:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l() + ", process:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464());
        yu5.c.a(new zx5.i(this));
    }

    @Override // zx5.a
    public void d(int i17) {
    }

    @Override // zx5.a
    public void e() {
        by5.c4.g("XWebBroadcastListener", "onPluginCfgUpdated, package:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l() + ", process:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464());
        yu5.c.a(new zx5.j(this));
    }

    @Override // zx5.a
    public void f(int i17, int i18) {
        by5.c4.g("XWebBroadcastListener", "onUpdateFinished, package:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l() + ", process:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464());
        if (i17 == 0) {
            if (!com.p314xaae8f345.p3210x3857dc.b3.f301749d) {
                by5.c4.f("XWebBroadcastListener", "onUpdateFinished, not waiting for xweb");
                return;
            }
            int d17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d();
            int h17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.h();
            if (d17 > 0 || h17 <= 0 || "true".equalsIgnoreCase(com.p314xaae8f345.p3210x3857dc.b.m().f("dis_reinit_web_core"))) {
                return;
            }
            by5.c4.f("XWebBroadcastListener", "onUpdateFinished, loadedVersion:" + d17 + ", installedVersion:" + h17);
            com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.B0();
        }
    }

    @Override // zx5.a
    public void g(boolean z17) {
        by5.c4.g("XWebBroadcastListener", "onMultiProfileUpdated, package:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l() + ", process:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464());
        if (by5.a1.c()) {
            by5.c4.f("XWebMultiProfile", "onSupportMultiProfileChanged, main process ignored.");
            return;
        }
        java.lang.Boolean bool = com.p314xaae8f345.p3210x3857dc.o2.f301899a;
        if (bool == null) {
            by5.c4.f("XWebMultiProfile", "onSupportMultiProfileChanged, not finish init, will read isSupport from SP.");
            return;
        }
        if (bool.booleanValue() == z17) {
            by5.c4.f("XWebMultiProfile", "onSupportMultiProfileChanged, sIsSupportMultiProfile not changed: " + z17);
            return;
        }
        by5.c4.f("XWebMultiProfile", "onSupportMultiProfileChanged, sIsSupportMultiProfile != isSupport, isSupport:" + z17 + ", lastTrySettingName:" + com.p314xaae8f345.p3210x3857dc.o2.f301900b + ", isMultiProfileInited:" + com.p314xaae8f345.p3210x3857dc.o2.f301902d);
        if (!com.p314xaae8f345.p3210x3857dc.o2.a()) {
            by5.c4.g("XWebMultiProfile", "onSupportMultiProfileChanged, process has used old sIsSupportMultiProfile.");
            xx5.l.a(11, 1, z17);
            return;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p3210x3857dc.o2.f301899a = valueOf;
        com.p314xaae8f345.p3210x3857dc.o2.f301902d = true;
        if (!valueOf.booleanValue()) {
            if (com.p314xaae8f345.p3210x3857dc.o2.f("Default", true)) {
                return;
            }
            xx5.l.a(2, 1, com.p314xaae8f345.p3210x3857dc.o2.c());
        } else {
            java.lang.String str = com.p314xaae8f345.p3210x3857dc.o2.f301900b;
            if (str != null) {
                com.p314xaae8f345.p3210x3857dc.o2.e(str);
            }
        }
    }
}
