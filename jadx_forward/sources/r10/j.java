package r10;

/* loaded from: classes9.dex */
public abstract class j {
    public static final r10.i a(y02.d0 d0Var) {
        y02.b0 b0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d0Var, "<this>");
        y02.e0 e0Var = (y02.e0) d0Var;
        y02.z a17 = e0Var.a();
        if (a17 != null) {
            y02.a0 a0Var = (y02.a0) a17;
            synchronized (a0Var) {
                if (a0Var.f540125d[3]) {
                    b0Var = a0Var.f540129h;
                } else {
                    com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 m170306x21b0d646 = p3380x6a61f93.p3387xf51c6630.C30619x21b24a1c.m170306x21b0d646(a0Var.m105978x2737f10());
                    synchronized (a0Var) {
                        a0Var.f540129h = (y02.b0) m170306x21b0d646;
                        a0Var.f540125d[3] = true;
                    }
                    b0Var = (y02.b0) m170306x21b0d646;
                }
            }
        } else {
            b0Var = null;
        }
        if (b0Var == null || !(b0Var instanceof r10.i)) {
            b0Var = new r10.i();
            y02.z a18 = e0Var.a();
            if (a18 != null) {
                p3380x6a61f93.p3387xf51c6630.C30619x21b24a1c.m170311x21b3ff79(((y02.a0) a18).m105978x2737f10(), b0Var);
            }
        }
        return (r10.i) b0Var;
    }

    public static final pq.a b(y02.d0 d0Var) {
        bw5.h8 h8Var;
        yz5.p l1Var;
        yz5.p pVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d0Var, "<this>");
        android.content.Context context = a(d0Var).f450111d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        pq.a aVar = new pq.a(context);
        y02.e0 e0Var = (y02.e0) d0Var;
        y02.z a17 = e0Var.a();
        aVar.f439088e = a17 != null ? ((y02.a0) a17).d() : java.lang.System.currentTimeMillis();
        y02.z a18 = e0Var.a();
        if (a18 != null) {
            ((y02.a0) a18).a();
        }
        synchronized (e0Var) {
            if (e0Var.f540133d[1]) {
                h8Var = e0Var.f540135f;
            } else {
                h8Var = (bw5.h8) y02.k.c(p3380x6a61f93.p3387xf51c6630.C30617x21b1bcc3.m170292x21b99023(e0Var.m105978x2737f10()), new bw5.h8());
                synchronized (e0Var) {
                    e0Var.f540135f = h8Var;
                    e0Var.f540133d[1] = true;
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h8Var, "<set-?>");
        aVar.f439085b = h8Var;
        synchronized (e0Var) {
            if (e0Var.f540133d[2]) {
                pVar = e0Var.f540136g;
            } else {
                y02.h1 h1Var = (y02.h1) p3380x6a61f93.p3387xf51c6630.C30617x21b1bcc3.m170290x21b44a55(e0Var.m105978x2737f10());
                if (h1Var == null) {
                    pVar = null;
                } else {
                    if (!(h1Var instanceof y02.o1) || (l1Var = ((y02.o1) h1Var).f540153f) == null) {
                        l1Var = new y02.l1(h1Var);
                    }
                    pVar = l1Var;
                }
                synchronized (e0Var) {
                    e0Var.f540136g = pVar;
                    e0Var.f540133d[2] = true;
                }
            }
        }
        aVar.f439086c = pVar;
        pq.c cVar = a(d0Var).f450112e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<set-?>");
        aVar.f439087d = cVar;
        return aVar;
    }

    public static final y02.d0 c(pq.a aVar) {
        y02.o1 o1Var;
        y02.z a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<this>");
        int i17 = y02.e0.f540132h;
        y02.d0 d0Var = (y02.d0) p3380x6a61f93.p3387xf51c6630.C30617x21b1bcc3.m170288x21b14333(2);
        if (d0Var != null && (a17 = ((y02.e0) d0Var).a()) != null) {
            p3380x6a61f93.p3387xf51c6630.C30619x21b24a1c.m170309x21b29a90(((y02.a0) a17).m105978x2737f10(), aVar.f439088e);
        }
        if (d0Var != null) {
            a(d0Var).f450111d = aVar.c();
        }
        if (d0Var != null) {
            bw5.h8 data = aVar.f439085b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            byte[] mo14344x5f01b1f6 = data.mo14344x5f01b1f6();
            long m105978x2737f10 = ((y02.e0) d0Var).m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
            p3380x6a61f93.p3387xf51c6630.C30617x21b1bcc3.m170289x21b27371(m105978x2737f10, mo14344x5f01b1f6);
        }
        if (d0Var != null) {
            yz5.p pVar = aVar.f439086c;
            y02.e0 e0Var = (y02.e0) d0Var;
            if (pVar == null) {
                o1Var = null;
            } else {
                y02.o1 o1Var2 = new y02.o1();
                o1Var2.f540153f = pVar;
                o1Var = o1Var2;
            }
            p3380x6a61f93.p3387xf51c6630.C30617x21b1bcc3.m170294x21ba76b4(e0Var.m105978x2737f10(), o1Var);
        }
        if (d0Var != null) {
            pq.c value = aVar.f439087d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
            a(d0Var).f450112e = value;
        }
        return d0Var;
    }
}
