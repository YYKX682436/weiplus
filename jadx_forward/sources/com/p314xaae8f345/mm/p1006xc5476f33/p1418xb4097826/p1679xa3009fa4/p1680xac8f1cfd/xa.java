package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class xa extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f217961n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f217962o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f217963p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(int i17, int i18, int i19, android.app.Activity activity) {
        super(activity);
        this.f217961n = i17;
        this.f217962o = i18;
        this.f217963p = i19;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int i(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93584c;
        if (layoutManager == null || !layoutManager.getF204840r()) {
            return 0;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
        int m8016xfbd72d54 = layoutManager.m8016xfbd72d54(view) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int m8010xd6b039cc = (layoutManager.m8010xd6b039cc(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - m8016xfbd72d54;
        int ceil = (int) java.lang.Math.ceil(((this.f217961n - this.f217962o) + 1) / 3.0f);
        int i18 = m8010xd6b039cc * ceil;
        int m8018x1c4fb41d = (layoutManager.m8018x1c4fb41d() - layoutManager.m8026xc96f6de6()) - layoutManager.m8031xf39fff7a();
        if (i18 > m8018x1c4fb41d / 2) {
            ceil = (int) java.lang.Math.ceil((m8018x1c4fb41d / 2.0f) / m8010xd6b039cc);
        }
        return (m8018x1c4fb41d - (m8016xfbd72d54 + (ceil * m8010xd6b039cc))) + this.f217963p;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int m() {
        return 1;
    }
}
