package jm3;

/* loaded from: classes2.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final jm3.h1 f381855a = new jm3.h1();

    public final void a(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 obj) {
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj2;
        r45.m23 m23Var;
        r45.oj4 oj4Var;
        r45.rj4 rj4Var;
        java.util.LinkedList<r45.bk4> m75941xfb8219142;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        r45.lu0 m76754xe4c0157 = obj.m76754xe4c0157();
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> linkedList = null;
        if (m76754xe4c0157 != null && (m75941xfb821914 = m76754xe4c0157.m75941xfb821914(0)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((r45.ku0) obj2).m75939xb282bd08(0) == 1) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            r45.ku0 ku0Var = (r45.ku0) obj2;
            if (ku0Var != null && (m23Var = (r45.m23) ku0Var.m75936x14adae67(1)) != null && (oj4Var = (r45.oj4) m23Var.m75936x14adae67(1)) != null && (rj4Var = (r45.rj4) oj4Var.m75936x14adae67(2)) != null && (m75941xfb8219142 = rj4Var.m75941xfb821914(1)) != null) {
                linkedList = new java.util.LinkedList<>();
                for (r45.bk4 bk4Var : m75941xfb8219142) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bk4Var, "<this>");
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e();
                    c19788xd7cfd73e.m76678xca029dad(bk4Var.m75945x2fec8307(0));
                    c19788xd7cfd73e.m76676xd3f7e23b(bk4Var.m75945x2fec8307(1));
                    c19788xd7cfd73e.m76666xdb5612fc(4);
                    c19788xd7cfd73e.m76682xc9923ded(bk4Var.m75939xb282bd08(3));
                    c19788xd7cfd73e.m76685x53e9ee84(bk4Var.m75938x746dc8a6(4));
                    c19788xd7cfd73e.m76658xf84e829(bk4Var.m75938x746dc8a6(5));
                    c19788xd7cfd73e.m76665x17e7970f(bk4Var.m75945x2fec8307(6));
                    c19788xd7cfd73e.m76644x4abaca1f(bk4Var.m75939xb282bd08(7));
                    c19788xd7cfd73e.m76634xab2604ab(bk4Var.m75939xb282bd08(8));
                    java.util.LinkedList<r45.vf2> m76622xfb856031 = c19788xd7cfd73e.m76622xfb856031();
                    m76622xfb856031.clear();
                    java.util.LinkedList<r45.ck4> m75941xfb8219143 = bk4Var.m75941xfb821914(15);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getSpec(...)");
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    for (r45.ck4 ck4Var : m75941xfb8219143) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ck4Var, "<this>");
                        r45.vf2 vf2Var = new r45.vf2();
                        vf2Var.set(0, ck4Var.m75945x2fec8307(0));
                        vf2Var.set(1, java.lang.Integer.valueOf(ck4Var.m75939xb282bd08(1)));
                        vf2Var.set(2, java.lang.Integer.valueOf(ck4Var.m75939xb282bd08(2)));
                        vf2Var.set(3, ck4Var.m75945x2fec8307(3));
                        linkedList2.add(vf2Var);
                    }
                    m76622xfb856031.addAll(linkedList2);
                    c19788xd7cfd73e.m76638x619ae8ba(bk4Var.m75945x2fec8307(10));
                    c19788xd7cfd73e.m76641x7a76574f(bk4Var.m75945x2fec8307(9));
                    c19788xd7cfd73e.m76681x5b2204e7(bk4Var.m75945x2fec8307(12));
                    c19788xd7cfd73e.m76677x8372173e(bk4Var.m75945x2fec8307(13));
                    c19788xd7cfd73e.m76640xb83193df(bk4Var.m75945x2fec8307(14));
                    c19788xd7cfd73e.m76659xc4dbd88d((r45.kb1) bk4Var.m75936x14adae67(16));
                    c19788xd7cfd73e.m76660x653d6aa0(bk4Var.m75939xb282bd08(18));
                    c19788xd7cfd73e.m76656xf87fac2e((r45.bb1) bk4Var.m75936x14adae67(19));
                    c19788xd7cfd73e.m76651xbcc476d8(bk4Var.m75945x2fec8307(20));
                    c19788xd7cfd73e.m76652x840911d2(bk4Var.m75945x2fec8307(21));
                    linkedList.add(c19788xd7cfd73e);
                }
            }
        }
        if (linkedList != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvLogic", "convertFinderLongVideoDuration replace success " + obj.m76784x5db1b11());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = obj.m76802x2dd01666();
            if (m76802x2dd01666 == null) {
                return;
            }
            m76802x2dd01666.m77000x535b30a2(linkedList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(r45.ss4 r19) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jm3.h1.b(r45.ss4):void");
    }

    public final java.lang.String c(r45.hf2 hf2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hf2Var, "<this>");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("songId: ");
        stringBuffer.append(hf2Var.m75945x2fec8307(5));
        stringBuffer.append("\nsongName: ");
        stringBuffer.append(hf2Var.m75945x2fec8307(0));
        stringBuffer.append("\nsinger: ");
        stringBuffer.append(hf2Var.m75945x2fec8307(1));
        stringBuffer.append("\nalbumName: ");
        stringBuffer.append(hf2Var.m75945x2fec8307(7));
        stringBuffer.append("\nalbumUrl: ");
        stringBuffer.append(hf2Var.m75945x2fec8307(8));
        stringBuffer.append("\ngenre: ");
        stringBuffer.append(hf2Var.m75945x2fec8307(9));
        stringBuffer.append("\npublicTime: ");
        stringBuffer.append(hf2Var.m75942xfb822ef2(11));
        stringBuffer.append("\nduration: ");
        stringBuffer.append(hf2Var.m75939xb282bd08(14));
        stringBuffer.append("\ndataUrl: ");
        stringBuffer.append(hf2Var.m75945x2fec8307(2));
        stringBuffer.append("\nwebUrl: ");
        stringBuffer.append(hf2Var.m75945x2fec8307(4));
        stringBuffer.append("\nsongLyric: ");
        stringBuffer.append(hf2Var.m75945x2fec8307(6));
        stringBuffer.append("\n");
        return "FinderMVSongInfo " + ((java.lang.Object) stringBuffer);
    }
}
