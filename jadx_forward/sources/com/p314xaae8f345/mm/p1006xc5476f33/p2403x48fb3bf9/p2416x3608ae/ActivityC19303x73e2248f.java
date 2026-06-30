package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubTempUI */
/* loaded from: classes8.dex */
public class ActivityC19303x73e2248f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public int f265037d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f265038e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Dialog f265039f = null;

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubTempUI$StartActivityForResultTask */
    /* loaded from: classes8.dex */
    public static final class StartActivityForResultTask implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19303x73e2248f.StartActivityForResultTask> f38736x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.r0();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f265042d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f265043e;

        /* renamed from: f, reason: collision with root package name */
        public android.content.Intent f265044f;

        /* renamed from: g, reason: collision with root package name */
        public int f265045g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f265046h;

        /* renamed from: i, reason: collision with root package name */
        public int f265047i;

        public StartActivityForResultTask(android.os.Parcel parcel) {
            this.f265042d = parcel.readString();
            this.f265043e = parcel.readString();
            this.f265044f = (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader());
            this.f265045g = parcel.readInt();
            this.f265046h = parcel.readByte() != 0;
            this.f265047i = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f265042d);
            parcel.writeString(this.f265043e);
            parcel.writeParcelable(this.f265044f, i17);
            parcel.writeInt(this.f265045g);
            parcel.writeByte(this.f265046h ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f265047i);
        }
    }

    public static boolean T6(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var, java.lang.String[] strArr, int i17, int i18) {
        if (context == null || strArr == null || strArr.length == 0) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            if (b3.l.m9698x3fed0563(context, str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 0) {
            return true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_action_code", 1);
        bundle.putStringArray("key_permission_types", (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
        bundle.putInt("key_permission_request_code", i17);
        bundle.putInt("key_binder_id", i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.e(bundle, "webview", ".stub.WebViewStubTempUI", z0Var, null);
        return false;
    }

    public static void U6(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final android.content.DialogInterface.OnClickListener onClickListener, final android.content.DialogInterface.OnClickListener onClickListener2) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19303x73e2248f.class);
        if (context instanceof android.app.Service) {
            intent.addFlags(268435456);
        }
        intent.putExtra("key_action_code", 0);
        intent.putExtra("key_alert_cancelable", z17);
        intent.putExtra("key_alert_message", str);
        intent.putExtra("key_alert_title", str2);
        intent.putExtra("key_alert_yes", str3);
        intent.putExtra("key_alert_no", str4);
        intent.putExtra("key_alert_result_receiver", new android.os.ResultReceiver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                if (i17 == 0) {
                    onClickListener.onClick(null, 0);
                } else {
                    if (i17 != 1) {
                        return;
                    }
                    onClickListener2.onClick(null, 0);
                }
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.e(intent.getExtras(), "webview", ".stub.WebViewStubTempUI", z0Var, null);
    }

    public static void V6(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, int i17, boolean z17, int i18) {
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19303x73e2248f.class);
        if (context instanceof android.app.Service) {
            intent2.addFlags(268435456);
        }
        intent2.putExtra("key_action_code", 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19303x73e2248f.StartActivityForResultTask startActivityForResultTask = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19303x73e2248f.StartActivityForResultTask();
        startActivityForResultTask.f265042d = str;
        startActivityForResultTask.f265043e = str2;
        startActivityForResultTask.f265044f = intent;
        startActivityForResultTask.f265045g = i17;
        startActivityForResultTask.f265046h = z17;
        startActivityForResultTask.f265047i = i18;
        intent2.putExtra("key_activity_result_task", startActivityForResultTask);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubTempUI", "startActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;IZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/stub/WebViewStubTempUI", "startActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;IZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17;
        if (this.f265038e && (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(this.f265037d)) != null) {
            a17.mo9729x757c998b(i17, i18, intent);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("key_action_code", -1);
        if (intExtra == 0) {
            android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) getIntent().getParcelableExtra("key_alert_result_receiver");
            if (resultReceiver == null) {
                finish();
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 K = db5.e1.K(this, getIntent().getBooleanExtra("key_alert_cancelable", false), getIntent().getStringExtra("key_alert_message"), getIntent().getStringExtra("key_alert_title"), getIntent().getStringExtra("key_alert_yes"), getIntent().getStringExtra("key_alert_no"), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.o0(this, resultReceiver), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.p0(this, resultReceiver));
            this.f265039f = K;
            K.setOnCancelListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.q0(this));
            return;
        }
        if (intExtra == 1) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, getIntent().getStringArrayExtra("key_permission_types"), getIntent().getIntExtra("key_permission_request_code", 0), null, null);
        } else {
            if (intExtra != 2) {
                finish();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19303x73e2248f.StartActivityForResultTask startActivityForResultTask = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19303x73e2248f.StartActivityForResultTask) getIntent().getParcelableExtra("key_activity_result_task");
            this.f265037d = startActivityForResultTask.f265047i;
            this.f265038e = true;
            m78545xde66c1f2(this);
            j45.l.o(this, startActivityForResultTask.f265042d, startActivityForResultTask.f265043e, startActivityForResultTask.f265044f, startActivityForResultTask.f265045g, startActivityForResultTask.f265046h);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.Dialog dialog = this.f265039f;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        int intExtra = getIntent().getIntExtra("key_binder_id", 0);
        if (i17 != 72 && i17 != 75 && i17 != 113) {
            switch (i17) {
            }
            finish();
        }
        if (iArr.length != 0) {
            if (iArr[0] == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(intExtra).mo9729x757c998b(i17, -1, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(intExtra).mo9729x757c998b(i17, 0, null);
            }
        }
        finish();
    }
}
