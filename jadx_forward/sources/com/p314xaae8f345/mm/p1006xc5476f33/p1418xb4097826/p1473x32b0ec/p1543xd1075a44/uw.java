package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class uw extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 f201542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201543e;

    public uw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 c14407x4ca0b248, android.content.Context context) {
        this.f201542d = c14407x4ca0b248;
        this.f201543e = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.LinkedList linkedList = this.f201542d.f199209g;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qw holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qw) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 c14407x4ca0b248 = this.f201542d;
        java.util.LinkedList linkedList = c14407x4ca0b248.f199209g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pw pwVar = linkedList != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pw) linkedList.get(i17) : null;
        android.content.Context context = this.f201543e;
        if (pwVar != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566359fn3);
            c22628xfde5d61d.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.e().c(new mn2.q3(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ow) pwVar).f200863a.m75945x2fec8307(0), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), c22628xfde5d61d, g1Var.h(mn2.f1.f411486d));
            c22628xfde5d61d.setTag(com.p314xaae8f345.mm.R.id.f565948e72, null);
            c22628xfde5d61d.m81387x205ac394(i65.a.b(context, 8));
            c22628xfde5d61d.setId(com.p314xaae8f345.mm.R.id.f566361fn5);
            ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566360fn4)).b(null);
        }
        holder.f3639x46306858.setTag(java.lang.Integer.valueOf(i17));
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tw(c14407x4ca0b248, context, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 c14407x4ca0b248 = this.f201542d;
        android.view.View inflate = android.view.LayoutInflater.from(c14407x4ca0b248.m57928x52aa25f8()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570533b05, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qw(c14407x4ca0b248, inflate);
    }
}
