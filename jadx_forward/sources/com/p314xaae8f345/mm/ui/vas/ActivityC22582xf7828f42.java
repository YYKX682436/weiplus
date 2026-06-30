package com.p314xaae8f345.mm.ui.vas;

@db5.a(m123858x6ac9171 = 672)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/vas/VASCommonActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.ui.vas.VASCommonActivity */
/* loaded from: classes14.dex */
public class ActivityC22582xf7828f42 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292648d = "MicroMsg.VAS.VASCommonActivity@" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f292649e = jz5.h.b(new lk5.x(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f292650f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f292651g;

    public ActivityC22582xf7828f42() {
        jz5.h.b(new lk5.z(this));
        this.f292650f = jz5.h.b(new lk5.y(this));
        this.f292651g = jz5.h.b(new lk5.w(this));
    }

    public int T6() {
        return com.p314xaae8f345.mm.R.id.hys;
    }

    public final com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 U6() {
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = mo7595x9cdc264().m7675x1626d96d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7675x1626d96d, "getFragments(...)");
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : m7675x1626d96d) {
            if (componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) {
                return (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) componentCallbacksC1101xa17d4670;
            }
        }
        return null;
    }

    public final android.view.View V6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f292650f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void W6() {
        android.view.ViewGroup viewGroup = this.f39331xd9e73aa4;
        if (viewGroup == null || !(viewGroup instanceof vj5.h)) {
            return;
        }
        ((vj5.h) viewGroup).s(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 U6 = U6();
        if (!((U6 == null || (abstractActivityC22579xbed01a372 = U6.f292654p) == null) ? true : abstractActivityC22579xbed01a372.get_isFinishing())) {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 U62 = U6();
            if (U62 == null || (abstractActivityC22579xbed01a37 = U62.f292654p) == null) {
                return;
            }
            abstractActivityC22579xbed01a37.m81180x7dc9f8cb();
            return;
        }
        jz5.o oVar = null;
        if (vk5.a.f519307d) {
            jz5.o oVar2 = new jz5.o(java.lang.Integer.valueOf(vk5.a.f519304a), vk5.a.f519305b, java.lang.Integer.valueOf(vk5.a.f519306c));
            vk5.a.f519304a = 0;
            vk5.a.f519305b = null;
            vk5.a.f519306c = -1;
            vk5.a.f519307d = false;
            oVar = oVar2;
        }
        if (oVar != null) {
            setResult(((java.lang.Number) oVar.f384374d).intValue(), (android.content.Intent) oVar.f384375e);
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569461bt;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isCallSuperOnSaveInstanceState */
    public boolean mo52915xa8181dad() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: isForceFixStatusBar */
    public boolean mo53703xa622f4ad() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.util.Objects.toString(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        boolean z17;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 U6 = U6();
        boolean z18 = false;
        if (U6 != null) {
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = U6.f292654p;
            if (abstractActivityC22579xbed01a37 != null) {
                abstractActivityC22579xbed01a37.onBackPressed();
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                z18 = true;
            }
        }
        if (z18) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0017  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            java.util.Objects.toString(r8)
            r0 = 0
            r1 = 1
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L60
            r4 = 29
            if (r3 == r4) goto L13
            r4 = 28
            if (r3 != r4) goto L11
            goto L13
        L11:
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            if (r3 != 0) goto L17
            goto L6a
        L17:
            if (r8 != 0) goto L1a
            goto L25
        L1a:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> L60
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L60
            r8.setClassLoader(r3)     // Catch: java.lang.Throwable -> L60
        L25:
            if (r8 == 0) goto L6a
            java.lang.String r3 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r3 = r8.getBundle(r3)     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L6a
            java.util.Set r4 = r3.keySet()     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L6a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L60
        L39:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L60
            boolean r6 = r5 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L50
            android.os.Bundle r5 = (android.os.Bundle) r5     // Catch: java.lang.Throwable -> L60
            goto L51
        L50:
            r5 = r0
        L51:
            if (r5 != 0) goto L54
            goto L39
        L54:
            java.lang.Class r6 = r7.getClass()     // Catch: java.lang.Throwable -> L60
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Throwable -> L60
            r5.setClassLoader(r6)     // Catch: java.lang.Throwable -> L60
            goto L39
        L60:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r7.f292648d
            java.lang.String r6 = "protectSysBundleCrash err"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r5, r3, r6, r4)
        L6a:
            o25.n1.f(r7)
            super.onCreate(r8)
            r7.mo64405x4dab7448(r2)
            android.view.Window r2 = r7.getWindow()
            android.view.View r2 = r2.getDecorView()
            r3 = 1792(0x700, float:2.511E-42)
            r2.setSystemUiVisibility(r3)
            android.view.Window r2 = r7.getWindow()
            vj5.o.e(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131102543(0x7f060b4f, float:1.7817527E38)
            int r2 = r2.getColor(r3)
            r7.mo78578x8b18f126(r2)
            r7.mo78530x8b45058f()
            r7.mo78529xe76c1b79()
            androidx.appcompat.app.b r2 = r7.mo2533x106ab264()
            if (r2 == 0) goto La4
            r2.o()
        La4:
            if (r8 != 0) goto Lca
            lk5.a0 r8 = com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83.Q
            jz5.g r2 = r7.f292649e
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.mo141623x754a37bb()
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Class<com.tencent.mm.ui.vas.VASCommonFragmentForCommonActivity> r3 = com.p314xaae8f345.mm.ui.vas.C22585x4fe56300.class
            com.tencent.mm.ui.vas.VASCommonFragment r8 = r8.a(r2, r3)
            androidx.fragment.app.FragmentManager r2 = r7.mo7595x9cdc264()
            androidx.fragment.app.i2 r2 = r2.m7630xb2c12e75()
            int r3 = r7.T6()
            r2.h(r3, r8, r0, r1)
            r2.d()
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = mo7595x9cdc264().m7675x1626d96d();
        if (m7675x1626d96d.size() > 0) {
            p012xc85e97e9.p093xedfae76a.m1 m1Var = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) m7675x1626d96d.get(m7675x1626d96d.size() - 1);
            if (m1Var instanceof lk5.b) {
                com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) ((lk5.b) m1Var);
                if (!z17) {
                    c22584xf7d97e83.getClass();
                    return;
                }
                if (!(c22584xf7d97e83.mo7430x19263085() instanceof com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42)) {
                    com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = c22584xf7d97e83.f292654p;
                    if (!((abstractActivityC22579xbed01a37 == null || abstractActivityC22579xbed01a37.m81188x60276c93()) ? false : true)) {
                        return;
                    }
                }
                c22584xf7d97e83.y0();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent) {
        java.lang.String str;
        android.content.ComponentName component;
        if (!com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.m78729x75b0ecd(intent)) {
            super.startActivity(intent);
            return;
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 U6 = U6();
        if (U6 != null) {
            if (intent == null || (component = intent.getComponent()) == null || (str = component.getClassName()) == null) {
                str = "";
            }
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = U6.f292654p;
            if (abstractActivityC22579xbed01a37 != null) {
                lk5.q0.f(abstractActivityC22579xbed01a37, cls, intent, null, -1);
            }
        }
    }
}
