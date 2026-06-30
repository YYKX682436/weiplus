package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class r2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        java.lang.String lowerCase;
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        int intExtra = intent.getIntExtra("delay", -1);
        int intExtra2 = intent.getIntExtra("times", -1);
        java.lang.String stringExtra = intent.getStringExtra("crash_type");
        java.lang.String stringExtra2 = intent.getStringExtra("process");
        java.lang.String stringExtra3 = intent.getStringExtra("base_tinker_id");
        if (intExtra == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "#RECOVERY_EXERCISE invalid delay");
            return;
        }
        if (intExtra2 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "#RECOVERY_EXERCISE invalid times");
            return;
        }
        if (stringExtra == null) {
            lowerCase = "random";
        } else {
            if (!y45.b.a(stringExtra.toLowerCase(java.util.Locale.getDefault()))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "#RECOVERY_EXERCISE invalid crash type = %s", stringExtra);
                return;
            }
            lowerCase = stringExtra.toLowerCase(java.util.Locale.getDefault());
        }
        java.lang.String str = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        if (stringExtra2 != null) {
            java.lang.String lowerCase2 = stringExtra2.toLowerCase(java.util.Locale.getDefault());
            if (!(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM.equals(lowerCase2) || com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH.equals(lowerCase2))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "#RECOVERY_EXERCISE invalid process = %s", stringExtra2);
                return;
            }
            str = stringExtra2.toLowerCase(java.util.Locale.getDefault());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "#RECOVERY_EXERCISE, crash type = %s, delay = %s, times = %s, process = %s, baseTinkerId = %s", lowerCase, java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2), str, stringExtra3);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        d55.w wVar = new d55.w(context, "recovery_exercise");
        wVar.e();
        wVar.g("exercise_flags", 4);
        wVar.h();
        d55.w wVar2 = new d55.w(context, "recovery_exercise");
        wVar2.e();
        wVar2.g("exercise_delay", intExtra);
        wVar2.h();
        d55.m.a(context, intExtra2);
        d55.w wVar3 = new d55.w(context, "recovery_exercise");
        wVar3.e();
        wVar3.b();
        wVar3.f226622c.putString("exercise_crash_type", lowerCase);
        wVar3.h();
        d55.w wVar4 = new d55.w(context, "recovery_exercise");
        wVar4.e();
        wVar4.b();
        wVar4.f226622c.putString("exercise_process", str);
        wVar4.h();
        d55.w wVar5 = new d55.w(context, "recovery_exercise");
        wVar5.e();
        wVar5.b();
        wVar5.f226622c.putString("exercise_base_tinker_id", stringExtra3);
        wVar5.h();
    }
}
