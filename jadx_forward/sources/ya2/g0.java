package ya2;

/* loaded from: classes2.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl0.g f542013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(cl0.g gVar) {
        super(0);
        this.f542013d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cl0.g gVar = this.f542013d;
        java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4(dm.i4.f66875xa013b0d5);
        java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("nickname");
        java.lang.String mo15082x48bce8a43 = gVar.mo15082x48bce8a4("headUrl");
        java.lang.String mo15082x48bce8a44 = gVar.mo15082x48bce8a4("signature");
        int optInt = gVar.optInt("profileRefScene");
        gVar.mo15082x48bce8a4("extRelationInfo");
        android.content.Intent intent = new android.content.Intent();
        ya2.b2 b2Var = new ya2.b2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
        b2Var.f69347xdec927b = mo15082x48bce8a4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a42);
        b2Var.f69328x21f9b213 = mo15082x48bce8a42;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a43);
        b2Var.f69301x81118c51 = mo15082x48bce8a43;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a44);
        b2Var.f69341xda9bc3b3 = mo15082x48bce8a44;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko koVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.f214053a;
        koVar.b(b2Var, intent);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.c(mo15082x48bce8a4, 3);
        intent.putExtra("IsPoster", true);
        intent.putExtra("Action", 1);
        intent.putExtra("hideSendMsg", true);
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if ((k17 != null ? (android.app.Activity) k17.get() : null) == null) {
            k17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
        }
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        if (activity != null) {
            intent.putExtra("SessionId", c17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            koVar.g(activity, intent, optInt);
        }
        return jz5.f0.f384359a;
    }
}
