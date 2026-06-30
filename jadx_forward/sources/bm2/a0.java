package bm2;

/* loaded from: classes3.dex */
public final class a0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f103280d;

    /* renamed from: e, reason: collision with root package name */
    public final sf2.e0 f103281e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f103282f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f103283g;

    /* renamed from: h, reason: collision with root package name */
    public final int f103284h;

    public a0(android.content.Context context, sf2.e0 controller, r45.xg7 xg7Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f103280d = context;
        this.f103281e = controller;
        this.f103282f = new java.util.ArrayList();
        this.f103283g = new java.util.ArrayList();
        this.f103284h = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su);
    }

    public static final java.lang.String x(bm2.a0 a0Var, java.lang.String str) {
        a0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        for (int indexOf = sb6.indexOf("<em>"); indexOf >= 0; indexOf = sb6.indexOf("<em>")) {
            sb6.delete(indexOf, indexOf + 4);
            int indexOf2 = sb6.indexOf("</em>");
            if (indexOf2 < 0) {
                break;
            }
            sb6.delete(indexOf2, indexOf2 + 5);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void B(java.util.List suggests, boolean z17) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suggests, "suggests");
        java.util.List list = this.f103282f;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else {
                if (((bm2.w) listIterator.previous()).f103926a == bm2.v.f103892e) {
                    i17 = listIterator.nextIndex();
                    break;
                }
            }
        }
        ((java.util.ArrayList) list).clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(suggests, 10));
        java.util.Iterator it = suggests.iterator();
        while (it.hasNext()) {
            arrayList2.add(new bm2.w(bm2.v.f103891d, (dk2.vg) it.next()));
        }
        ((java.util.ArrayList) list).addAll(arrayList2);
        if ((!suggests.isEmpty()) && z17) {
            ((java.util.ArrayList) list).add(new bm2.w(bm2.v.f103892e, null));
        } else if (i17 != -1) {
            m8155x27702c4(i17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f103282f).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((bm2.w) ((java.util.ArrayList) this.f103282f).get(i17)).f103926a.ordinal();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.List list = this.f103282f;
        if (((bm2.w) ((java.util.ArrayList) list).get(i17)).f103926a != bm2.v.f103891d) {
            return;
        }
        bm2.x xVar = (bm2.x) holder;
        dk2.vg vgVar = ((bm2.w) ((java.util.ArrayList) list).get(i17)).f103927b;
        if (vgVar == null) {
            return;
        }
        r45.d22 d22Var = vgVar.f315787a;
        java.lang.String m75945x2fec8307 = d22Var.m75945x2fec8307(2);
        java.lang.CharSequence string = xVar.f3639x46306858.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4r, m75945x2fec8307, no0.m.f420263a.b(d22Var.m75939xb282bd08(12), ":"));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String m75945x2fec83072 = d22Var.m75945x2fec8307(1);
        android.widget.TextView textView = xVar.f103953d;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, m75945x2fec83072, textSize);
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            float textSize2 = textView.getTextSize();
            ((ke0.e) xVar3).getClass();
            string = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, string, textSize2);
        }
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
        mn2.q3 q3Var = new mn2.q3(d22Var.m75945x2fec8307(4), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        yo0.f fVar = new yo0.f();
        fVar.f545616g = com.p314xaae8f345.mm.R.C30861xcebc809e.co_;
        wo0.c b17 = d1Var.b(q3Var, fVar.a());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = xVar.f103955f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22628xfde5d61d, "<get-musicCover>(...)");
        ((wo0.b) b17).b(c22628xfde5d61d, true);
        java.lang.String spannableString = j17.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spannableString, "toString(...)");
        z(textView, spannableString);
        android.widget.TextView textView2 = xVar.f103954e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView2, "<get-musicDuration>(...)");
        z(textView2, string.toString());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = xVar.f103956g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb352, "<get-musicFavTips>(...)");
        y(c22699x3dcdb352, vgVar.f315789c == 51);
        c22699x3dcdb352.setOnClickListener(new bm2.z(this, xVar, vgVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        bm2.v vVar = bm2.v.f103891d;
        android.content.Context context = this.f103280d;
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.amm, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new bm2.x(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ami, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new bm2.u(this, inflate2);
    }

    public final void y(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, boolean z17) {
        if (z17) {
            rr.v.a(c22699x3dcdb352, com.p314xaae8f345.mm.R.raw.f79549xbd3cab98, c22699x3dcdb352.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
        } else {
            rr.v.a(c22699x3dcdb352, com.p314xaae8f345.mm.R.raw.f79548x7538e904, c22699x3dcdb352.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        }
    }

    public final void z(android.widget.TextView textView, java.lang.String str) {
        if (!(str.length() > 0)) {
            textView.setVisibility(8);
            return;
        }
        java.util.List list = this.f103283g;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        bm2.y yVar = new bm2.y(0, 0, 3, null);
        for (int indexOf = sb6.indexOf("<em>"); indexOf >= 0; indexOf = sb6.indexOf("<em>")) {
            yVar.f103971a = indexOf;
            sb6.delete(indexOf, indexOf + 4);
            int indexOf2 = sb6.indexOf("</em>");
            if (indexOf2 < 0) {
                break;
            }
            yVar.f103972b = indexOf2;
            sb6.delete(indexOf2, indexOf2 + 5);
            arrayList.add(yVar);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(sb7);
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            bm2.y yVar2 = (bm2.y) it.next();
            int i17 = yVar2.f103971a;
            int i18 = yVar2.f103972b;
            if (i17 < i18) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.f103284h), i17, i18, 33);
            }
        }
        textView.setText(spannableString);
        textView.setVisibility(0);
    }
}
