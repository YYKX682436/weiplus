package nt4;

/* loaded from: classes9.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f421356a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f421357b;

    public f(int i17, java.lang.String str) {
        this.f421356a = i17;
        this.f421357b = str;
    }

    public static nt4.f a(int i17) {
        return b(i17, "");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static nt4.f b(int r4, java.lang.String r5) {
        /*
            r0 = -15001(0xffffffffffffc567, float:NaN)
            r1 = 2131780795(0x7f1064bb, float:1.9193185E38)
            if (r4 > r0) goto L9
        L7:
            r0 = r4
            goto L53
        L9:
            if (r4 == 0) goto L4f
            r0 = 1
            if (r4 == r0) goto L4b
            r0 = 3
            if (r4 == r0) goto L48
            r2 = 6
            if (r4 == r2) goto L42
            r3 = 7
            if (r4 == r3) goto L4b
            r3 = 8
            if (r4 == r3) goto L3e
            switch(r4) {
                case 103: goto L37;
                case 104: goto L37;
                case 105: goto L48;
                case 106: goto L35;
                default: goto L1e;
            }
        L1e:
            switch(r4) {
                case 109: goto L31;
                case 110: goto L2d;
                case 111: goto L29;
                case 112: goto L25;
                case 113: goto L7;
                default: goto L21;
            }
        L21:
            switch(r4) {
                case 100000001: goto L35;
                case 100000002: goto L37;
                default: goto L24;
            }
        L24:
            goto L35
        L25:
            r1 = 2131780798(0x7f1064be, float:1.9193191E38)
            goto L7
        L29:
            r1 = 2131780800(0x7f1064c0, float:1.9193196E38)
            goto L7
        L2d:
            r1 = 2131780799(0x7f1064bf, float:1.9193194E38)
            goto L7
        L31:
            r1 = 2131780797(0x7f1064bd, float:1.919319E38)
            goto L7
        L35:
            r0 = r2
            goto L53
        L37:
            r0 = 100000002(0x5f5e102, float:2.3122344E-35)
            r1 = 2131780792(0x7f1064b8, float:1.919318E38)
            goto L53
        L3e:
            r1 = 2131780793(0x7f1064b9, float:1.9193181E38)
            goto L7
        L42:
            nt4.f r4 = new nt4.f
            r4.<init>(r2, r5)
            return r4
        L48:
            java.lang.String r5 = "Google Play not install"
            goto L53
        L4b:
            r1 = 2131780796(0x7f1064bc, float:1.9193187E38)
            goto L7
        L4f:
            r1 = 2131780794(0x7f1064ba, float:1.9193183E38)
            goto L7
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "code : "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = ", errMsg : "
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = ", convert to errCode : "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "MicroMsg.IapResult"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4)
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)
            if (r4 == 0) goto L88
            nt4.f r4 = new nt4.f
            android.content.Context r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r5 = r5.getString(r1)
            r4.<init>(r0, r5)
            return r4
        L88:
            nt4.f r4 = new nt4.f
            r4.<init>(r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nt4.f.b(int, java.lang.String):nt4.f");
    }

    public boolean c() {
        int i17 = this.f421356a;
        if (!(i17 == 0)) {
            if (!(i17 == 104 || i17 == 100000002)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m149966x9616526c() {
        return "IapResult: " + this.f421357b;
    }
}
