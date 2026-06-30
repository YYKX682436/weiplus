package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class k1 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266756c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266757d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, java.lang.String str2, nw4.y2 y2Var) {
        this.f266757d = c1Var;
        this.f266754a = str;
        this.f266755b = str2;
        this.f266756c = y2Var;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "imageLoaderListener onImageLoadComplete %s", str);
        nw4.y2 y2Var = this.f266756c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266757d;
        if (bitmap == null || objArr == null || objArr.length <= 0) {
            c1Var.i5(y2Var, "shareEmoticon:fail", null);
            return;
        }
        java.lang.Object obj = objArr[0];
        if (obj == null || !(obj instanceof java.lang.String)) {
            c1Var.i5(y2Var, "shareEmoticon:fail", null);
            return;
        }
        if (!str.equals(this.f266754a)) {
            c1Var.i5(y2Var, "shareEmoticon:fail", null);
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(objArr[0].toString());
        if (!r6Var.m()) {
            c1Var.i5(y2Var, "shareEmoticon:fail", null);
            return;
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r6Var.u());
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5 x5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
        java.lang.String g17 = n22.m.g();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o0) x5Var).getClass();
        com.p314xaae8f345.mm.vfs.w6.c(r6Var.o(), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(g17, "", p17));
        c1Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.l1(c1Var, p17, this.f266755b));
    }
}
