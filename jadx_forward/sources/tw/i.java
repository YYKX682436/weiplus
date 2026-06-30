package tw;

/* loaded from: classes9.dex */
public final class i extends wm3.a implements pr1.i, pr1.h {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 f503935d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f503936e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f503937f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f503938g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f503939h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f503940i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f503941m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f503942n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f503943o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Runnable f503944p;

    /* renamed from: q, reason: collision with root package name */
    public final e31.i f503945q;

    /* renamed from: r, reason: collision with root package name */
    public final e31.g f503946r;

    /* renamed from: s, reason: collision with root package name */
    public final e31.h f503947s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f503948t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f503949u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f503939h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f503940i = "MicroMsg.BrandEcsNotifySettingUIC_SubscribeStatus_" + hashCode();
        this.f503941m = "MicroMsg.BrandEcsNotifySettingUIC_NotifySwitchInfo_" + hashCode();
        this.f503942n = "MicroMsg.BrandEcsNotifySettingUIC_GlobalNotifySwitchInfo_" + hashCode();
        this.f503943o = new java.util.LinkedHashSet();
        this.f503945q = new tw.d(this);
        this.f503946r = new tw.b(this);
        this.f503947s = new tw.c(this);
        this.f503948t = new tw.e(activity, this);
        this.f503949u = jz5.h.b(tw.g.f503933d);
    }

    public static final void T6(tw.i iVar) {
        java.util.Map map;
        java.lang.String string;
        java.util.Set set = iVar.f503943o;
        if (set.isEmpty()) {
            return;
        }
        java.util.List<java.lang.String> S0 = kz5.n0.S0(set);
        set.clear();
        java.lang.Runnable runnable = iVar.f503944p;
        if (runnable != null) {
            iVar.f503939h.mo50300x3fa464aa(runnable);
            iVar.f503944p = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "triggerBatchUpdate: updating " + S0.size() + " items");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = iVar.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd1 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
        android.widget.ListView mo48656xcc101dd9 = viewOnCreateContextMenuListenerC12986xffd38cd1.mo48656xcc101dd9();
        if (mo48656xcc101dd9 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandEcsNotifySettingUIC", "triggerBatchUpdate: listView is null");
            return;
        }
        int headerViewsCount = mo48656xcc101dd9.getHeaderViewsCount();
        int firstVisiblePosition = mo48656xcc101dd9.getFirstVisiblePosition();
        int childCount = mo48656xcc101dd9.getChildCount();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd12 = iVar.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
        fb5.m m79351xf939df19 = viewOnCreateContextMenuListenerC12986xffd38cd12.m79351xf939df19();
        if (m79351xf939df19 == null) {
            map = kz5.q0.f395534d;
        } else {
            java.util.Map linkedHashMap = new java.util.LinkedHashMap();
            int count = m79351xf939df19.getCount();
            for (int i17 = 0; i17 < count; i17++) {
                java.lang.Object item = m79351xf939df19.getItem(i17);
                fb5.n nVar = item instanceof fb5.n ? (fb5.n) item : null;
                if (nVar != null) {
                    java.lang.Object obj = nVar.f342431b;
                    r45.co coVar = obj instanceof r45.co ? (r45.co) obj : null;
                    if (coVar != null) {
                        java.lang.String userName = coVar.f453209d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "userName");
                        if (userName.length() > 0) {
                            java.lang.String userName2 = coVar.f453209d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName2, "userName");
                            linkedHashMap.put(userName2, java.lang.Integer.valueOf(i17));
                        }
                    }
                }
            }
            map = linkedHashMap;
        }
        for (java.lang.String str : S0) {
            java.lang.Integer num = (java.lang.Integer) map.get(str);
            int intValue = num != null ? num.intValue() : -1;
            if (intValue < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandEcsNotifySettingUIC", "triggerBatchUpdate: item not found");
            } else {
                int i18 = (intValue + headerViewsCount) - firstVisiblePosition;
                if (i18 >= 0 && i18 < childCount) {
                    android.view.View childAt = mo48656xcc101dd9.getChildAt(i18);
                    if (childAt == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandEcsNotifySettingUIC", "triggerBatchUpdate: view is null at visiblePosition=" + i18);
                    } else {
                        android.widget.TextView textView = (android.widget.TextView) childAt.findViewById(com.p314xaae8f345.mm.R.id.t3k);
                        if (textView == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandEcsNotifySettingUIC", "triggerBatchUpdate: detail_text not found in view");
                        } else {
                            e31.k U6 = iVar.U6();
                            if (U6 != null ? ((g31.l) U6).n(str) : false) {
                                e31.k U62 = iVar.U6();
                                int l17 = U62 != null ? ((g31.l) U62).l(str) : 0;
                                string = l17 > 0 ? iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o6c, java.lang.Integer.valueOf(l17)) : iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5p);
                            } else {
                                string = iVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573652o34);
                            }
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                            textView.setText(string);
                        }
                    }
                }
            }
        }
    }

    @Override // pr1.i
    public void S4(int i17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        boolean z17 = true;
        if (username.length() == 0) {
            username = null;
        }
        if (username != null) {
            e31.k U6 = U6();
            if (U6 != null) {
                U6.hashCode();
            }
            e31.k U62 = U6();
            if (U62 != null) {
                g31.y yVar = ((g31.l) U62).f349624d;
                yVar.getClass();
                if (username.length() == 0) {
                    return;
                }
                java.util.Map map = yVar.f349663b;
                g31.r rVar = (g31.r) ((java.util.LinkedHashMap) map).get(username);
                if (rVar == null) {
                    map.put(username, new g31.r(username, 0L, null, 0, 14, null));
                } else {
                    g31.s sVar = rVar.f349643c;
                    g31.s sVar2 = g31.s.f349648g;
                    if (sVar == sVar2 && java.lang.System.currentTimeMillis() - rVar.f349642b < 3600000) {
                        return;
                    }
                    g31.s sVar3 = rVar.f349643c;
                    if (sVar3 == sVar2) {
                        if (!(sVar3 == sVar2 && java.lang.System.currentTimeMillis() - rVar.f349642b < 3600000)) {
                            rVar.f349643c = g31.s.f349645d;
                        }
                    }
                    if (rVar.f349643c == g31.s.f349647f) {
                        if (rVar.f349644d < 3) {
                            rVar.f349643c = g31.s.f349645d;
                        }
                    }
                    z17 = false;
                }
                if (z17) {
                    if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeSwitchInfoBatchFetcher", "fetchNotifyInfoIfNeeded: network is not reachable, skip update");
                        return;
                    }
                    android.os.Handler handler = yVar.f349666e;
                    java.lang.Runnable runnable = yVar.f349667f;
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable, 250L);
                }
            }
        }
    }

    public final e31.k U6() {
        return (e31.k) ((jz5.n) this.f503949u).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tw.i.V6():void");
    }

    @Override // pr1.i
    public void X5(int i17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
    }

    @Override // pr1.i
    public void b6(int i17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (username.length() == 0) {
            return;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(username);
        e31.k U6 = U6();
        if (U6 != null) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
            U6.e(m80379x76847179, 5, username, e17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569775e03;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ndr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1) mo144222x4ff8c0f0;
        this.f503935d = viewOnCreateContextMenuListenerC12986xffd38cd1;
        viewOnCreateContextMenuListenerC12986xffd38cd1.m54323xfd4b21cd(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd12 = this.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
        viewOnCreateContextMenuListenerC12986xffd38cd12.m54324x6a3f32bf(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd13 = this.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd13 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
        viewOnCreateContextMenuListenerC12986xffd38cd13.m54322xc605daef(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd14 = this.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd14 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
        viewOnCreateContextMenuListenerC12986xffd38cd14.m54325x73721e68(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd15 = this.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
        viewOnCreateContextMenuListenerC12986xffd38cd15.m54321xa5206a69(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd16 = this.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd16 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
        viewOnCreateContextMenuListenerC12986xffd38cd16.m54320xd96da529(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd17 = this.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd17 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
        viewOnCreateContextMenuListenerC12986xffd38cd17.m54318xa7687c07(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd18 = this.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd18 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
        viewOnCreateContextMenuListenerC12986xffd38cd18.m54317x683d6267(this);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(m158354x19263085());
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd19 = this.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd19 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569774e02, (android.view.ViewGroup) viewOnCreateContextMenuListenerC12986xffd38cd19, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f503936e = (android.view.ViewGroup) inflate;
        ((h00.b) ((c00.a3) i95.n0.c(c00.a3.class))).getClass();
        bw5.i6 a17 = h00.a.f359341a.a();
        bw5.h6 h6Var = a17 != null ? a17.f110011i[2] ? a17.f110007e : new bw5.h6() : null;
        if (h6Var != null) {
            java.lang.String str = h6Var.f109625m[3] ? h6Var.f109621f : "";
            if (str != null) {
                if (!(str.length() > 0)) {
                    str = null;
                }
                if (str != null) {
                    android.view.ViewGroup viewGroup = this.f503936e;
                    if (viewGroup == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerView");
                        throw null;
                    }
                    ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.sg7)).setText(str);
                }
            }
        }
        if (h6Var != null) {
            java.lang.String str2 = h6Var.f109625m[4] ? h6Var.f109622g : "";
            if (str2 != null) {
                if (!(str2.length() > 0)) {
                    str2 = null;
                }
                if (str2 != null) {
                    android.view.ViewGroup viewGroup2 = this.f503936e;
                    if (viewGroup2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerView");
                        throw null;
                    }
                    ((android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.sg6)).setText(str2);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd110 = this.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd110 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
        android.view.ViewGroup viewGroup3 = this.f503936e;
        if (viewGroup3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerView");
            throw null;
        }
        android.widget.ListView listView = viewOnCreateContextMenuListenerC12986xffd38cd110.f175586x;
        if (listView != null) {
            listView.addHeaderView(viewGroup3);
        }
        e31.k U6 = U6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[NotifySwitchCB] initData: service=");
        sb6.append(U6);
        sb6.append(", serviceClass=");
        sb6.append(U6 != null ? U6.getClass().getName() : null);
        sb6.append(", serviceHashCode=");
        sb6.append(U6 != null ? java.lang.Integer.valueOf(U6.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsNotifySettingUIC", sb6.toString());
        if (U6 != null) {
            e31.g callback = this.f503946r;
            g31.l lVar = (g31.l) U6;
            java.lang.String key = this.f503942n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "registerGlobalNotifySwitchInfoCallback key: %s", key);
            g31.i iVar = new g31.i(callback);
            g31.c0 c0Var = lVar.f349625e;
            c0Var.getClass();
            java.util.Map map = c0Var.f349605d;
            map.put(key, new java.lang.ref.WeakReference(iVar));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubscribeSwitchInfoSyncer", "[registerGlobalCallback] key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "[NotifySwitchCB] initData: registered global callback, key=".concat(key));
            e31.h hVar = this.f503947s;
            java.lang.String str3 = this.f503941m;
            lVar.t(str3, hVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "[NotifySwitchCB] initData: registered notify switch info callback, key=".concat(str3));
            e31.i iVar2 = this.f503945q;
            java.lang.String str4 = this.f503940i;
            lVar.u(str4, iVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "[NotifySwitchCB] initData: registered subscribe status callback, key=".concat(str4));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubscribeSwitchInfoSyncer", "[fetchNotifySwitchInfo] start");
            if (c0Var.f349603b != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubscribeSwitchInfoSyncer", "[fetchNotifySwitchInfo] cancel previous task");
                l31.i iVar3 = c0Var.f349603b;
                if (iVar3 != null) {
                    iVar3.a();
                }
            }
            l31.i iVar4 = new l31.i(c0Var.f349602a, new g31.a0(c0Var));
            c0Var.f349603b = iVar4;
            iVar4.run();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandEcsNotifySettingUIC", "[NotifySwitchCB] initData: subscribeMsgService is null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.o6r);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new tw.a(this));
        }
        V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd111 = this.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd111 != null) {
            viewOnCreateContextMenuListenerC12986xffd38cd111.i();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f503939h;
        n3Var.mo50300x3fa464aa(this.f503948t);
        java.lang.Runnable runnable = this.f503944p;
        if (runnable != null) {
            n3Var.mo50300x3fa464aa(runnable);
        }
        e31.k U6 = U6();
        if (U6 != null) {
            java.lang.String key = this.f503942n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "unregisterGlobalNotifySwitchInfoCallback key: %s", key);
            g31.c0 c0Var = ((g31.l) U6).f349625e;
            c0Var.getClass();
            java.util.Map map = c0Var.f349605d;
            map.remove(key);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubscribeSwitchInfoSyncer", "[unregisterGlobalCallback] key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
        }
        e31.k U62 = U6();
        if (U62 != null) {
            ((g31.l) U62).v(this.f503941m);
        }
        e31.k U63 = U6();
        if (U63 != null) {
            ((g31.l) U63).w(this.f503940i);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.f503938g = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f503938g) {
            this.f503938g = false;
            V6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = this.f503935d;
            if (viewOnCreateContextMenuListenerC12986xffd38cd1 != null) {
                viewOnCreateContextMenuListenerC12986xffd38cd1.i();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
                throw null;
            }
        }
    }
}
