package com.p314xaae8f345.mm.ui.p2635x2dc211;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo4;", "Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo2;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo4 */
/* loaded from: classes11.dex */
public final class ActivityC21450x7ea88d4 extends com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2 {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f278696n = jz5.h.b(new na5.c0(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f278697o = jz5.h.b(new na5.y(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f278698p = jz5.h.b(new na5.z(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f278699q = jz5.h.b(new na5.a0(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f278700r = jz5.h.b(new na5.b0(this));

    @Override // com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2
    public void W6(java.util.List dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        ((android.widget.ImageView) ((jz5.n) this.f278697o).mo141623x754a37bb()).setImageResource(((java.lang.Number) dataList.get(0)).intValue());
        ((android.widget.ImageView) ((jz5.n) this.f278698p).mo141623x754a37bb()).setImageResource(((java.lang.Number) dataList.get(1)).intValue());
        ((android.widget.ImageView) ((jz5.n) this.f278699q).mo141623x754a37bb()).setImageResource(((java.lang.Number) dataList.get(2)).intValue());
        ((android.widget.ImageView) ((jz5.n) this.f278700r).mo141623x754a37bb()).setImageResource(((java.lang.Number) dataList.get(3)).intValue());
    }

    @Override // com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2
    public void X6(int i17) {
        java.util.List U6 = U6(i17);
        W6(U6);
        com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2.f278686m = U6;
    }

    @Override // com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bpg;
    }

    @Override // com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("SharedElementDemo4");
        X6(4);
        ((android.widget.LinearLayout) ((jz5.n) this.f278696n).mo141623x754a37bb()).setOnClickListener(new na5.d0(this));
    }
}
