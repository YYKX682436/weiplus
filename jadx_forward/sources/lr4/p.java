package lr4;

/* loaded from: classes11.dex */
public final class p extends qz5.l implements yz5.p {
    public p(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lr4.p(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        lr4.p pVar = new lr4.p((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
        kr4.m Bi = g0Var.Bi();
        java.lang.String Di = g0Var.Di();
        kr4.g y07 = Bi.y0("w1wsayhisessionholder@w1wmsg");
        p75.n0 n0Var = dm.wb.f322435w;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.d dVar = dm.wb.f322437y;
        p75.m0 j17 = dVar.j(Di);
        p75.d dVar2 = dm.wb.D;
        p75.m c17 = j17.c(dVar2.i(1));
        linkedList2.add(dm.wb.A.u());
        p75.n0 n0Var2 = dm.wb.f322435w;
        p75.i0 g17 = n0Var2.g(linkedList);
        g17.f434190d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        l75.k0 k0Var = Bi.f393050d;
        java.util.List k17 = a17.k(k0Var, kr4.g.class);
        if (!k17.isEmpty()) {
            kr4.k Ai = g0Var.Ai();
            java.util.ArrayList arrayList = (java.util.ArrayList) k17;
            java.lang.String field_talkerUserName = ((kr4.g) arrayList.get(0)).f69050x3e123854;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talkerUserName, "field_talkerUserName");
            kr4.e y08 = Ai.y0(field_talkerUserName);
            ((kr4.g) arrayList.get(0)).Z = y08 != null ? y08.t0() : null;
            kr4.g gVar = (kr4.g) arrayList.get(0);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ((kr4.g) arrayList.get(0)).Z;
            gVar.f393040x0 = z3Var != null ? z3Var.g2() : null;
        }
        if (!k17.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) k17;
            sb6.append(((kr4.g) arrayList2.get(0)).f393040x0);
            sb6.append(':');
            sb6.append(((kr4.g) arrayList2.get(0)).f69038xf66fcca9);
            str = sb6.toString();
        } else {
            str = "";
        }
        long j18 = k17.isEmpty() ^ true ? ((kr4.g) ((java.util.ArrayList) k17).get(0)).f69053xa783a79b : 0L;
        y07.f69047x5568d387 = Di;
        p75.i0 h17 = n0Var2.h(dm.wb.f322438z.y());
        h17.f434190d = dVar.j(Di).c(dVar2.i(1));
        int m17 = h17.a().m(k0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsg.ConversationStorage", "[getGreetUnreadCount] w1wUsername=" + Di + " unreadCount=" + m17);
        y07.f69052xa35b5abb = m17;
        y07.f69038xf66fcca9 = str;
        y07.f69053xa783a79b = j18;
        y07.f69045xa97e89ae = 1000L;
        long j19 = y07.f72763xa3c65b86;
        if (j19 < 0) {
            y07.f69050x3e123854 = "w1wsayhisessionholder@w1wmsg";
            y07.t0();
            if (Bi.mo880xb970c2b9(y07)) {
                Bi.mo142179xf35bbb4(y07.f69048xbed8694c, 2, y07);
            }
        } else if (Bi.m145258xce0038c9(j19, y07, false)) {
            Bi.mo142179xf35bbb4(y07.f69048xbed8694c, 1, y07);
        }
        return jz5.f0.f384359a;
    }
}
