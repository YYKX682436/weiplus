package i12;

/* loaded from: classes15.dex */
public class o extends i12.m {

    /* renamed from: p, reason: collision with root package name */
    public int f368761p;

    /* renamed from: q, reason: collision with root package name */
    public int f368762q;

    /* renamed from: r, reason: collision with root package name */
    public int f368763r;

    public o(android.content.Context context, java.lang.String str) {
        super(context, str);
        this.f368761p = 0;
        this.f368762q = 0;
        this.f368763r = 0;
    }

    @Override // i12.m, j12.b
    public int c() {
        return this.f368763r;
    }

    @Override // i12.m, j12.b
    public int f() {
        return this.f368761p;
    }

    @Override // j12.b, android.widget.Adapter
    public int getCount() {
        return super.getCount();
    }

    @Override // j12.b, android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return super.getItem(i17);
    }

    @Override // j12.b
    /* renamed from: h */
    public j12.i getItem(int i17) {
        return super.getItem(i17);
    }

    @Override // i12.m, j12.b
    public android.view.View j(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        i12.l lVar = (i12.l) view.getTag();
        int i18 = this.f368761p;
        android.content.Context context = this.f378684d;
        if (i18 <= 0) {
            int i19 = this.f368762q;
            if (i19 > 0) {
                if (i17 == 0) {
                    lVar.f368722u.setVisibility(0);
                    lVar.f368722u.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bz6));
                } else if (i17 == i18 + i19) {
                    lVar.f368722u.setVisibility(0);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179123f)) {
                        lVar.f368722u.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179123f);
                    } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179121d) {
                        lVar.f368722u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572647bz5);
                    } else {
                        lVar.f368722u.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bye));
                    }
                } else {
                    lVar.f368722u.setVisibility(8);
                }
            } else if (i17 == 0) {
                lVar.f368722u.setVisibility(0);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179123f)) {
                    lVar.f368722u.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179123f);
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179121d) {
                    lVar.f368722u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572647bz5);
                } else {
                    lVar.f368722u.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bye));
                }
            } else {
                lVar.f368722u.setVisibility(8);
            }
        } else if (i17 == 0) {
            lVar.f368722u.setVisibility(0);
            lVar.f368722u.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byt));
        } else {
            int i27 = this.f368762q;
            if (i27 > 0 && i17 == i18) {
                lVar.f368722u.setVisibility(0);
                lVar.f368722u.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bz6));
            } else if (i17 == i18 + i27) {
                lVar.f368722u.setVisibility(0);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179123f)) {
                    lVar.f368722u.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179123f);
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179121d) {
                    lVar.f368722u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572647bz5);
                } else {
                    lVar.f368722u.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bye));
                }
            } else {
                lVar.f368722u.setVisibility(8);
            }
        }
        android.widget.FrameLayout frameLayout = lVar.f368723v;
        if (frameLayout != null) {
            frameLayout.postDelayed(new i12.n(this, lVar), 100L);
        }
        super.j(i17, view, viewGroup);
        return view;
    }

    @Override // i12.m, j12.b
    public int k() {
        return this.f368762q;
    }

    @Override // i12.m, j12.b
    public void o(int i17) {
        this.f368763r = i17;
    }

    @Override // i12.m, j12.b
    public void p(int i17) {
        this.f368761p = i17;
    }

    @Override // i12.m, j12.b
    public void q(int i17) {
        this.f368762q = i17;
    }
}
