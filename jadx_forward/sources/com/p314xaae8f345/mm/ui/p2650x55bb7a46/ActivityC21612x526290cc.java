package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/BizHalfScreenChattingUI;", "Lcom/tencent/mm/ui/chatting/ChattingUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.BizHalfScreenChattingUI */
/* loaded from: classes11.dex */
public final class ActivityC21612x526290cc extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f279694z = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f279695u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.l9 f279696v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f279697w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f279698x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f279699y;

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (!this.f279699y) {
            int action = ev6.getAction();
            if (action == 0) {
                this.f279698x = h7(this, ev6);
            } else if (action == 1) {
                boolean h76 = h7(this, ev6);
                if (this.f279698x && h76) {
                    this.f279699y = true;
                    this.f279787h.f279685f.f542243e.Q();
                }
            }
        }
        return super.dispatchTouchEvent(ev6);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    public final int g7(int i17) {
        if (getIntent().getBooleanExtra("key_template_history_msg", false)) {
            return i17 / 4;
        }
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a;
        return i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 80);
    }

    public final boolean h7(android.content.Context context, android.view.MotionEvent motionEvent) {
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int scaledWindowTouchSlop = android.view.ViewConfiguration.get(context).getScaledWindowTouchSlop();
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        int i17 = -scaledWindowTouchSlop;
        return x17 < i17 || y17 < i17 || x17 > decorView.getWidth() + scaledWindowTouchSlop || y17 > decorView.getHeight() + scaledWindowTouchSlop;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[Catch: Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x0011, B:9:0x0017, B:11:0x001d, B:13:0x0036, B:14:0x003e, B:24:0x0022, B:26:0x0028, B:28:0x002e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i7() {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.BizDialogChattingUI"
            java.lang.String r1 = "getCurrentWindowHeight tmpWindowHeight:"
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L5c
            r4 = 30
            if (r3 < r4) goto L22
            android.view.WindowManager r3 = r7.getWindowManager()     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L33
            android.view.WindowMetrics r3 = r3.getCurrentWindowMetrics()     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L33
            android.graphics.Rect r3 = r3.getBounds()     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L33
            int r3 = r3.height()     // Catch: java.lang.Exception -> L5c
            goto L34
        L22:
            android.view.WindowManager r3 = r7.getWindowManager()     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L33
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L33
            int r3 = r3.getHeight()     // Catch: java.lang.Exception -> L5c
            goto L34
        L33:
            r3 = r2
        L34:
            if (r3 > 0) goto L3d
            android.graphics.Point r4 = com.p314xaae8f345.mm.ui.bl.b(r7)     // Catch: java.lang.Exception -> L5c
            int r4 = r4.y     // Catch: java.lang.Exception -> L5c
            goto L3e
        L3d:
            r4 = r3
        L3e:
            int r5 = r7.g7(r4)     // Catch: java.lang.Exception -> L5c
            int r5 = r4 - r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
            r6.<init>(r1)     // Catch: java.lang.Exception -> L5c
            r6.append(r3)     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = "  finalWindowHeight:"
            r6.append(r1)     // Catch: java.lang.Exception -> L5c
            r6.append(r4)     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Exception -> L5c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L5c
            goto L70
        L5c:
            r1 = move-exception
            java.lang.String r3 = "getCurrentWindowHeight"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r3, r2)
            android.graphics.Point r1 = com.p314xaae8f345.mm.ui.bl.b(r7)
            int r1 = r1.y
            int r2 = r7.g7(r1)
            int r5 = r1 - r2
        L70:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrentWindowHeight height:"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            r7.f279695u = r5
            android.view.Window r0 = r7.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            r1 = -1
            r0.width = r1
            r0.height = r1
            r2 = 80
            r0.gravity = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.dimAmount = r2
            android.view.Window r2 = r7.getWindow()
            r2.setAttributes(r0)
            android.view.Window r0 = r7.getWindow()
            int r2 = r7.f279695u
            r0.setLayout(r1, r2)
            android.view.Window r0 = r7.getWindow()
            r1 = 2
            r0.addFlags(r1)
            com.tencent.mm.ui.chatting.l9 r0 = r7.f279696v
            if (r0 == 0) goto Lbf
            int r1 = r7.f279695u
            r0.f283462m = r1
            float r1 = (float) r1
            r2 = 1050253722(0x3e99999a, float:0.3)
            float r1 = r1 * r2
            r0.f283461i = r1
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21612x526290cc.i7():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a, com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizDialogChattingUI", "onConfigurationChanged  isInMultiWindowMode:" + isInMultiWindowMode());
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        super.onCreate(bundle);
        i7();
        fq1.e eVar = fq1.e.f347040a;
        eVar.g(getWindow().getDecorView(), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12), true, false);
        getWindow().getDecorView().setBackgroundColor(0);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        setFinishOnTouchOutside(true);
        int i17 = this.f279695u;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.l9 l9Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.l9(this, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.q1(this));
        this.f279696v = l9Var;
        l9Var.a(i17);
        eVar.g(this.f279696v, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12), true, false);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z17, android.content.res.Configuration configuration) {
        super.onMultiWindowModeChanged(z17, configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizDialogChattingUI", "onMultiWindowModeChanged  isInMultiWindowMode:" + z17 + "  newConfig:" + configuration);
        i7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity
    public void setRequestedOrientation(int i17) {
        super.setRequestedOrientation(1);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onMultiWindowModeChanged(boolean z17) {
        super.onMultiWindowModeChanged(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizDialogChattingUI", "onMultiWindowModeChanged  isInMultiWindowMode:" + z17);
        i7();
    }
}
