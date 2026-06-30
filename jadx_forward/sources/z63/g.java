package z63;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public y9.i f551938a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f551939b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f551940c;

    /* renamed from: d, reason: collision with root package name */
    public int f551941d;

    /* renamed from: e, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f551942e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f551943f;

    /* renamed from: g, reason: collision with root package name */
    public z63.f f551944g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f551945h;

    public g(android.content.Context context) {
        this.f551940c = context;
        this.f551939b = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bio, null);
        y9.i iVar = new y9.i(context, 0);
        this.f551938a = iVar;
        iVar.setContentView(this.f551939b);
        this.f551938a.setOnDismissListener(new z63.c(this));
        this.f551943f = (android.widget.TextView) this.f551939b.findViewById(com.p314xaae8f345.mm.R.id.ku_);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f551939b.getLayoutParams();
        layoutParams.height = i65.a.b(context, 250);
        this.f551939b.setLayoutParams(layoutParams);
        this.f551941d = i65.a.b(context, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) this.f551939b.getParent());
        this.f551942e = A;
        if (A != null) {
            A.C(this.f551941d);
            this.f551942e.f125976p = false;
        }
        ((android.widget.Button) this.f551939b.findViewById(com.p314xaae8f345.mm.R.id.khs)).setOnClickListener(new z63.d(this));
        ((android.widget.Button) this.f551939b.findViewById(com.p314xaae8f345.mm.R.id.b5i)).setOnClickListener(new z63.e(this));
    }

    public void a() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        if (str == null || str.length() <= 0) {
            android.content.Context context = this.f551940c;
            db5.e1.L(context, false, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsf), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsf), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsg), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new z63.a(this), new z63.b(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su, com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su);
            return;
        }
        this.f551945h = str;
        this.f551943f.setText(str);
        y9.i iVar = this.f551938a;
        if (iVar != null) {
            iVar.show();
        }
    }
}
