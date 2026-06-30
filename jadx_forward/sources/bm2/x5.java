package bm2;

/* loaded from: classes3.dex */
public final class x5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f103963d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f103964e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f103965f;

    public x5(yz5.l lVar, yz5.l lVar2) {
        this.f103963d = lVar;
        this.f103964e = lVar2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.LinkedList linkedList = this.f103965f;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        jz5.f0 f0Var;
        bm2.t5 holder = (bm2.t5) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.content.Context context = holder.f3639x46306858.getContext();
        java.util.LinkedList linkedList = this.f103965f;
        r45.h32 h32Var = linkedList != null ? (r45.h32) linkedList.get(i17) : null;
        if (h32Var != null) {
            r45.h32 h32Var2 = h32Var;
            holder.f103843d.setText(zl2.q4.t(zl2.q4.f555466a, h32Var2, com.p314xaae8f345.mm.R.C30867xcad56011.e1u, false, false, false, 20, null));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15420x768bf212 c15420x768bf212 = holder.f103845f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c15420x768bf212, "<get-bindItemMiniInfoView>(...)");
            boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15420x768bf212.a(c15420x768bf212, h32Var2, false, false, false, 14, null);
            android.widget.TextView textView = holder.f103844e;
            if (a17) {
                textView.setVisibility(8);
            } else {
                c15420x768bf212.setVisibility(8);
                java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(3);
                if (!(true ^ (m75945x2fec8307 == null || m75945x2fec8307.length() == 0))) {
                    m75945x2fec8307 = null;
                }
                if (m75945x2fec8307 != null) {
                    textView.setVisibility(0);
                    textView.setText(h32Var.m75945x2fec8307(3));
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    textView.setVisibility(8);
                }
            }
            holder.f103846g.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyx, zl2.r4.S(zl2.r4.f555483a, h32Var.m75939xb282bd08(5), 0, 2, null)));
            yz5.l lVar = this.f103964e;
            if (lVar != null) {
                boolean booleanValue = ((java.lang.Boolean) lVar.mo146xb9724478(h32Var.m75945x2fec8307(4))).booleanValue();
                android.view.View view = holder.f103847h;
                android.widget.TextView textView2 = holder.f103848i;
                if (booleanValue) {
                    textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyw));
                    textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                    view.setOnClickListener(null);
                } else {
                    textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyv));
                    textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                    view.setOnClickListener(new bm2.v5(this, h32Var));
                }
            }
            holder.f3639x46306858.setOnClickListener(new bm2.w5(context, h32Var));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.avp, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new bm2.t5(this, inflate);
    }
}
