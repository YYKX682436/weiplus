package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes11.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.i0 f145037a = new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.i0();

    public m0(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.k0 k0Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r27, long r28, boolean r30, boolean r31, java.lang.String r32, int r33, java.lang.String r34, java.lang.String r35, android.content.Intent r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 2076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.m0.a(com.tencent.mm.storage.f9, long, boolean, boolean, java.lang.String, int, java.lang.String, java.lang.String, android.content.Intent, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0249, code lost:
    
        if (r21.y2() != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024f, code lost:
    
        if (r21.F2() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.String r20, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.m0.b(java.lang.String, com.tencent.mm.storage.f9, int, boolean):boolean");
    }

    public void c(int i17, java.util.Map map) {
        if (this.f145037a.f145032a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Notification.Handle", "mAppMsgHandle is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.AppMsg.Handle", "refreshTotalUnread, %d, %s", java.lang.Integer.valueOf(i17), map);
        if (i17 == -1) {
            i17 = ip.l.b();
        }
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.e0.g(i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (map == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.HashMap hashMap = (java.util.HashMap) c01.h2.e(c01.e2.f118654e);
            java.util.Iterator it = hashMap.keySet().iterator();
            int i18 = -1;
            while (it.hasNext()) {
                i18--;
                arrayList2.add(((com.p314xaae8f345.mm.p2621x8fb0427b.z3) hashMap.get((java.lang.String) it.next())).d1());
                if (i18 == 0) {
                    break;
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.d0 d0Var = new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.d0(null);
                d0Var.f145009d = str;
                d0Var.f145010e = c01.h2.d(str, null);
                arrayList.add(d0Var);
            }
        } else {
            for (java.util.Map.Entry entry : map.entrySet()) {
                com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.d0 d0Var2 = new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.d0(null);
                d0Var2.f145009d = (java.lang.String) entry.getKey();
                d0Var2.f145010e = ((java.lang.Integer) entry.getValue()).intValue();
                arrayList.add(d0Var2);
            }
        }
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.e0.h(arrayList);
    }
}
