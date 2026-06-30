package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes5.dex */
public abstract class k extends du0.g implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel f69240i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f69241m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f69241m = jz5.h.b(new com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.j(this));
    }

    public static void U6(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k kVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeSelf");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = kVar.f69240i;
        if (baseComposingPanel != null) {
            baseComposingPanel.e(z17, true);
        }
    }

    public static java.lang.Object V6(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k kVar, java.lang.String key, java.lang.Object obj, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPanelArguments");
        }
        if ((i17 & 2) != 0) {
            obj = null;
        }
        kVar.getClass();
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = kVar.f69240i;
        if (baseComposingPanel != null) {
            return baseComposingPanel.j(key, obj);
        }
        return null;
    }

    public static void i7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k kVar, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k childPanelUIC, java.util.Map map, zw0.b entrance, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m mVar, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o oVar, int i17, java.lang.Object obj) {
        zw0.d dVar;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openChildPanel");
        }
        java.util.Map map2 = (i17 & 2) != 0 ? null : map;
        if ((i17 & 4) != 0) {
            entrance = zw0.b.f476551e;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m mVar2 = (i17 & 8) != 0 ? null : mVar;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o oVar2 = (i17 & 16) != 0 ? null : oVar;
        kVar.getClass();
        kotlin.jvm.internal.o.g(childPanelUIC, "childPanelUIC");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = kVar.f69240i;
        if (baseComposingPanel == null || (dVar = baseComposingPanel.getPanelLevel()) == null) {
            dVar = zw0.d.f476561f;
        }
        kVar.h7(childPanelUIC, map2, new zw0.e(entrance, dVar), mVar2, oVar2);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public final void C1(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        a7((com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel) composingPanel);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public final void G5(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        f7((com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel) composingPanel);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public final void J(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        c7((com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel) composingPanel);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public final void R4(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        b7();
    }

    public final androidx.lifecycle.y W6() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = this.f69240i;
        return baseComposingPanel != null ? baseComposingPanel : getActivity();
    }

    public final boolean X6() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = this.f69240i;
        return baseComposingPanel != null && baseComposingPanel.isShown();
    }

    public abstract com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6();

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public final void Z(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        Z6((com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel) composingPanel);
    }

    public void Z6(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
    }

    public abstract void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel);

    public void b7() {
    }

    public void c7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
    }

    public void d7() {
    }

    public void e7() {
    }

    public void f7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
    }

    public final void g7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel childPanel) {
        kotlin.jvm.internal.o.g(childPanel, "childPanel");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = this.f69240i;
        if (baseComposingPanel != null) {
            android.view.ViewGroup viewGroup = baseComposingPanel.f69206f;
            if (viewGroup == null) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                viewGroup = null;
            }
            android.view.ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                nv0.e childPanelNavigation = baseComposingPanel.getChildPanelNavigation();
                zw0.e eVar = new zw0.e(baseComposingPanel.getEntrance(), baseComposingPanel.getPanelLevel());
                nv0.b bVar = (nv0.b) childPanelNavigation;
                bVar.getClass();
                bVar.d(childPanel, viewGroup2, eVar, null, null, null, true);
            }
        }
    }

    @Override // pf5.o, pf5.p
    public android.view.View getFindViewIdRootView() {
        return this.f69240i;
    }

    public final void h7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k childPanelUIC, java.util.Map map, zw0.e panelEntrance, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m mVar, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o oVar) {
        kotlin.jvm.internal.o.g(childPanelUIC, "childPanelUIC");
        kotlin.jvm.internal.o.g(panelEntrance, "panelEntrance");
        nv0.e eVar = (nv0.e) ((jz5.n) this.f69241m).getValue();
        if (eVar != null) {
            nv0.e.a(eVar, childPanelUIC, map, panelEntrance, mVar, oVar, false, 32, null);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public final void l3(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        e7();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = this.f69240i;
        boolean z17 = false;
        if (baseComposingPanel != null && baseComposingPanel.q()) {
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = this.f69240i;
        if (baseComposingPanel != null) {
            baseComposingPanel.f69210m.remove(this);
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel2 = this.f69240i;
        if (baseComposingPanel2 != null) {
            baseComposingPanel2.g();
        }
    }

    @Override // du0.g, com.tencent.mm.ui.component.UIComponent
    public final void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n
    public final void x2(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        d7();
    }
}
