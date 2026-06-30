package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class t6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f282938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282939f;

    public t6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        this.f282939f = viewOnClickListenerC21748xb3d38e6b;
        this.f282937d = f9Var;
        this.f282938e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f361204d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282937d;
        int Bi = ((g90.u) wVar).Bi(f9Var, 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "footer menuView clicked: talker:%s, msgId:%d, deviceFileStatus: %d", f9Var.Q0(), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(Bi));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282939f;
        if (Bi == 3) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.Y6(viewOnClickListenerC21748xb3d38e6b);
            viewOnClickListenerC21748xb3d38e6b.f282184q2.u();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).bj(viewOnClickListenerC21748xb3d38e6b, f9Var, 1, 1);
        } else {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(viewOnClickListenerC21748xb3d38e6b);
            e4Var.f293309c = viewOnClickListenerC21748xb3d38e6b.getText(com.p314xaae8f345.mm.R.C30867xcad56011.obn);
            e4Var.c();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).bj(viewOnClickListenerC21748xb3d38e6b, f9Var, 1, 1);
        }
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b2 = this.f282939f;
        ((g90.s) vVar).uj(viewOnClickListenerC21748xb3d38e6b2, this.f282937d, viewOnClickListenerC21748xb3d38e6b2.T3, this.f282938e, 1);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
