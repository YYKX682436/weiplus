package l0;

/* loaded from: classes14.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f395626a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final float f395627b = 8;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b3, code lost:
    
        if (r7.e(r84) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r71, yz5.l r72, z0.t r73, boolean r74, boolean r75, a2.o1 r76, yz5.p r77, yz5.p r78, yz5.p r79, yz5.p r80, boolean r81, g2.t0 r82, j0.j2 r83, j0.i2 r84, boolean r85, int r86, c0.o r87, e1.a1 r88, l0.m3 r89, n0.o r90, int r91, int r92, int r93) {
        /*
            Method dump skipped, instructions count: 1437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c1.a(java.lang.String, yz5.l, z0.t, boolean, boolean, a2.o1, yz5.p, yz5.p, yz5.p, yz5.p, boolean, g2.t0, j0.j2, j0.i2, boolean, int, c0.o, e1.a1, l0.m3, n0.o, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0141, code lost:
    
        if (r1 == n0.n.f415153a) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(z0.t r32, yz5.p r33, yz5.q r34, yz5.p r35, yz5.p r36, yz5.p r37, boolean r38, float r39, yz5.l r40, yz5.p r41, d0.d2 r42, n0.o r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c1.b(z0.t, yz5.p, yz5.q, yz5.p, yz5.p, yz5.p, boolean, float, yz5.l, yz5.p, d0.d2, n0.o, int, int):void");
    }

    public static final int c(int i17, int i18, int i19, int i27, int i28, long j17, float f17, d0.d2 d2Var) {
        d0.e2 e2Var = (d0.e2) d2Var;
        return java.lang.Math.max(p2.c.i(j17), java.lang.Math.max(i17, java.lang.Math.max(i18, a06.d.b(java.lang.Math.max(i19, i28) + (e2Var.f306644d * f17) + java.lang.Math.max(e2Var.f306642b * f17, i27 / 2.0f)))));
    }
}
