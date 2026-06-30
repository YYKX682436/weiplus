package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class l1 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 f268906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f268907b;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var, float f17) {
        this.f268906a = m1Var;
        this.f268907b = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var = this.f268906a.f268930s;
        if ((n1Var.f268968r == 1) && n1Var.f268959i == 1) {
            outline.setRoundRect(0, 0, (int) (view.getWidth() + this.f268907b), view.getHeight(), this.f268907b);
            return;
        }
        int width = view.getWidth();
        float height = view.getHeight();
        float f17 = this.f268907b;
        outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
    }
}
