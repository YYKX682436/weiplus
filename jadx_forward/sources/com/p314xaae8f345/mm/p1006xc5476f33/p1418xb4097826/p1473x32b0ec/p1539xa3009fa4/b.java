package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class b extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f198443d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f198444e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f198445f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f198446g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f198447h;

    /* renamed from: i, reason: collision with root package name */
    public r45.xl6 f198448i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198443d = "Finder.FinderGameFinishUIC";
        this.f198444e = true;
        this.f198445f = "";
        this.f198446g = "";
    }

    public final void O6() {
        android.view.View h17 = h();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(h17, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void P6(boolean z17, java.lang.String title, java.lang.String desc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f198444e = z17;
        this.f198445f = title;
        this.f198446g = desc;
    }

    public final void Q6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h().findViewById(com.p314xaae8f345.mm.R.id.g6b);
        if (this.f198444e) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79236x2de5f313);
            c22699x3dcdb352.m82040x7541828(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560596oq));
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79723x416541f0);
            c22699x3dcdb352.m82040x7541828(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560596oq));
        }
        ((android.widget.TextView) h().findViewById(com.p314xaae8f345.mm.R.id.g6g)).setText(this.f198445f);
        ((android.widget.TextView) h().findViewById(com.p314xaae8f345.mm.R.id.g6a)).setText(this.f198446g);
        h().findViewById(com.p314xaae8f345.mm.R.id.g68).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a(this));
        android.view.View h17 = h();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(h17, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final android.view.View h() {
        android.view.View view = this.f198447h;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.g67);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        this.f198447h = mo144222x4ff8c0f0;
        r45.xl6 xl6Var = new r45.xl6();
        byte[] byteArrayExtra = m158359x1e885992().getByteArrayExtra("KEY_FROM_THIRD_PARTY_SHARE");
        if (byteArrayExtra != null) {
            try {
                xl6Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
            this.f198448i = xl6Var;
        }
        xl6Var = null;
        this.f198448i = xl6Var;
    }
}
