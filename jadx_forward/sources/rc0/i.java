package rc0;

@j95.b
/* loaded from: classes12.dex */
public class i extends i95.w implements sc0.g {
    public void wi(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "setLaunchRecovery, dump recovery status:");
        d55.j b17 = d55.j.b(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash count   = " + b17.f308124d.f308130a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash time    = " + b17.f308121a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash version = " + b17.f308122b);
        android.os.Bundle bundle = new android.os.Bundle();
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("recovery_enable", 4);
        if (sharedPreferences == null) {
            throw new java.lang.IllegalStateException("Persis#load() has not yet been called");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting enable       = " + (bundle.containsKey("enable") ? bundle.getBoolean("enable") : sharedPreferences.getBoolean("enable", true)));
        d55.a0 a0Var = new d55.a0(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting threshold 1  = " + a0Var.f308088a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting threshold 2  = " + a0Var.f308089b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting interval     = " + a0Var.f308090c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting min interval = " + a0Var.f308092e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting auto reset   = " + a0Var.f308093f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "setLaunchRecovery, main process will crash immediately");
        d55.j b18 = d55.j.b(context);
        b18.f308124d.f308130a = a0Var.f308088a;
        b18.f308121a = java.lang.System.currentTimeMillis();
        b18.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting new recovery status:");
        d55.j b19 = d55.j.b(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash count   = " + b19.f308124d.f308130a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash time    = " + b19.f308121a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash version = " + b19.f308122b);
        throw new java.lang.RuntimeException("setLaunchRecovery");
    }
}
