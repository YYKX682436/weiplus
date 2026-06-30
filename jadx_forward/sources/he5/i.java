package he5;

/* loaded from: classes9.dex */
public final class i implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final int f362469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f362470b;

    public i(int i17, int i18) {
        this.f362469a = i17;
        this.f362470b = i18;
    }

    @Override // he5.t
    public int a() {
        return this.f362470b;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k c17;
        if (list == null) {
            return;
        }
        ((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).getClass();
        java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.f9> arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g0 c18 = yw.a3.f547799a.c();
        java.util.LinkedList linkedList = (c18 == null || (c17 = c18.c(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, this.f362469a)) == null) ? null : c17.f300531d;
        if (linkedList != null) {
            for (int size = linkedList.size() - 1; -1 < size; size--) {
                ow.n nVar = ow.n.f430792a;
                java.lang.Object obj = linkedList.get(size);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                arrayList.add(nVar.b((com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j) obj));
            }
        }
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : arrayList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f9Var);
            list.add(f9Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingBrandEcsTemplateMsgDataSource", "fillItem size:%d", java.lang.Integer.valueOf(list.size()));
        if (sVar != null) {
            ((hd5.f) sVar).a();
        }
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        if (oVar != null) {
            oVar.mo133232x338af3();
        }
    }

    @Override // he5.t
    /* renamed from: close */
    public void mo133462x5a5ddf8() {
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }
}
