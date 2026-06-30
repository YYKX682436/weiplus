package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class qg implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f291089d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.og f291090e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f291091f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f291092g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f291093h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f291094i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f291095m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f291096n;

    public qg(android.content.Context context, com.p314xaae8f345.mm.ui.og ogVar) {
        this.f291089d = context;
        this.f291090e = ogVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean W5() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Y3(boolean z17) {
        if (z17) {
            this.f291094i.setVisibility(0);
            return true;
        }
        this.f291094i.setVisibility(8);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        if (!z17) {
            this.f291095m.setVisibility(8);
            return true;
        }
        this.f291095m.setVisibility(0);
        if (pm6Var.f464719d > 99) {
            this.f291095m.setText("");
            this.f291095m.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78601xa3931aa1);
            return true;
        }
        this.f291095m.setText("" + pm6Var.f464719d);
        this.f291095m.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(this.f291089d, pm6Var.f464719d));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void c1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(this, rVar, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        return this.f291090e.f291009b.f291043e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        return this.f291091f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean o0(boolean z17) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean y(boolean z17) {
        if (z17) {
            android.view.View view = this.f291096n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        android.view.View view2 = this.f291096n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }
}
