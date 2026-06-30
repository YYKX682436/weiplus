package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class rl implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f286994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ue4.z f286995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ot0.q f286996h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 f286997i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wl f286998m;

    public rl(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wl wlVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, ue4.z zVar, ot0.q qVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
        this.f286998m = wlVar;
        this.f286992d = dVar;
        this.f286993e = f9Var;
        this.f286994f = z17;
        this.f286995g = zVar;
        this.f286996h = qVar;
        this.f286997i = g0Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.lang.String str;
        ue4.z zVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (i18 == 0) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wl wlVar = this.f286998m;
        wlVar.f287484t.mo75757x2ce24761();
        wlVar.f287484t.mo75762xe81a1f0f();
        j30.n nVar = (j30.n) i95.n0.c(j30.n.class);
        yb5.d dVar = this.f286992d;
        java.util.Set wi6 = ((i30.f) nVar).wi(dVar.g());
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286993e;
        if (!wi6.contains(java.lang.String.valueOf(f9Var.m124847x74d37ac6()))) {
            boolean z17 = this.f286994f;
            ot0.q qVar = this.f286996h;
            if (z17 || (zVar = this.f286995g) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f508466b)) {
                str = null;
            } else {
                if (wlVar.d0(qVar.D0, zVar.f508468d)) {
                    yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                    return;
                }
                str = zVar.f508466b;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHardDeviceMsg", "onScroll: report iconId:%s, position:%s", str, java.lang.Integer.valueOf(this.f286997i.mo79416xf806b362()));
                jx3.f.INSTANCE.d(13168, 43, 0, java.lang.Integer.valueOf(java.lang.Integer.parseInt(qVar.f430236r0)), str);
                ((i30.f) ((j30.n) i95.n0.c(j30.n.class))).wi(dVar.g()).add(java.lang.String.valueOf(f9Var.m124847x74d37ac6()));
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
