package go2;

/* loaded from: classes2.dex */
public class g extends x92.e {
    public java.lang.String B;
    public android.view.View C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.B = "";
    }

    @Override // x92.e
    public void W6(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c view, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.W6(view, f17);
        float abs = java.lang.Math.abs(f17) / view.m19973xa8f0dc02();
        if (abs < 0.95d) {
            android.view.View view2 = this.C;
            if (view2 != null) {
                view2.setBackgroundColor(m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                return;
            }
            return;
        }
        int i17 = (int) (abs * 255);
        android.view.View view3 = this.C;
        if (view3 != null) {
            view3.setBackgroundColor(com.p314xaae8f345.mm.ui.uk.a(this.f534220w, i17));
        }
    }

    @Override // x92.e
    public v92.g X6() {
        return new go2.e(this, m158354x19263085(), this.B);
    }

    @Override // x92.e
    public java.lang.String Y6() {
        r45.tr0 tr0Var = (r45.tr0) this.f534252d;
        java.lang.String str = tr0Var != null ? tr0Var.f468257e : null;
        return str == null ? "" : str;
    }

    @Override // x92.e, x92.r, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.B = stringExtra;
        this.C = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nvf);
        mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.roi).setOnClickListener(new go2.f(this));
    }
}
