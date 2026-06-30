package z63;

/* loaded from: classes5.dex */
public class f1 implements z63.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f551914b;

    /* renamed from: c, reason: collision with root package name */
    public final j45.h f551915c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f551916d;

    /* renamed from: e, reason: collision with root package name */
    public db5.d5 f551917e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f551918f;

    /* renamed from: g, reason: collision with root package name */
    public final z63.e1 f551919g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f551920h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f551925m;

    /* renamed from: n, reason: collision with root package name */
    public int f551926n;

    /* renamed from: o, reason: collision with root package name */
    public int f551927o;

    /* renamed from: p, reason: collision with root package name */
    public int f551928p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f551929q;

    /* renamed from: s, reason: collision with root package name */
    public final z63.b1 f551931s;

    /* renamed from: t, reason: collision with root package name */
    public final z63.c1 f551932t;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f551934v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f551935w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f551936x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f551937y;

    /* renamed from: a, reason: collision with root package name */
    public android.animation.ValueAnimator f551913a = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f551921i = false;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f551922j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f551923k = "";

    /* renamed from: l, reason: collision with root package name */
    public y63.a f551924l = null;

    /* renamed from: r, reason: collision with root package name */
    public y63.a f551930r = null;

    /* renamed from: u, reason: collision with root package name */
    public z63.d1 f551933u = null;

    public f1(android.content.Context context, j45.h hVar, z63.e1 e1Var) {
        this.f551925m = "";
        z63.v0 v0Var = new z63.v0(this);
        this.f551936x = v0Var;
        this.f551937y = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "SuggestSolitatireTips()");
        this.f551914b = context;
        this.f551915c = hVar;
        this.f551919g = e1Var;
        this.f551931s = new z63.b1(context, v0Var, this);
        this.f551932t = new z63.c1(this, context, v0Var, this);
        this.f551925m = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsk);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cxe, null);
        this.f551916d = inflate;
        inflate.setOnClickListener(new z63.x0(this));
        db5.d5 d5Var = new db5.d5(this.f551916d, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.ac_), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.ac9), true);
        this.f551917e = d5Var;
        d5Var.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        this.f551917e.setOutsideTouchable(false);
        this.f551917e.setFocusable(false);
        this.f551917e.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f575995np);
        android.widget.TextView textView = (android.widget.TextView) this.f551916d.findViewById(com.p314xaae8f345.mm.R.id.nda);
        this.f551920h = textView;
        textView.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
        ((android.widget.TextView) this.f551916d.findViewById(com.p314xaae8f345.mm.R.id.nd8)).setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k));
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "hideTips()");
        if (this.f551917e.isShowing()) {
            this.f551917e.dismiss();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f551936x;
        n3Var.mo50302x6b17ad39(null);
        n3Var.mo50303x856b99f0(20002);
    }
}
