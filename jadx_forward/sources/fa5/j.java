package fa5;

@j95.b
/* loaded from: classes7.dex */
public final class j extends i95.w implements com.p314xaae8f345.mm.udr.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f342350d = jz5.h.b(fa5.i.f342349d);

    public final com.p314xaae8f345.mm.vfs.r6 Ai(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar) {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        java.lang.String c17 = xVar.c();
        if (c17 == null) {
            r6Var = new com.p314xaae8f345.mm.vfs.r6(xVar.m117639xfb83cc9b());
        } else {
            if (com.p314xaae8f345.mm.vfs.w6.j(c17)) {
                return new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(c17));
            }
            r6Var = new com.p314xaae8f345.mm.vfs.r6(xVar.m117639xfb83cc9b());
        }
        return r6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Bi(java.lang.String r10, java.lang.String r11, boolean r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fa5.j.Bi(java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void Di(java.lang.String projectName, java.lang.String name, boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectName, "projectName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) this.f342350d).mo141623x754a37bb(), null, new fa5.f(callback, this, projectName, name, z17, null), 1, null);
    }

    public java.lang.Object wi(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ea5.l wi6 = ((com.p314xaae8f345.mm.udr.e1) ((com.p314xaae8f345.mm.udr.c0) i95.n0.c(com.p314xaae8f345.mm.udr.c0.class))).wi(str);
        if (wi6 == null) {
            return java.lang.Boolean.FALSE;
        }
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
        qVar.c(str);
        java.util.LinkedList linkedList = qVar.f299081e;
        if (linkedList != null) {
            linkedList.add(str2);
        }
        java.util.LinkedList linkedList2 = qVar.f299082f;
        if (linkedList2 != null) {
            java.util.RandomAccess mo14972x73ec24f3 = wi6.mo14972x73ec24f3();
            if (mo14972x73ec24f3 == null) {
                mo14972x73ec24f3 = kz5.p0.f395529d;
            }
            linkedList2.addAll(mo14972x73ec24f3);
        }
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UdrBasisService", "check! CheckParameterModel = " + qVar + ' ');
        ((com.p314xaae8f345.mm.udr.a1) e0Var).Di(qVar, new fa5.e(nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }
}
