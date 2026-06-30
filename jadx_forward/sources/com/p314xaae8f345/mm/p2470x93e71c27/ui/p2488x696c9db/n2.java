package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public final class n2 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s1 {

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.r6 f273317o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.r6 f273318p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.r6[] f273319q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f273320r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273321s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 adapter) {
        super(activityC19730xa7b9756f, adapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f273321s = activityC19730xa7b9756f;
        this.f273319q = new com.p314xaae8f345.mm.vfs.r6[0];
    }

    public final com.p314xaae8f345.mm.vfs.r6 d() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f273318p;
        if (r6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curFile");
            throw null;
        }
        int m82468x8cdac1b = r6Var.m82468x8cdac1b();
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = this.f273317o;
        if (r6Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootPath");
            throw null;
        }
        if (m82468x8cdac1b == r6Var2.m82468x8cdac1b()) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = this.f273318p;
        if (r6Var3 != null) {
            return r6Var3.s();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curFile");
        throw null;
    }

    public final void e(com.p314xaae8f345.mm.vfs.r6 curFile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curFile, "curFile");
        this.f273318p = curFile;
        if (curFile.h()) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = this.f273318p;
            if (r6Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curFile");
                throw null;
            }
            if (r6Var.y()) {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = this.f273318p;
                if (r6Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curFile");
                    throw null;
                }
                com.p314xaae8f345.mm.vfs.r6[] H = r6Var2.H(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k2(this));
                this.f273319q = H;
                if (H != null) {
                    if (!(H.length == 0)) {
                        java.util.HashSet hashSet = new java.util.HashSet();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (com.p314xaae8f345.mm.vfs.r6 r6Var3 : H) {
                            if (r6Var3 != null) {
                                if (r6Var3.y()) {
                                    java.lang.String o17 = r6Var3.o();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                                    if (!hashSet.contains(o17)) {
                                        java.lang.String o18 = r6Var3.o();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
                                        hashSet.add(o18);
                                        arrayList.add(r6Var3);
                                    }
                                } else {
                                    arrayList.add(r6Var3);
                                }
                            }
                        }
                        H = (com.p314xaae8f345.mm.vfs.r6[]) arrayList.toArray(new com.p314xaae8f345.mm.vfs.r6[0]);
                    }
                    this.f273319q = H;
                    if (H != null) {
                        if (!(H.length == 0)) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(H);
                            while (true) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.b bVar = (p3321xbce91901.jvm.p3324x21ffc6bd.b) a17;
                                if (!bVar.hasNext()) {
                                    break;
                                }
                                com.p314xaae8f345.mm.vfs.r6 r6Var4 = (com.p314xaae8f345.mm.vfs.r6) bVar.next();
                                if (r6Var4 != null) {
                                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i2 i2Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i2(this);
                                    i2Var.f273242a = r6Var4;
                                    i2Var.f273243b = r6Var4.B();
                                    if (r6Var4.y()) {
                                        java.lang.String a18 = x51.k.a(r6Var4.m82467xfb82e301());
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getFullSpell(...)");
                                        java.lang.String upperCase = a18.toUpperCase();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
                                        i2Var.f273244c = upperCase;
                                        arrayList2.add(i2Var);
                                    } else {
                                        arrayList3.add(i2Var);
                                    }
                                }
                            }
                            kz5.g0.t(arrayList2, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l2.f273290d);
                            java.util.Collections.sort(arrayList3, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.m2.f273304d);
                            java.util.Iterator it = arrayList2.iterator();
                            int i17 = 0;
                            while (it.hasNext()) {
                                H[i17] = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i2) it.next()).f273242a;
                                i17++;
                            }
                            java.util.Iterator it6 = arrayList3.iterator();
                            while (it6.hasNext()) {
                                H[i17] = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i2) it6.next()).f273242a;
                                i17++;
                            }
                        }
                    }
                }
            }
        }
        java.util.List list = this.f273418f;
        list.clear();
        com.p314xaae8f345.mm.vfs.r6[] r6VarArr = this.f273319q;
        if (r6VarArr != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var5 : r6VarArr) {
                if (r6Var5 != null) {
                    java.lang.String o19 = r6Var5.o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o19, "getAbsolutePath(...)");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o19)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileSelectorUI", "createTargetList, folder filePath is null, filter!!");
                    } else {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e2 e2Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e2(this.f273321s);
                        e2Var.f273156a = 4;
                        e2Var.f273157b = 3;
                        e2Var.f273135q = !r6Var5.y();
                        java.lang.String m82467xfb82e301 = r6Var5.m82467xfb82e301();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                        e2Var.f273097h = m82467xfb82e301;
                        e2Var.f273098i = o19;
                        if (r6Var5.y()) {
                            java.lang.String[] E = r6Var5.E(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j2.f273262a);
                            e2Var.f273134p = E == null ? 0 : E.length;
                        } else if (r6Var5.A()) {
                            e2Var.f273099j = r6Var5.C();
                            e2Var.f273095f = r6Var5.B();
                        }
                        list.add(e2Var);
                    }
                }
            }
        }
    }
}
