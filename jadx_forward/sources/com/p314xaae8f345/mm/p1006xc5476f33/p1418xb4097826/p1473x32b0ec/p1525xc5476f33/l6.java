package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes2.dex */
public final class l6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 f194883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f194884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var, boolean z17) {
        super(0);
        this.f194883d = v6Var;
        this.f194884e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var = this.f194883d;
        boolean z17 = this.f194884e;
        v6Var.B = z17;
        android.widget.TextView textView = v6Var.f196202r;
        android.widget.ImageView imageView = v6Var.f196201q;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = v6Var.f196203s;
        if (z17) {
            imageView.setVisibility(4);
            textView.setVisibility(8);
            android.view.View view = v6Var.f196205u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$changeApplaudMode$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$changeApplaudMode$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22789xd23e9a9b.setVisibility(0);
            if (!c22789xd23e9a9b.f()) {
                ym5.l2 l2Var = ym5.l2.f544957a;
                ym5.j2[] j2VarArr = ym5.j2.f544925d;
                c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.f544859w));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var2 = this.f194883d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(v6Var2, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j6(v6Var2, null), 3, null);
            }
            pm0.v.V(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k6(v6Var));
        } else {
            imageView.setVisibility(0);
            textView.setVisibility(0);
            c22789xd23e9a9b.setVisibility(8);
            c22789xd23e9a9b.n();
            v6Var.A = java.lang.System.currentTimeMillis();
        }
        return jz5.f0.f384359a;
    }
}
