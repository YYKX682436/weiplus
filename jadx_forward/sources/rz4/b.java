package rz4;

/* loaded from: classes12.dex */
public class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final mz4.j0 f483350d;

    /* renamed from: e, reason: collision with root package name */
    public final mz4.d f483351e;

    /* renamed from: f, reason: collision with root package name */
    public final uz4.d f483352f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f483354h = false;

    /* renamed from: g, reason: collision with root package name */
    public final sz4.k f483353g = new sz4.k();

    public b(mz4.j0 j0Var, mz4.d dVar, uz4.d dVar2) {
        this.f483350d = j0Var;
        this.f483351e = dVar;
        this.f483352f = dVar2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        boolean z17 = this.f483354h;
        mz4.d dVar = this.f483351e;
        return z17 ? dVar.D() + 1 : dVar.D();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        mz4.d dVar = this.f483351e;
        iz4.c l17 = dVar.l(i17);
        if (l17 != null) {
            return l17.d();
        }
        if (this.f483354h && i17 == dVar.D()) {
            return 30;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteRecyclerViewAdapter", "getItemViewType, item is null, position is %d", java.lang.Integer.valueOf(i17));
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        sz4.a aVar = (sz4.a) k3Var;
        synchronized (this) {
            iz4.c l17 = this.f483351e.l(i17);
            if (l17 == null || l17.d() != aVar.i()) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Boolean.valueOf(l17 == null);
                objArr[1] = java.lang.Integer.valueOf(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteRecyclerViewAdapter", "onBindViewHolder, item is null %b, position is %d", objArr);
            } else {
                aVar.j(l17, i17, l17.d());
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteRecyclerViewAdapter", "onCreateViewHolder viewType = " + i17);
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(((java.lang.Integer) this.f483353g.f495738a.get(i17)).intValue(), viewGroup, false);
        mz4.j0 j0Var = this.f483350d;
        mz4.d dVar = this.f483351e;
        uz4.d dVar2 = this.f483352f;
        if (i17 == 20) {
            return new sz4.e(inflate, j0Var, dVar, dVar2);
        }
        if (i17 == 30) {
            return new sz4.g(inflate, j0Var, dVar);
        }
        switch (i17) {
            case -3:
                return new sz4.i(inflate, j0Var, dVar);
            case -2:
                return new sz4.b(inflate, j0Var, dVar);
            case -1:
                return new sz4.a0(inflate, j0Var, dVar);
            case 0:
                return new sz4.g0(inflate, j0Var, dVar);
            case 1:
                return new sz4.f0(inflate, j0Var, dVar);
            case 2:
                return new sz4.j(inflate, j0Var, dVar);
            case 3:
                return new sz4.l(inflate, j0Var, dVar);
            case 4:
                return new sz4.k0(inflate, j0Var, dVar, dVar2);
            case 5:
                return new sz4.h(inflate, j0Var, dVar);
            case 6:
                return new sz4.h0(inflate, j0Var, dVar);
            case 7:
                return new sz4.t(inflate, j0Var, dVar);
            default:
                return null;
        }
    }
}
