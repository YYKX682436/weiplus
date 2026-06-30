package com.p314xaae8f345.mm.p2617xca9a2a67;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.splash.SplashHackInstrumentation */
/* loaded from: classes12.dex */
public class InstrumentationC21045xd647e006 extends android.app.Instrumentation {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Instrumentation f275170a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.invoke.MethodHandle f275171b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.reflect.Method f275172c;

    public InstrumentationC21045xd647e006(android.app.Instrumentation instrumentation) {
        this.f275170a = instrumentation;
        java.lang.reflect.Field[] declaredFields = android.app.Instrumentation.class.getDeclaredFields();
        for (int i17 = 0; i17 < declaredFields.length; i17++) {
            declaredFields[i17].setAccessible(true);
            declaredFields[i17].set(this, declaredFields[i17].get(this.f275170a));
        }
    }

    /* renamed from: execStartActivity */
    public android.app.Instrumentation.ActivityResult m77903x30394480(android.content.Context context, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.Activity activity, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        try {
            com.p314xaae8f345.mm.p2617xca9a2a67.f fVar = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275189o;
            if (fVar != null && ((com.p314xaae8f345.mm.app.n7) fVar).a(context, activity, intent, i17, bundle)) {
                return null;
            }
            if (!(com.p314xaae8f345.mm.p2617xca9a2a67.j.f275188n != null ? com.p314xaae8f345.mm.ui.bk.w0() : false) || android.os.Build.VERSION.SDK_INT < 26) {
                com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackInstrumentation", "execStartActivity use method.invoke", new java.lang.Object[0]);
                if (this.f275172c == null) {
                    this.f275172c = android.app.Instrumentation.class.getDeclaredMethod("execStartActivity", android.content.Context.class, android.os.IBinder.class, android.os.IBinder.class, android.app.Activity.class, android.content.Intent.class, java.lang.Integer.TYPE, android.os.Bundle.class);
                }
                java.lang.Object invoke = this.f275172c.invoke(this.f275170a, context, iBinder, iBinder2, activity, intent, java.lang.Integer.valueOf(i17), bundle);
                if (invoke == null) {
                    return null;
                }
                return (android.app.Instrumentation.ActivityResult) invoke;
            }
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackInstrumentation", "execStartActivity use methodHandle", new java.lang.Object[0]);
            if (this.f275171b == null) {
                this.f275171b = java.lang.invoke.MethodHandles.lookup().findSpecial(android.app.Instrumentation.class, "execStartActivity", java.lang.invoke.MethodType.methodType(android.app.Instrumentation.ActivityResult.class, android.content.Context.class, android.os.IBinder.class, android.os.IBinder.class, android.app.Activity.class, android.content.Intent.class, java.lang.Integer.TYPE, android.os.Bundle.class), com.p314xaae8f345.mm.p2617xca9a2a67.InstrumentationC21045xd647e006.class);
            }
            java.lang.Object invokeWithArguments = this.f275171b.invokeWithArguments(this, context, iBinder, iBinder2, activity, intent, java.lang.Integer.valueOf(i17), bundle);
            if (invokeWithArguments == null) {
                return null;
            }
            return (android.app.Instrumentation.ActivityResult) invokeWithArguments;
        } catch (java.lang.reflect.InvocationTargetException e17) {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackInstrumentation", "Guard ignore throwableL " + e17.getMessage(), new java.lang.Object[0]);
            throw e17.getTargetException();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackInstrumentation", "Guard invoke Error" + th6.getMessage(), new java.lang.Object[0]);
            throw th6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (com.p314xaae8f345.mm.ui.bk.S() != false) goto L42;
     */
    @Override // android.app.Instrumentation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Activity newActivity(java.lang.ClassLoader r10, java.lang.String r11, android.content.Intent r12) {
        /*
            r9 = this;
            com.tencent.mm.splash.e r0 = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275181g
            r1 = 1
            java.lang.String r2 = "com.tencent.mm.ui.LauncherUI"
            if (r0 == 0) goto L1f
            r0 = 512(0x200, float:7.17E-43)
            boolean r0 = nm.a.a(r0)
            if (r0 == 0) goto L1f
            boolean r0 = r2.equals(r11)
            if (r0 == 0) goto L1f
            nm.a.f419955w = r1
            java.lang.String r0 = "MicroMsg.BlinkStartup"
            java.lang.String r3 = "report this time"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3)
        L1f:
            boolean r0 = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275183i
            r3 = 0
            java.lang.String r4 = "WxSplash.SplashHackInstrumentation"
            if (r0 == 0) goto L9a
            java.lang.Class r0 = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275190p
            java.lang.String r0 = r0.getCanonicalName()
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L9a
            java.util.Set r0 = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275191q
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r11)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r11, r5}
            java.lang.String r6 = "WxSplash.Splash"
            java.lang.String r7 = "ignore activity %s ?, %s"
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d(r6, r7, r5)
            if (r0 != 0) goto L9a
            com.tencent.mm.splash.SplashHackActivity r10 = new com.tencent.mm.splash.SplashHackActivity
            com.tencent.mm.splash.b r12 = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275188n
            com.tencent.mm.legacy.app.z r12 = (com.p314xaae8f345.mm.p815xbe0af3c9.app.z) r12
            r12.getClass()
            java.lang.String r12 = "WxSplash.WeChatSplash"
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L84
            boolean r1 = com.p314xaae8f345.mm.ui.bk.R()     // Catch: java.lang.Throwable -> L77
            if (r1 != 0) goto L6e
            boolean r1 = com.p314xaae8f345.mm.ui.bk.U()     // Catch: java.lang.Throwable -> L77
            if (r1 != 0) goto L6e
            boolean r1 = com.p314xaae8f345.mm.ui.bk.S()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L84
        L6e:
            java.lang.String r0 = "Disable replay mode."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r12, r0)     // Catch: java.lang.Throwable -> L74
            goto L85
        L74:
            r0 = move-exception
            r1 = r3
            goto L7b
        L77:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
        L7b:
            java.lang.String r2 = ""
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r12, r0, r2, r3)
            r3 = r1
            goto L85
        L84:
            r3 = r0
        L85:
            r10.<init>(r3)
            r10.f275168d = r11
            java.lang.String r12 = "new splash hack activity. replace activity %s"
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d(r4, r12, r11)
            java.util.ArrayList r11 = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275175a
            r11.add(r10)
            return r10
        L9a:
            android.app.Activity r10 = super.newActivity(r10, r11, r12)
            com.tencent.mm.splash.c r0 = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275180f
            if (r0 == 0) goto Lb4
            com.tencent.mm.legacy.app.v r0 = (com.p314xaae8f345.mm.p815xbe0af3c9.app.v) r0
            android.app.Activity r0 = r0.a(r10)
            if (r0 == r10) goto Lb4
            java.lang.String r10 = "Activity %s is intercepted by %s."
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0}
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d(r4, r10, r11)
            r10 = r0
        Lb4:
            boolean r11 = com.p314xaae8f345.mm.p2617xca9a2a67.p.f275202h
            if (r11 == 0) goto Lc6
            java.lang.String r11 = "processing relaunch activity."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d(r4, r11, r0)
            java.lang.String r11 = "splash-hack-activity-recreate"
            r12.putExtra(r11, r1)
        Lc6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2617xca9a2a67.InstrumentationC21045xd647e006.newActivity(java.lang.ClassLoader, java.lang.String, android.content.Intent):android.app.Activity");
    }
}
