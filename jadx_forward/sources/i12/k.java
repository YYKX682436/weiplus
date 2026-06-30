package i12;

/* loaded from: classes12.dex */
public class k extends android.widget.ArrayAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final int f368753d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f368754e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0 f368755f;

    public k(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0 e0Var) {
        super(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a7h, e0Var.c());
        this.f368753d = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561895vt);
        this.f368754e = context;
        this.f368755f = e0Var;
        java.util.Iterator it = e0Var.c().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiSortAdapter", "before sort %s", ((m22.i) it.next()).b());
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        i12.j jVar;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(this.f368754e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a7h, (android.view.ViewGroup) null);
            jVar = new i12.j(this, view);
            view.setTag(jVar);
        } else {
            jVar = (i12.j) view.getTag();
        }
        m22.p pVar = (m22.p) getItem(i17);
        if (n22.l.b(pVar.b())) {
            jVar.f368751c.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572648c00);
        } else {
            jVar.f368751c.setText(pVar.c());
        }
        if (n22.l.b(pVar.b())) {
            jVar.f368750b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78061x1bf83724);
        } else {
            vo0.e eVar = vo0.e.f520000a;
            wo0.c a17 = vo0.e.f520001b.a(pVar.a());
            yo0.f fVar = new yo0.f();
            fVar.f545611b = true;
            a17.f529405c = fVar.a();
            ((wo0.b) a17).c(jVar.f368750b);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiSortAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/EmojiSortAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return view;
    }
}
