package mm;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final mm.h f410018a = new mm.h();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f410019b;

    static {
        jz5.i iVar = jz5.i.f384362d;
        jz5.h.a(iVar, mm.g.f410015d);
        jz5.h.a(iVar, mm.e.f410010d);
        jz5.h.a(iVar, mm.f.f410012d);
        jz5.h.a(iVar, mm.c.f410005d);
        jz5.h.a(iVar, mm.a.f409996d);
        f410019b = jz5.h.a(iVar, mm.b.f410004d);
    }

    public final void a(r45.j4 add) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(add, "add");
        if (((java.lang.Boolean) ((jz5.n) mm.j.f410028a).mo141623x754a37bb()).booleanValue()) {
            jz5.g gVar = f410019b;
            synchronized (((java.util.Map) gVar.mo141623x754a37bb())) {
                mm.h hVar = f410018a;
                ((java.util.Map) gVar.mo141623x754a37bb()).remove(java.lang.Long.valueOf(add.f459101r));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.proc.MsgTracker", "freeAddMsg: add=" + hVar.c(add) + ':' + add.hashCode() + ", id=" + add.f459090d + ':' + add.f459101r);
            }
        }
    }

    public final int b(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        boolean z17 = obj instanceof r45.ju4;
        mm.h hVar = f410018a;
        if (z17) {
            r45.ju4 ju4Var = (r45.ju4) obj;
            java.util.LinkedList CmdList = ju4Var.f459649i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CmdList, "CmdList");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(CmdList, 10));
            java.util.Iterator it = CmdList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(hVar.b((r45.b50) it.next())));
            }
            java.lang.Object[] array = arrayList.toArray(new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.l0 l0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.l0(7);
            l0Var.a(java.lang.Integer.valueOf(b(ju4Var.f459644d)));
            l0Var.a(java.lang.Integer.valueOf(b(ju4Var.f459645e)));
            l0Var.a(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ju4Var.f459646f))));
            l0Var.a(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ju4Var.f459647g))));
            l0Var.a(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ju4Var.f459648h))));
            l0Var.b(array);
            l0Var.a(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ju4Var.f459650m))));
            return java.util.Objects.hash(l0Var.d(new java.lang.Object[l0Var.c()]));
        }
        if (obj instanceof r45.ew4) {
            r45.ew4 ew4Var = (r45.ew4) obj;
            return java.util.Objects.hash(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ew4Var.f455291d))), java.lang.Integer.valueOf(b(ew4Var.f455292e)), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ew4Var.f455293f))), java.lang.Integer.valueOf(b(ew4Var.f455294g)), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ew4Var.f455295h))), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ew4Var.f455296i))), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(ew4Var.f455297m))));
        }
        if (obj instanceof r45.j4) {
            return c((r45.j4) obj);
        }
        if (obj instanceof r45.b50) {
            r45.b50 b50Var = (r45.b50) obj;
            return java.util.Objects.hash(java.lang.Integer.valueOf(b50Var.f452063d), java.lang.Integer.valueOf(b(b50Var.f452064e)));
        }
        if (!(obj instanceof r45.c50)) {
            if (obj instanceof r45.du5) {
                java.lang.String g17 = x51.j1.g((r45.du5) obj);
                if (g17 == null) {
                    return 0;
                }
                return g17.hashCode();
            }
            if (!(obj instanceof r45.cu5)) {
                return obj.hashCode();
            }
            byte[] d17 = x51.j1.d((r45.cu5) obj);
            if (d17 == null) {
                return 0;
            }
            return java.util.Arrays.hashCode(d17);
        }
        r45.c50 c50Var = (r45.c50) obj;
        java.util.LinkedList List = c50Var.f452828e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(List, "List");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(List, 10));
        java.util.Iterator it6 = List.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(hVar.b((r45.b50) it6.next())));
        }
        java.lang.Object[] array2 = arrayList2.toArray(new java.lang.Object[0]);
        p3321xbce91901.jvm.p3324x21ffc6bd.l0 l0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.l0(2);
        l0Var2.a(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(c50Var.f452827d))));
        l0Var2.b(array2);
        return java.util.Objects.hash(l0Var2.d(new java.lang.Object[l0Var2.c()]));
    }

    public final int c(r45.j4 addMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsg, "addMsg");
        return java.util.Objects.hash(java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f459090d))), java.lang.Integer.valueOf(b(addMsg.f459091e)), java.lang.Integer.valueOf(b(addMsg.f459092f)), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f459093g))), java.lang.Integer.valueOf(b(addMsg.f459094h)), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f459095i))), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f459096m))), java.lang.Integer.valueOf(b(addMsg.f459097n)), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f459098o))), java.lang.Integer.valueOf(b(addMsg.f459099p)), java.lang.Integer.valueOf(b(addMsg.f459100q)), java.lang.Integer.valueOf(b(java.lang.Long.valueOf(addMsg.f459101r))), java.lang.Integer.valueOf(b(java.lang.Integer.valueOf(addMsg.f459102s))));
    }
}
