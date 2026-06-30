package ic5;

/* loaded from: classes9.dex */
public final class g extends hc5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yb5.d mChattingContext) {
        super(mChattingContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mChattingContext, "mChattingContext");
    }

    @Override // hc5.a
    public int a(java.util.List msgInfos) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfos, "msgInfos");
        if (msgInfos.isEmpty()) {
            i17 = 0;
        } else {
            java.util.Iterator it = msgInfos.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if ((!((rd5.d) it.next()).f475787d.f526833b.P2()) && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        return i17 >= 2 ? 1 : Integer.MAX_VALUE;
    }

    @Override // hc5.a
    public java.lang.String c() {
        return "mediagroup_";
    }

    @Override // hc5.a
    public rd5.d d(java.util.List msgInfos) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfos, "msgInfos");
        java.util.Iterator it = msgInfos.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((rd5.d) obj).f475787d.f526833b.P2()) {
                break;
            }
        }
        rd5.d dVar = (rd5.d) obj;
        return dVar == null ? (rd5.d) kz5.n0.X(msgInfos) : dVar;
    }

    @Override // hc5.a
    public java.lang.Class e(rd5.d msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        return g95.e0.i(msgInfo.f475787d.f526833b) ? ye5.i.class : ye5.g.class;
    }

    @Override // hc5.a
    public void f() {
        yb5.d dVar = this.f361902a;
        ic5.f fVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4) ((sb5.b0) dVar.f542241c.a(sb5.b0.class))).f281646e;
        if (fVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaGroupMsgHelper");
            throw null;
        }
        fVar.f371973b.clear();
        fVar.f371972a = false;
        ic5.e eVar = ic5.f.f371970c;
        java.lang.String x17 = dVar.x();
        if (r26.n0.N(x17)) {
            return;
        }
        ic5.f.f371971d.e(x17);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    @Override // hc5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String h(rd5.d r7) {
        /*
            r6 = this;
            java.lang.String r0 = "msgInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.lang.Class<wg3.j> r1 = wg3.j.class
            i95.m r1 = i95.n0.c(r1)
            wg3.j r1 = (wg3.j) r1
            kc5.x r1 = (kc5.x) r1
            boolean r1 = r1.Di()
            r2 = 0
            if (r1 != 0) goto L17
            return r2
        L17:
            we5.a r1 = r7.f475787d
            com.tencent.mm.storage.f9 r1 = r1.f526833b
            boolean r1 = r1.m78014x7b98c171()
            if (r1 != 0) goto L36
            we5.a r1 = r7.f475787d
            com.tencent.mm.storage.f9 r1 = r1.f526833b
            boolean r1 = r1.J2()
            if (r1 != 0) goto L36
            we5.a r1 = r7.f475787d
            com.tencent.mm.storage.f9 r1 = r1.f526833b
            boolean r1 = r1.P2()
            if (r1 != 0) goto L36
            return r2
        L36:
            yb5.d r1 = r6.f361902a
            com.tencent.mm.ui.chatting.manager.c r3 = r1.f542241c
            java.lang.Class<sb5.b0> r4 = sb5.b0.class
            yn.e r3 = r3.a(r4)
            sb5.b0 r3 = (sb5.b0) r3
            we5.a r4 = r7.f475787d
            com.tencent.mm.storage.f9 r4 = r4.f526833b
            r5 = r3
            com.tencent.mm.ui.chatting.component.v4 r5 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4) r5
            r5.getClass()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            ic5.f r0 = r5.f281646e
            if (r0 == 0) goto L8e
            boolean r5 = r0.f371972a
            if (r5 == 0) goto L58
            goto L62
        L58:
            java.lang.String r4 = r0.a(r4)
            boolean r5 = r26.n0.N(r4)
            if (r5 == 0) goto L64
        L62:
            r0 = 0
            goto L6a
        L64:
            java.util.Set r0 = r0.f371973b
            boolean r0 = r0.contains(r4)
        L6a:
            if (r0 == 0) goto L6d
            return r2
        L6d:
            ke5.f0 r0 = r1.h()
            r0.getClass()
            boolean r0 = r0 instanceof ke5.p
            r0 = r0 ^ 1
            if (r0 != 0) goto L7b
            return r2
        L7b:
            we5.a r7 = r7.f475787d
            com.tencent.mm.storage.f9 r7 = r7.f526833b
            com.tencent.mm.ui.chatting.component.v4 r3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4) r3
            java.lang.String r7 = r3.n0(r7)
            boolean r0 = r26.n0.N(r7)
            if (r0 == 0) goto L8c
            goto L8d
        L8c:
            r2 = r7
        L8d:
            return r2
        L8e:
            java.lang.String r7 = "mediaGroupMsgHelper"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ic5.g.h(rd5.d):java.lang.String");
    }
}
