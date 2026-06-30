package d55;

/* loaded from: classes12.dex */
public abstract class g extends d55.a {
    @Override // d55.h
    public void b(android.content.Context context, d55.j jVar) {
        java.lang.String str;
        android.content.Intent intent;
        d55.w wVar;
        int mo123525xb58848b9;
        boolean mo123524x41a8a7f2;
        java.lang.Class<?> d17 = ((d55.d) this).f308110b.d();
        if (d17 == null) {
            d17 = null;
        }
        if (d17 == null) {
            d55.o0.a(4, "MicroMsg.recovery.callback", "can not get target service, skip");
            return;
        }
        try {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(context, d17);
            intent2.putExtra("extra_crash_count", jVar.f308124d.f308130a);
            jVar.a();
            com.p314xaae8f345.mm.p2500x32bcfcd1.C19823xc30d8063 c19823xc30d8063 = new com.p314xaae8f345.mm.p2500x32bcfcd1.C19823xc30d8063();
            c19823xc30d8063.f273739d = jVar.f308124d.f308130a;
            c19823xc30d8063.f273740e = jVar.f308121a;
            c19823xc30d8063.f273741f = jVar.f308122b;
            intent2.putExtra("extra_crash_record", c19823xc30d8063);
            try {
                context.startService(intent2);
                wVar = new d55.w(context, "recovery_statistic");
                wVar.e();
                mo123525xb58848b9 = wVar.mo123525xb58848b9("crash_count", 0);
                mo123524x41a8a7f2 = wVar.mo123524x41a8a7f2("launch_recovery", false);
                intent = intent2;
            } catch (java.lang.Exception e17) {
                e = e17;
                intent = intent2;
            }
            try {
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
                wVar.g("recover_launch_mode", 2);
                wVar.g("recover_running_time", mo123526xfb822ef2);
                wVar.mo123528x1c849219("recover_is_discard", mo123524x41a8a7f24);
                wVar.mo123531xe4673800("recover_app_ver", mo123527x2fec8307);
                wVar.h();
            } catch (java.lang.Exception e18) {
                e = e18;
                str = "MicroMsg.recovery.callback";
                try {
                    d55.o0.a(5, str, "start service fail + " + e.getMessage() + ", try bind service");
                } catch (java.lang.Exception e19) {
                    e = e19;
                }
                try {
                    context.bindService(intent, new d55.f(this), 1);
                } catch (java.lang.Exception e27) {
                    e = e27;
                    d55.q0.a(str, "start service fail", e);
                }
            }
        } catch (java.lang.Exception e28) {
            e = e28;
            str = "MicroMsg.recovery.callback";
        }
    }
}
