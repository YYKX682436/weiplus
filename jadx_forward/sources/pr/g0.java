package pr;

/* loaded from: classes15.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.k0 f439240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f439241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(pr.k0 k0Var, boolean z17) {
        super(0);
        this.f439240d = k0Var;
        this.f439241e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pr.k0 k0Var = this.f439240d;
        java.lang.Byte[] bArr = k0Var.f439276p;
        boolean z17 = this.f439241e;
        synchronized (bArr) {
            java.util.List a17 = k0Var.f439261a.a();
            k0Var.f439267g = a17.size();
            if (!k0Var.f439268h) {
                java.util.Iterator it = a17.iterator();
                boolean z18 = false;
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (!((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) it.next()).w0()) {
                        break;
                    }
                    i17++;
                }
                if (i17 < 0 || i17 >= a17.size()) {
                    int i18 = k0Var.f439267g;
                    k0Var.f439266f = i18;
                    k0Var.f439264d = i18;
                    k0Var.f439265e = i18;
                    k0Var.f439269i = true;
                    pm0.v.X(new pr.f0(k0Var));
                } else {
                    k0Var.f439264d = i17;
                    if (i17 < ((pr.a0) k0Var.f439262b).a()) {
                        k0Var.f439266f = ((pr.a0) k0Var.f439262b).a();
                    } else {
                        k0Var.f439266f = k0Var.f439264d;
                    }
                    k0Var.f439265e = k0Var.f439264d;
                    k0Var.f439269i = k0Var.f439266f == k0Var.f439267g;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f439263c, "checkSyncEmoji: " + k0Var.f439264d + ", " + k0Var.f439266f + ", " + k0Var.f439269i);
                if (z17) {
                    synchronized (k0Var.f439276p) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f439263c, "start: ");
                        if (k0Var.f439269i) {
                            k0Var.f439268h = false;
                        } else if (!k0Var.f439268h) {
                            z18 = true;
                        }
                        if (z18) {
                            k0Var.h();
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
