package fb3;

/* loaded from: classes.dex */
public final class h implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fb3.j f342397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342398b;

    public h(fb3.j jVar, java.lang.String str) {
        this.f342397a = jVar;
        this.f342398b = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String str2 = this.f342398b;
        fb3.j jVar = this.f342397a;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29977, 3, jVar.f342402f, str2, jVar.f342401e);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29977, 4, jVar.f342402f, str2, jVar.f342401e);
        r45.oz5 oz5Var = new r45.oz5();
        oz5Var.f464163d = jVar.f342400d;
        oz5Var.f464164e = str2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6446;
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendsharecovermsg";
        lVar.f152197a = oz5Var;
        lVar.f152198b = new r45.pz5();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new fb3.g(jVar, str2));
    }
}
