package fc2;

/* loaded from: classes2.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc2.o f342476a;

    public f(fc2.o oVar) {
        this.f342476a = oVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        fc2.o oVar = this.f342476a;
        fc2.o.b(oVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedFlowEventSubscriber", "onChanged");
        oVar.f342505q.mo50303x856b99f0(0);
        oVar.f342505q.mo50307xb9e94560(0, oVar.f342502n);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void c(int i17, int i18) {
        fc2.o oVar = this.f342476a;
        fc2.o.b(oVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedFlowEventSubscriber", "onItemRangeChanged " + i17 + ' ' + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209542wf).mo141623x754a37bb()).r()).booleanValue()) {
            oVar.f342505q.mo50303x856b99f0(1);
        } else {
            oVar.f342505q.mo50303x856b99f0(0);
        }
        oVar.f342505q.mo50307xb9e94560(1, oVar.f342502n);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void e(int i17, int i18) {
        fc2.o oVar = this.f342476a;
        fc2.o.b(oVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedFlowEventSubscriber", "onItemRangeInserted " + i17 + ' ' + i18);
        oVar.f342505q.mo50303x856b99f0(0);
        oVar.f342505q.mo50307xb9e94560(0, oVar.f342502n);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void f(int i17, int i18, int i19) {
        fc2.o oVar = this.f342476a;
        fc2.o.b(oVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedFlowEventSubscriber", "onItemRangeMoved " + i17 + ' ' + i18 + ' ' + i19);
        oVar.f342505q.mo50303x856b99f0(0);
        oVar.f342505q.mo50307xb9e94560(0, oVar.f342502n);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void g(int i17, int i18) {
        fc2.o oVar = this.f342476a;
        fc2.o.b(oVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedFlowEventSubscriber", "onItemRangeRemoved " + i17 + ' ' + i18);
        oVar.f342505q.mo50303x856b99f0(0);
        oVar.f342505q.mo50307xb9e94560(0, oVar.f342502n);
    }
}
