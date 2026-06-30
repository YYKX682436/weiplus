package lo2;

/* loaded from: classes2.dex */
public final class g extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f401655d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f401656e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f401657f;

    public g(android.app.Activity context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f401655d = context;
        this.f401656e = new java.util.ArrayList();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f401656e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.lang.Object obj = this.f401656e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (r45.ag2) obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        java.lang.String str;
        android.app.Activity activity = this.f401655d;
        if (view == null) {
            view = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.agt, null);
            view.setTag(new lo2.e());
        }
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI.MemberFansListAdapter.FansViewHolder");
        lo2.e eVar = (lo2.e) tag;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        eVar.f401646a = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        eVar.f401647b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.ag6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        java.lang.Object obj = this.f401656e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.ag2 ag2Var = (r45.ag2) obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = ag2Var.f451522d;
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76175x6d346f39()) == null) {
            str = "";
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d l17 = g1Var.l();
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.widget.ImageView imageView = eVar.f401646a;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
            throw null;
        }
        l17.c(nVar, imageView, g1Var.h(mn2.f1.f411494o));
        android.widget.TextView textView = eVar.f401647b;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nicknameTv");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = ag2Var.f451522d;
        java.lang.String m76197x6c03c64c = c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = ag2Var.f451522d;
        java.lang.String md6 = c61.yb.md(ybVar, m76197x6c03c64c, c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76184x8010e5e4() : null, false, 4, null);
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(activity, md6));
        android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.f565840ds5);
        findViewById4.setOnClickListener(new lo2.f(this, findViewById4, i17));
        return view;
    }
}
