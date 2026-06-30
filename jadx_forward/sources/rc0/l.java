package rc0;

@j95.b
/* loaded from: classes12.dex */
public class l extends i95.w {
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.mm.app.i4.a(new rc0.k(this));
        boolean z17 = false;
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2534xf84d0b50.C20224x3c1db5ce()) == 1) {
            y45.r.a(context).f308151b.putBoolean("sk_enable_https_patch_channel", true);
        } else {
            y45.r.a(context).f308151b.putBoolean("sk_enable_https_patch_channel", false);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            final android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (!d55.r0.d(context2)) {
                new d55.w(context2, "recovery_exercise").e();
                if ((r0.mo123525xb58848b9("exercise_flags", 0) & 4) == 4) {
                    d55.w wVar = new d55.w(context2, "recovery_exercise");
                    wVar.e();
                    final int mo123525xb58848b9 = wVar.mo123525xb58848b9("exercise_delay", 5);
                    d55.w wVar2 = new d55.w(context2, "recovery_exercise");
                    wVar2.e();
                    final int mo123525xb58848b92 = wVar2.mo123525xb58848b9("exercise_times", 3);
                    android.os.Bundle bundle = new android.os.Bundle();
                    android.content.SharedPreferences sharedPreferences = context2.getSharedPreferences("recovery_exercise", 4);
                    if (sharedPreferences == null) {
                        throw new java.lang.IllegalStateException("Persis#load() has not yet been called");
                    }
                    final java.lang.String string = bundle.containsKey("exercise_crash_type") ? bundle.getString("exercise_crash_type") : sharedPreferences.getString("exercise_crash_type", "");
                    if (mo123525xb58848b9 > 0 && mo123525xb58848b9 < 100 && mo123525xb58848b92 > 0 && y45.b.a(string)) {
                        new android.os.Handler().postDelayed(new java.lang.Runnable(context2, mo123525xb58848b9, mo123525xb58848b92, string) { // from class: y45.b$$a

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ android.content.Context f540897d;

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ int f540898e;

                            /* renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ java.lang.String f540899f;

                            {
                                this.f540898e = mo123525xb58848b92;
                                this.f540899f = string;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.String[] strArr = {"java", "native", "kill"};
                                java.lang.String str = this.f540899f;
                                if ("random".equals(str)) {
                                    str = strArr[new java.util.Random(java.lang.System.currentTimeMillis()).nextInt(3)];
                                }
                                int i17 = this.f540898e - 1;
                                android.content.Context context3 = this.f540897d;
                                d55.m.a(context3, i17);
                                if (i17 <= 0) {
                                    y45.b.b(context3);
                                }
                                if ("java".equals(str)) {
                                    throw new java.lang.RuntimeException("!!Fake JavaCrash for recovery timer practise!!");
                                }
                                if ("native".equals(str)) {
                                    try {
                                        java.lang.Class<?> cls = java.lang.Class.forName("dalvik.system.VMDebug");
                                        java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class);
                                        declaredMethod.setAccessible(true);
                                        java.lang.reflect.Method method = (java.lang.reflect.Method) declaredMethod.invoke(cls, com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede, new java.lang.Class[0]);
                                        method.setAccessible(true);
                                        method.invoke(null, new java.lang.Object[0]);
                                        return;
                                    } catch (java.lang.Exception unused) {
                                        android.os.Process.sendSignal(android.os.Process.myPid(), 6);
                                        return;
                                    }
                                }
                                if (!"kill".equals(str)) {
                                    if (com.p314xaae8f345.mm.app.C4999x403c3a42.f134755c.equals(str)) {
                                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new y45.c());
                                        return;
                                    }
                                    return;
                                }
                                int myPid = android.os.Process.myPid();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList.add(java.lang.Integer.valueOf(myPid));
                                java.lang.Object obj = new java.lang.Object();
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/recovery/RecoveryExercise", "mockKillProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(obj, "com/tencent/mm/recovery/RecoveryExercise", "mockKillProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                            }
                        }, mo123525xb58848b9 * 1000);
                        z17 = true;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecoveryOnSplashService", "Scheduling recovery exercise = %s", java.lang.Boolean.valueOf(z17));
        }
    }
}
