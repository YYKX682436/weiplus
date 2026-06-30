package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class c5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 f235797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90) {
        super(1);
        this.f235797d = c16892x4a36dc90;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list;
        int i17;
        boolean z17;
        boolean z18;
        p012xc85e97e9.p093xedfae76a.m1 m1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90;
        r45.km kmVar;
        r45.lm lmVar;
        java.util.LinkedList linkedList;
        as3.m0 type = (as3.m0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        as3.m0 m0Var = as3.m0.f95066g;
        vr3.v vVar = vr3.v.f521185a;
        gr3.b bVar = gr3.b.f356380a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc902 = this.f235797d;
        if (type == m0Var) {
            r45.wl wlVar = c16892x4a36dc902.f235744q;
            if (!((wlVar == null || (kmVar = wlVar.f470771i) == null || (lmVar = kmVar.f460348d) == null || (linkedList = lmVar.f461122g) == null || !linkedList.isEmpty()) ? false : true)) {
                if (c16892x4a36dc902.f235743p1 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "half screen menu is showing, return");
                } else {
                    r45.wl wlVar2 = c16892x4a36dc902.f235744q;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wlVar2);
                    r45.lm MenuInfo = wlVar2.f470771i.f460348d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MenuInfo, "MenuInfo");
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = c16892x4a36dc902.f235739n;
                    java.util.List b17 = qr3.c0.b(MenuInfo, z3Var != null && z3Var.r2());
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = c16892x4a36dc902.f235731d;
                    if (activityC16840x4302a3e2 instanceof android.app.Activity) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = c16892x4a36dc902.f235739n;
                        int i18 = z3Var2 != null ? z3Var2.f318119x1 : 0;
                        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e.f236248z;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activityC16840x4302a3e2);
                        android.view.Window window = activityC16840x4302a3e2.getWindow();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
                        sr3.g gVar = c16892x4a36dc902.f235736i;
                        boolean a17 = gVar.a();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileServiceInfoDrawer", "createDrawerToAttachWindow");
                        final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e c16922xfbfc713e = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e(activityC16840x4302a3e2);
                        android.graphics.Point b18 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        int i27 = b18.x;
                        int i28 = b18.y;
                        java.lang.System.nanoTime();
                        boolean z19 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        if (!z19) {
                            if (i28 >= i27) {
                                i27 = i28;
                            }
                            i28 = i27;
                        }
                        c16922xfbfc713e.m82810x46bc3006((int) (i28 * 0.25f));
                        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                        cs3.f fVar = new cs3.f(new vr3.z(activityC16840x4302a3e2, a17));
                        h0Var.f391656d = fVar;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c16922xfbfc713e.getContext(), "getContext(...)");
                        fVar.f303642g = c16922xfbfc713e;
                        c16922xfbfc713e.m82809x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.ctq);
                        c16922xfbfc713e.m82805x59f38d7d(true);
                        c16922xfbfc713e.h(fVar);
                        c16922xfbfc713e.m67730xbf0278d9((cs3.f) h0Var.f391656d);
                        window.getDecorView().post(new cs3.b(activityC16840x4302a3e2, layoutParams, window, c16922xfbfc713e, h0Var, i18));
                        activityC16840x4302a3e2.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer$Companion$createDrawerToAttachWindow$2
                            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                            /* renamed from: onDestroy */
                            public final void m67731xac79a11b() {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e.this.b();
                                ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activityC16840x4302a3e2).mo273xed6858b4().c(this);
                            }
                        });
                        c16922xfbfc713e.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l6(c16922xfbfc713e, c16892x4a36dc902));
                        c16892x4a36dc902.f235743p1 = c16922xfbfc713e;
                        android.view.View view = c16892x4a36dc902.f235752x0;
                        if (view == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                            throw null;
                        }
                        view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m6(c16892x4a36dc902, b17));
                        if (gVar.a()) {
                            c16892x4a36dc90 = c16892x4a36dc902;
                            bVar.b(0L, 0L, 800L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, c16892x4a36dc902.f235741p, (r29 & 128) != 0 ? 0 : c16892x4a36dc902.Z, (r29 & 256) != 0 ? 0 : 0);
                            vVar.a(c16892x4a36dc90.f235739n, 2, c16892x4a36dc90.f235741p, c16892x4a36dc90.f235734g, c16892x4a36dc90.d());
                        }
                    }
                }
            }
            c16892x4a36dc90 = c16892x4a36dc902;
            vVar.a(c16892x4a36dc90.f235739n, 2, c16892x4a36dc90.f235741p, c16892x4a36dc90.f235734g, c16892x4a36dc90.d());
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16916xb2db4a89 c16916xb2db4a89 = c16892x4a36dc902.C;
            if (c16916xb2db4a89 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("menuTabLayout");
                throw null;
            }
            int A = c16916xb2db4a89.A(type);
            java.util.List list2 = c16892x4a36dc902.f235755z;
            if (A < ((java.util.ArrayList) list2).size()) {
                gr3.c.f(c16892x4a36dc902.f235731d, A);
                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = c16892x4a36dc902.A;
                if (c1190x18d3c3fe == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                    throw null;
                }
                c1190x18d3c3fe.m8317x940d026a(A, false);
                vVar.a(c16892x4a36dc902.f235739n, A, c16892x4a36dc902.f235741p, c16892x4a36dc902.f235734g, c16892x4a36dc902.d());
                gr3.f.f356390a.a(c16892x4a36dc902.f235742p0, "click_tab", "tab.index", type.ordinal());
                if (c16892x4a36dc902.f235736i.a() && (m1Var = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) kz5.n0.a0(list2, A)) != null && (m1Var instanceof zy2.h5) && ((zy2.h5) m1Var).O()) {
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = c16892x4a36dc902.f235737l1;
                    if (componentCallbacksC1101xa17d4670 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, componentCallbacksC1101xa17d4670)) {
                        list = list2;
                        i17 = A;
                        z17 = false;
                        z18 = true;
                        bVar.b(0L, 0L, 702L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, c16892x4a36dc902.f235741p, (r29 & 128) != 0 ? 0 : c16892x4a36dc902.Z, (r29 & 256) != 0 ? 0 : 0);
                    } else {
                        list = list2;
                        i17 = A;
                        z17 = false;
                        z18 = true;
                        bVar.b(0L, 0L, 700L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, c16892x4a36dc902.f235741p, (r29 & 128) != 0 ? 0 : c16892x4a36dc902.Z, (r29 & 256) != 0 ? 0 : 0);
                    }
                } else {
                    list = list2;
                    i17 = A;
                    z17 = false;
                    z18 = true;
                }
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) kz5.n0.a0(list, i17);
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46703 = c16892x4a36dc902.f235737l1;
                boolean z27 = (componentCallbacksC1101xa17d46703 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(componentCallbacksC1101xa17d46702, componentCallbacksC1101xa17d46703)) ? z17 : z18;
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o oVar = c16892x4a36dc902.X;
                if (oVar != null) {
                    oVar.h(type, z27);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
