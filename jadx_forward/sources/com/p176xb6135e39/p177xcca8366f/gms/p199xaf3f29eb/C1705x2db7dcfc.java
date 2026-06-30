package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zad.class, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: com.google.android.gms.common.GoogleApiAvailability */
/* loaded from: classes13.dex */
public class C1705x2db7dcfc extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a {

    /* renamed from: GOOGLE_PLAY_SERVICES_PACKAGE */
    public static final java.lang.String f5824x1100896a = "com.google.android.gms";
    private java.lang.String zac;
    private static final java.lang.Object zaa = new java.lang.Object();
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc zab = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc();

    /* renamed from: GOOGLE_PLAY_SERVICES_VERSION_CODE */
    public static final int f5825x7aedca50 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.f5827x7aedca50;

    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc m17618x9cf0d20b() {
        return zab;
    }

    public static final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zai(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1749x484400ff interfaceC1749x484400ff, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1749x484400ff... interfaceC1749x484400ffArr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(interfaceC1749x484400ff, "Requested API must not be null.");
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1749x484400ff interfaceC1749x484400ff2 : interfaceC1749x484400ffArr) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(interfaceC1749x484400ff2, "Requested API must not be null.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(interfaceC1749x484400ffArr.length + 1);
        arrayList.add(interfaceC1749x484400ff);
        arrayList.addAll(java.util.Arrays.asList(interfaceC1749x484400ffArr));
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.zaj().zam(arrayList);
    }

    /* renamed from: checkApiAvailability */
    public com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> m17619x1e5bae6d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01<?> abstractC1746xcf54ed01, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01<?>... abstractC1746xcf54ed01Arr) {
        return zai(abstractC1746xcf54ed01, abstractC1746xcf54ed01Arr).mo19600xd0f5b8c9(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2438xddc7e5ba() { // from class: com.google.android.gms.common.zab
            @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2438xddc7e5ba
            /* renamed from: then */
            public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 mo18451x364e1d(java.lang.Object obj) {
                int i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.f5825x7aedca50;
                return com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19614x3e1fc646(null);
            }
        });
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a
    /* renamed from: getClientVersion */
    public int mo17621xeb61b2d7(android.content.Context context) {
        return super.mo17621xeb61b2d7(context);
    }

    /* renamed from: getErrorDialog */
    public android.app.Dialog m17622x7a665c3a(android.app.Activity activity, int i17, int i18) {
        return m17623x7a665c3a(activity, i17, i18, (android.content.DialogInterface.OnCancelListener) null);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a
    /* renamed from: getErrorResolutionIntent */
    public android.content.Intent mo17626x91cd42da(android.content.Context context, int i17, java.lang.String str) {
        return super.mo17626x91cd42da(context, i17, str);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a
    /* renamed from: getErrorResolutionPendingIntent */
    public android.app.PendingIntent mo17627x6703115(android.content.Context context, int i17, int i18) {
        return super.mo17627x6703115(context, i17, i18);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a
    /* renamed from: getErrorString */
    public final java.lang.String mo17629x94a1bf03(int i17) {
        return super.mo17629x94a1bf03(i17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: isGooglePlayServicesAvailable */
    public int mo17630x402556f4(android.content.Context context) {
        return super.mo17630x402556f4(context);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a
    /* renamed from: isUserResolvableError */
    public final boolean mo17632xd322c280(int i17) {
        return super.mo17632xd322c280(i17);
    }

    /* renamed from: makeGooglePlayServicesAvailable */
    public com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> m17633x8fe103b0(android.app.Activity activity) {
        int i17 = f5825x7aedca50;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18207x6483284b("makeGooglePlayServicesAvailable must be called from the main thread");
        int mo17631x402556f4 = mo17631x402556f4(activity, i17);
        if (mo17631x402556f4 == 0) {
            return com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19614x3e1fc646(null);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1851x38edc7 zaa2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1851x38edc7.zaa(activity);
        zaa2.zah(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(mo17631x402556f4, null), 0);
        return zaa2.zad();
    }

    /* renamed from: setDefaultNotificationChannelId */
    public void m17634xdb43a694(android.content.Context context, java.lang.String str) {
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(((android.app.NotificationManager) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: showErrorDialogFragment */
    public boolean m17635x94f575a3(android.app.Activity activity, int i17, int i18) {
        return m17636x94f575a3(activity, i17, i18, (android.content.DialogInterface.OnCancelListener) null);
    }

    /* renamed from: showErrorNotification */
    public void m17638xd6620196(android.content.Context context, int i17) {
        zae(context, i17, null, m17645x6703115(context, i17, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.app.Dialog zaa(android.content.Context context, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zag zagVar, android.content.DialogInterface.OnCancelListener onCancelListener, android.content.DialogInterface.OnClickListener onClickListener) {
        if (i17 == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        android.app.AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new android.app.AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new android.app.AlertDialog.Builder(context);
        }
        builder.setMessage(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zac.zac(context, i17));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        java.lang.String zab2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zac.zab(context, i17);
        if (zab2 != null) {
            if (zagVar == null) {
                zagVar = onClickListener;
            }
            builder.setPositiveButton(zab2, zagVar);
        }
        java.lang.String zaf = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zac.zaf(context, i17);
        if (zaf != null) {
            builder.setTitle(zaf);
        }
        java.lang.String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", java.lang.Integer.valueOf(i17));
        new java.lang.IllegalArgumentException();
        return builder.create();
    }

    public final android.app.Dialog zab(android.app.Activity activity, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zac.zac(activity, 18));
        builder.setPositiveButton("", (android.content.DialogInterface.OnClickListener) null);
        android.app.AlertDialog create = builder.create();
        zad(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1846x38edbd zac(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1845x38edbc abstractC1845x38edbc) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1846x38edbd c1846x38edbd = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1846x38edbd(abstractC1845x38edbc);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zao.zaa(context, c1846x38edbd, intentFilter);
        c1846x38edbd.zaa(context);
        if (m17648x87a2c935(context, "com.google.android.gms")) {
            return c1846x38edbd;
        }
        abstractC1845x38edbc.zaa();
        c1846x38edbd.zab();
        return null;
    }

    public final void zad(android.app.Activity activity, android.app.Dialog dialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1724x1725c7b1.m17700x6bff0255(dialog, onCancelListener).mo7414x35dafd(((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) activity).mo7595x9cdc264(), str);
                return;
            }
        } catch (java.lang.NoClassDefFoundError unused) {
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.DialogFragmentC1701x77ccb3c0.m17609x6bff0255(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void zae(android.content.Context context, int i17, java.lang.String str, android.app.PendingIntent pendingIntent) {
        int i18;
        java.lang.String str2;
        java.lang.String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", java.lang.Integer.valueOf(i17), null);
        new java.lang.IllegalArgumentException();
        if (i17 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        java.lang.String zae = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zac.zae(context, i17);
        java.lang.String zad = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zac.zad(context, i17);
        android.content.res.Resources resources = context.getResources();
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context.getSystemService("notification"));
        z2.k0 k0Var = new z2.k0(context, null);
        k0Var.f551007r = true;
        k0Var.h(16, true);
        k0Var.f(zae);
        z2.i0 i0Var = new z2.i0();
        i0Var.f550983b = z2.k0.c(zad);
        k0Var.l(i0Var);
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.m18567xa53304a3(context)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18220xe071d469(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18601xc171897b());
            k0Var.D.icon = context.getApplicationInfo().icon;
            k0Var.f550999j = 2;
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.m18568xbed280e8(context)) {
                k0Var.f550991b.add(new z2.f0(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1695xcebc809e.f5740x96691e87, resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5784xf879ce0f), pendingIntent));
            } else {
                k0Var.f550996g = pendingIntent;
            }
        } else {
            k0Var.D.icon = android.R.drawable.stat_sys_warning;
            k0Var.m(resources.getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5777xb6e5d7f6));
            k0Var.D.when = java.lang.System.currentTimeMillis();
            k0Var.f550996g = pendingIntent;
            k0Var.e(zad);
        }
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18220xe071d469(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                java.lang.String string = context.getResources().getString(com.p176xb6135e39.p177xcca8366f.gms.p198x2e06d1.R.C1696xcad56011.f5776xd9a26c33);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new android.app.NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            k0Var.f551015z = str2;
        }
        android.app.Notification b17 = k0Var.b();
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5842x7f5be832.set(false);
            i18 = 10436;
        } else {
            i18 = 39789;
        }
        notificationManager.notify(i18, b17);
    }

    public final void zaf(android.content.Context context) {
        new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zad(this, context).sendEmptyMessageDelayed(1, u04.d.f505010c);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zag(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba interfaceC1780x4bb63ba, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog zaa2 = zaa(activity, i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zag.zad(interfaceC1780x4bb63ba, mo17626x91cd42da(activity, i17, "d"), 2), onCancelListener, null);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1712x8c1d834d.f5832x787fe651, onCancelListener);
        return true;
    }

    public final boolean zah(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, int i17) {
        android.app.PendingIntent m17628x6703115;
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2018xe6ff33d3.m18633xb736014a(context) || (m17628x6703115 = m17628x6703115(context, c1700xff0c58bb)) == null) {
            return false;
        }
        zae(context, c1700xff0c58bb.m17600x130a215f(), null, android.app.PendingIntent.getActivity(context, 0, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.DialogInterfaceOnCancelListenerC1747xcb82b330.zaa(context, m17628x6703115, i17, true), com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zap.zaa | 134217728));
        return true;
    }

    /* renamed from: getErrorDialog */
    public android.app.Dialog m17623x7a665c3a(android.app.Activity activity, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zag.zab(activity, mo17626x91cd42da(activity, i17, "d"), i18), onCancelListener, null);
    }

    /* renamed from: getErrorResolutionPendingIntent */
    public android.app.PendingIntent m17628x6703115(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        if (c1700xff0c58bb.m17603xc9b9eee6()) {
            return c1700xff0c58bb.m17602x8ee230a2();
        }
        return mo17627x6703115(context, c1700xff0c58bb.m17600x130a215f(), 0);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a
    /* renamed from: isGooglePlayServicesAvailable */
    public int mo17631x402556f4(android.content.Context context, int i17) {
        return super.mo17631x402556f4(context, i17);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: showErrorDialogFragment */
    public boolean m17636x94f575a3(android.app.Activity activity, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog m17623x7a665c3a = m17623x7a665c3a(activity, i17, i18, onCancelListener);
        if (m17623x7a665c3a == null) {
            return false;
        }
        zad(activity, m17623x7a665c3a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1712x8c1d834d.f5832x787fe651, onCancelListener);
        return true;
    }

    /* renamed from: checkApiAvailability */
    public com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> m17620x1e5bae6d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1749x484400ff<?> interfaceC1749x484400ff, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1749x484400ff<?>... interfaceC1749x484400ffArr) {
        return zai(interfaceC1749x484400ff, interfaceC1749x484400ffArr).mo19600xd0f5b8c9(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2438xddc7e5ba() { // from class: com.google.android.gms.common.zaa
            @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2438xddc7e5ba
            /* renamed from: then */
            public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 mo18451x364e1d(java.lang.Object obj) {
                int i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.f5825x7aedca50;
                return com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19614x3e1fc646(null);
            }
        });
    }

    /* renamed from: showErrorNotification */
    public void m17639xd6620196(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        zae(context, c1700xff0c58bb.m17600x130a215f(), null, m17628x6703115(context, c1700xff0c58bb));
    }

    /* renamed from: getErrorDialog */
    public android.app.Dialog m17624x7a665c3a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17, int i18) {
        return m17625x7a665c3a(componentCallbacksC1101xa17d4670, i17, i18, (android.content.DialogInterface.OnCancelListener) null);
    }

    /* renamed from: showErrorDialogFragment */
    public boolean m17637x94f575a3(android.app.Activity activity, int i17, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c cVar, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog zaa2 = zaa(activity, i17, null, onCancelListener, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zac(this, activity, i17, cVar));
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1712x8c1d834d.f5832x787fe651, onCancelListener);
        return true;
    }

    /* renamed from: getErrorDialog */
    public android.app.Dialog m17625x7a665c3a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return zaa(componentCallbacksC1101xa17d4670.m7550xf0c4608a(), i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zag.zac(componentCallbacksC1101xa17d4670, mo17626x91cd42da(componentCallbacksC1101xa17d4670.m7550xf0c4608a(), i17, "d"), i18), onCancelListener, null);
    }
}
