package n12;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final n12.a f415605a;

    public e(n12.a aVar) {
        this.f415605a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r10, java.lang.String r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n12.e.a(long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    public final java.lang.Object b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.vf2 vf2Var;
        r45.vf2 vf2Var2;
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("emoji-editor");
        if (!com.p314xaae8f345.mm.vfs.w6.j(c17)) {
            com.p314xaae8f345.mm.vfs.w6.u(c17);
        }
        java.lang.String str = c17 + '/' + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c19788xd7cfd73e.m76625xb5887639());
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return str;
        }
        java.util.LinkedList<r45.vf2> m76622xfb856031 = c19788xd7cfd73e.m76622xfb856031();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76622xfb856031, "getSpec(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = m76622xfb856031.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if ((((r45.vf2) next).m75939xb282bd08(2) * 8) * 1024 < 1000000) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            java.util.LinkedList<r45.vf2> m76622xfb8560312 = c19788xd7cfd73e.m76622xfb856031();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76622xfb8560312, "getSpec(...)");
            java.util.Iterator it6 = m76622xfb8560312.iterator();
            if (it6.hasNext()) {
                ?? next2 = it6.next();
                if (it6.hasNext()) {
                    int m75939xb282bd08 = ((r45.vf2) next2).m75939xb282bd08(2);
                    do {
                        java.lang.Object next3 = it6.next();
                        int m75939xb282bd082 = ((r45.vf2) next3).m75939xb282bd08(2);
                        next2 = next2;
                        if (m75939xb282bd08 > m75939xb282bd082) {
                            next2 = next3;
                            m75939xb282bd08 = m75939xb282bd082;
                        }
                    } while (it6.hasNext());
                }
                vf2Var2 = next2;
            } else {
                vf2Var2 = null;
            }
            vf2Var = vf2Var2;
        } else {
            java.util.Iterator it7 = arrayList.iterator();
            if (!it7.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            java.lang.Object next4 = it7.next();
            if (it7.hasNext()) {
                int m75939xb282bd083 = ((r45.vf2) next4).m75939xb282bd08(2);
                do {
                    java.lang.Object next5 = it7.next();
                    int m75939xb282bd084 = ((r45.vf2) next5).m75939xb282bd08(2);
                    if (m75939xb282bd083 < m75939xb282bd084) {
                        next4 = next5;
                        m75939xb282bd083 = m75939xb282bd084;
                    }
                } while (it7.hasNext());
            }
            vf2Var = (r45.vf2) next4;
        }
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        java.lang.String str2 = str + ".tmp";
        com.p314xaae8f345.mm.vfs.w6.e(str2);
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a("emoji_editor-finder-" + c19788xd7cfd73e.m76625xb5887639());
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_VideoPreloadWorker";
        oVar.f69601xaca5bdda = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c19788xd7cfd73e.m76625xb5887639());
        oVar.M1 = c19788xd7cfd73e.m76625xb5887639() + c19788xd7cfd73e.m76628xfece4473();
        oVar.f69595x6d25b0d9 = str2;
        oVar.Y1 = c19788xd7cfd73e.m76588x1e2296db();
        oVar.f323331q = c19788xd7cfd73e.m76607x6a850994() == 1;
        oVar.Y = 0;
        oVar.H1 = 0;
        oVar.Z = 8;
        oVar.V1 = 100;
        oVar.X = 0L;
        oVar.f323342y0 = zy2.u.f559114a;
        oVar.f323339x0 = 1;
        oVar.f69592xf1ebe47b = 20302;
        oVar.f69610x4f5245a8 = 0;
        oVar.Z1 = true;
        oVar.f323346a2 = true;
        if (vf2Var != null) {
            oVar.X1 = vf2Var.m75945x2fec8307(0);
        }
        oVar.f323348c2 = new n12.d(this, str2, str, rVar);
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().e(oVar, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "start downloading, path: " + str + ", url: " + c19788xd7cfd73e.m76625xb5887639() + c19788xd7cfd73e.m76628xfece4473());
        rVar.m(new n12.c(a17, str2));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }
}
