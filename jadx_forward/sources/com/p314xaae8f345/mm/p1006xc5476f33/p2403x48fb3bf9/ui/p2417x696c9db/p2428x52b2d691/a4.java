package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f267473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f267474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267476h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, java.lang.String str2, nw4.k kVar) {
        super(1);
        this.f267472d = str;
        this.f267473e = h0Var;
        this.f267474f = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f267475g = str2;
        this.f267476h = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7 d7Var;
        java.lang.String sourUserName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourUserName, "sourUserName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "recent forward onClick, sourUserName = ".concat(sourUserName));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5 k5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267837d;
        java.lang.String str = this.f267472d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            bitmap = null;
        } else {
            android.graphics.Bitmap j07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(str, 140, 140, i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b();
            if (m43592x7a249f0b < 0) {
                m43592x7a249f0b = 0;
            }
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(j07, m43592x7a249f0b);
        }
        android.graphics.Bitmap bitmap2 = bitmap;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267844n && (d7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7) this.f267473e.f391656d) != null) {
            d7Var.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.z3 z3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.z3(sourUserName, this.f267474f, this.f267472d, this.f267475g, this.f267476h);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f267474f;
        if (str != null) {
            jd5.a aVar = new jd5.a();
            aVar.p(str);
            n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
            n13.t tVar = new n13.t();
            tVar.f415666a = z3Var;
            tVar.f415671f.f415672a = 11;
            ((dk5.y) a0Var).wi(viewOnCreateContextMenuListenerC19337x37f3384d, aVar, sourUserName, tVar);
        } else {
            ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Ni(viewOnCreateContextMenuListenerC19337x37f3384d, sourUserName, bitmap2, viewOnCreateContextMenuListenerC19337x37f3384d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), 3, z3Var).show();
        }
        return jz5.f0.f384359a;
    }
}
