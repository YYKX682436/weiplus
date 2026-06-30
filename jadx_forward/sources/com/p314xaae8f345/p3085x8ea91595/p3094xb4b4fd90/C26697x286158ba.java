package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90;

/* renamed from: com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver */
/* loaded from: classes13.dex */
public class C26697x286158ba extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "DownloadStateChangedReceiver";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26697x286158ba f56274x46143c22;

    /* renamed from: handler */
    protected com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f56275x294b574a;

    /* renamed from: isRegisted */
    protected boolean f56276xa793d5df = false;

    /* renamed from: mListeners */
    java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26698x709a5c48> f56277x32131c52 = new java.util.ArrayList<>();

    public C26697x286158ba() {
        this.f56275x294b574a = null;
        this.f56275x294b574a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("downloadStateChangedThread");
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26697x286158ba m105032x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26697x286158ba c26697x286158ba;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26697x286158ba.class) {
            if (f56274x46143c22 == null) {
                f56274x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26697x286158ba();
            }
            c26697x286158ba = f56274x46143c22;
        }
        return c26697x286158ba;
    }

    /* renamed from: addDownloadStateChangedListener */
    public void m105033xfbae60a0(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26698x709a5c48 interfaceC26698x709a5c48) {
        if (interfaceC26698x709a5c48 == null || this.f56277x32131c52.contains(interfaceC26698x709a5c48)) {
            return;
        }
        this.f56277x32131c52.add(interfaceC26698x709a5c48);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, final android.content.Intent intent) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f56275x294b574a;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26710x252547fa c26710x252547fa = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26710x252547fa();
                    c26710x252547fa.f56383xab3ca929 = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56297x2269af2b);
                    c26710x252547fa.f56384x8db49210 = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56298x20e8c910);
                    c26710x252547fa.f56387xcb7ef180 = intent.getStringExtra("taskId");
                    c26710x252547fa.f56381x139cb015 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993), 0);
                    c26710x252547fa.f56382x5336c059 = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb);
                    c26710x252547fa.f56386x68ac491 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(intent.getStringExtra("state"), 0);
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b();
                    c26708x7750f26b.f56370x49183d30 = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56299x6a713c7f);
                    c26708x7750f26b.f56375x9200497 = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56302x8390751);
                    c26708x7750f26b.f56374x91ff1d2 = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56301x838f48c);
                    c26708x7750f26b.f56376x4225cd2c = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56304xd1b84066);
                    c26708x7750f26b.f56377x857e2f93 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56305x2252dbed), 0);
                    c26708x7750f26b.via = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56308x97129f1f);
                    c26708x7750f26b.uin = intent.getStringExtra("uin");
                    c26708x7750f26b.f56378xe69c0ab4 = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56307x4c587525);
                    c26710x252547fa.f56385x658188d = c26708x7750f26b;
                    java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26698x709a5c48> it = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26697x286158ba.this.f56277x32131c52.iterator();
                    while (it.hasNext()) {
                        it.next().mo105037x9a6f4e0a(c26710x252547fa);
                    }
                }
            });
        }
    }

    /* renamed from: registeReceiver */
    public void m105034x2573f6be(android.content.Context context) {
        if (this.f56276xa793d5df) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "registeReceiver   context" + context + "  receiver:" + this);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56309x1a3b36c5);
        try {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "" + (fp.h.a(33) ? context.registerReceiver(this, intentFilter) : context.registerReceiver(this, intentFilter, 2)));
            this.f56276xa793d5df = true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "registeReceiver exception!!!");
            this.f56276xa793d5df = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: removeDownloadStateChangedListener */
    public void m105035x30aafe03(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26698x709a5c48 interfaceC26698x709a5c48) {
        if (interfaceC26698x709a5c48 != null) {
            this.f56277x32131c52.remove(interfaceC26698x709a5c48);
        }
    }

    /* renamed from: unRegisteReceiver */
    public void m105036xb4567ae5(android.content.Context context) {
        if (context == null || f56274x46143c22 == null || !this.f56276xa793d5df) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "realy unRegisteReceiver  context:" + context + "  receiver:" + this);
        try {
            context.unregisterReceiver(this);
            this.f56276xa793d5df = false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "unRegisteReceiver exception!!!");
            this.f56276xa793d5df = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
        }
    }
}
