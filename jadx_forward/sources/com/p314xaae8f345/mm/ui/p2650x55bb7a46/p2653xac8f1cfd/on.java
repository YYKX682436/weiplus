package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class on extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho f281186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar) {
        super(0);
        this.f281186d = hoVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar = this.f281186d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(hoVar.f280113d.g(), 0, 2, true);
        z2Var.q(hoVar.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6i));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(hoVar.f280113d.g());
        linearLayout.setOrientation(1);
        linearLayout.addView((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) hoVar.f280717n).mo141623x754a37bb());
        jz5.g gVar = hoVar.f280718o;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        linearLayout.addView((android.view.View) mo141623x754a37bb);
        z2Var.k(linearLayout, 0, 0);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.view.View) mo141623x754a37bb2).setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rn(hoVar));
        z2Var.f293596o = true;
        return z2Var;
    }
}
