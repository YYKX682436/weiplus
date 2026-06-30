package pc0;

@j95.b
/* loaded from: classes10.dex */
public final class e2 extends i95.w implements qc0.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f434782d = new java.util.HashSet();

    public boolean Ai(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c ui6, android.os.Bundle bundle, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (bundle == null) {
            return false;
        }
        android.os.Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        android.os.Bundle bundle3 = bundle2 != null ? bundle2.getBundle("android:support:activity-result") : null;
        if (bundle3 != null) {
            ui6.mo2507xfe541f5f().c(bundle3);
            java.util.ArrayList<java.lang.String> stringArrayList = bundle3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null) {
                for (java.lang.String str : stringArrayList) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    if (r26.i0.y(str, "media_opt_", false) && this.f434782d.contains(str)) {
                        ui6.mo2507xfe541f5f().e(str, new pc0.a2(-1), new pc0.d2(str, this, callback));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaOptService", "restoreCallback success key:".concat(str));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object wi(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c r12, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            r11 = this;
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r14 = pz5.f.b(r14)
            r0 = 1
            r6.<init>(r14, r0)
            r6.k()
            pc0.c2 r14 = new pc0.c2
            r14.<init>(r6)
            boolean r1 = iq.b.h(r12, r0, r14)
            java.lang.String r7 = "MicroMsg.MediaOptService"
            r8 = 0
            if (r1 != 0) goto L5b
            boolean r1 = iq.b.D(r12, r14)
            if (r1 != 0) goto L5b
            boolean r1 = iq.b.w(r12, r14)
            if (r1 == 0) goto L28
            goto L5b
        L28:
            java.lang.Class<tb0.j> r1 = tb0.j.class
            i95.m r1 = i95.n0.c(r1)
            tb0.j r1 = (tb0.j) r1
            sb0.f r1 = (sb0.f) r1
            r1.getClass()
            java.lang.String r1 = "android.permission.CAMERA"
            r2 = 16
            java.lang.String r3 = ""
            boolean r1 = j35.u.a(r12, r1, r2, r3, r3)
            if (r1 != 0) goto L4b
            java.lang.String r0 = "not get enough permission checkCamera"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r0)
            r0 = 0
            r14.onClick(r0, r8)
            goto L60
        L4b:
            boolean r14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.String r14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(r0)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.String r1 = "checkPermission %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r1, r14)
            goto L61
        L5b:
            java.lang.String r14 = "checkPermission, voip or multitalk running"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r14)
        L60:
            r0 = r8
        L61:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "optRecord start ui:"
            r14.<init>(r1)
            r14.append(r12)
            java.lang.String r1 = " checkPermission:"
            r14.append(r1)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r14)
            if (r0 != 0) goto L7d
            goto Le7
        L7d:
            kotlin.jvm.internal.h0 r14 = new kotlin.jvm.internal.h0
            r14.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "media_opt_"
            r0.<init>(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r9 = r0.toString()
            pc0.b2 r10 = new pc0.b2
            r0 = r10
            r1 = r12
            r2 = r9
            r3 = r14
            r4 = r11
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "optLaunch key:"
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(r7, r0, r1)
            boolean r0 = com.p314xaae8f345.mm.ui.bk.Q()
            if (r0 != 0) goto Lbe
            boolean r0 = com.p314xaae8f345.mm.ui.bk.A()
            if (r0 == 0) goto Lc3
        Lbe:
            java.util.HashSet r0 = r11.f434782d
            r0.add(r9)
        Lc3:
            androidx.activity.result.h r0 = r12.mo2507xfe541f5f()
            pc0.a2 r1 = new pc0.a2
            r1.<init>(r8)
            androidx.activity.result.c r0 = r0.e(r9, r1, r10)
            r14.f391656d = r0
            z2.i r14 = new z2.i
            android.app.ActivityOptions r1 = z2.l.a()
            r14.<init>(r1)
            r0.a(r13, r14)
            r13 = 2130772174(0x7f0100ce, float:1.7147459E38)
            r14 = 2130772175(0x7f0100cf, float:1.714746E38)
            r12.overridePendingTransition(r13, r14)
        Le7:
            java.lang.Object r12 = r6.j()
            pz5.a r13 = pz5.a.f440719d
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pc0.e2.wi(androidx.activity.ComponentActivity, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
