package mm2;

/* loaded from: classes10.dex */
public final class p implements mn0.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w f410874d;

    public p(mm2.w wVar) {
        this.f410874d = wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.m66744x2a55bdd7().mo162437xc00617a4() == true) goto L8;
     */
    @Override // mn0.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j6() {
        /*
            r3 = this;
            mm2.w r0 = r3.f410874d
            mm2.h r1 = r0.f411037p
            if (r1 == 0) goto L12
            rh3.o r1 = r1.m66744x2a55bdd7()
            boolean r1 = r1.mo162437xc00617a4()
            r2 = 1
            if (r1 != r2) goto L12
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L1c
            mm2.h r0 = r0.f411037p
            if (r0 == 0) goto L1c
            r0.q()
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.p.j6():void");
    }

    @Override // mn0.c0
    public void u() {
        r45.ce2 m147935x5721a227;
        mm2.w wVar = this.f410874d;
        mm2.h hVar = wVar.f411037p;
        if (hVar == null || (m147935x5721a227 = hVar.m147935x5721a227()) == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long m147936x307afbb9 = currentTimeMillis - hVar.m147936x307afbb9();
        java.lang.Long valueOf = java.lang.Long.valueOf(hVar.m147944xdf1112ec());
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : m147935x5721a227.m75942xfb822ef2(2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "onLive PlayerResume startPos: " + m147936x307afbb9 + " curTime: " + currentTimeMillis + " startTime: " + m147935x5721a227.m75942xfb822ef2(1) + " duration: " + longValue + " curStartPlayTime: " + hVar.m147936x307afbb9() + " live_ad_id: " + m147935x5721a227.m75945x2fec8307(0));
        if (m147936x307afbb9 > longValue) {
            java.lang.String m75945x2fec8307 = m147935x5721a227.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            mm2.w.N6(wVar, m75945x2fec8307);
            return;
        }
        int mo162423x75286adb = hVar.m66744x2a55bdd7().mo162423x75286adb();
        if (mo162423x75286adb != 0) {
            if (mo162423x75286adb != 1 && mo162423x75286adb != 2) {
                switch (mo162423x75286adb) {
                    case 6:
                        hVar.m66744x2a55bdd7().mo162431x68ac462();
                        break;
                }
                hVar.m66744x2a55bdd7().mo162429xc9fc1b13(m147936x307afbb9);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.m66740xe56ce956(), "pause return for state:" + mo162423x75286adb);
            hVar.m66744x2a55bdd7().mo162429xc9fc1b13(m147936x307afbb9);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hVar.m66744x2a55bdd7().mo162429xc9fc1b13(m147936x307afbb9);
    }
}
