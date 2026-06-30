package rc3;

/* loaded from: classes7.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4 f475518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(rc3.w0 w0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4 n4Var) {
        super(0);
        this.f475517d = w0Var;
        this.f475518e = n4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qc3.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4 n4Var = this.f475518e;
        rc3.w0 w0Var = this.f475517d;
        java.lang.String str = w0Var.f475638z;
        java.lang.String str2 = w0Var.f475620e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onServerMgrReady");
        if (w0Var.A == null) {
            try {
                fVar = n4Var.B5(str2, w0Var);
            } catch (android.os.RemoteException e17) {
                java.lang.String obj = e17.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "remote exception: " + obj);
                je3.i.t8(je3.k.f380831e, w0Var.f475635w, "remoteException-IMBServerMgr", obj, null, 0.0f, 24, null);
                fVar = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "connect to biz server " + fVar);
            if (fVar != null) {
                w0Var.B = n4Var;
                w0Var.A = new tc3.l0(str2, fVar, new rc3.e0(w0Var));
                java.util.Iterator it = w0Var.f475625m.iterator();
                while (it.hasNext()) {
                    ((jc3.u) it.next()).x5();
                }
                while (!w0Var.f475634v) {
                    kz5.q qVar = w0Var.f475633u;
                    if (!(!qVar.isEmpty())) {
                        break;
                    }
                    ((yz5.a) qVar.m144679xed1b9c8c()).mo152xb9724478();
                }
            } else if (!w0Var.C) {
                w0Var.C = true;
                w0Var.f475627o.postDelayed(new rc3.d0(w0Var), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            }
        }
        return jz5.f0.f384359a;
    }
}
