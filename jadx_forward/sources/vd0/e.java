package vd0;

@j95.b
/* loaded from: classes12.dex */
public final class e extends i95.w implements ia0.m {

    /* renamed from: d, reason: collision with root package name */
    public boolean f516924d;

    /* renamed from: e, reason: collision with root package name */
    public final vd0.d f516925e = new vd0.d(this);

    public static final void wi(vd0.e eVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDensityService", "checkReStart isDensityChanged: " + eVar.f516924d);
        if (eVar.f516924d) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6227x9fa4a4fc c6227x9fa4a4fc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6227x9fa4a4fc();
            c6227x9fa4a4fc.e();
            boolean z18 = c6227x9fa4a4fc.f136474g.f89582a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDensityService", "checkReStart isVoipCalling: " + z18);
            if (z18) {
                return;
            }
            eVar.f516924d = false;
            if (z17) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Intro_Need_Clear_Top ", true);
                ((com.p314xaae8f345.mm.app.y7) f14.g.b()).d(intent, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                return;
            }
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/feature/setting/CheckDensityService", "checkReStart", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/feature/setting/CheckDensityService", "checkReStart", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDensityService", "onAccountInitialized");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(this.f516925e);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDensityService", "onAccountReleased");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(this.f516925e);
    }
}
