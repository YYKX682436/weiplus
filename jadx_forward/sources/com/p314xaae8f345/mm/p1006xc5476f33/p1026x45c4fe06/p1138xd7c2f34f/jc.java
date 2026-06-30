package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0014R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/jc;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "shouldOverrideExitAnimation", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Lcom/tencent/mm/plugin/appbrand/ui/q9;", "d", "Lcom/tencent/mm/plugin/appbrand/ui/q9;", "weakNetReloadButtonContainer", "e", "Z", "closeByHomeButton", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class jc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q9 weakNetReloadButtonContainer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closeByHomeButton;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12352x4b255c79)) {
            m50420x7b736e5c(null);
            return;
        }
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUITask$handleRequest$reloadListener$1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a2;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/appbrand/launching/ShowFallbackErrorReloadUITask$handleRequest$reloadListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12352x4b255c79) abstractC11887x3610e10c2).getInitConfig();
                initConfig.f128802b2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12352x4b255c79) abstractC11887x3610e10c2).getStatObject();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc a17 = k91.h0.a(initConfig);
                java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12352x4b255c79) abstractC11887x3610e10c2).getInitConfig().f128810w;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getWxaLaunchInstanceId(...)");
                a17.M = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1(str, wg1.b.f527249i.h());
                a17.d();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.jc jcVar = this;
                m50421x3c6fed6a = jcVar.m50421x3c6fed6a();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) xVar).a(m50421x3c6fed6a, a17);
                m50421x3c6fed6a2 = jcVar.m50421x3c6fed6a();
                m50421x3c6fed6a2.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUITask$handleRequest$reloadListener$1.2
                    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                    /* renamed from: onStop */
                    public void mo7798xc39f8281(p012xc85e97e9.p093xedfae76a.y owner) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.jc.this.m50420x7b736e5c(null);
                    }
                });
                yj0.a.h(this, "com/tencent/mm/plugin/appbrand/launching/ShowFallbackErrorReloadUITask$handleRequest$reloadListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) m50421x3c6fed6a().findViewById(android.R.id.content);
        boolean z17 = true;
        com.p314xaae8f345.mm.ui.v9.c(m50421x3c6fed6a().getWindow(), !com.p314xaae8f345.mm.ui.bk.C());
        com.p314xaae8f345.mm.ui.v9.f(m50421x3c6fed6a(), b3.l.m9702x7444d5ad(m50421x3c6fed6a(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        android.view.View.inflate(m50421x3c6fed6a(), com.p314xaae8f345.mm.R.C30864xbddafb2a.dhg, viewGroup);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q9 q9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q9(onClickListener, viewGroup);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12352x4b255c79 c12352x4b255c79 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12352x4b255c79) abstractC11887x3610e10c;
        java.lang.String retryMsg = c12352x4b255c79.getRetryMsg();
        if (retryMsg != null && retryMsg.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            q9Var.f171494d = c12352x4b255c79.getRetryMsg();
            android.widget.TextView textView = (android.widget.TextView) q9Var.f171493c.mo141623x754a37bb();
            if (textView != null) {
                textView.setText(q9Var.f171494d);
            }
        }
        this.weakNetReloadButtonContainer = q9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v.f168686a.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WASERVICE);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "getActivityContext(...)");
        mi1.i iVar = (mi1.i) a17.a(m50421x3c6fed6a, mi1.i.class);
        if (iVar != null) {
            viewGroup.addView(iVar, new android.view.ViewGroup.LayoutParams(-1, m50421x3c6fed6a().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561154aw)));
            iVar.m147354x23320e34(com.p314xaae8f345.mm.ui.bk.C() ? -1 : -16777216);
            iVar.m147352x4dad334a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ic(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: onConfigurationChanged */
    public void mo50425x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo50425x50e1c15d(newConfig);
        xi1.o oVar = newConfig.orientation == 2 ? xi1.o.LANDSCAPE_SENSOR : xi1.o.PORTRAIT;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q9 q9Var = this.weakNetReloadButtonContainer;
        if (q9Var != null) {
            if (q9Var != null) {
                q9Var.a(oVar);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("weakNetReloadButtonContainer");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: shouldOverrideExitAnimation */
    public boolean mo50431x33f85ba7() {
        if (!this.closeByHomeButton) {
            return false;
        }
        m50421x3c6fed6a().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559279a7);
        return true;
    }
}
