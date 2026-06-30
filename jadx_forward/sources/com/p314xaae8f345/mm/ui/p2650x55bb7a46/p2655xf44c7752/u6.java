package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class u6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f283011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f283012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f283013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f283014g;

    public u6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2, int i17) {
        this.f283014g = viewOnClickListenerC21748xb3d38e6b;
        this.f283011d = f9Var;
        this.f283012e = f9Var2;
        this.f283013f = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$54", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f361204d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f283011d;
        int Bi = ((g90.u) wVar).Bi(f9Var, 1);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f283012e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "footer menuView clicked: talker:%s, msgId:%d, deviceFileStatus: %d", f9Var2.Q0(), java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()), java.lang.Integer.valueOf(Bi));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f283014g;
        if (Bi == 3) {
            int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
            viewOnClickListenerC21748xb3d38e6b.F8();
            viewOnClickListenerC21748xb3d38e6b.f282184q2.u();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).bj(viewOnClickListenerC21748xb3d38e6b, f9Var, 1, 1);
        } else {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(viewOnClickListenerC21748xb3d38e6b);
            e4Var.f293309c = viewOnClickListenerC21748xb3d38e6b.getText(com.p314xaae8f345.mm.R.C30867xcad56011.ncy);
            e4Var.c();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).bj(viewOnClickListenerC21748xb3d38e6b, f9Var, 1, 2);
        }
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b2 = this.f283014g;
        ((g90.s) vVar).uj(viewOnClickListenerC21748xb3d38e6b2, this.f283011d, viewOnClickListenerC21748xb3d38e6b2.T3, this.f283013f, 1);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$54", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
