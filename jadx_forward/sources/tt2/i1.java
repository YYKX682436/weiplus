package tt2;

/* loaded from: classes3.dex */
public final class i1 extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f503472h = new java.util.ArrayList();

    @Override // in5.q0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void y(tt2.h1 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        r45.p45 pairingInfo = (r45.p45) ((java.util.ArrayList) this.f503472h).get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pairingInfo, "pairingInfo");
        holder.f503461o.setText(pairingInfo.m75945x2fec8307(1));
        holder.f503463q.setText(holder.f503460n.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nty, java.lang.Integer.valueOf(pairingInfo.m75941xfb821914(4).size())));
        holder.f503462p.setOnClickListener(new tt2.g1(holder, pairingInfo));
        java.util.LinkedList m75941xfb821914 = pairingInfo.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getImg_list(...)");
        r45.o45 o45Var = (r45.o45) kz5.n0.Z(m75941xfb821914);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = holder.f503464r;
        if (o45Var != null) {
            android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba4.getLayoutParams();
            layoutParams.height = (int) ((o45Var.m75939xb282bd08(1) / o45Var.m75939xb282bd08(2)) * com.p314xaae8f345.mm.ui.bk.o(1.0f));
            c1163xf1deaba4.setLayoutParams(layoutParams);
        }
        c1163xf1deaba4.mo7967x900dcbe1(holder.f503465s);
        tt2.k1 k1Var = holder.f503466t;
        c1163xf1deaba4.mo7960x6cab2c8d(k1Var);
        k1Var.getClass();
        k1Var.f503484e = pairingInfo;
        java.util.ArrayList arrayList = (java.util.ArrayList) k1Var.f503483d;
        arrayList.clear();
        java.util.LinkedList m75941xfb8219142 = pairingInfo.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getImg_list(...)");
        arrayList.addAll(m75941xfb8219142);
        k1Var.m8146xced61ae5();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f408797s;
        cl0.g gVar = new cl0.g();
        ml2.f4 f4Var = ml2.f4.f408964e;
        gVar.o("commerceAction", 1068);
        gVar.p("pairing_id", pairingInfo.m75942xfb822ef2(0));
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f503472h).size();
    }

    @Override // in5.q0
    public void x(in5.r0 r0Var, int i17) {
        tt2.h1 holder = (tt2.h1) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        y(holder, i17, new java.util.ArrayList());
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ebh, (android.view.ViewGroup) null, false);
        inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        return new tt2.h1(this, inflate);
    }
}
