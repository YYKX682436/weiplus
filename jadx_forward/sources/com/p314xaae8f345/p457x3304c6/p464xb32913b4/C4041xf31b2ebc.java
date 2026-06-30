package com.p314xaae8f345.p457x3304c6.p464xb32913b4;

/* renamed from: com.tencent.maas.export.MJExportManager */
/* loaded from: classes4.dex */
public class C4041xf31b2ebc implements com.p314xaae8f345.p457x3304c6.p464xb32913b4.InterfaceC4047xd1f5999c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f129537a = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f129538b = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15916x39e86013;

    private C4041xf31b2ebc(com.p166x1da19ac6.jni.C1545xd48843e6 c1545xd48843e6) {
        this.f15916x39e86013 = c1545xd48843e6;
        m32943x1cebe753(this);
    }

    /* renamed from: nativeCancelTaskById */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32936x425cdb88(java.lang.String str);

    /* renamed from: nativeGetAllPausedTasksInfo */
    private native java.util.Map<java.lang.String, com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4043x2a1119e> m32937xd780a60c();

    /* renamed from: nativeGetScheduledTasksInfo */
    private native java.util.Map<java.lang.String, com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4043x2a1119e> m32938x1c3fd54e();

    /* renamed from: nativeIsServicePaused */
    private native boolean m32939xf0715e22();

    /* renamed from: nativePauseService */
    private native void m32940x35dcf196();

    /* renamed from: nativePauseTaskById */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32941x1b11ec36(java.lang.String str);

    /* renamed from: nativeResumeService */
    private native void m32942x61be76f1();

    /* renamed from: nativeSetNativeStateChangeListener */
    private native void m32943x1cebe753(com.p314xaae8f345.p457x3304c6.p464xb32913b4.InterfaceC4047xd1f5999c interfaceC4047xd1f5999c);

    /* renamed from: nativeStartTaskById */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32944x92a55ea2(java.lang.String str);

    /* renamed from: nativeSubmitAndStartNewTask */
    private native java.lang.String m32945xf1d0eb(com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4043x2a1119e c4043x2a1119e);

    /* renamed from: nativeSubmitNewTask */
    private native java.lang.String m32946x2b80d36(com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4043x2a1119e c4043x2a1119e);

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b a(com.p314xaae8f345.p457x3304c6.p464xb32913b4.c cVar) {
        return m32936x425cdb88(cVar.f129543a);
    }

    public java.util.Map b() {
        java.util.Map<java.lang.String, com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4043x2a1119e> m32938x1c3fd54e = m32938x1c3fd54e();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4043x2a1119e> entry : m32938x1c3fd54e.entrySet()) {
            java.lang.String key = entry.getKey();
            hashMap.put(new com.p314xaae8f345.p457x3304c6.p464xb32913b4.c(key), entry.getValue());
        }
        return hashMap;
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c(com.p314xaae8f345.p457x3304c6.p464xb32913b4.c cVar) {
        return m32944x92a55ea2(cVar.f129543a);
    }

    public com.p314xaae8f345.p457x3304c6.p464xb32913b4.c d(com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4043x2a1119e c4043x2a1119e) {
        return new com.p314xaae8f345.p457x3304c6.p464xb32913b4.c(m32946x2b80d36(c4043x2a1119e));
    }

    @Override // com.p314xaae8f345.p457x3304c6.p464xb32913b4.InterfaceC4047xd1f5999c
    /* renamed from: onServiceStateChange */
    public void mo32947xb2f911eb(int i17) {
        java.util.Iterator it = this.f129538b.iterator();
        while (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        }
    }

    @Override // com.p314xaae8f345.p457x3304c6.p464xb32913b4.InterfaceC4047xd1f5999c
    /* renamed from: onStateChange */
    public void mo32948x4799dc42(java.lang.String str, int i17, float f17, java.lang.String finalVideoPath) {
        for (com.p314xaae8f345.p457x3304c6.p464xb32913b4.a aVar : this.f129537a) {
            if (aVar != null) {
                if (i17 == 1) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6159x3bba2a8a c6159x3bba2a8a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6159x3bba2a8a();
                    am.ty tyVar = c6159x3bba2a8a.f136421g;
                    tyVar.f89574a = 4001;
                    tyVar.f89575b = ((hz0.d) aVar).f367782a;
                    tyVar.f89577d = (int) (100 * f17);
                    tyVar.f89576c = -1;
                    c6159x3bba2a8a.e();
                } else if (i17 == 2) {
                    com.p314xaae8f345.p457x3304c6.p464xb32913b4.c cVar = new com.p314xaae8f345.p457x3304c6.p464xb32913b4.c(str);
                    hz0.d dVar = (hz0.d) aVar;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finalVideoPath, "finalVideoPath");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f367786e, "onFinish: " + str + ", " + java.lang.Thread.currentThread().getName());
                    if ((cVar.m32967xb2c87fbf(com.p314xaae8f345.p457x3304c6.p464xb32913b4.c.f129542b) ^ true) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, dVar.f367782a) && com.p314xaae8f345.mm.vfs.w6.j(finalVideoPath)) {
                        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2548x18d5ed17.C20463xb561ba28()) == 1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TemplateBackgroundWork", "onFinish: hardcode local error");
                            dVar.a(cVar);
                        } else {
                            com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.C11020xf79d3099 c11020xf79d3099 = dVar.f367787f;
                            hz0.c cVar2 = new hz0.c(finalVideoPath, dVar, c11020xf79d3099);
                            c11020xf79d3099.getClass();
                            ((ku5.t0) ku5.t0.f394148d).h(new hz0.j(c11020xf79d3099, cVar2), "sns_template_background_thread");
                        }
                    }
                } else if (i17 == 3) {
                    ((hz0.d) aVar).a(new com.p314xaae8f345.p457x3304c6.p464xb32913b4.c(str));
                } else if (i17 == 4) {
                    hz0.d dVar2 = (hz0.d) aVar;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar2.f367786e, "onCancelled: workTagId=" + dVar2.f367782a + ", " + str);
                    p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new hz0.a(dVar2, null), 3, null);
                    long j17 = dVar2.f367784c;
                    dVar2.f367787f.getClass();
                    az0.rc.i("3002", j17, null, false, 300, 12, null);
                } else if (i17 == 5) {
                    hz0.d dVar3 = (hz0.d) aVar;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar3.f367786e, "onPaused: workTagId=" + dVar3.f367782a + ", " + str);
                    long j18 = dVar3.f367784c;
                    dVar3.f367787f.getClass();
                    az0.rc.i("3001", j18, null, false, 300, 12, null);
                }
            }
        }
    }
}
