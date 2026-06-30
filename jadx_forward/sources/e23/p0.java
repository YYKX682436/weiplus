package e23;

/* loaded from: classes12.dex */
public class p0 extends u13.g {
    public static final boolean A = j62.e.g().l("clicfg_android_fts_enable_multi_msg_show_details", true, true, true);

    /* renamed from: q, reason: collision with root package name */
    public p13.y f328458q;

    /* renamed from: r, reason: collision with root package name */
    public int f328459r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f328460s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f328461t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f328462u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f328463v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.CharSequence f328464w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f328465x;

    /* renamed from: y, reason: collision with root package name */
    public final e23.o0 f328466y;

    /* renamed from: z, reason: collision with root package name */
    public final e23.n0 f328467z;

    public p0(int i17) {
        super(5, i17);
        this.f328466y = new e23.o0(this);
        this.f328467z = new e23.n0(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        e23.n0 n0Var = (e23.n0) eVar;
        this.f328460s = this.f328458q.f432720e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String d17 = o13.n.d(this.f328460s);
        float textSize = n0Var.f328443d.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f328461t = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, d17, textSize);
        java.lang.Object obj = this.f328458q.f432730o;
        if (obj instanceof java.lang.Integer) {
            this.f328459r = ((java.lang.Integer) obj).intValue();
        }
        if (!A) {
            int i17 = this.f328459r;
            if (i17 > 1) {
                this.f328462u = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.idj, java.lang.Integer.valueOf(this.f328459r));
                return;
            } else {
                if (i17 == 1) {
                    o(context);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMessageDataItem", "fts multi_msg_show_details enabled");
        o(context);
        if (this.f328459r <= 1) {
            android.view.View view = n0Var.f328441b;
            if (view != null) {
                view.setMinimumHeight(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ane));
                n0Var.f328445f.setVisibility(8);
                return;
            }
            return;
        }
        this.f328463v = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogg, java.lang.Integer.valueOf(this.f328459r));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.f328463v);
        this.f328463v = spannableStringBuilder;
        int i18 = 0;
        while (true) {
            if (i18 >= spannableStringBuilder.length()) {
                i18 = -1;
                break;
            } else if (java.lang.Character.isDigit(spannableStringBuilder.charAt(i18))) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 != -1) {
            ((android.text.SpannableStringBuilder) this.f328463v).setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m)), i18, ((int) java.lang.Math.log10(this.f328459r)) + i18 + 1, 33);
        }
        android.view.View view2 = n0Var.f328441b;
        if (view2 != null) {
            view2.setMinimumHeight(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.anb));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) n0Var.f328442c.getLayoutParams();
            marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ana);
            n0Var.f328442c.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // u13.g
    public int h() {
        return this.f328459r < 2 ? 0 : 1;
    }

    @Override // u13.g
    public int j() {
        return this.f328458q.f432733r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328466y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0352, code lost:
    
        if (r0 == null) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e23.p0.o(android.content.Context):void");
    }
}
