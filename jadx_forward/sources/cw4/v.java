package cw4;

/* loaded from: classes4.dex */
public final class v implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw4.x f305816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw4.a0 f305817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f305818c;

    public v(cw4.x xVar, cw4.a0 a0Var, int i17) {
        this.f305816a = xVar;
        this.f305817b = a0Var;
        this.f305818c = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        cw4.x xVar = this.f305816a;
        java.util.LinkedList linkedList = xVar.f305827h;
        cw4.a0 a0Var = this.f305817b;
        linkedList.remove(a0Var);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebTransCgiLogic", "translate: onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        java.util.HashSet hashSet = xVar.f305825f;
        int i19 = this.f305818c;
        if (!hashSet.contains(java.lang.Integer.valueOf(i19))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebTransCgiLogic", "translate: hashCode has been erased, lifecycle is end!");
            xVar.f305825f.remove(java.lang.Integer.valueOf(i19));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
        xVar.getClass();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetTransTextResponse");
        r45.kp3 kp3Var = (r45.kp3) fVar;
        java.util.Iterator it = a0Var.f305726a.iterator();
        int i27 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i28 = i27 + 1;
            java.lang.String str2 = null;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            cw4.z zVar = (cw4.z) next;
            r45.dq6 dq6Var = (r45.dq6) kp3Var.f460424e.get(i27);
            zVar.f305841c = dq6Var != null ? dq6Var.f454202e : null;
            r45.dq6 dq6Var2 = (r45.dq6) kp3Var.f460424e.get(i27);
            if (dq6Var2 != null) {
                str2 = dq6Var2.f454204g;
            }
            zVar.f305842d = str2;
            i27 = i28;
        }
        xVar.a();
        pm0.v.X(new cw4.w(xVar, a0Var));
    }
}
