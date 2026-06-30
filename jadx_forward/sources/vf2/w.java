package vf2;

/* loaded from: classes3.dex */
public final class w extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public boolean f517896m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f517897n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f517897n = new vf2.v(this);
    }

    public static final android.view.ViewGroup Z6(vf2.w wVar) {
        return (android.view.ViewGroup) wVar.T6(com.p314xaae8f345.mm.R.id.rof, com.p314xaae8f345.mm.R.id.roe);
    }

    public final android.view.ViewGroup a7() {
        return (android.view.ViewGroup) T6(com.p314xaae8f345.mm.R.id.rog, com.p314xaae8f345.mm.R.id.rod);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null) {
            yz5.l l17 = this.f517897n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
            ((java.util.ArrayList) w0Var.D1).remove(l17);
        }
        android.view.ViewGroup a76 = a7();
        if (a76 == null) {
            return;
        }
        a76.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.view.ViewGroup a76 = a7();
        if (a76 != null) {
            a76.setVisibility(8);
        }
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null) {
            yz5.l l17 = this.f517897n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
            ((java.util.ArrayList) w0Var.D1).add(l17);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null) {
            yz5.l l17 = this.f517897n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
            ((java.util.ArrayList) w0Var.D1).remove(l17);
        }
    }
}
