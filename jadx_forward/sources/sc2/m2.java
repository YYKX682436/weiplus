package sc2;

/* loaded from: classes2.dex */
public final class m2 extends sc2.f2 {

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f487603z = "FeedDynamicMultiCardJumperObserver";

    @Override // ad2.h
    public void A(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        java.lang.String str;
        java.lang.Object obj;
        r45.ag0 ag0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.A(holder, jumpView, infoEx);
        sc2.q8 q8Var = infoEx.f534766J;
        int i17 = q8Var != null ? q8Var.f487712c : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVideoFinish: jumperState=");
        sb6.append(i17);
        sb6.append(", jumpId=");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        sb6.append(c19786x6a1e2862.m76501xf2fd2296());
        sb6.append(", feedId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = infoEx.f534777f;
        sb6.append(pm0.v.u(abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.mo2128x1ed62e84() : 0L));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f487603z;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (i17 == 2 || (abstractC14490x69736cb5 = infoEx.f534777f) == null || (str = infoEx.f534780i) == null) {
            return;
        }
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.wf6) obj).m75939xb282bd08(2) == 31) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (ag0Var = (r45.ag0) wf6Var.m75936x14adae67(40)) == null) {
            return;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("tryFinishExpand: finish_change=");
        sb8.append(ag0Var.m75939xb282bd08(3));
        sb8.append(", jumpId=");
        sb8.append(c19786x6a1e2862.m76501xf2fd2296());
        sb8.append(", feedId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = infoEx.f534777f;
        sb8.append(pm0.v.u(abstractC14490x69736cb53 != null ? abstractC14490x69736cb53.mo2128x1ed62e84() : 0L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
        if (ag0Var.m75939xb282bd08(3) > 0) {
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = a8Var != null ? a8Var.f487742e : null;
            if (n3Var != null) {
                n3Var.mo50302x6b17ad39(sc2.i2.A);
            }
            K(abstractC14490x69736cb5, holder, jumpView, infoEx, str, P(infoEx), true);
            sc2.q8 q8Var2 = infoEx.f534766J;
            if (q8Var2 != null) {
                q8Var2.f487712c = 2;
            }
            I(jumpView, N(infoEx), P(infoEx));
            W(holder, jumpView, infoEx, "tryFinishExpand");
            xc2.z2 z2Var = this.f84684o;
            xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
            if (bVar == null || infoEx.f534794w != 0 || bVar.f534602m <= 0) {
                return;
            }
            infoEx.f534794w = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f534602m) / 1000);
        }
    }

    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        java.lang.String str;
        java.lang.Object obj;
        r45.ag0 ag0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.c(holder, jumpView, infoEx, z17, aVar);
        sc2.q8 q8Var = infoEx.f534766J;
        int i17 = q8Var != null ? q8Var.f487712c : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRealShow: jumperState=");
        sb6.append(i17);
        sb6.append(", jumpId=");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        sb6.append(c19786x6a1e2862.m76501xf2fd2296());
        sb6.append(", feedId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        sb6.append(pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f487603z;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (i17 != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = infoEx.f534777f;
            if (abstractC14490x69736cb52 == null || (str = infoEx.f534780i) == null) {
                return;
            }
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator<T> it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.wf6) obj).m75939xb282bd08(2) == 31) {
                        break;
                    }
                }
            }
            r45.wf6 wf6Var = (r45.wf6) obj;
            if (wf6Var != null && (ag0Var = (r45.ag0) wf6Var.m75936x14adae67(40)) != null) {
                long m75939xb282bd08 = ag0Var.m75939xb282bd08(2) * 1000;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("tryDelayExpand: delayExpandMs=");
                sb8.append(m75939xb282bd08);
                sb8.append(", jumpId=");
                sb8.append(c19786x6a1e2862.m76501xf2fd2296());
                sb8.append(", feedId=");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = infoEx.f534777f;
                sb8.append(pm0.v.u(abstractC14490x69736cb53 != null ? abstractC14490x69736cb53.mo2128x1ed62e84() : 0L));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
                if (m75939xb282bd08 > 0) {
                    android.content.Context context = holder.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = a8Var != null ? a8Var.f487742e : null;
                    long uptimeMillis = android.os.SystemClock.uptimeMillis() + m75939xb282bd08;
                    if (n3Var != null) {
                        n3Var.mo50302x6b17ad39(sc2.i2.A);
                    }
                    if (n3Var != null) {
                        n3Var.mo50296x41bd0e60(new sc2.l2(this, infoEx, abstractC14490x69736cb52, holder, jumpView, str), sc2.i2.A, uptimeMillis);
                    }
                }
            }
        }
        xc2.z2 z2Var = this.f84684o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        if (bVar == null || infoEx.f534793v != 0 || bVar.f534602m <= 0) {
            return;
        }
        infoEx.f534793v = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f534602m) / 1000);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487603z;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        r45.su N = N(infoEx);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(N != null ? N.m75945x2fec8307(1) : null)) {
            r45.su P = P(infoEx);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P != null ? P.m75945x2fec8307(1) : null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x02d6, code lost:
    
        if (r1 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x02ea, code lost:
    
        if (r1 == null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0414 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0421 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0447 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0454 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03c9 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03b4 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0378 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0362 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0343 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034f A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0370 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0390 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03a0 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03c1 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03e1 A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ee A[Catch: all -> 0x0396, TryCatch #0 {all -> 0x0396, blocks: (B:70:0x0339, B:72:0x0343, B:73:0x0349, B:75:0x034f, B:77:0x035b, B:78:0x036a, B:80:0x0370, B:81:0x0386, B:83:0x0390, B:84:0x039a, B:86:0x03a0, B:88:0x03ac, B:89:0x03bb, B:91:0x03c1, B:92:0x03d7, B:94:0x03e1, B:95:0x03e8, B:97:0x03ee, B:99:0x03fa, B:100:0x0401, B:102:0x0408, B:104:0x0414, B:105:0x041b, B:107:0x0421, B:109:0x042d, B:110:0x0434, B:112:0x043b, B:114:0x0447, B:115:0x044e, B:117:0x0454, B:119:0x045e, B:120:0x0465, B:245:0x03c9, B:247:0x03b4, B:249:0x0378, B:251:0x0362), top: B:69:0x0339 }] */
    @Override // ad2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r40, in5.s0 r41, android.view.View r42, xc2.p0 r43, java.lang.String r44) {
        /*
            Method dump skipped, instructions count: 2354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.m2.q(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String):void");
    }
}
