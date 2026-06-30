package mu1;

/* loaded from: classes15.dex */
public class f extends mu1.a {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f412893g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f412894h;

    @Override // mu1.a, mu1.j
    public void d(boolean z17, boolean z18) {
    }

    @Override // mu1.a
    public void g() {
        this.f412894h = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.b7t);
        this.f412893g = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.bc7);
    }

    @Override // mu1.a
    public void h() {
        if (this.f412867a.s0().f470093s == null || this.f412867a.s0().f470093s.size() <= 0) {
            return;
        }
        r45.w50 w50Var = (r45.w50) this.f412867a.s0().f470093s.get(0);
        android.widget.TextView textView = this.f412871e;
        if (textView != null) {
            textView.setText(w50Var.f470411d);
        }
        if (this.f412893g != null) {
            if (android.text.TextUtils.isEmpty(w50Var.f470412e)) {
                this.f412893g.setVisibility(8);
            } else {
                this.f412893g.setText(w50Var.f470412e);
            }
        }
        if (this.f412894h != null) {
            if (android.text.TextUtils.isEmpty(w50Var.f470413f)) {
                this.f412894h.setVisibility(8);
            } else {
                this.f412894h.setText(w50Var.f470413f);
            }
        }
    }
}
