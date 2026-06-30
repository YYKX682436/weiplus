package tm;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f501931a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f501932b;

    /* renamed from: c, reason: collision with root package name */
    public int f501933c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f501934d;

    /* renamed from: e, reason: collision with root package name */
    public int f501935e;

    /* renamed from: f, reason: collision with root package name */
    public int f501936f = -100;

    /* renamed from: g, reason: collision with root package name */
    public tm.j f501937g;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ed, code lost:
    
        if (tm.j.a(r0.f501971c) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x011a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tm.a b(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.a.b(java.lang.String):tm.a");
    }

    public final void a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        if (!gm0.j1.a()) {
            intent.putExtra("neverGetA8Key", true);
        }
        int i17 = this.f501936f;
        if (i17 != -100) {
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public boolean c(android.content.Context context, final android.content.DialogInterface.OnClickListener onClickListener, final android.content.DialogInterface.OnClickListener onClickListener2) {
        if (this.f501933c == 8 && this.f501935e == 7 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f501931a)) {
            cm5.c.f124959a.a(context, this.f501931a);
            return true;
        }
        if (this.f501933c == 8 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f501931a)) {
            a(context, this.f501931a);
            return true;
        }
        int i17 = this.f501933c;
        if (i17 != 3 && i17 != 4) {
            if (i17 != 1) {
                if (i17 == 5) {
                    db5.e1.s(context, this.f501932b, this.f501934d);
                    return true;
                }
                if (i17 != 10) {
                    return false;
                }
                db5.t7.g(context, this.f501932b);
                return true;
            }
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.u(this.f501934d);
            u1Var.g(this.f501932b);
            u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
            u1Var.l(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: tm.a$$d
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
                public final void a(boolean z17, java.lang.String str) {
                    android.content.DialogInterface.OnClickListener onClickListener3 = onClickListener;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(u1Var.f293531c, -1);
                    }
                }
            });
            u1Var.a(true);
            u1Var.q(false);
            return true;
        }
        tm.j jVar = this.f501937g;
        java.lang.String str = jVar.f501974f;
        java.lang.String str2 = jVar.f501975g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str = context.getString(this.f501933c == 3 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu : com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
            str2 = context.getString(this.f501933c == 3 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx : com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            final boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var2.u(this.f501934d);
            u1Var2.g(this.f501932b);
            if (!K0) {
                str2 = str;
            }
            u1Var2.n(str2);
            u1Var2.l(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: tm.a$$a
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
                public final void a(boolean z17, java.lang.String str3) {
                    boolean z18 = K0;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var3 = u1Var2;
                    if (z18) {
                        android.content.DialogInterface.OnClickListener onClickListener3 = onClickListener;
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(u1Var3.f293531c, -1);
                            return;
                        }
                        return;
                    }
                    android.content.DialogInterface.OnClickListener onClickListener4 = onClickListener2;
                    if (onClickListener4 != null) {
                        onClickListener4.onClick(u1Var3.f293531c, -2);
                    }
                }
            });
            u1Var2.q(false);
            return true;
        }
        int i18 = this.f501937g.f501972d;
        if (i18 == 1) {
            java.lang.String str3 = this.f501934d;
            java.lang.String str4 = this.f501932b;
            tm.b bVar = new tm.b(this, onClickListener, context, onClickListener2);
            if (context == null) {
                return true;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            if (str3 == null) {
                str3 = "";
            }
            u1Var3.u(str3);
            if (str4 == null) {
                str4 = "";
            }
            u1Var3.g(str4);
            if (str == null) {
                str = "";
            }
            u1Var3.n(str);
            u1Var3.a(true);
            u1Var3.f293529a.f293354b.G = null;
            u1Var3.b(bVar);
            u1Var3.q(false);
            return true;
        }
        if (i18 != 7) {
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var4 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var4.u(this.f501934d);
            u1Var4.g(this.f501932b);
            u1Var4.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
            u1Var4.l(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: tm.a$$b
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
                public final void a(boolean z17, java.lang.String str5) {
                    android.content.DialogInterface.OnClickListener onClickListener3 = onClickListener;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(u1Var4.f293531c, -1);
                    }
                }
            });
            u1Var4.j(str2);
            u1Var4.i(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: tm.a$$c
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
                public final void a(boolean z17, java.lang.String str5) {
                    android.content.DialogInterface.OnClickListener onClickListener3 = onClickListener2;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(u1Var4.f293531c, -2);
                    }
                }
            });
            u1Var4.a(true);
            u1Var4.q(false);
            return true;
        }
        java.lang.String str5 = this.f501934d;
        java.lang.String str6 = this.f501932b;
        tm.c cVar = new tm.c(this, onClickListener, context, onClickListener2);
        if (context == null) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var5 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        if (str5 == null) {
            str5 = "";
        }
        u1Var5.u(str5);
        if (str6 == null) {
            str6 = "";
        }
        u1Var5.g(str6);
        if (str == null) {
            str = "";
        }
        u1Var5.n(str);
        if (str2 == null) {
            str2 = "";
        }
        u1Var5.j(str2);
        u1Var5.a(true);
        u1Var5.f293529a.f293354b.G = null;
        u1Var5.b(cVar);
        u1Var5.q(false);
        return true;
    }

    public boolean d(android.content.Context context, android.content.DialogInterface.OnDismissListener onDismissListener) {
        java.lang.String str = this.f501932b;
        java.lang.String str2 = this.f501934d;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = str2;
        aVar.f293262s = str;
        aVar.H = onDismissListener;
        aVar.A = false;
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        aVar.E = new db5.p0();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        db5.e1.a(context, j0Var);
        return true;
    }
}
