package or1;

/* loaded from: classes9.dex */
public class s1 extends android.widget.BaseAdapter implements l75.q0, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f429104d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f429105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a f429106f;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a activityC12982x2657907a, android.content.Context context) {
        this.f429106f = activityC12982x2657907a;
        this.f429104d = context;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnterpriseBizListAdapter", "onNotifyChange1 %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new or1.q1(this));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f429105e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (or1.v1) this.f429105e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        or1.r1 r1Var;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            r1Var = new or1.r1(this);
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570273a91, null);
            r1Var.f429098a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5l);
            r1Var.f429099b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5r);
            view2.setTag(r1Var);
        } else {
            view2 = view;
            r1Var = (or1.r1) view.getTag();
        }
        or1.v1 v1Var = (or1.v1) this.f429105e.get(i17);
        if (v1Var == null) {
            r1Var.a();
            return view2;
        }
        r1Var.a();
        int paddingBottom = view2.getPaddingBottom();
        int paddingTop = view2.getPaddingTop();
        int paddingRight = view2.getPaddingRight();
        int paddingLeft = view2.getPaddingLeft();
        view2.setBackgroundDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2));
        view2.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        r45.d67 d67Var = v1Var.f429122a;
        java.lang.String str = d67Var.f453719e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = r1Var.f429099b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = r1Var.f429099b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        r1Var.f429099b.setVisibility(0);
        r1Var.f429098a.setVisibility(0);
        n11.a b17 = n11.a.b();
        java.lang.String str2 = d67Var.f453720f;
        android.widget.ImageView imageView = r1Var.f429098a;
        int i18 = v1Var.f429123b;
        if (i18 == 0) {
            i18 = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
        }
        b17.h(str2, imageView, or1.v1.a(context, i18));
        return view2;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnterpriseBizListAdapter", "onNotifyChange2 %s", str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new or1.q1(this));
    }
}
