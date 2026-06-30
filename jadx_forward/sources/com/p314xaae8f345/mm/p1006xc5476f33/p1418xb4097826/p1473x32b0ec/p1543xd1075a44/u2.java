package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class u2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f201462d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 f201463e;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var) {
        this.f201463e = h3Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f201462d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v2 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f201462d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.cw1 cw1Var = (r45.cw1) obj;
        holder.f201559d = cw1Var;
        android.view.View view = holder.f3639x46306858;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var = this.f201463e;
        h3Var.getClass();
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g3(view, h3Var, cw1Var));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adPartner, index: ");
        sb6.append(i17);
        sb6.append(", nickname: ");
        sb6.append(cw1Var.m75945x2fec8307(1));
        sb6.append(", isFollow: ");
        sb6.append(cw1Var.m75933x41a8a7f2(4));
        sb6.append(", type: ");
        sb6.append(cw1Var.m75939xb282bd08(5));
        sb6.append(", authDesc: ");
        r45.dr2 dr2Var = (r45.dr2) cw1Var.m75936x14adae67(2);
        sb6.append(dr2Var != null ? dr2Var.m75945x2fec8307(0) : null);
        sb6.append(", authType: ");
        r45.dr2 dr2Var2 = (r45.dr2) cw1Var.m75936x14adae67(2);
        sb6.append(dr2Var2 != null ? java.lang.Integer.valueOf(dr2Var2.m75939xb282bd08(1)) : null);
        sb6.append(", authUrl: ");
        r45.dr2 dr2Var3 = (r45.dr2) cw1Var.m75936x14adae67(2);
        sb6.append(dr2Var3 != null ? dr2Var3.m75945x2fec8307(2) : null);
        sb6.append(" avatarUrl: ");
        sb6.append(cw1Var.m75945x2fec8307(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h3Var.f200047c, sb6.toString());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.al6, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v2(this.f201463e, inflate);
    }
}
