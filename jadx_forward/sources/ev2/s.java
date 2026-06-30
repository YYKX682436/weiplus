package ev2;

/* loaded from: classes10.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ev2.t f338464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ev2.o f338465b;

    public s(ev2.t tVar, ev2.o oVar) {
        this.f338464a = tVar;
        this.f338465b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        ev2.o oVar = this.f338465b;
        ev2.t tVar = this.f338464a;
        if (i17 == 0 && fVar.f152149b == 0) {
            int m141448xf4204902 = tVar.f338467d.m141448xf4204902();
            jv2.c cVar = tVar.f338467d;
            boolean z17 = cVar.u0().m76081xbd8ebd19() != 1 ? 0 : 1;
            boolean z18 = tVar.f338468e;
            if (z18) {
                cVar.u0().m76131x50740976(cVar.m141448xf4204902() + (!z17));
            } else {
                cVar.u0().m76131x50740976(cVar.m141448xf4204902() + (z17 != 0 ? -1 : 0));
            }
            cVar.u0().m76132xb8471e25(z18 ? 1 : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LikeCommentAction", "CgiFinderLikeFeed end likeFlag: " + cVar.u0().m76081xbd8ebd19() + " likeCount " + cVar.m141448xf4204902() + ' ' + z17 + ' ' + m141448xf4204902);
            ev2.n.f338454f.c(tVar);
            fp0.u uVar = fp0.u.f346823f;
            ev2.p pVar = (ev2.p) oVar;
            pVar.getClass();
            ev2.q qVar = pVar.f338460a;
            qVar.f338462g = false;
            qVar.b(uVar);
        } else if (i17 == 4) {
            pm0.v.X(new ev2.r(tVar));
            fp0.u uVar2 = fp0.u.f346824g;
            ev2.p pVar2 = (ev2.p) oVar;
            pVar2.getClass();
            ev2.q qVar2 = pVar2.f338460a;
            qVar2.f338462g = false;
            qVar2.b(uVar2);
        } else {
            fp0.u uVar3 = fp0.u.f346824g;
            ev2.p pVar3 = (ev2.p) oVar;
            pVar3.getClass();
            ev2.q qVar3 = pVar3.f338460a;
            qVar3.f338462g = true;
            qVar3.b(uVar3);
        }
        return jz5.f0.f384359a;
    }
}
