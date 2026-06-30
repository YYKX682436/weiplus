package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* renamed from: com.tencent.mm.plugin.mall.ui.BannerActView */
/* loaded from: classes3.dex */
public class C16470x3920ad6b extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f229760d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f229761e;

    public C16470x3920ad6b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f229761e = (android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569726k3, (android.view.ViewGroup) this, true).findViewById(com.p314xaae8f345.mm.R.id.j9g);
        setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.a(this));
    }

    /* renamed from: setActivityList */
    public void m66574xf84d85cf(java.util.List<bt4.a> list) {
        this.f229760d = list;
        if (list != null) {
            boolean z17 = true;
            if (list.size() >= 1) {
                java.util.List list2 = this.f229760d;
                gm0.j1.i();
                int intValue = ((java.lang.Integer) gm0.j1.u().c().l(270342, 0)).intValue();
                if (list2 != null) {
                    for (int size = list2.size() - 1; size >= 0; size--) {
                        int i17 = ((bt4.a) list2.get(size)).f105999a;
                        if (((bt4.a) list2.get(size)).f105999a > intValue) {
                            break;
                        }
                    }
                }
                z17 = false;
                if (!z17) {
                    setVisibility(8);
                    return;
                } else {
                    this.f229761e.setText(((bt4.a) this.f229760d.get(0)).f106000b);
                    setVisibility(0);
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BannerActivityView", "func[setActivityList] actList null");
        setVisibility(8);
    }

    /* renamed from: setData */
    public void m66575x76491f2c(at4.c1 c1Var) {
        if (c1Var == null) {
            setVisibility(8);
        } else {
            this.f229761e.setText(c1Var.f65938x24411286);
            setVisibility(0);
        }
    }
}
