package d55;

/* loaded from: classes12.dex */
public abstract class b extends d55.a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f308096b = false;

    @Override // d55.a, d55.h
    public void a(android.content.Context context, d55.j jVar) {
        if (!this.f308096b) {
            d55.o0.a(5, "MicroMsg.recovery.callback", "do NOT suicide, bcs launching activity fail");
            return;
        }
        d55.o0.a(4, "MicroMsg.recovery.callback", "suicide when launch recovery activity");
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
    }

    @Override // d55.h
    public void b(android.content.Context context, d55.j jVar) {
        java.lang.String str;
        java.util.ArrayList arrayList;
        android.content.Intent intent = new android.content.Intent();
        java.lang.Class<?> c17 = ((d55.c) this).f308108c.c();
        if (c17 == null) {
            c17 = null;
        }
        if (c17 == null) {
            d55.o0.a(4, "MicroMsg.recovery.callback", "can not get target activity, skip");
            return;
        }
        try {
            d55.o0.a(4, "MicroMsg.recovery.callback", "start recovery activity, target = ".concat(c17.getName()));
            intent.setClass(context, c17);
            intent.putExtra("extra_crash_count", jVar.f308124d.f308130a);
            jVar.a();
            com.p314xaae8f345.mm.p2500x32bcfcd1.C19823xc30d8063 c19823xc30d8063 = new com.p314xaae8f345.mm.p2500x32bcfcd1.C19823xc30d8063();
            c19823xc30d8063.f273739d = jVar.f308124d.f308130a;
            try {
                c19823xc30d8063.f273740e = jVar.f308121a;
                c19823xc30d8063.f273741f = jVar.f308122b;
                intent.putExtra("extra_crash_record", c19823xc30d8063);
                intent.addFlags(276824064);
                arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                str = "MicroMsg.recovery.callback";
            } catch (java.lang.Exception e17) {
                e = e17;
                str = "MicroMsg.recovery.callback";
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            str = "MicroMsg.recovery.callback";
        }
        try {
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/recoveryv2/RecoveryCallback$ActivityRecoveryCallback", "onRecovery", "(Landroid/content/Context;Lcom/tencent/mm/recoveryv2/RecoveryCrash;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/recoveryv2/RecoveryCallback$ActivityRecoveryCallback", "onRecovery", "(Landroid/content/Context;Lcom/tencent/mm/recoveryv2/RecoveryCrash;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f308096b = true;
            d55.w wVar = new d55.w(context, "recovery_statistic");
            wVar.e();
            int mo123525xb58848b9 = wVar.mo123525xb58848b9("crash_count", 0);
            boolean mo123524x41a8a7f2 = wVar.mo123524x41a8a7f2("launch_recovery", false);
            boolean mo123524x41a8a7f22 = wVar.mo123524x41a8a7f2("launch_recovery_real", false);
            boolean mo123524x41a8a7f23 = wVar.mo123524x41a8a7f2("recover_from_crash", false);
            int mo123525xb58848b92 = wVar.mo123525xb58848b9("recovery_status", -1);
            int mo123525xb58848b93 = wVar.mo123525xb58848b9("recovery_from", 0);
            int mo123525xb58848b94 = wVar.mo123525xb58848b9("recover_internal_status", 0);
            wVar.mo123525xb58848b9("recover_launch_mode", 0);
            long mo123526xfb822ef2 = wVar.mo123526xfb822ef2("recover_running_time", 0L);
            boolean mo123524x41a8a7f24 = wVar.mo123524x41a8a7f2("recover_is_discard", false);
            java.lang.String mo123527x2fec8307 = wVar.mo123527x2fec8307("recover_app_ver", "");
            wVar.g("crash_count", mo123525xb58848b9);
            wVar.mo123528x1c849219("launch_recovery", mo123524x41a8a7f2);
            wVar.mo123528x1c849219("launch_recovery_real", mo123524x41a8a7f22);
            wVar.mo123528x1c849219("recover_from_crash", mo123524x41a8a7f23);
            wVar.g("recovery_status", mo123525xb58848b92);
            wVar.g("recovery_from", mo123525xb58848b93);
            wVar.g("recover_internal_status", mo123525xb58848b94);
            wVar.g("recover_launch_mode", 1);
            wVar.g("recover_running_time", mo123526xfb822ef2);
            wVar.mo123528x1c849219("recover_is_discard", mo123524x41a8a7f24);
            wVar.mo123531xe4673800("recover_app_ver", mo123527x2fec8307);
            wVar.h();
        } catch (java.lang.Exception e19) {
            e = e19;
            d55.q0.a(str, "start activity fail", e);
        }
    }
}
