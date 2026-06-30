package yt2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f546829a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f546830b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f546831c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f546832d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f546833e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f546834f;

    /* renamed from: g, reason: collision with root package name */
    public int f546835g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f546836h;

    /* renamed from: i, reason: collision with root package name */
    public long f546837i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f546838j;

    public g(android.content.Context context, android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f546829a = parent;
        this.f546830b = "FinderLiveShopCountdownWordView";
        this.f546831c = jz5.h.b(new yt2.c(context, this));
        this.f546832d = jz5.h.b(new yt2.b(this));
        this.f546833e = jz5.h.b(new yt2.a(this));
        this.f546834f = jz5.h.b(new yt2.d(this));
        this.f546838j = jz5.h.b(new yt2.f(this));
    }

    public final void a(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f546830b, "attachToParent " + i17);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), 0);
        if (parent.indexOfChild(e()) == -1) {
            if (i17 <= parent.getChildCount()) {
                parent.addView(e(), i17, layoutParams);
            } else {
                parent.addView(e(), 0, layoutParams);
            }
        }
    }

    public final void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f546830b, "detach source=" + i17);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f546838j).mo141623x754a37bb()).d();
        this.f546836h = null;
        this.f546835g = 0;
        this.f546837i = 0L;
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.view.View e17 = e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "<get-rootView>(...)");
        r4Var.Q2(e17);
    }

    public final java.lang.String c(int i17) {
        no0.l lVar = no0.m.f420263a;
        return i17 < 3600 ? no0.l.a(lVar, i17, ":", false, false, false, 24, null) : no0.l.a(lVar, i17, ":", false, false, false, 28, null);
    }

    public final android.widget.TextView d() {
        return (android.widget.TextView) ((jz5.n) this.f546833e).mo141623x754a37bb();
    }

    public final android.view.View e() {
        return (android.view.View) ((jz5.n) this.f546831c).mo141623x754a37bb();
    }

    public final int f() {
        int measuredWidth = e().getMeasuredWidth();
        if (measuredWidth > 0) {
            return measuredWidth;
        }
        jz5.g gVar = this.f546832d;
        float desiredWidth = android.text.Layout.getDesiredWidth(((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).getText().toString(), ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).getPaint());
        float desiredWidth2 = android.text.Layout.getDesiredWidth(d().getText().toString(), d().getPaint());
        jz5.g gVar2 = this.f546834f;
        return (int) (desiredWidth + desiredWidth2 + android.text.Layout.getDesiredWidth(((android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb()).getText().toString(), ((android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb()).getPaint()) + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x00d6, TryCatch #0 {all -> 0x00d6, blocks: (B:9:0x004d, B:11:0x0051, B:16:0x005d, B:19:0x006a, B:20:0x00b2, B:21:0x0073, B:22:0x00aa, B:23:0x00cf), top: B:8:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r17, r45.j90 r18, yz5.a r19) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt2.g.g(java.lang.String, r45.j90, yz5.a):void");
    }
}
