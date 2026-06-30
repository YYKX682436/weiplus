package il2;

/* loaded from: classes3.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.p5 f373605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il2.r f373606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(mm2.p5 p5Var, il2.r rVar) {
        super(3);
        this.f373605d = p5Var;
        this.f373606e = rVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String verifyId = (java.lang.String) obj2;
        java.lang.String url = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyId, "verifyId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        il2.r rVar = this.f373606e;
        mm2.p5 p5Var = this.f373605d;
        if (booleanValue) {
            p5Var.getClass();
            p5Var.f410884c = verifyId;
            p5Var.f410885d = url;
            kl2.q qVar = (kl2.q) ((jz5.n) rVar.f373617r).mo141623x754a37bb();
            java.lang.String id6 = p5Var.f410884c;
            java.lang.String url2 = p5Var.f410885d;
            r45.f82 f82Var = ((mm2.v5) rVar.P0(mm2.v5.class)).f411019i;
            if (f82Var == null || (str = f82Var.m75945x2fec8307(5)) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            qVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url2, "url");
            long j17 = p5Var.f410883b;
            qVar.f390340n = j17;
            qVar.f390341o = id6;
            qVar.f390342p = url2;
            qVar.w();
            il2.s.f373619a.b(zl2.e5.f555281r, j17);
            android.widget.TextView textView = qVar.f390338i;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleText");
                throw null;
            }
            textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0());
            android.widget.TextView textView2 = qVar.f390338i;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleText");
                throw null;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = qVar.f199914d;
            android.widget.TextView textView3 = qVar.f390338i;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleText");
                throw null;
            }
            textView2.setText(((ke0.e) xVar).hj(context, str2, (int) textView3.getTextSize(), 1, null));
        } else {
            zl2.j5.f555383a.e(p5Var.f410883b);
            ((mm2.v5) rVar.P0(mm2.v5.class)).f411021n.mo7808x76db6cb1(mm2.q5.f410900a);
        }
        return jz5.f0.f384359a;
    }
}
