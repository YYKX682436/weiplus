package dh2;

/* loaded from: classes10.dex */
public final class a0 extends bh2.x {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh2.b0 f313951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f313952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ah2.d dVar, dh2.b0 b0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(dVar);
        this.f313951e = b0Var;
        this.f313952f = c0Var;
    }

    @Override // bh2.b
    public void P1(java.lang.String songUniqueId, int i17) {
        om2.q qVar;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f102441d;
        if (bVar != null) {
            bVar.P1(songUniqueId, i17);
        }
        dh2.b0 b0Var = this.f313951e;
        jh2.c cVar = b0Var.f313959f;
        if (cVar != null) {
            cVar.j();
        }
        om2.s sVar = b0Var.f313956c;
        if (sVar == null || (qVar = sVar.f427913c) == null || (str = qVar.f427906b) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f313957d, "onPlayBGMEnd accompanyLocalPath: ".concat(str));
        if (this.f313952f.f391645d) {
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        ah2.d dVar = b0Var.f313958e;
        if (dVar != null) {
            jh2.e eVar = jh2.e.f381346e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("accBgm play fail; fileExit: ");
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            sb6.append(m17.a() ? m17.f294799a.F(m17.f294800b) : false);
            dVar.e6(songUniqueId, new jh2.d(eVar, i17, sb6.toString(), 0, 0));
        }
    }

    @Override // bh2.b
    public void Y4(java.lang.String songUniqueId, int i17) {
        om2.q qVar;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f102441d;
        if (bVar != null) {
            bVar.Y4(songUniqueId, i17);
        }
        dh2.b0 b0Var = this.f313951e;
        jh2.c cVar = b0Var.f313959f;
        if (cVar != null) {
            cVar.j();
        }
        om2.s sVar = b0Var.f313956c;
        if (sVar == null || (qVar = sVar.f427913c) == null || (str = qVar.f427906b) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f313957d, "onChorusPlayError accompanyLocalPath: ".concat(str));
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        ah2.d dVar = b0Var.f313958e;
        if (dVar != null) {
            jh2.e eVar = jh2.e.f381346e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("accBgm play fail; fileExit: ");
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            sb6.append(m17.a() ? m17.f294799a.F(m17.f294800b) : false);
            dVar.E0(songUniqueId, new jh2.d(eVar, i17, sb6.toString(), 0, 0));
        }
    }

    @Override // bh2.b
    public void a0(java.lang.String songUniqueId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f102441d;
        if (bVar != null) {
            bVar.a0(songUniqueId, i17);
        }
        this.f313952f.f391645d = true;
        dh2.b0 b0Var = this.f313951e;
        b0Var.c(0L);
        dh2.b0.a(b0Var);
    }

    @Override // bh2.b
    public void s0(java.lang.String songUniqueId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f102441d;
        if (bVar != null) {
            bVar.s0(songUniqueId, j17);
        }
        dh2.b0 b0Var = this.f313951e;
        b0Var.c(j17);
        dh2.b0.a(b0Var);
    }

    @Override // bh2.b
    public void y2(java.lang.String songUniqueId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f102441d;
        if (bVar != null) {
            bVar.y2(songUniqueId, j17, j18);
        }
        this.f313951e.f313963j = j17;
    }
}
