package qn2;

/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final qn2.i0 f446695a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f446696b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f446697c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f446698d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f446699e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f446700f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f446701g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f446702h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f446703i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f446704j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f446705k;

    /* renamed from: l, reason: collision with root package name */
    public qn2.c0 f446706l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f446707m;

    public u1(qn2.i0 visitorCardPlugin, android.view.ViewGroup doneWinnerListContainer, android.view.View cardContainer, android.view.View card) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitorCardPlugin, "visitorCardPlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doneWinnerListContainer, "doneWinnerListContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardContainer, "cardContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(card, "card");
        this.f446695a = visitorCardPlugin;
        this.f446696b = doneWinnerListContainer;
        this.f446697c = cardContainer;
        this.f446698d = card;
        this.f446699e = "VisitorLotteryCardDoneWidget";
    }

    public final void a(r45.ht1 ht1Var) {
        r45.jz1 jz1Var;
        java.util.LinkedList linkedList = null;
        r45.cz1 cz1Var = ht1Var != null ? (r45.cz1) ht1Var.m75936x14adae67(1) : null;
        android.widget.TextView textView = this.f446701g;
        android.view.ViewGroup viewGroup = this.f446696b;
        if (textView != null) {
            java.lang.String string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = cz1Var != null ? java.lang.Integer.valueOf(cz1Var.m75939xb282bd08(10)) : null;
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            textView.setText(format);
        }
        android.widget.TextView textView2 = this.f446702h;
        if (textView2 != null) {
            java.lang.String string2 = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573172dr4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = cz1Var != null ? java.lang.Integer.valueOf(cz1Var.m75939xb282bd08(7)) : null;
            java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(objArr2, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            textView2.setText(format2);
        }
        qn2.c0 c0Var = this.f446706l;
        if (c0Var != null) {
            if (ht1Var != null && (jz1Var = (r45.jz1) ht1Var.m75936x14adae67(4)) != null) {
                linkedList = jz1Var.m75941xfb821914(0);
            }
            c0Var.y(linkedList, cz1Var);
        }
        qn2.c0 c0Var2 = this.f446706l;
        if (c0Var2 != null) {
            c0Var2.m8146xced61ae5();
        }
    }
}
