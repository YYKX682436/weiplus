package az2;

/* loaded from: classes10.dex */
public abstract class u extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, cz2.j {

    /* renamed from: d, reason: collision with root package name */
    public final r45.qt2 f97687d;

    /* renamed from: e, reason: collision with root package name */
    public az2.f f97688e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f97689f;

    public u(r45.qt2 qt2Var) {
        this.f97687d = qt2Var;
        jz5.g b17 = jz5.h.b(new az2.t(this));
        this.f97689f = b17;
        if (qt2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderBase", "Create commentScene:" + qt2Var.m75939xb282bd08(5) + " fromCommentScene:" + qt2Var.m75939xb282bd08(7));
            ((cz2.i) ((jz5.n) b17).mo141623x754a37bb()).f306549i = qt2Var.m75939xb282bd08(7);
        }
    }

    public java.util.List H() {
        return null;
    }

    public boolean I() {
        return true;
    }

    public abstract void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr);

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        az2.f fVar = this.f97688e;
        if (fVar != null) {
            fVar.b();
        }
        super.mo9408xae7a2e7a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: dispatch */
    public int mo9409x10f9447a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        az2.f fVar = this.f97688e;
        if (fVar != null) {
            fVar.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dispatchCgi] ");
        sb6.append(v0Var != null ? v0Var.mo13823xb5887636() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderBase", sb6.toString());
        ((cz2.i) ((jz5.n) this.f97689f).mo141623x754a37bb()).c(v0Var instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) v0Var : null);
        az2.h hVar = az2.j.f97666r;
        r45.qt2 qt2Var = this.f97687d;
        az2.j.f97667s.put(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0, java.lang.Long.valueOf(c01.id.c()));
        az2.k.f97672a.a(mo808xfb85f7b0());
        return super.mo9409x10f9447a(sVar, v0Var, l0Var);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        jz5.g gVar = this.f97689f;
        cz2.i iVar = (cz2.i) ((jz5.n) gVar).mo141623x754a37bb();
        iVar.f306545e = iVar.f306544d.a();
        az2.f fVar = this.f97688e;
        if (fVar != null) {
            fVar.b();
        }
        if (I()) {
            hz2.d dVar = hz2.d.f367846a;
            dVar.g(i18, i19, str);
            dVar.i(i18, i19, str);
            dVar.e(i18, i19, str);
        }
        az2.m.b(az2.m.f97677a, i19, str, 0, 4, null);
        J(i17, i18, i19, str, v0Var, bArr);
        cz2.i iVar2 = (cz2.i) ((jz5.n) gVar).mo141623x754a37bb();
        iVar2.f306546f = iVar2.f306544d.a();
        ((cz2.i) ((jz5.n) gVar).mo141623x754a37bb()).a(i18, i19, str, v0Var instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) v0Var : null);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = mo47948x7f0c4558();
        java.lang.String mo13823xb5887636 = mo47948x7f0c4558 != null ? mo47948x7f0c4558.mo13823xb5887636() : null;
        if (mo13823xb5887636 == null) {
            mo13823xb5887636 = "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List H = H();
        if (H != null) {
            arrayList.addAll(H);
        }
        arrayList.add(new jz5.l("errType", java.lang.String.valueOf(i18)));
        arrayList.add(new jz5.l("errCode", java.lang.String.valueOf(i19)));
        ((b92.d1) zbVar).Di(mo13823xb5887636, 1, arrayList);
    }

    @Override // cz2.j
    public cz2.f v() {
        return cz2.f.f306535d;
    }

    @Override // cz2.j
    public org.json.JSONObject w() {
        return null;
    }

    @Override // cz2.j
    public org.json.JSONObject z() {
        return null;
    }

    public /* synthetic */ u(r45.qt2 qt2Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : qt2Var);
    }
}
