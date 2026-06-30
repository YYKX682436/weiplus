package r10;

@j95.b
/* loaded from: classes9.dex */
public final class q extends i95.w implements pq.q {
    public void Ai(pq.a context, java.lang.String jumpInfoBase64Str, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoBase64Str, "jumpInfoBase64Str");
        try {
            byte[] decode = android.util.Base64.decode(jumpInfoBase64Str, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            Bi(context, decode, lVar);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ECS_O.service", e17, "hy: invalid base64", new java.lang.Object[0]);
        }
    }

    public void Bi(pq.a context, byte[] jumpInfoBytes, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoBytes, "jumpInfoBytes");
        try {
            bw5.x7 mo11468x92b714fd = new bw5.x7().mo11468x92b714fd(jumpInfoBytes);
            jz5.f0 f0Var = null;
            if (!(mo11468x92b714fd instanceof bw5.x7)) {
                mo11468x92b714fd = null;
            }
            if (mo11468x92b714fd != null) {
                wi(context, mo11468x92b714fd, lVar);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("ECS_O.service", "hy: can not parse bytes to EcsJumpInfo with size " + jumpInfoBytes.length, new java.lang.Object[0]);
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ECS_O.service", e17, "hy: failed when parse", new java.lang.Object[0]);
        }
    }

    public final void Di(pq.a aVar, yz5.q qVar, yz5.l lVar) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, 0, s00.a.class, null);
        java.lang.String valueOf = java.lang.String.valueOf(aVar.f439088e);
        z20.e eVar = z20.e.f551075d;
        z20.b bVar = new z20.b();
        bVar.f551070a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f113532d = "ecso_open";
        q9Var.f113546u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f551071b = q9Var;
        bVar.f(valueOf);
        bVar.c("native_start");
        bVar.a();
        int i17 = y02.j0.f540142d;
        y02.h0 h0Var = (y02.h0) p3380x6a61f93.p3387xf51c6630.C30621x21b27191.m170322x21b0d463();
        if (h0Var != null) {
            r10.p pVar = new r10.p(aVar, qVar, h0Var, valueOf, lVar);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOpenAsyncInfo", "fetchAsyncInfo direct, already in main process");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOpenAsyncInfo", "fetchDirectly, executing in main process");
                pVar.mo146xb9724478((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a.C10545xf0ca44c1) new r10.f().a());
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOpenAsyncInfo", "fetchAsyncInfo via IPC, switching to main process");
                r10.g gVar = new r10.g(pVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOpenAsyncInfo", "invokeAsync via IPC, task: ".concat(r10.f.class.getSimpleName()));
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a.C10544x1911ae8f(0, 1, null), r10.f.class, new r10.h(r10.f.class, gVar));
                return;
            }
        }
        z20.e eVar2 = z20.e.f551078g;
        z20.b bVar2 = new z20.b();
        bVar2.f551070a = eVar2;
        bw5.q9 q9Var2 = new bw5.q9();
        q9Var2.f113532d = "ecso_open";
        q9Var2.f113546u[1] = true;
        q9Var2.c(java.lang.System.currentTimeMillis());
        q9Var2.b(2);
        bVar2.f551071b = q9Var2;
        bVar2.f(valueOf);
        bVar2.c("native_failed");
        bVar2.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.service", "EcsOpenService_UrCpp is null");
    }

    public void Ni(pq.a context, bw5.x7 jumpInfo, bw5.l8 l8Var, yz5.l lVar) {
        y02.o1 o1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        int i17 = y02.j0.f540142d;
        y02.h0 h0Var = (y02.h0) p3380x6a61f93.p3387xf51c6630.C30621x21b27191.m170322x21b0d463();
        if (h0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.service", "EcsOpenService_UrCpp is null");
            return;
        }
        y02.d0 c17 = r10.j.c(context);
        if (l8Var == null) {
            l8Var = new bw5.l8();
        }
        y02.j0 j0Var = (y02.j0) h0Var;
        byte[] mo14344x5f01b1f6 = jumpInfo.mo14344x5f01b1f6();
        byte[] mo14344x5f01b1f62 = l8Var.mo14344x5f01b1f6();
        if (lVar == null) {
            o1Var = null;
        } else {
            o1Var = new y02.o1();
            o1Var.f540154g = lVar;
        }
        long m105978x2737f10 = j0Var.m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f62);
        p3380x6a61f93.p3387xf51c6630.C30621x21b27191.m170328x21b9f6b7(m105978x2737f10, mo14344x5f01b1f6, c17, mo14344x5f01b1f62, o1Var);
    }

    public void Ri(pq.a context, java.lang.String jumpInfoBase64Str, bw5.l8 l8Var, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoBase64Str, "jumpInfoBase64Str");
        try {
            byte[] decode = android.util.Base64.decode(jumpInfoBase64Str, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            Ui(context, decode, l8Var, lVar);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ECS_O.service", e17, "hy: invalid base64", new java.lang.Object[0]);
        }
    }

    public void Ui(pq.a context, byte[] jumpInfoBytes, bw5.l8 l8Var, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoBytes, "jumpInfoBytes");
        try {
            bw5.x7 mo11468x92b714fd = new bw5.x7().mo11468x92b714fd(jumpInfoBytes);
            jz5.f0 f0Var = null;
            if (!(mo11468x92b714fd instanceof bw5.x7)) {
                mo11468x92b714fd = null;
            }
            if (mo11468x92b714fd != null) {
                Ni(context, mo11468x92b714fd, l8Var, lVar);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("ECS_O.service", "hy: can not parse bytes to EcsJumpInfo with size " + jumpInfoBytes.length, new java.lang.Object[0]);
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ECS_O.service", e17, "hy: failed when parse", new java.lang.Object[0]);
        }
    }

    public void wi(pq.a context, bw5.x7 jumpInfo, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        Di(context, new r10.m(jumpInfo), lVar);
    }
}
