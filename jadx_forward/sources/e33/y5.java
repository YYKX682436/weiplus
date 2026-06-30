package e33;

/* loaded from: classes10.dex */
public class y5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f329088d;

    /* renamed from: e, reason: collision with root package name */
    public t23.h2 f329089e;

    /* renamed from: f, reason: collision with root package name */
    public e33.z5 f329090f;

    public y5(android.content.Context context) {
        this.f329088d = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        t23.h2 h2Var = this.f329089e;
        if (h2Var == null) {
            return 0;
        }
        return h2Var.f496705b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        e33.x5 x5Var = (e33.x5) k3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryUI", "CategoryAlbumAdapter onBindViewHolder: %d.", java.lang.Integer.valueOf(i17));
        t23.h2 h2Var = this.f329089e;
        if (h2Var != null) {
            t23.i2 i2Var = (t23.i2) h2Var.f496704a.get(i17);
            x5Var.f329080d.setText(i2Var.f496718c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryUI", "category id: %s, category name: %s.", i2Var.f496717b, i2Var.f496718c);
            java.util.List list = (java.util.List) this.f329089e.f496705b.get(i2Var);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SmartGalleryUI", "album info list invalid.");
                return;
            }
            int size = list.size();
            android.content.Context context = this.f329088d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = size > 4 ? new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 2, 0, false) : new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 1, 0, false);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = x5Var.f329081e;
            c1163xf1deaba4.mo7967x900dcbe1(c1161x57298f5d);
            e33.w5 w5Var = new e33.w5(context);
            e33.z5 z5Var = this.f329090f;
            if (z5Var != null) {
                w5Var.f329062f = z5Var;
            }
            c1163xf1deaba4.mo7960x6cab2c8d(w5Var);
            java.util.ArrayList arrayList = (java.util.ArrayList) w5Var.f329061e;
            arrayList.clear();
            arrayList.addAll(list);
            w5Var.m8146xced61ae5();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new e33.x5(android.view.LayoutInflater.from(this.f329088d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571009co3, viewGroup, false));
    }
}
