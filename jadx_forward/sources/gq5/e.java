package gq5;

/* loaded from: classes5.dex */
public class e extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f356152d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f356153e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f356154f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f356155g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f356156h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f356157i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f356152d = "MicroMsg.WeDrop.WeDropMainUIC";
        this.f356153e = "hasRebuild";
        this.f356154f = jz5.h.b(new gq5.c(this));
        this.f356155g = jz5.h.b(new gq5.d(activity));
        this.f356157i = jz5.h.b(new gq5.b(this));
    }

    public java.lang.String T6() {
        return this.f356152d;
    }

    public int U6() {
        return ((java.lang.Boolean) ((jz5.n) this.f356154f).mo141623x754a37bb()).booleanValue() ? 1 : 2;
    }

    public void V6() {
    }

    public void W6(int i17) {
    }

    public void X6(r45.b87 prepareSendRequest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepareSendRequest, "prepareSendRequest");
    }

    public void Y6() {
    }

    public void Z6(int i17, byte[] data, r45.y77 fileInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileInfo, "fileInfo");
    }

    public void a7(int i17, byte[] data, r45.y77 fileInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileInfo, "fileInfo");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eqq;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo64405x4dab7448(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            P6.mo78530x8b45058f();
            P6.m78560xe21cbbf(false);
            P6.mo56583xbf7c1df6("");
            P6.getWindow().addFlags(128);
            p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = P6.mo2533x106ab264();
            if (mo2533x106ab264 != null) {
                mo2533x106ab264.o();
            }
        }
        this.f356156h = bundle != null ? bundle.getBoolean(this.f356153e) : false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        int U6 = this.f356156h ? ((java.lang.Boolean) ((jz5.n) this.f356154f).mo141623x754a37bb()).booleanValue() ? 11 : 12 : U6();
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.c());
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.B3(new eq5.i(U6));
        }
        float q17 = i65.a.q(m80379x76847179());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.uoc);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.l3o);
        android.widget.TextView textView = (android.widget.TextView) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.odf);
        if (q17 <= 1.4f) {
            viewGroup.setPadding(0, i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu), 0, 0);
            int f17 = i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = f17;
            viewGroup2.setLayoutParams(marginLayoutParams);
            return;
        }
        viewGroup.setPadding(0, i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df), 0, 0);
        int f18 = i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = f18;
        viewGroup2.setLayoutParams(marginLayoutParams2);
        textView.setTextSize(0, i65.a.j(m80379x76847179()) * i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561385h1));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.getWindow().clearFlags(128);
        }
        aq5.p0.f94806a.f(null, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(T6(), "onDestroy() called");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.setRequestedOrientation(1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
        super.mo2285xa71a2260(bundle);
        if (bundle != null) {
            bundle.putBoolean(this.f356153e, true);
        }
    }
}
