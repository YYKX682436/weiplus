package aq1;

/* loaded from: classes11.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq1.q0 f13049d;

    public h0(aq1.q0 q0Var) {
        this.f13049d = q0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r17;
        aq1.q0 q0Var = this.f13049d;
        java.lang.String[] b17 = q0Var.Bi().b();
        if (b17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : b17) {
                kotlin.jvm.internal.o.d(str);
                if (r26.i0.y(str, "voip-invite-", false)) {
                    arrayList.add(str);
                }
            }
            r17 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r17.add(com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo.a(q0Var.Bi().j((java.lang.String) it.next())));
            }
        } else {
            r17 = kz5.p0.f313996d;
        }
        for (com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo iLightPushService$VoipInviteInfo : r17) {
            long currentTimeMillis = (java.lang.System.currentTimeMillis() - iLightPushService$VoipInviteInfo.f188623f) / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect leak: duringMin=" + currentTimeMillis + ", id=" + iLightPushService$VoipInviteInfo.f188622e);
            if (currentTimeMillis > 10) {
                java.lang.String[] strArr = new java.lang.String[3];
                strArr[0] = java.lang.String.valueOf(currentTimeMillis);
                strArr[1] = java.lang.String.valueOf(iLightPushService$VoipInviteInfo.f188622e);
                strArr[2] = ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Ri() ? "1" : "0";
                ap.a.a(1, "voipInviteLeak", null, null, strArr);
                com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect clear last voipInviteInfo: " + iLightPushService$VoipInviteInfo.f188622e);
                q0Var.Bi().remove("voip-invite-" + iLightPushService$VoipInviteInfo.f188622e);
            }
        }
    }
}
