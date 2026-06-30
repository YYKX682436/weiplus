package r2;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.w f450245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r2.o f450246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u1.w wVar, r2.o oVar) {
        super(1);
        this.f450245d = wVar;
        this.f450246e = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g1.i drawBehind = (g1.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawBehind, "$this$drawBehind");
        e1.u a17 = ((g1.b) drawBehind.p()).a();
        u1.r1 r1Var = this.f450245d.f505222m;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = r1Var instanceof p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 ? (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) r1Var : null;
        if (c1059xa8272988 != null) {
            android.graphics.Canvas canvas = e1.c.f327762a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<this>");
            android.graphics.Canvas canvas2 = ((e1.b) a17).f327758a;
            r2.o view = this.f450246e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas2, "canvas");
            c1059xa8272988.m7028xd5058f8b().getClass();
            view.draw(canvas2);
        }
        return jz5.f0.f384359a;
    }
}
