package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class n0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.o0 f231260a;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.o0 o0Var) {
        this.f231260a = o0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "initEngine done! %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkService", "initEngine fail errtype %d errcode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i18 != -66) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.m(this.f231260a.f231269e, true);
                return;
            }
            synchronized (this.f231260a.f231269e.Q1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.o0 o0Var = this.f231260a;
                o0Var.f231269e.Q1.add(o0Var.f231268d);
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.o0 o0Var2 = this.f231260a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = o0Var2.f231269e;
        r45.q07 q07Var = o0Var2.f231268d;
        if (i4Var.Y != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w0 w0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w0(i4Var);
            i4Var.H = w0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.f0 f0Var = i4Var.f231154e;
            f0Var.b(8, w0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.y0(i4Var);
            i4Var.I = y0Var;
            f0Var.b(9, y0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.a1(i4Var);
            i4Var.P = a1Var;
            f0Var.b(16, a1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b1 b1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b1(i4Var);
            i4Var.f231148J = b1Var;
            f0Var.b(11, b1Var);
            i4Var.Z();
            byte[] bArr = q07Var.f465079i.f273689a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120001xd82634ef(bArr, bArr.length, i4Var.f231190y1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "no delegate, return !");
        }
        synchronized (this.f231260a.f231269e.Q1) {
            java.util.Iterator it = this.f231260a.f231269e.Q1.iterator();
            while (it.hasNext()) {
                r45.q07 q07Var2 = (r45.q07) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "recvnotify deal with the cached invite notify");
                this.f231260a.f231269e.Z();
                byte[] bArr2 = q07Var2.f465079i.f273689a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120001xd82634ef(bArr2, bArr2.length, this.f231260a.f231269e.f231190y1);
            }
            this.f231260a.f231269e.Q1.clear();
        }
    }
}
