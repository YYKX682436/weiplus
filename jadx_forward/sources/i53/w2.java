package i53;

/* loaded from: classes8.dex */
public class w2 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public i53.t f370302d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f370303e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f370304f;

    /* renamed from: g, reason: collision with root package name */
    public i53.n0 f370305g;

    /* renamed from: h, reason: collision with root package name */
    public i53.d2 f370306h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 f370307i;

    /* renamed from: m, reason: collision with root package name */
    public final int f370308m;

    /* renamed from: n, reason: collision with root package name */
    public long f370309n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f370310o;

    /* renamed from: p, reason: collision with root package name */
    public int f370311p;

    public w2(android.content.Context context, int i17) {
        super(context);
        this.f370310o = true;
        this.f370308m = i17;
        b(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDataFromNet */
    public void m134769x5e1fdd53() {
        this.f370302d.d(new i53.u2(this));
    }

    public final void b(int i17, int i18, java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8766, i17, i18, this.f370311p, lj0.a.a(6, map));
    }

    public final void c(java.util.LinkedList linkedList, boolean z17, boolean z18) {
        android.view.View view = this.f370304f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabGalleryView", "setData, data is null : %b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            android.view.View view2 = this.f370303e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b(502, 1, null);
        } else {
            android.view.View view3 = this.f370303e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i53.t.b("game_haowan_mmkv_key")).getBoolean("game_tab_gallery_first_enter", true)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i53.t.b("game_haowan_mmkv_key")).putBoolean("game_tab_gallery_first_enter", false);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new i53.v2(this), 500L);
            }
        }
        this.f370305g.g1(linkedList, z17, z18);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f370302d.a();
    }

    /* renamed from: setLocalAlbumInfos */
    public void m134770x2d938d5f(org.json.JSONArray jSONArray) {
        i53.t tVar = new i53.t();
        this.f370302d = tVar;
        i53.t.f370248p = tVar;
        tVar.h(jSONArray);
        i53.n0 n0Var = new i53.n0(getContext(), 8766, this.f370311p);
        this.f370305g = n0Var;
        n0Var.setBackgroundColor(-1);
        this.f370305g.i(new i53.m2(this));
        this.f370305g.m134760xa1aeda28(new i53.n2(this));
        i53.d2 d2Var = new i53.d2(getContext());
        this.f370306h = d2Var;
        d2Var.m74245x8e3d1bf8(true);
        this.f370306h.m74243xaa2b6691(true);
        this.f370306h.m134740x3876e65c(new i53.p2(this));
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdu, (android.view.ViewGroup) this, false);
        this.f370307i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9) inflate.findViewById(com.p314xaae8f345.mm.R.id.gof);
        this.f370306h.f(inflate, this.f370305g);
        addView(this.f370306h, -1, -1);
        android.view.View inflate2 = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdr, (android.view.ViewGroup) this, false);
        this.f370303e = inflate2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate2, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate2, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(this.f370303e, -1, -1);
        android.view.View inflate3 = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdt, (android.view.ViewGroup) this, false);
        this.f370304f = inflate3;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(inflate3, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(inflate3, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(this.f370304f, -1, -1);
        java.util.LinkedList c17 = this.f370302d.c();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c17)) {
            android.view.View view = this.f370304f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9) this.f370304f.findViewById(com.p314xaae8f345.mm.R.id.f566663gn5)).e();
        } else {
            c(c17, false, true);
            postDelayed(new i53.q2(this), 0L);
        }
        m134769x5e1fdd53();
    }
}
