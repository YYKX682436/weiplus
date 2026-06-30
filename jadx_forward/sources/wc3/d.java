package wc3;

/* loaded from: classes7.dex */
public final class d extends wc3.b {
    @Override // wc3.b
    /* renamed from: destroy */
    public void mo173457x5cd39ffa() {
        super.mo173457x5cd39ffa();
    }

    @Override // wc3.b, jc3.u
    public void n() {
        cl0.g gVar = new cl0.g();
        cl0.g gVar2 = new cl0.g();
        android.util.DisplayMetrics displayMetrics = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(displayMetrics, "getDisplayMetrics(...)");
        gVar2.o("width", ik1.w.e(displayMetrics.widthPixels));
        gVar2.o("height", 100);
        gVar2.o("top", 100);
        gVar2.o("left", 0);
        java.lang.String gVar3 = gVar2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
        gVar.h("msg", "api:createCanvas:".concat(gVar3));
        java.lang.String gVar4 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
        jc3.j0 j0Var = this.f526040e;
        if (j0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
            throw null;
        }
        ((rc3.w0) j0Var).k("postMessage", gVar4);
        cl0.g gVar5 = new cl0.g();
        cl0.g gVar6 = new cl0.g();
        android.util.DisplayMetrics displayMetrics2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(displayMetrics2, "getDisplayMetrics(...)");
        gVar6.o("width", ik1.w.e(displayMetrics2.widthPixels));
        gVar6.o("height", 100);
        gVar6.o("top", 250);
        gVar6.o("left", 0);
        java.lang.String gVar7 = gVar6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar7, "toString(...)");
        gVar5.h("msg", "api:createCanvas:".concat(gVar7));
        java.lang.String gVar8 = gVar5.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar8, "toString(...)");
        jc3.j0 j0Var2 = this.f526040e;
        if (j0Var2 != null) {
            ((rc3.w0) j0Var2).k("postMessage", gVar8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
            throw null;
        }
    }
}
