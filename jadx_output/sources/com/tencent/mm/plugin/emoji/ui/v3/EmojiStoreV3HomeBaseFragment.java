package com.tencent.mm.plugin.emoji.ui.v3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment;", "Lcom/tencent/mm/ui/MMFragment;", "Li22/a0;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public abstract class EmojiStoreV3HomeBaseFragment extends com.tencent.mm.ui.MMFragment implements i22.a0 {
    public static final /* synthetic */ int C = 0;
    public final com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$emotionStateChangeListener$1 A;
    public final g22.q B;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f98419n;

    /* renamed from: o, reason: collision with root package name */
    public android.app.ProgressDialog f98420o;

    /* renamed from: p, reason: collision with root package name */
    public i22.b0 f98421p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f98422q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f98423r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f98424s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f98425t;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98412d = "MicroMsg.EmojiStoreV3HomeBaseFragment";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f98413e = "product_id";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f98414f = "progress";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f98415g = "status";

    /* renamed from: h, reason: collision with root package name */
    public final int f98416h = 131075;

    /* renamed from: i, reason: collision with root package name */
    public final int f98417i = 131076;

    /* renamed from: m, reason: collision with root package name */
    public final int f98418m = 131077;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f98426u = "";

    /* renamed from: v, reason: collision with root package name */
    public boolean f98427v = true;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f98428w = jz5.h.b(g22.j.f267841d);

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f98429x = jz5.h.b(new g22.k(this));

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f98430y = new g22.r(this);

    /* renamed from: z, reason: collision with root package name */
    public final l75.q0 f98431z = new g22.s(this);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$emotionStateChangeListener$1] */
    public EmojiStoreV3HomeBaseFragment() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmotionStateChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$emotionStateChangeListener$1
            {
                this.__eventId = 449099204;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent) {
                com.tencent.mm.autogen.events.EmotionStateChangeEvent event = emotionStateChangeEvent;
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment.this;
                kotlin.jvm.internal.o.g(event, "event");
                try {
                    am.t4 t4Var = event.f54107g;
                    com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment.l0(emojiStoreV3HomeBaseFragment, t4Var.f7979a, t4Var.f7980b, t4Var.f7981c, t4Var.f7982d);
                    return false;
                } catch (java.lang.NullPointerException unused) {
                    com.tencent.mars.xlog.Log.i(emojiStoreV3HomeBaseFragment.f98412d, "emotionStateChange callback failed, event null");
                    return false;
                }
            }
        };
        this.B = new g22.q(this);
    }

    public static final void l0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment, java.lang.String str, int i17, int i18, java.lang.String str2) {
        j12.i iVar;
        r45.zj0 zj0Var;
        j12.i iVar2;
        r45.zj0 zj0Var2;
        emojiStoreV3HomeBaseFragment.getClass();
        if (i17 == 6) {
            java.lang.String str3 = str == null ? "" : str;
            android.os.Message obtain = android.os.Message.obtain();
            obtain.getData().putString(emojiStoreV3HomeBaseFragment.f98413e, str3);
            obtain.getData().putInt(emojiStoreV3HomeBaseFragment.f98414f, i18);
            obtain.what = emojiStoreV3HomeBaseFragment.f98416h;
            emojiStoreV3HomeBaseFragment.f98430y.sendMessage(obtain);
        } else {
            com.tencent.mars.xlog.Log.i(emojiStoreV3HomeBaseFragment.f98412d, "product status:%d", java.lang.Integer.valueOf(i17));
            emojiStoreV3HomeBaseFragment.t0(str == null ? "" : str, i17);
        }
        i22.s m07 = emojiStoreV3HomeBaseFragment.m0();
        if (str == null) {
            str = "";
        }
        java.lang.Integer num = (java.lang.Integer) m07.f288019i.get(str);
        java.util.ArrayList arrayList = m07.f288017g;
        java.lang.Object obj = null;
        if (num != null && num.intValue() < arrayList.size()) {
            java.lang.Object obj2 = arrayList.get(num.intValue());
            i22.m0 m0Var = obj2 instanceof i22.m0 ? (i22.m0) obj2 : null;
            if (m0Var != null && (iVar2 = m0Var.f288004a) != null && (zj0Var2 = iVar2.f297167b) != null) {
                obj = zj0Var2.f392128d;
            }
            kotlin.jvm.internal.o.b(obj, str);
            return;
        }
        com.tencent.mars.xlog.Log.i(m07.f288016f, "updateEmotionItemCdn find pos failed by productId:" + str + ", updateEmotionItemCdn ergodic");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            i22.n0 n0Var = (i22.n0) next;
            i22.m0 m0Var2 = n0Var instanceof i22.m0 ? (i22.m0) n0Var : null;
            if (kotlin.jvm.internal.o.b((m0Var2 == null || (iVar = m0Var2.f288004a) == null || (zj0Var = iVar.f297167b) == null) ? null : zj0Var.f392128d, str)) {
                obj = next;
                break;
            }
        }
        i22.n0 n0Var2 = (i22.n0) obj;
        if (n0Var2 == null || !(n0Var2 instanceof i22.m0)) {
            return;
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public int getForceOrientation() {
        return 1;
    }

    public final i22.s m0() {
        return (i22.s) ((jz5.n) this.f98428w).getValue();
    }

    public final g22.i n0() {
        return (g22.i) ((jz5.n) this.f98429x).getValue();
    }

    public abstract int o0();

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f98425t = true;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dez);
        this.f98422q = findViewById;
        boolean z17 = (findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.df9) : null) instanceof android.widget.TextView;
        this.f98423r = findViewById(com.tencent.mm.R.id.ilp);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.den);
        androidx.recyclerview.widget.RecyclerView recyclerView = findViewById2 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) findViewById2 : null;
        this.f98419n = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        }
        i22.s m07 = m0();
        m07.getClass();
        g22.q clickListener = this.B;
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        m07.f288018h = clickListener;
        m0().f288022o = g22.l.f267845d;
        m0().f288024q = g22.m.f267847d;
        m0().f288023p = new g22.n(this);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f98419n;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(m0());
        }
        n0().f267831p.observe(this, new g22.p(this));
        if (this.f98424s) {
            p0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 0) {
            if (i18 == -1) {
                com.tencent.mm.ui.widget.snackbar.j.c(i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490553yc), null, thisActivity(), null, null);
                return;
            }
            return;
        }
        i22.b0 b0Var = this.f98421p;
        if (b0Var == null) {
            com.tencent.mars.xlog.Log.i(this.f98412d, "payOrDownloadComponent have no init.");
        } else if (b0Var != null) {
            b0Var.a(i17, i18, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setRequestedOrientation(1);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        alive();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().add(this.f98431z);
        ul5.k bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setStart2EndBgColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        setHasOptionsMenu(false);
        return onCreateView;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dead();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().remove(this.f98431z);
        g22.i n07 = n0();
        n07.getClass();
        gm0.j1.n().f273288b.q(6910, n07);
        gm0.j1.n().f273288b.q(com.tencent.wxmm.v2helper.EMethodSetNgStrength, n07);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        java.util.Map map;
        super.onResume();
        g22.i n07 = n0();
        n07.getClass();
        gm0.j1.n().f273288b.a(6910, n07);
        g22.i n08 = n0();
        n08.getClass();
        gm0.j1.n().f273288b.a(com.tencent.wxmm.v2helper.EMethodSetNgStrength, n08);
        if (this.f98424s) {
            java.util.ArrayList arrayList = m0().f288017g;
            if (!arrayList.isEmpty() && (map = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ri().f97598b) != null && !((java.util.HashMap) map).isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i22.n0 n0Var = (i22.n0) it.next();
                    if (n0Var instanceof i22.m0) {
                        i22.m0 m0Var = (i22.m0) n0Var;
                        j12.i iVar = m0Var.f288004a;
                        r45.zj0 zj0Var = iVar != null ? iVar.f297167b : null;
                        if (zj0Var != null) {
                            int b17 = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ri().b(zj0Var.f392128d);
                            j12.i iVar2 = m0Var.f288004a;
                            if (iVar2 != null) {
                                if (b17 >= 0) {
                                    iVar2.c(6);
                                    iVar2.f297170e = b17;
                                }
                                if (b17 < 0 && iVar2.f297171f == 6) {
                                    iVar2.c(3);
                                }
                            }
                        }
                    }
                }
            }
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            java.lang.Object l17 = c17.l(208900, bool);
            kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
            if (((java.lang.Boolean) l17).booleanValue()) {
                com.tencent.mars.xlog.Log.i(this.f98412d, "onResume needRefreshList");
                s0(false);
                gm0.j1.u().c().w(208900, bool);
            }
            i22.s m07 = m0();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f98419n;
            m07.y(recyclerView != null ? recyclerView.getLayoutManager() : null);
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment.p0():void");
    }

    public abstract boolean q0();

    public final void r0() {
        android.view.View view = this.f98422q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f98423r;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f98419n;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setVisibility(8);
    }

    @Override // i22.a0
    public void s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        g22.i n07 = n0();
        n07.getClass();
        n07.f267825g = new z12.l(str, str2, str3, null, str5);
        g22.i n08 = n0();
        n08.getClass();
        gm0.j1.n().f273288b.g(n08.f267825g);
    }

    public final void s0(boolean z17) {
        boolean z18 = n0().f267827i;
        java.lang.String str = this.f98412d;
        if (z18) {
            com.tencent.mars.xlog.Log.i(str, "startLoadRemoteEmoji isLoading");
            return;
        }
        g22.i n07 = n0();
        n07.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "[refreshNetSceneGetStoreRecList] request buffer is null.");
        n07.f267824f = new z12.v();
        n0().a();
        com.tencent.mars.xlog.Log.i(str, "[startLoadRemoteEmoji] doScene NetSceneGetEmotionStoreRecList");
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        super.setUserVisibleHint(z17);
        this.f98424s = z17;
        if (!n0().f267826h && this.f98425t) {
            p0();
        }
        boolean z18 = this.f98424s;
        int i17 = this.f98418m;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f98430y;
        if (!z18) {
            n3Var.removeMessages(i17);
            m0().B(false);
        } else {
            n3Var.sendEmptyMessageDelayed(i17, 0L);
            i22.s m07 = m0();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f98419n;
            m07.y(recyclerView != null ? recyclerView.getLayoutManager() : null);
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        return false;
    }

    public final void t0(java.lang.String str, int i17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.getData().putString(this.f98413e, str);
        obtain.getData().putInt(this.f98415g, i17);
        obtain.what = this.f98417i;
        this.f98430y.sendMessage(obtain);
    }

    @Override // i22.a0
    public void x() {
        s0(false);
    }
}
