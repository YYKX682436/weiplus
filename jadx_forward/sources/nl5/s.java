package nl5;

/* loaded from: classes15.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final nl5.s0 f419872a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.PopupWindow f419873b;

    /* renamed from: c, reason: collision with root package name */
    public int f419874c;

    /* renamed from: d, reason: collision with root package name */
    public int f419875d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f419876e;

    /* renamed from: f, reason: collision with root package name */
    public final nl5.o f419877f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f419878g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f419879h;

    public s(nl5.s0 selectableEditTextHelper, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectableEditTextHelper, "selectableEditTextHelper");
        this.f419872a = selectableEditTextHelper;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bon, (android.view.ViewGroup) null);
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f419874c = inflate.getMeasuredWidth();
        this.f419875d = inflate.getMeasuredHeight();
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -2, -2, false);
        this.f419873b = popupWindow;
        popupWindow.setClippingEnabled(false);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.m8z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        this.f419876e = c1163xf1deaba4;
        android.content.Context context2 = selectableEditTextHelper.f419889g;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context2, 0, false));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String string = context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574064gv0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        linkedList.add(new nl5.z(string, 1, 4));
        android.content.Context context3 = selectableEditTextHelper.f419889g;
        java.lang.String string2 = context3.getResources().getString(android.R.string.selectAll);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        linkedList.add(new nl5.z(string2, android.R.id.selectAll, 12));
        java.lang.String string3 = context3.getResources().getString(android.R.string.cut);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        linkedList.add(new nl5.z(string3, android.R.id.cut, 9));
        java.lang.String string4 = context3.getResources().getString(android.R.string.copy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        linkedList.add(new nl5.z(string4, android.R.id.copy, 9));
        java.lang.String string5 = context3.getResources().getString(android.R.string.paste);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
        linkedList.add(new nl5.z(string5, android.R.id.paste));
        this.f419878g = linkedList;
        nl5.o oVar = new nl5.o(linkedList, new nl5.q(this), selectableEditTextHelper.f419888f);
        this.f419877f = oVar;
        c1163xf1deaba4.mo7960x6cab2c8d(oVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(context2, 0);
        i0Var.d(new android.graphics.drawable.ColorDrawable(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560811uu)));
        c1163xf1deaba4.N(i0Var);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565539co5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f419879h = (android.widget.ImageView) findViewById2;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.s.a():void");
    }
}
