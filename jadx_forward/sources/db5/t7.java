package db5;

/* loaded from: classes5.dex */
public abstract class t7 extends android.widget.Toast {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f310051a;

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r3) {
        /*
            boolean r0 = r3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            r1 = 2131165358(0x7f0700ae, float:1.794493E38)
            if (r0 == 0) goto L19
            r0 = r3
            androidx.appcompat.app.AppCompatActivity r0 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r0
            androidx.appcompat.app.b r2 = r0.mo2533x106ab264()
            if (r2 == 0) goto L19
            androidx.appcompat.app.b r0 = r0.mo2533x106ab264()
            int r0 = r0.l()
            goto L3b
        L19:
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r2 = r0.widthPixels
            int r0 = r0.heightPixels
            if (r2 <= r0) goto L33
            android.content.res.Resources r0 = r3.getResources()
            r2 = 2131165357(0x7f0700ad, float:1.7944929E38)
            int r0 = r0.getDimensionPixelSize(r2)
            goto L3b
        L33:
            android.content.res.Resources r0 = r3.getResources()
            int r0 = r0.getDimensionPixelSize(r1)
        L3b:
            if (r0 != 0) goto L45
            android.content.res.Resources r3 = r3.getResources()
            int r0 = r3.getDimensionPixelSize(r1)
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: db5.t7.a(android.content.Context):int");
    }

    public static void b(android.content.Context context, java.lang.CharSequence charSequence) {
        if ((context instanceof android.app.Activity) && d()) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = charSequence;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c();
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.Intent.ACTION_SHOW_TOAST");
        intent.putExtra("toast_text", charSequence);
        intent.putExtra("toast_icon", com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }

    public static android.widget.Toast c(android.content.Context context, java.lang.String str) {
        android.widget.Toast makeText = android.widget.Toast.makeText(context, "", 0);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d0k, null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(str);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
        return makeText;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:5:0x0007, B:12:0x001a, B:17:0x0026, B:21:0x0032, B:23:0x0046, B:24:0x0050), top: B:4:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:5:0x0007, B:12:0x001a, B:17:0x0026, B:21:0x0032, B:23:0x0046, B:24:0x0050), top: B:4:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[Catch: Exception -> 0x0055, TRY_LEAVE, TryCatch #0 {Exception -> 0x0055, blocks: (B:5:0x0007, B:12:0x001a, B:17:0x0026, B:21:0x0032, B:23:0x0046, B:24:0x0050), top: B:4:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d() {
        /*
            java.lang.String r0 = "MicroMsg.MMToast"
            java.lang.Boolean r1 = db5.t7.f310051a
            if (r1 != 0) goto L61
            r1 = 0
            int r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h     // Catch: java.lang.Exception -> L55
            r3 = 788529167(0x2f00000f, float:1.1641553E-10)
            r4 = 1
            if (r2 == r3) goto L17
            r3 = 788529166(0x2f00000e, float:1.1641552E-10)
            if (r2 != r3) goto L15
            goto L17
        L15:
            r2 = r1
            goto L18
        L17:
            r2 = r4
        L18:
            if (r2 != 0) goto L23
            boolean r2 = z65.c.a()     // Catch: java.lang.Exception -> L55
            if (r2 == 0) goto L21
            goto L23
        L21:
            r2 = r1
            goto L24
        L23:
            r2 = r4
        L24:
            if (r2 != 0) goto L31
            int r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h     // Catch: java.lang.Exception -> L55
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v8.a(r2)     // Catch: java.lang.Exception -> L55
            if (r2 == 0) goto L2f
            goto L31
        L2f:
            r2 = r1
            goto L32
        L31:
            r2 = r4
        L32:
            j62.e r3 = j62.e.g()     // Catch: java.lang.Exception -> L55
            java.lang.String r5 = "clicfg_open_wetoast"
            java.lang.String r2 = java.lang.Integer.toString(r2)     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = r3.a(r5, r2, r1, r4)     // Catch: java.lang.Exception -> L55
            int r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r2, r4)     // Catch: java.lang.Exception -> L55
            if (r2 <= 0) goto L50
            java.lang.String r2 = "open wetoast!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Exception -> L55
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L55
            db5.t7.f310051a = r2     // Catch: java.lang.Exception -> L55
            goto L61
        L50:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L55
            db5.t7.f310051a = r2     // Catch: java.lang.Exception -> L55
            goto L61
        L55:
            r2 = move-exception
            java.lang.String r3 = "wetoast Exception"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r2, r3, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            db5.t7.f310051a = r0
        L61:
            java.lang.Boolean r0 = db5.t7.f310051a
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: db5.t7.d():boolean");
    }

    public static void e(android.content.Context context, java.lang.CharSequence charSequence, int i17) {
        if ((context instanceof android.app.Activity) && d()) {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = charSequence;
            e4Var.b(i17);
            e4Var.c();
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.Intent.ACTION_SHOW_TOAST");
        intent.putExtra("toast_text", charSequence);
        intent.putExtra("toast_icon", i17);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }

    public static void f(android.content.Context context, java.lang.String str, db5.s7 s7Var) {
        android.widget.Toast makeText = android.widget.Toast.makeText(context, "", 0);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569912rq, null);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568889oe2)).setImageResource(com.p314xaae8f345.mm.R.raw.f79723x416541f0);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(str);
        s7Var.a(inflate);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }

    public static void g(android.content.Context context, java.lang.String str) {
        if ((context instanceof android.app.Activity) && d()) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = str;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c();
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.Intent.ACTION_SHOW_TOAST");
        intent.putExtra("toast_text", str);
        intent.putExtra("toast_icon", com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }

    public static void h(android.content.Context context, java.lang.String str) {
        if (!(context instanceof android.app.Activity) || !d()) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.Intent.ACTION_SHOW_TOAST");
            intent.putExtra("toast_text", str);
            intent.putExtra("toast_icon", com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = str;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
            return;
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMToast", "showCenterSuccToastOld!! context:%s", context2);
        android.widget.Toast makeText = android.widget.Toast.makeText(context2, "", 0);
        android.view.View inflate = android.view.View.inflate(context2, com.p314xaae8f345.mm.R.C30864xbddafb2a.dig, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3);
        textView.setText(str);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new db5.n7(textView, context2));
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }

    public static void i(android.content.Context context, java.lang.String str, int i17) {
        if ((context instanceof android.app.Activity) && d()) {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = str;
            e4Var.b(i17);
            e4Var.c();
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.Intent.ACTION_SHOW_TOAST");
        intent.putExtra("toast_text", str);
        intent.putExtra("toast_icon", i17);
        intent.putExtra("toast_ignore", false);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }

    public static void j(android.content.Context context, java.lang.String str) {
        android.widget.Toast makeText = android.widget.Toast.makeText(context, "", 0);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bdg, null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(str);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }

    public static void k(android.content.Context context, android.view.View view) {
        java.lang.String str;
        if (!(context instanceof android.app.Activity) || b3.l.m9698x3fed0563((android.app.Activity) context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            if (!xo.a.f537272b) {
                return;
            }
            l(context);
            str = "Toast";
        } else {
            if (!xo.a.f537272b) {
                return;
            }
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhs);
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572088ye);
            db5.m7 m7Var = new db5.m7(context);
            new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.i(context, view, 0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(string, string2, context, m7Var, null);
            str = "SnackBar";
        }
        ap.a.a(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, "SdcardCompat", new java.lang.Throwable(), null, "showNoSdcard", str);
    }

    public static void l(android.content.Context context) {
        if (fp.m.c().equals("mounted_ro")) {
            db5.r7.a(context, 3);
        } else {
            db5.r7.a(context, 1);
        }
    }

    public static void m(android.content.Context context, java.lang.String str) {
        if ((context instanceof android.app.Activity) && d()) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = str;
            e4Var.c();
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.Intent.ACTION_SHOW_TOAST");
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        intent.putExtra("toast_text", str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }

    /* renamed from: makeText */
    public static android.widget.Toast m123882x26a183b(android.content.Context context, int i17, int i18) {
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        return dp.a.m125853x26a183b(context, i17, i18);
    }

    public static void n(android.content.Context context, java.lang.String str) {
        android.widget.Toast makeText = android.widget.Toast.makeText(context, "", 1);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d0k, null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(str);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }

    public static db5.d5 o(android.app.Activity activity, java.lang.String str, long j17) {
        android.view.View inflate = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.d1e, null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568891oe4)).setText(str);
        db5.d5 d5Var = new db5.d5(inflate);
        d5Var.setWidth(-1);
        d5Var.setHeight(-2);
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        d5Var.showAtLocation(activity.getWindow().getDecorView(), 48, 0, rect.top + a(activity));
        new db5.p7(d5Var).mo50307xb9e94560(0, j17);
        return d5Var;
    }

    public static db5.d5 p(android.app.Activity activity, int i17, java.lang.String str, long j17) {
        android.view.View inflate = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.bpw, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.i3u);
        textView.setText(str);
        textView.setOnClickListener(null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.i3t);
        if (i17 == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(i17);
        }
        db5.d5 d5Var = new db5.d5(inflate);
        d5Var.setWidth(-1);
        d5Var.setHeight(-2);
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i18 = rect.top;
        int a17 = a(activity);
        if (i18 == 0) {
            android.graphics.Rect rect2 = com.p314xaae8f345.mm.ui.bk.f279511a;
            i18 = fp.j0.a(activity, 25);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new db5.q7(d5Var, activity, i18 + a17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new db5.i7(d5Var), j17);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) inflate.findViewById(com.p314xaae8f345.mm.R.id.i3s);
        imageButton.setVisibility(8);
        imageButton.setOnClickListener(new db5.j7(d5Var));
        return d5Var;
    }

    /* renamed from: makeText */
    public static android.widget.Toast m123883x26a183b(android.content.Context context, java.lang.CharSequence charSequence, int i17) {
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        return dp.a.m125854x26a183b(context, charSequence, i17);
    }
}
