package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class r2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        java.lang.String lowerCase;
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        int intExtra = intent.getIntExtra("delay", -1);
        int intExtra2 = intent.getIntExtra("times", -1);
        java.lang.String stringExtra = intent.getStringExtra("crash_type");
        java.lang.String stringExtra2 = intent.getStringExtra("process");
        java.lang.String stringExtra3 = intent.getStringExtra("base_tinker_id");
        if (intExtra == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "#RECOVERY_EXERCISE invalid delay");
            return;
        }
        if (intExtra2 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "#RECOVERY_EXERCISE invalid times");
            return;
        }
        if (stringExtra == null) {
            lowerCase = "random";
        } else {
            if (!y45.b.a(stringExtra.toLowerCase(java.util.Locale.getDefault()))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "#RECOVERY_EXERCISE invalid crash type = %s", stringExtra);
                return;
            }
            lowerCase = stringExtra.toLowerCase(java.util.Locale.getDefault());
        }
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
        if (stringExtra2 != null) {
            java.lang.String lowerCase2 = stringExtra2.toLowerCase(java.util.Locale.getDefault());
            if (!(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29.equals(lowerCase2) || com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63.equals(lowerCase2))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "#RECOVERY_EXERCISE invalid process = %s", stringExtra2);
                return;
            }
            str = stringExtra2.toLowerCase(java.util.Locale.getDefault());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "#RECOVERY_EXERCISE, crash type = %s, delay = %s, times = %s, process = %s, baseTinkerId = %s", lowerCase, java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2), str, stringExtra3);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
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
        wVar3.f308155c.putString("exercise_crash_type", lowerCase);
        wVar3.h();
        d55.w wVar4 = new d55.w(context, "recovery_exercise");
        wVar4.e();
        wVar4.b();
        wVar4.f308155c.putString("exercise_process", str);
        wVar4.h();
        d55.w wVar5 = new d55.w(context, "recovery_exercise");
        wVar5.e();
        wVar5.b();
        wVar5.f308155c.putString("exercise_base_tinker_id", stringExtra3);
        wVar5.h();
    }
}
