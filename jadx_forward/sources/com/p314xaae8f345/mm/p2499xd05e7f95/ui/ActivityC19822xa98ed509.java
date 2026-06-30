package com.p314xaae8f345.mm.p2499xd05e7f95.ui;

/* renamed from: com.tencent.mm.recovery.ui.RecoveryUI */
/* loaded from: classes12.dex */
public class ActivityC19822xa98ed509 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {

    /* renamed from: s, reason: collision with root package name */
    public static volatile java.lang.Thread f273725s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.Object f273726t = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f273727d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f273728e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f273729f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f273730g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f273731h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f273732i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f273733m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f273734n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f273735o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2500x32bcfcd1.C19823xc30d8063 f273736p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnClickListener f273737q = new android.view.View.OnClickListener() { // from class: c55.m$$a
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            final com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed509 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.this;
            java.lang.Thread thread = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
            activityC19822xa98ed509.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(view);
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/recovery/ui/RecoveryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC19822xa98ed509, array);
            if (android.os.Build.VERSION.SDK_INT >= 26 && !activityC19822xa98ed509.getPackageManager().canRequestPackageInstalls()) {
                new android.app.AlertDialog.Builder(activityC19822xa98ed509).setMessage(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46228xa0a25942).setPositiveButton(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46217x1598375a, new android.content.DialogInterface.OnClickListener() { // from class: c55.m$$c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                        java.lang.Thread thread2 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
                        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5092 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.this;
                        activityC19822xa98ed5092.getClass();
                        android.content.Intent intent = new android.content.Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", android.net.Uri.parse("package:" + activityC19822xa98ed5092.getPackageName()));
                        intent.addFlags(268435456);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(activityC19822xa98ed5092, arrayList2.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$0", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activityC19822xa98ed5092.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(activityC19822xa98ed5092, "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$0", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }).setNegativeButton(android.R.string.cancel, new c55.DialogInterfaceOnClickListenerC1379x321857()).create().show();
                yj0.a.h(activityC19822xa98ed509, "com/tencent/mm/recovery/ui/RecoveryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            activityC19822xa98ed509.f273733m.setVisibility(8);
            android.view.View view2 = activityC19822xa98ed509.f273734n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$8", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$8", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object obj = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273726t;
            synchronized (obj) {
                if (com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s != null) {
                    com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s.interrupt();
                }
            }
            java.lang.Thread thread2 = new java.lang.Thread(new java.lang.Runnable() { // from class: c55.m$$e
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z17;
                    final com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5092 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.this;
                    java.lang.Thread thread3 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
                    activityC19822xa98ed5092.getClass();
                    activityC19822xa98ed5092.runOnUiThread(new java.lang.Runnable() { // from class: c55.m$$f
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.Thread thread4 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
                            com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5093 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.this;
                            if (activityC19822xa98ed5093.isFinishing()) {
                                return;
                            }
                            activityC19822xa98ed5093.f273735o.setText(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46227x88389f3d);
                        }
                    });
                    try {
                        final java.io.File O6 = activityC19822xa98ed5092.O6();
                        activityC19822xa98ed5092.runOnUiThread(new java.lang.Runnable() { // from class: c55.m$$h
                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.Thread thread4 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
                                com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5093 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.this;
                                if (activityC19822xa98ed5093.isFinishing()) {
                                    return;
                                }
                                activityC19822xa98ed5093.f273735o.setText(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46238x5623ea6c);
                            }
                        });
                        try {
                            java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(O6);
                            try {
                                java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
                                while (entries.hasMoreElements()) {
                                    if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55716x82f230e.equals(entries.nextElement().getName())) {
                                        zipFile.close();
                                        z17 = true;
                                        break;
                                    }
                                }
                                zipFile.close();
                            } finally {
                            }
                        } catch (java.io.IOException unused) {
                        }
                        z17 = false;
                        if (z17) {
                            activityC19822xa98ed5092.runOnUiThread(new java.lang.Runnable() { // from class: c55.m$$j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    java.io.File file = O6;
                                    java.lang.Thread thread4 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
                                    com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5093 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.this;
                                    if (activityC19822xa98ed5093.isFinishing()) {
                                        return;
                                    }
                                    android.view.View view3 = activityC19822xa98ed5093.f273734n;
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                                    arrayList3.add(8);
                                    java.util.Collections.reverse(arrayList3);
                                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$6", "(Ljava/io/File;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                    yj0.a.f(view3, "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$6", "(Ljava/io/File;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    try {
                                        activityC19822xa98ed5093.P6(file);
                                    } catch (java.lang.Throwable unused2) {
                                        activityC19822xa98ed5093.f273730g.setText(activityC19822xa98ed5093.getResources().getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46230x3af7ab9e, activityC19822xa98ed5093.getResources().getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46214xb4f48934)));
                                        activityC19822xa98ed5093.Q6();
                                    }
                                }
                            });
                            synchronized (com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273726t) {
                                com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s = null;
                            }
                            return;
                        }
                        activityC19822xa98ed5092.runOnUiThread(new java.lang.Runnable() { // from class: c55.m$$i
                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.Thread thread4 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
                                com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5093 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.this;
                                if (activityC19822xa98ed5093.isFinishing()) {
                                    return;
                                }
                                activityC19822xa98ed5093.f273730g.setText(activityC19822xa98ed5093.getResources().getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46237x55488ee6, activityC19822xa98ed5093.getResources().getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46214xb4f48934)));
                                activityC19822xa98ed5093.Q6();
                            }
                        });
                        synchronized (com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273726t) {
                            com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s = null;
                        }
                    } finally {
                        activityC19822xa98ed5092.runOnUiThread(new java.lang.Runnable() { // from class: c55.m$$g
                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.Thread thread4 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
                                com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5093 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.this;
                                if (activityC19822xa98ed5093.isFinishing()) {
                                    return;
                                }
                                activityC19822xa98ed5093.f273730g.setText(activityC19822xa98ed5093.getResources().getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46226x51647337, activityC19822xa98ed5093.getResources().getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46214xb4f48934)));
                                activityC19822xa98ed5093.Q6();
                            }
                        });
                        java.lang.Object obj2 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273726t;
                    }
                }
            });
            synchronized (obj) {
                com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s = thread2;
            }
            thread2.start();
            yj0.a.h(activityC19822xa98ed509, "com/tencent/mm/recovery/ui/RecoveryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    };

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f273738r = new android.view.View.OnClickListener() { // from class: c55.m$$b
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Thread thread = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
            com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed509 = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.this;
            activityC19822xa98ed509.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(view);
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/recovery/ui/RecoveryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC19822xa98ed509, array);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse("https://weixin.qq.com"));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC19822xa98ed509, arrayList2.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$9", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC19822xa98ed509.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC19822xa98ed509, "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$9", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            yj0.a.h(activityC19822xa98ed509, "com/tencent/mm/recovery/ui/RecoveryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    };

    public final java.io.File O6() {
        java.io.File file = new java.io.File(getCacheDir(), "recovery");
        if (!file.exists() && !file.mkdir()) {
            throw new java.lang.RuntimeException("Create recovery dir failed");
        }
        java.io.File file2 = new java.io.File(file, "latest.apk");
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) java.net.URI.create("https://weixin.qq.com/d").toURL().openConnection();
            try {
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(300000);
                try {
                    java.io.InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                        try {
                            byte[] bArr = new byte[8192];
                            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.close();
                            inputStream.close();
                            return file2;
                        } finally {
                        }
                    } catch (java.lang.Throwable th6) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.lang.Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                } catch (java.io.IOException e17) {
                    throw new java.lang.RuntimeException(e17);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }

    public final void P6(java.io.File file) {
        android.net.Uri m7220x706c42cf = p012xc85e97e9.p075x2eaf9f.p076x38b73479.C1088x835a77ad.m7220x706c42cf(this, getPackageName() + ".external.recovery.provider", file);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.addFlags(1);
        intent.addFlags(268435456);
        intent.setDataAndType(m7220x706c42cf, "application/vnd.android.package-archive");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "installApk", "(Ljava/io/File;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/recovery/ui/RecoveryUI", "installApk", "(Ljava/io/File;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Q6() {
        android.view.View view = this.f273734n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "switchUpdateToOfficialWebsiteEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/recovery/ui/RecoveryUI", "switchUpdateToOfficialWebsiteEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f273733m.setVisibility(0);
        this.f273733m.setText(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46214xb4f48934);
        this.f273733m.setOnClickListener(this.f273738r);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e == null ? super.getResources() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.onCreate(android.os.Bundle):void");
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d55.u.b("MicroMsg.recovery.ui", "activity onDestroy, id = " + this, new java.lang.Object[0]);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        d55.u.b("MicroMsg.recovery.ui", "activity onNewIntent, id = " + this, new java.lang.Object[0]);
    }
}
