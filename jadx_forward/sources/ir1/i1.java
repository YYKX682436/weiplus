package ir1;

/* loaded from: classes11.dex */
public final class i1 extends android.widget.RelativeLayout {
    public static final ir1.m0 R = new ir1.m0(null);
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 A;
    public final android.widget.TextView B;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C;
    public final android.widget.TextView D;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 E;
    public final android.widget.LinearLayout F;
    public final android.widget.TextView G;
    public final android.widget.TextView H;
    public final android.widget.LinearLayout I;

    /* renamed from: J, reason: collision with root package name */
    public final android.widget.TextView f375516J;
    public final android.widget.TextView K;
    public final android.view.View L;
    public final android.widget.LinearLayout M;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 N;
    public hr1.a P;
    public java.lang.Boolean Q;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f375517d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f375518e;

    /* renamed from: f, reason: collision with root package name */
    public final int f375519f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f375520g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.RelativeLayout f375521h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f375522i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 f375523m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d f375524n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f375525o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f375526p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f375527q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f375528r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f375529s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f375530t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.LinearLayout f375531u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f375532v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.LinearLayout f375533w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f375534x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.LinearLayout f375535y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f375536z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 sheet, java.lang.String currentBiz, int i17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentBiz, "currentBiz");
        this.f375517d = sheet;
        this.f375518e = currentBiz;
        this.f375519f = i17;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dzn, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f375520g = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f375521h = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u6v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f375522i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.bys);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f375523m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u6w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f375524n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vhz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f375525o = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u6x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f375526p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vhy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f375527q = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vhx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f375528r = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vhw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f375529s = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vhv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f375530t = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ulu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f375531u = (android.widget.LinearLayout) findViewById11;
        android.view.View findViewById12 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568954vi1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f375532v = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u1i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.f375533w = (android.widget.LinearLayout) findViewById13;
        android.view.View findViewById14 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568953vi0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.f375534x = (android.widget.TextView) findViewById14;
        android.view.View findViewById15 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        this.f375535y = (android.widget.LinearLayout) findViewById15;
        android.view.View findViewById16 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        this.f375536z = (android.widget.TextView) findViewById16;
        android.view.View findViewById17 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById17, "findViewById(...)");
        this.A = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById17;
        android.view.View findViewById18 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById18, "findViewById(...)");
        this.B = (android.widget.TextView) findViewById18;
        android.view.View findViewById19 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById19, "findViewById(...)");
        this.C = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById19;
        android.view.View findViewById20 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById20, "findViewById(...)");
        this.D = (android.widget.TextView) findViewById20;
        android.view.View findViewById21 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById21, "findViewById(...)");
        this.E = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById21;
        android.view.View findViewById22 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564802sf4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById22, "findViewById(...)");
        this.F = (android.widget.LinearLayout) findViewById22;
        android.view.View findViewById23 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById23, "findViewById(...)");
        this.G = (android.widget.TextView) findViewById23;
        android.view.View findViewById24 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById24, "findViewById(...)");
        this.H = (android.widget.TextView) findViewById24;
        android.view.View findViewById25 = inflate.findViewById(com.p314xaae8f345.mm.R.id.kqj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById25, "findViewById(...)");
        this.I = (android.widget.LinearLayout) findViewById25;
        android.view.View findViewById26 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById26, "findViewById(...)");
        this.f375516J = (android.widget.TextView) findViewById26;
        android.view.View findViewById27 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById27, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById27;
        android.view.View findViewById28 = inflate.findViewById(com.p314xaae8f345.mm.R.id.szp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById28, "findViewById(...)");
        this.L = findViewById28;
        android.view.View findViewById29 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u5q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById29, "findViewById(...)");
        this.M = (android.widget.LinearLayout) findViewById29;
        android.view.View findViewById30 = inflate.findViewById(com.p314xaae8f345.mm.R.id.smp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById30, "findViewById(...)");
        this.N = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById30;
    }

    /* renamed from: getFriendNameStr */
    private final java.lang.String m139726xb8af7772() {
        hr1.a aVar = this.P;
        if (aVar == null) {
            return "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        if (aVar.u0() == null) {
            return "";
        }
        hr1.a aVar2 = this.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar2);
        if (aVar2.f66210x4f9943d != 1) {
            return "";
        }
        hr1.a aVar3 = this.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar3);
        if (aVar3.f66216xf8cebfca == 5) {
            java.lang.String string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ngm);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            hr1.a aVar4 = this.P;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar4);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p5 u07 = aVar4.u0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u07);
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{u07.f300008e}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            return format;
        }
        java.lang.String string2 = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nf8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        hr1.a aVar5 = this.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar5);
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p5 u08 = aVar5.u0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u08);
        java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{u08.f300008e}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        return format2;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x15ce  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x16c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0596  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 6070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir1.i1.a():void");
    }

    public final java.lang.String b() {
        android.content.res.Resources resources;
        int i17;
        hr1.a aVar = this.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        java.lang.String str = aVar.f66205xadaa0551;
        java.lang.String str2 = "";
        if (!(str == null || str.length() == 0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            hr1.a aVar2 = this.P;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar2);
            sb6.append(aVar2.f66205xadaa0551);
            sb6.append(' ');
            str2 = sb6.toString();
        }
        hr1.a aVar3 = this.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar3);
        java.lang.String str3 = aVar3.f66214xe2e734d5;
        if (!(str3 == null || str3.length() == 0)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str2);
            hr1.a aVar4 = this.P;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar4);
            sb7.append(aVar4.f66214xe2e734d5);
            sb7.append(' ');
            str2 = sb7.toString();
        }
        hr1.a aVar5 = this.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar5);
        java.lang.String str4 = aVar5.f66204x225a3d90;
        if (!(str4 == null || str4.length() == 0)) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str2);
            hr1.a aVar6 = this.P;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar6);
            sb8.append(aVar6.f66204x225a3d90);
            sb8.append(' ');
            str2 = sb8.toString();
        }
        hr1.a aVar7 = this.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar7);
        if (aVar7.f66217x4b6e7fa1 != 0) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str2);
            hr1.a aVar8 = this.P;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar8);
            if (aVar8.f66217x4b6e7fa1 == 1) {
                resources = getResources();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.j1n;
            } else {
                resources = getResources();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.j1m;
            }
            sb9.append(resources.getString(i17));
            str2 = sb9.toString();
        }
        hr1.a aVar9 = this.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar9);
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p5 u07 = aVar9.u0();
        if (u07 == null || !u07.f300007d) {
            return str2;
        }
        if (str2.length() > 0) {
            str2 = str2 + ' ';
        }
        java.lang.String str5 = str2 + m139726xb8af7772();
        if (!(this.f375527q.getPaint().measureText(str5) > ((float) (wl5.y.n(getContext()) - es.h.a(getContext(), 148))))) {
            return str5;
        }
        this.Q = java.lang.Boolean.TRUE;
        return str2;
    }

    public final void c() {
        com.p314xaae8f345.mm.p2621x8fb0427b.u2 u2Var = com.p314xaae8f345.mm.p2621x8fb0427b.u2.f276886a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = u2Var.a();
        boolean z17 = false;
        if (a17 != null && a17.getBoolean("biz_fans_private_msg_education_shown", false)) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = u2Var.a();
        if (a18 != null) {
            a18.putBoolean("biz_fans_private_msg_education_shown", true);
        }
        this.N.post(new ir1.g1(this));
    }

    public final void d(int i17) {
        android.view.View findViewById = this.f375520g.findViewById(com.p314xaae8f345.mm.R.id.ont);
        if (findViewById == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.addRule(0, i17);
        findViewById.setLayoutParams(layoutParams2);
    }
}
