package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes12.dex */
public final class ey extends p012xc85e97e9.p103xe821e364.p104xd1075a44.q1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14411xc4c352f7 f199824e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14411xc4c352f7 c14411xc4c352f7) {
        super(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dy());
        this.f199824e = c14411xc4c352f7;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cy holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cy) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f93733d.f93638e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getItem(...)");
        r45.nu0 nu0Var = (r45.nu0) obj;
        holder.f199564d.setText(nu0Var.m75945x2fec8307(1) + ' ' + nu0Var.m75945x2fec8307(2));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14411xc4c352f7 c14411xc4c352f7 = this.f199824e;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(c14411xc4c352f7.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dob, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cy(c14411xc4c352f7, inflate);
    }
}
