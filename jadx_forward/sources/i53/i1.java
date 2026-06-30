package i53;

/* loaded from: classes8.dex */
public class i1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f370127d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f370128e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f370129f;

    /* renamed from: g, reason: collision with root package name */
    public int f370130g;

    /* renamed from: h, reason: collision with root package name */
    public int f370131h;

    /* renamed from: i, reason: collision with root package name */
    public i53.b1 f370132i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f370133m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de f370134n;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de, android.content.Context context) {
        this.f370134n = c15908x78af54de;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f370127d = arrayList;
        this.f370128e = new java.util.ArrayList();
        this.f370133m = new i53.h1(this);
        this.f370129f = context;
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLocalMediaView", "RecycleViewAdapter");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.ArrayList arrayList = this.f370127d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLocalMediaView", "getItemCount, count : %d", java.lang.Integer.valueOf(arrayList.size()));
        return arrayList.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        i53.j1 j1Var = (i53.j1) k3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLocalMediaView", "onBindViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) this.f370127d.get(i17);
        if (abstractC15633xee433078 == null) {
            return;
        }
        j1Var.f370142d.setVisibility(0);
        int mo63659xfb85f7b0 = abstractC15633xee433078.mo63659xfb85f7b0();
        android.widget.RelativeLayout relativeLayout = j1Var.f370144f;
        if (mo63659xfb85f7b0 == 2) {
            relativeLayout.setVisibility(0);
            ((d60.g0) ((e60.m1) i95.n0.c(e60.m1.class))).getClass();
            e33.a0.a(j1Var.f370145g, (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078);
        } else {
            relativeLayout.setVisibility(8);
        }
        boolean equalsIgnoreCase = abstractC15633xee433078.f219971p.equalsIgnoreCase("edit");
        android.widget.ImageView imageView = j1Var.f370149n;
        if (equalsIgnoreCase) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        java.lang.String o17 = abstractC15633xee433078.o();
        java.lang.String str = abstractC15633xee433078.f219963e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLocalMediaView", "null or nil filepath: " + i17);
            return;
        }
        int mo63659xfb85f7b02 = abstractC15633xee433078.mo63659xfb85f7b0();
        android.widget.CheckBox checkBox = j1Var.f370146h;
        if (mo63659xfb85f7b02 == 1) {
            android.view.View view = j1Var.f370147i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setVisibility(0);
            j1Var.f370147i.setTag(com.p314xaae8f345.mm.R.id.jdi, java.lang.Integer.valueOf(i17));
        } else {
            android.view.View view2 = j1Var.f370147i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setVisibility(8);
        }
        e60.n1 n1Var = (e60.n1) i95.n0.c(e60.n1.class);
        android.widget.ImageView imageView2 = j1Var.f370143e;
        int mo63659xfb85f7b03 = abstractC15633xee433078.mo63659xfb85f7b0();
        long j17 = abstractC15633xee433078.f219967i;
        i53.c1 c1Var = new i53.c1(this, j1Var.f370142d);
        long j18 = abstractC15633xee433078.f219968m;
        ((d60.i0) n1Var).getClass();
        e33.m6.b(imageView2, mo63659xfb85f7b03, o17, str, j17, -1, c1Var, j18);
        boolean contains = this.f370128e.contains(abstractC15633xee433078);
        android.widget.ImageView imageView3 = j1Var.f370148m;
        if (contains) {
            checkBox.setChecked(true);
            imageView3.setVisibility(0);
            imageView3.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.t_);
        } else {
            checkBox.setChecked(false);
            imageView3.setVisibility(0);
            imageView3.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560799uj);
        }
        j1Var.f3639x46306858.setOnClickListener(new i53.d1(this, abstractC15633xee433078));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLocalMediaView", "onCreateViewHolder");
        i53.j1 j1Var = new i53.j1(this.f370134n, android.view.LayoutInflater.from(this.f370129f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bgx, viewGroup, false));
        j1Var.f370147i.setOnClickListener(this.f370133m);
        return j1Var;
    }

    public java.util.ArrayList x() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f370128e.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next()).f219963e);
        }
        return arrayList;
    }
}
