package pl2;

/* loaded from: classes3.dex */
public final class d implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pl2.s f438153a;

    public d(pl2.s sVar) {
        this.f438153a = sVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        pl2.m mVar;
        pl2.s sVar = this.f438153a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = sVar.c().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        int y17 = c1162x665295de != null ? c1162x665295de.y() : 0;
        if (y17 == sVar.f438189k.size() - 1 && (mVar = sVar.f438184f) != null) {
            int size = sVar.f438189k.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "onLoadNextPage position:" + y17 + ", size:" + size);
            vd2.t1 t1Var = ((vd2.l4) mVar).f517337c.f193019h;
            if (t1Var != null) {
                ((vd2.v2) t1Var).s(y17, size, dk2.ef.I);
            }
        }
        return true;
    }
}
