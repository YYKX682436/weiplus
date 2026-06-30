package com.p314xaae8f345.mm.ui.p2635x2dc211;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo2;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo2 */
/* loaded from: classes5.dex */
public class ActivityC21448x7ea88d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: m, reason: collision with root package name */
    public static java.util.List f278686m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f278687d = kz5.c0.i(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81176x4d7ce47), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81177x5581ac48), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81178xa62b8a49), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81179xf6d5684a), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81180x477f464b), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81181x9829244c), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81182xe8d3024d), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81183x397ce04e), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81184x8a26be4f), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81173xe2c84239), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81174x3372203a), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81175x841bfe3b));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f278688e = jz5.h.b(new na5.t(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f278689f = jz5.h.b(new na5.s(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f278690g = jz5.h.b(new na5.m(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f278691h = jz5.h.b(new na5.l(this));

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f278692i = new java.util.LinkedList();

    public final java.util.List U6(int i17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i18 = 0; i18 < i17; i18++) {
            c06.d dVar = c06.e.f119249d;
            java.util.List list = this.f278687d;
            linkedList.add(list.get(dVar.d(list.size())));
        }
        return linkedList;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 V6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f278688e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }

    public void W6(java.util.List dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        int i17 = dataList.size() > 1 ? dataList.size() <= 4 ? 2 : 3 : 1;
        java.util.LinkedList linkedList = this.f278692i;
        linkedList.clear();
        V6().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(this, i17));
        V6().mo7960x6cab2c8d(new na5.f(dataList, 9, linkedList));
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh);
        if (V6().m7950x883dc776() > 0) {
            V6().T0(0);
        }
        V6().N(new na5.r(dimensionPixelSize));
    }

    public void X6(int i17) {
        java.util.List U6 = U6(i17);
        W6(U6);
        ((android.widget.EditText) ((jz5.n) this.f278690g).mo141623x754a37bb()).setText(java.lang.String.valueOf(i17));
        f278686m = U6;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void finishAfterTransition() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bpe;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        jz5.g gVar = this.f278689f;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb).mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(this, 8));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 1; i17 < 30; i17++) {
            linkedList.add(java.lang.Integer.valueOf(i17));
        }
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb2).mo7960x6cab2c8d(new na5.g(linkedList, new na5.q(this)));
        ((android.widget.Button) ((jz5.n) this.f278691h).mo141623x754a37bb()).setOnClickListener(new na5.n(this));
        X6(9);
        V6().setOnTouchListener(na5.o.f417548d);
        V6().setOnClickListener(new na5.p(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }
}
