package e33;

/* loaded from: classes10.dex */
public class g6 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f328770d;

    /* renamed from: f, reason: collision with root package name */
    public e33.z5 f328772f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f328773g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f328774h = new e33.c6(this);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f328771e = new java.util.ArrayList();

    public g6(android.content.Context context) {
        this.f328770d = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f328771e;
        if (((java.util.ArrayList) list).size() == 0) {
            ((java.util.ArrayList) list).add(new t23.k2());
        }
        return ((java.util.ArrayList) list).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((t23.m2) ((java.util.ArrayList) this.f328771e).get(i17)).f496739a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        boolean z17 = k3Var instanceof e33.e6;
        java.util.List list = this.f328771e;
        if (z17) {
            ((e33.e6) k3Var).f328746d.setText(((t23.i2) ((java.util.ArrayList) list).get(i17)).f496718c);
            return;
        }
        if (!(k3Var instanceof e33.d6)) {
            if (k3Var instanceof e33.f6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryUI", "no search result.");
                return;
            }
            return;
        }
        t23.f2 f2Var = (t23.f2) ((java.util.ArrayList) list).get(i17);
        k3Var.f3639x46306858.setOnClickListener(this.f328774h);
        k3Var.f3639x46306858.setTag(f2Var);
        t23.g2 g2Var = f2Var.f496686h;
        int i18 = (g2Var == null || !g2Var.f496689c) ? 1 : 2;
        e33.d6 d6Var = (e33.d6) k3Var;
        android.widget.ImageView imageView = d6Var.f328735d;
        java.lang.String str = f2Var.f496685g;
        e33.m6.c(imageView, i18, str, str, f2Var.f496684f, -1, null, g2Var == null ? null : g2Var.f496688b, 0L);
        d6Var.f328736e.setText(o13.q.c(this.f328770d, f2Var.f496682d, this.f328773g));
        d6Var.f328737f.setText(java.lang.String.valueOf(f2Var.f496683e));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.content.Context context = this.f328770d;
        return i17 == 0 ? new e33.e6(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.co6, viewGroup, false)) : 1 == i17 ? new e33.d6(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571011co5, viewGroup, false)) : new e33.f6(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.co7, viewGroup, false));
    }
}
