package za3;

/* loaded from: classes15.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f552428a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f552429b = false;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f552430c;

    /* renamed from: d, reason: collision with root package name */
    public final za3.b0 f552431d;

    public c0(za3.e0 e0Var, java.lang.String str) {
        this.f552428a = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareHeaderAvatarViewMgr", "init HeaderAvatar, username can't not be null");
            return;
        }
        za3.b0 b0Var = new za3.b0(this);
        this.f552431d = b0Var;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((android.view.LayoutInflater) e0Var.f552436b.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bsq, (android.view.ViewGroup) null);
        b0Var.f552423a = relativeLayout;
        b0Var.f552424b = (android.widget.ImageView) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.a9m);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(b0Var.f552424b, str);
        b0Var.f552423a.setTag(str);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        this.f552430c = layoutParams;
        android.content.Context context = e0Var.f552436b;
        layoutParams.leftMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 5.0f);
        this.f552430c.rightMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 5.0f);
        this.f552430c.gravity = 17;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHeaderAvatarViewMgr", "exitTalking, username=%s", this.f552428a);
        za3.b0 b0Var = this.f552431d;
        b0Var.f552423a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bjg);
        b0Var.f552423a.invalidate();
        this.f552429b = false;
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHeaderAvatarViewMgr", "setTalking, username=%s", this.f552428a);
        za3.b0 b0Var = this.f552431d;
        b0Var.f552423a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bjh);
        b0Var.f552423a.invalidate();
        this.f552429b = true;
    }
}
