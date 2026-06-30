package e33;

/* loaded from: classes10.dex */
public class w5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f329060d;

    /* renamed from: f, reason: collision with root package name */
    public e33.z5 f329062f;

    /* renamed from: g, reason: collision with root package name */
    public final int f329063g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f329064h = new e33.t5(this);

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f329065i = new e33.u5(this);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f329061e = new java.util.ArrayList();

    public w5(android.content.Context context) {
        this.f329060d = context;
        this.f329063g = (((context.getResources().getDisplayMetrics().widthPixels - com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn)) - (com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) * 4)) / 9) * 2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f329061e).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        e33.v5 v5Var = (e33.v5) k3Var;
        t23.f2 f2Var = (t23.f2) ((java.util.ArrayList) this.f329061e).get(i17);
        v5Var.f3639x46306858.setTag(f2Var);
        v5Var.f3639x46306858.setOnClickListener(this.f329064h);
        t23.g2 g2Var = f2Var.f496686h;
        int i18 = (g2Var == null || !g2Var.f496689c) ? 1 : 2;
        java.lang.String str = f2Var.f496685g;
        e33.m6.c(v5Var.f329051d, i18, str, str, f2Var.f496684f, -1, null, g2Var == null ? null : g2Var.f496688b, 0L);
        v5Var.f329052e.setText(f2Var.f496682d);
        v5Var.f329053f.setText(java.lang.String.valueOf(f2Var.f496683e));
        v5Var.f3639x46306858.setOnLongClickListener(this.f329065i);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new e33.v5(android.view.LayoutInflater.from(this.f329060d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571008co2, viewGroup, false), this.f329063g);
    }
}
