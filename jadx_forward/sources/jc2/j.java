package jc2;

/* loaded from: classes8.dex */
public final class j implements jc2.d {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f380489a;

    /* renamed from: b, reason: collision with root package name */
    public final ey2.t0 f380490b;

    public j(zy2.fa manager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        this.f380489a = manager;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f380490b = (ey2.t0) a17;
    }

    public static void c(jc2.j jVar, r45.vs2 vs2Var, java.lang.String str, int i17, java.lang.Object obj) {
        java.lang.Object obj2;
        r45.f03 I0;
        if ((i17 & 2) != 0) {
            str = g92.b.f351302e.T0();
        }
        jVar.getClass();
        if (vs2Var.f470020e == 15) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = vs2Var.f470022g.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = ((r45.f03) it.next()).f455425i;
                if (str2 == null) {
                    str2 = "";
                }
                hashSet.add(str2);
            }
            java.util.LinkedList f17 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().f(15, str);
            synchronized (f17) {
                java.util.ListIterator listIterator = f17.listIterator(f17.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj2).f65883xdec927b)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj2;
            if (jbVar != null) {
                for (java.lang.String str3 : jbVar.J0()) {
                    if (!hashSet.contains(str3) && (I0 = jbVar.I0(str3)) != null) {
                        vs2Var.f470022g.add(I0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:275:0x09ea, code lost:
    
        if (r3.intValue() == 1) goto L334;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06f5  */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object] */
    @Override // jc2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb a(jc2.c r45) {
        /*
            Method dump skipped, instructions count: 2882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jc2.j.a(jc2.c):com.tencent.mm.plugin.finder.extension.reddot.jb");
    }

    public final long b() {
        return c01.id.c() - gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_EXIT_NEARBY_LONG_SYNC, 0L);
    }
}
