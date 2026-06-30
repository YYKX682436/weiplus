package fx1;

/* loaded from: classes12.dex */
public class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final nx1.z f348643d;

    /* renamed from: e, reason: collision with root package name */
    public final gx1.e f348644e = new gx1.e();

    public b(nx1.z zVar) {
        this.f348643d = zVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return nx1.d.q().B() + 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        int i18 = i17 - 0;
        ix1.a l17 = nx1.d.q().l(i18);
        if (l17 != null) {
            return l17.b();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorAdapter", "getItemViewType, item is null, position is %d", java.lang.Integer.valueOf(i18));
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        gx1.a aVar = (gx1.a) k3Var;
        synchronized (this) {
            int i18 = i17 - 0;
            ix1.a l17 = nx1.d.q().l(i18);
            if (l17 == null || l17.b() != aVar.i()) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Boolean.valueOf(l17 == null);
                objArr[1] = java.lang.Integer.valueOf(i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorAdapter", "onBindViewHolder, item is null %b, position is %d", objArr);
            } else {
                aVar.j(l17, i18, l17.b());
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        if (i17 == Integer.MAX_VALUE) {
            return null;
        }
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(this.f348644e.f358829a.get(i17), viewGroup, false);
        nx1.z zVar = this.f348643d;
        switch (i17) {
            case -1:
                return new gx1.n(inflate, zVar);
            case 0:
                return new gx1.t(inflate, zVar);
            case 1:
                return new gx1.s(inflate, zVar);
            case 2:
                return new gx1.d(inflate, zVar);
            case 3:
                return new gx1.g(inflate, zVar);
            case 4:
                return new gx1.b0(inflate, zVar);
            case 5:
                return new gx1.b(inflate, zVar);
            case 6:
                return new gx1.y(inflate, zVar);
            default:
                return null;
        }
    }
}
