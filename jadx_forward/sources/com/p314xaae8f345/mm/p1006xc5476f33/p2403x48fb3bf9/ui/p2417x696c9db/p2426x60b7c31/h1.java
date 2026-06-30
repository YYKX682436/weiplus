package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class h1 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266687c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266689e;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, nw4.y2 y2Var) {
        this.f266689e = c1Var;
        this.f266685a = str;
        this.f266686b = str2;
        this.f266687c = str3;
        this.f266688d = y2Var;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "imageLoaderListener onImageLoadComplete %s", str);
        nw4.y2 y2Var = this.f266688d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266689e;
        if (bitmap == null || objArr == null || objArr.length <= 0) {
            c1Var.i5(y2Var, "addToEmoticon:fail", null);
            return;
        }
        java.lang.Object obj = objArr[0];
        if (obj == null || !(obj instanceof java.lang.String)) {
            c1Var.i5(y2Var, "addToEmoticon:fail", null);
            return;
        }
        if (!str.equals(this.f266685a)) {
            c1Var.i5(y2Var, "addToEmoticon:fail", null);
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(objArr[0].toString());
        if (!r6Var.m()) {
            c1Var.i5(y2Var, "addToEmoticon:fail", null);
            return;
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r6Var.u());
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5 x5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
        java.lang.String g17 = n22.m.g();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o0) x5Var).getClass();
        com.p314xaae8f345.mm.vfs.w6.c(r6Var.o(), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(g17, "", p17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.I3(c1Var, p17, this.f266686b, this.f266687c);
    }
}
