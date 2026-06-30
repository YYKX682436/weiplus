package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f231094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 f231095f;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var, java.lang.String str, java.util.ArrayList arrayList) {
        this.f231095f = i4Var;
        this.f231093d = str;
        this.f231094e = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231095f;
        i4Var.f231156f.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var = i4Var.f231156f;
        c0Var.f231053d = this.f231093d;
        c0Var.getClass();
        final java.util.ArrayList arrayList = this.f231094e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.j(i4Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b() { // from class: com.tencent.mm.plugin.multitalk.ilinkservice.e2$$a
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b
            public final void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e2 e2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e2.this;
                java.util.ArrayList arrayList2 = arrayList;
                e2Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "initEngine done! %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i17 != 0 || i18 != 0) {
                    if (i18 != -66) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.m(e2Var.f231095f, true);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = e2Var.f231095f;
                    i4Var2.Y.c(16, i4Var2.f231176p1, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkService", "initEngine fail errtype %d errcode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var3 = e2Var.f231095f;
                i4Var3.getClass();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w) it.next();
                    if (!wVar.f231375c.equals(i4Var3.f231189y0)) {
                        linkedList.add(wVar.f231375c);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "on invite users: %s, usrname:%s", wVar.f231374b, wVar.f231375c);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var2 = i4Var3.f231156f;
                c0Var2.f231054e = arrayList2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.h1(i4Var3);
                i4Var3.E = h1Var;
                i4Var3.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j1(i4Var3, null);
                i4Var3.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m1(i4Var3);
                i4Var3.D = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.o1(i4Var3, null);
                i4Var3.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.p1(i4Var3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.f0 f0Var = i4Var3.f231154e;
                f0Var.b(5, h1Var);
                f0Var.b(6, i4Var3.F);
                f0Var.b(22, i4Var3.C);
                f0Var.b(23, i4Var3.D);
                f0Var.b(7, i4Var3.G);
                i4Var3.w();
                c0Var2.f231050a.clear();
                i4Var3.Q();
                if (gq4.v.Ni()) {
                    i4Var3.G();
                }
                i4Var3.Z();
                java.lang.String str2 = i4Var3.f231176p1;
                int i19 = i4Var3.f231190y1;
                java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231116a;
                r45.w70 w70Var = new r45.w70();
                w70Var.f470452d = linkedList;
                w70Var.f470453e = i4Var3.f231178q;
                w70Var.f470454f = true;
                w70Var.f470455g = i19;
                w70Var.f470456h = str2;
                w70Var.f470457i = "";
                int i27 = -1;
                try {
                    i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m119996x82d71b29(w70Var.mo14344x5f01b1f6(), w70Var.mo14344x5f01b1f6().length);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "steve: invite ret:" + i27);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Multitalk.ILinkNativeEngine", e17, "Invite exception", new java.lang.Object[0]);
                }
                if (i27 != 0) {
                    i4Var3.r(null, -10086, -4, "join room sdk failed: " + i27, null);
                } else {
                    i4Var3.f231169m2 = true;
                    i4Var3.V(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.q1(i4Var3));
                }
                synchronized (e2Var.f231095f.Q1) {
                    java.util.Iterator it6 = e2Var.f231095f.Q1.iterator();
                    while (it6.hasNext()) {
                        r45.q07 q07Var = (r45.q07) it6.next();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "inviteSync deal with the cached invite notify");
                        e2Var.f231095f.Z();
                        byte[] bArr = q07Var.f465079i.f273689a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120001xd82634ef(bArr, bArr.length, e2Var.f231095f.f231190y1);
                    }
                    e2Var.f231095f.Q1.clear();
                }
            }
        });
    }
}
