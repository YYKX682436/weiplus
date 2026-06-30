package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment;", "Lcom/tencent/mm/ui/MMFragment;", "Li22/a0;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment */
/* loaded from: classes15.dex */
public abstract class AbstractC13361x415b318 extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 implements i22.a0 {
    public static final /* synthetic */ int C = 0;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13362x99123333 A;
    public final g22.q B;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f179952n;

    /* renamed from: o, reason: collision with root package name */
    public android.app.ProgressDialog f179953o;

    /* renamed from: p, reason: collision with root package name */
    public i22.b0 f179954p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f179955q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f179956r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f179957s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f179958t;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f179945d = "MicroMsg.EmojiStoreV3HomeBaseFragment";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f179946e = "product_id";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f179947f = "progress";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f179948g = "status";

    /* renamed from: h, reason: collision with root package name */
    public final int f179949h = 131075;

    /* renamed from: i, reason: collision with root package name */
    public final int f179950i = 131076;

    /* renamed from: m, reason: collision with root package name */
    public final int f179951m = 131077;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f179959u = "";

    /* renamed from: v, reason: collision with root package name */
    public boolean f179960v = true;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f179961w = jz5.h.b(g22.j.f349374d);

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f179962x = jz5.h.b(new g22.k(this));

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f179963y = new g22.r(this);

    /* renamed from: z, reason: collision with root package name */
    public final l75.q0 f179964z = new g22.s(this);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$emotionStateChangeListener$1] */
    public AbstractC13361x415b318() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.A = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4>(a0Var) { // from class: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$emotionStateChangeListener$1
            {
                this.f39173x3fe91575 = 449099204;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 event = c5327x7bab71d4;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b318 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                try {
                    am.t4 t4Var = event.f135640g;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318.l0(abstractC13361x415b318, t4Var.f89512a, t4Var.f89513b, t4Var.f89514c, t4Var.f89515d);
                    return false;
                } catch (java.lang.NullPointerException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC13361x415b318.f179945d, "emotionStateChange callback failed, event null");
                    return false;
                }
            }
        };
        this.B = new g22.q(this);
    }

    public static final void l0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b318, java.lang.String str, int i17, int i18, java.lang.String str2) {
        j12.i iVar;
        r45.zj0 zj0Var;
        j12.i iVar2;
        r45.zj0 zj0Var2;
        abstractC13361x415b318.getClass();
        if (i17 == 6) {
            java.lang.String str3 = str == null ? "" : str;
            android.os.Message obtain = android.os.Message.obtain();
            obtain.getData().putString(abstractC13361x415b318.f179946e, str3);
            obtain.getData().putInt(abstractC13361x415b318.f179947f, i18);
            obtain.what = abstractC13361x415b318.f179949h;
            abstractC13361x415b318.f179963y.mo50308x2936bf5f(obtain);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC13361x415b318.f179945d, "product status:%d", java.lang.Integer.valueOf(i17));
            abstractC13361x415b318.t0(str == null ? "" : str, i17);
        }
        i22.s m07 = abstractC13361x415b318.m0();
        if (str == null) {
            str = "";
        }
        java.lang.Integer num = (java.lang.Integer) m07.f369552i.get(str);
        java.util.ArrayList arrayList = m07.f369550g;
        java.lang.Object obj = null;
        if (num != null && num.intValue() < arrayList.size()) {
            java.lang.Object obj2 = arrayList.get(num.intValue());
            i22.m0 m0Var = obj2 instanceof i22.m0 ? (i22.m0) obj2 : null;
            if (m0Var != null && (iVar2 = m0Var.f369537a) != null && (zj0Var2 = iVar2.f378700b) != null) {
                obj = zj0Var2.f473661d;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m07.f369549f, "updateEmotionItemCdn find pos failed by productId:" + str + ", updateEmotionItemCdn ergodic");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            i22.n0 n0Var = (i22.n0) next;
            i22.m0 m0Var2 = n0Var instanceof i22.m0 ? (i22.m0) n0Var : null;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((m0Var2 == null || (iVar = m0Var2.f369537a) == null || (zj0Var = iVar.f378700b) == null) ? null : zj0Var.f473661d, str)) {
                obj = next;
                break;
            }
        }
        i22.n0 n0Var2 = (i22.n0) obj;
        if (n0Var2 == null || !(n0Var2 instanceof i22.m0)) {
            return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getForceOrientation */
    public int mo54830x663c095b() {
        return 1;
    }

    public final i22.s m0() {
        return (i22.s) ((jz5.n) this.f179961w).mo141623x754a37bb();
    }

    public final g22.i n0() {
        return (g22.i) ((jz5.n) this.f179962x).mo141623x754a37bb();
    }

    public abstract int o0();

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        this.f179958t = true;
        android.view.View mo26077x4ff8c0f0 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.dez);
        this.f179955q = mo26077x4ff8c0f0;
        boolean z17 = (mo26077x4ff8c0f0 != null ? (android.widget.TextView) mo26077x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.df9) : null) instanceof android.widget.TextView;
        this.f179956r = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.ilp);
        android.view.View mo26077x4ff8c0f02 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.den);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = mo26077x4ff8c0f02 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo26077x4ff8c0f02 : null;
        this.f179952n = c1163xf1deaba4;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7438x76847179()));
        }
        i22.s m07 = m0();
        m07.getClass();
        g22.q clickListener = this.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickListener, "clickListener");
        m07.f369551h = clickListener;
        m0().f369555o = g22.l.f349378d;
        m0().f369557q = g22.m.f349380d;
        m0().f369556p = new g22.n(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f179952n;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7960x6cab2c8d(m0());
        }
        n0().f349364p.mo7806x9d92d11c(this, new g22.p(this));
        if (this.f179957s) {
            p0();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo7496x9d4787cb(i17, i18, intent);
        if (i17 == 0) {
            if (i18 == -1) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f572086yc), null, mo78409x676b27cd(), null, null);
                return;
            }
            return;
        }
        i22.b0 b0Var = this.f179954p;
        if (b0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f179945d, "payOrDownloadComponent have no init.");
        } else if (b0Var != null) {
            b0Var.a(i17, i18, intent);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        m78405xf1bfa104(1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        m78405xf1bfa104(1);
        mo48813x58998cd();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().add(this.f179964z);
        ul5.k m78645x9f88d943 = m78645x9f88d943();
        if (m78645x9f88d943 != null) {
            m78645x9f88d943.mo82173x2c7f5575(m7460x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(inflater, viewGroup, bundle);
        m7568x9c2f1725(false);
        return mo7503x18bad100;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        mo48814x2efc64();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().mo49775xc84af884(this.f179964z);
        g22.i n07 = n0();
        n07.getClass();
        gm0.j1.n().f354821b.q(6910, n07);
        gm0.j1.n().f354821b.q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336, n07);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDetach */
    public void mo7400x3f5eee52() {
        super.mo7400x3f5eee52();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        java.util.Map map;
        super.mo7517x57429eec();
        g22.i n07 = n0();
        n07.getClass();
        gm0.j1.n().f354821b.a(6910, n07);
        g22.i n08 = n0();
        n08.getClass();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336, n08);
        if (this.f179957s) {
            java.util.ArrayList arrayList = m0().f369550g;
            if (!arrayList.isEmpty() && (map = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ri().f179131b) != null && !((java.util.HashMap) map).isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i22.n0 n0Var = (i22.n0) it.next();
                    if (n0Var instanceof i22.m0) {
                        i22.m0 m0Var = (i22.m0) n0Var;
                        j12.i iVar = m0Var.f369537a;
                        r45.zj0 zj0Var = iVar != null ? iVar.f378700b : null;
                        if (zj0Var != null) {
                            int b17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ri().b(zj0Var.f473661d);
                            j12.i iVar2 = m0Var.f369537a;
                            if (iVar2 != null) {
                                if (b17 >= 0) {
                                    iVar2.c(6);
                                    iVar2.f378703e = b17;
                                }
                                if (b17 < 0 && iVar2.f378704f == 6) {
                                    iVar2.c(3);
                                }
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            java.lang.Object l17 = c17.l(208900, bool);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
            if (((java.lang.Boolean) l17).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f179945d, "onResume needRefreshList");
                s0(false);
                gm0.j1.u().c().w(208900, bool);
            }
            i22.s m07 = m0();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f179952n;
            m07.y(c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318.p0():void");
    }

    public abstract boolean q0();

    public final void r0() {
        android.view.View view = this.f179955q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f179956r;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f179952n;
        if (c1163xf1deaba4 == null) {
            return;
        }
        c1163xf1deaba4.setVisibility(8);
    }

    @Override // i22.a0
    public void s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        g22.i n07 = n0();
        n07.getClass();
        n07.f349358g = new z12.l(str, str2, str3, null, str5);
        g22.i n08 = n0();
        n08.getClass();
        gm0.j1.n().f354821b.g(n08.f349358g);
    }

    public final void s0(boolean z17) {
        boolean z18 = n0().f349360i;
        java.lang.String str = this.f179945d;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startLoadRemoteEmoji isLoading");
            return;
        }
        g22.i n07 = n0();
        n07.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "[refreshNetSceneGetStoreRecList] request buffer is null.");
        n07.f349357f = new z12.v();
        n0().a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startLoadRemoteEmoji] doScene NetSceneGetEmotionStoreRecList");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setUserVisibleHint */
    public void mo7583x951b248c(boolean z17) {
        super.mo7583x951b248c(z17);
        this.f179957s = z17;
        if (!n0().f349359h && this.f179958t) {
            p0();
        }
        boolean z18 = this.f179957s;
        int i17 = this.f179951m;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f179963y;
        if (!z18) {
            n3Var.mo50303x856b99f0(i17);
            m0().B(false);
        } else {
            n3Var.mo50307xb9e94560(i17, 0L);
            i22.s m07 = m0();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f179952n;
            m07.y(c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        return false;
    }

    public final void t0(java.lang.String str, int i17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.getData().putString(this.f179946e, str);
        obtain.getData().putInt(this.f179948g, i17);
        obtain.what = this.f179950i;
        this.f179963y.mo50308x2936bf5f(obtain);
    }

    @Override // i22.a0
    public void x() {
        s0(false);
    }
}
