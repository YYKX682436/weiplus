package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public final class q5 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f181164d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final o11.g f181165e;

    public q5() {
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.c1o;
        this.f181165e = fVar.a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f181164d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o5) ((java.util.LinkedList) this.f181164d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p5 p5Var;
        r45.rw6 rw6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o5 o5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o5) ((java.util.LinkedList) this.f181164d).get(i17);
        java.lang.String str = null;
        if (view == null) {
            p5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p5(null);
            view2 = android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a__, null);
            p5Var.f181152a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k3h);
            p5Var.f181153b = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.h5u);
            view2.setTag(p5Var);
        } else {
            view2 = view;
            p5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p5) view.getTag();
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13476xfb15ef0e.f180862f;
        java.lang.String str2 = "";
        if (o5Var != null && (rw6Var = o5Var.f181140a) != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rw6Var.f466784h)) {
                v32.b bVar = o5Var.f181141b;
                if (bVar != null) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f318639y)) {
                        str = bVar.f318639y;
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.B)) {
                        long j17 = bVar.f66609x4b6e688a;
                        if (j17 != 0) {
                            str = a42.i.f(j17);
                        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f66606x5fdff396)) {
                            str = bVar.f66606x5fdff396;
                        }
                    } else {
                        str = bVar.B;
                    }
                    if (str != null) {
                        str2 = str;
                    }
                }
            } else {
                str2 = o5Var.f181140a.f466784h;
            }
        }
        o5Var.getClass();
        p5Var.f181152a.setText(str2);
        n11.a.b().h(o5Var.f181140a.f466785i, p5Var.f181153b, this.f181165e);
        return view2;
    }
}
