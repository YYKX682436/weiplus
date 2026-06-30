package o12;

/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f423669i = {-1, -16777216, -372399, -15616, -16268960, -15683841, -10197008};

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 f423670a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f423671b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f423672c;

    /* renamed from: d, reason: collision with root package name */
    public int f423673d = kz5.z.K(f423669i);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f423674e;

    /* renamed from: f, reason: collision with root package name */
    public o12.y f423675f;

    /* renamed from: g, reason: collision with root package name */
    public o12.u f423676g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f423677h;

    public d0() {
        o12.x xVar = o12.x.f423727a;
        this.f423674e = kz5.c0.i(xVar, o12.w.f423726a, o12.v.f423725a);
        this.f423675f = xVar;
    }

    public final void a(o12.u uVar) {
        o12.y yVar;
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoEmojiTextInputViewController", "active, decoration: " + uVar);
        this.f423676g = uVar;
        if (uVar == null || (yVar = uVar.f423717b) == null) {
            yVar = o12.x.f423727a;
        }
        this.f423675f = yVar;
        this.f423673d = uVar != null ? uVar.f423718c : this.f423673d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e84 = this.f423670a;
        if (c13257xd7c65e84 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
        if (uVar == null || (str = uVar.f423716a) == null) {
            str = "";
        }
        c13257xd7c65e84.setText(str);
        o12.y yVar2 = this.f423675f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e842 = this.f423670a;
        if (c13257xd7c65e842 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
        yVar2.a(c13257xd7c65e842, this.f423673d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e843 = this.f423670a;
        if (c13257xd7c65e843 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
        c13257xd7c65e843.requestFocus();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e844 = this.f423670a;
        if (c13257xd7c65e844 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
        java.lang.Object systemService = c13257xd7c65e844.getContext().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 c13257xd7c65e845 = this.f423670a;
        if (c13257xd7c65e845 != null) {
            inputMethodManager.showSoftInput(c13257xd7c65e845, 0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editableText");
            throw null;
        }
    }

    public final void b() {
        android.widget.LinearLayout linearLayout = this.f423671b;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("colorSelector");
            throw null;
        }
        e06.k m17 = e06.p.m(0, linearLayout.getChildCount());
        android.widget.LinearLayout linearLayout2 = this.f423671b;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("colorSelector");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            arrayList.add(linearLayout2.getChildAt(((kz5.x0) it).b()));
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13259xd4e56388 c13259xd4e56388 : kz5.j0.I(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13259xd4e56388.class)) {
            c13259xd4e56388.setSelected(this.f423673d == c13259xd4e56388.getColor());
        }
    }
}
