package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class c8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f232620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e f232621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f232622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fm3.u f232623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 f232624h;

    public c8(int i17, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e c16677x5944b67e, android.view.ViewGroup viewGroup, fm3.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var) {
        this.f232620d = i17;
        this.f232621e = c16677x5944b67e;
        this.f232622f = viewGroup;
        this.f232623g = uVar;
        this.f232624h = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("song_copyright_ll onClick, position:");
        sb6.append(this.f232620d);
        sb6.append(", snapPositin:");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i iVar = this.f232621e.f232533e;
        sb6.append(iVar != null ? java.lang.Integer.valueOf(iVar.f233397m) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvSongInfoUIC", sb6.toString());
        android.view.ViewGroup viewGroup = this.f232622f;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.hf2 hf2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).f232843i;
        android.content.Context context2 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class);
        fm3.u uVar = this.f232623g;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var = this.f232624h;
        int S6 = c16668xffb9dd68.S6(hf2Var, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b8(hf2Var, uVar, viewGroup, n0Var));
        if (S6 != 7 && uVar != null) {
            fm3.j0 j0Var = fm3.j0.f345611a;
            android.content.Context context3 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            j0Var.f(context3, hf2Var, uVar, 2, S6, 2, (r27 & 64) != 0 ? 2 : 0, (r27 & 128) != 0 ? 1 : n0Var.Q6(), (r27 & 256) != 0 ? 1 : n0Var.O6(), (r27 & 512) != 0 ? "" : n0Var.P6(), (r27 & 1024) != 0 ? 2 : n0Var.E);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
