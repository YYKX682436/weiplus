package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class c0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f232599d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f232600e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f232601f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16666xe1e8fad2 f232602g;

    /* renamed from: h, reason: collision with root package name */
    public xm3.t0 f232603h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f232599d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b0(activity));
        this.f232600e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t(activity));
        this.f232601f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s(activity));
    }

    public static final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 O6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0 c0Var) {
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) c0Var.f232599d).mo141623x754a37bb();
    }

    public final android.widget.Button P6() {
        return (android.widget.Button) ((jz5.n) this.f232600e).mo141623x754a37bb();
    }

    public final void Q6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16666xe1e8fad2 c16666xe1e8fad2 = this.f232602g;
        if (c16666xe1e8fad2 != null) {
            android.content.Intent intent = new android.content.Intent();
            r45.oc5 oc5Var = new r45.oc5();
            for (im3.j jVar : c16666xe1e8fad2.f233598o) {
                java.util.LinkedList linkedList = oc5Var.f463683e;
                r45.ny5 ny5Var = new r45.ny5();
                ny5Var.f463299e = jVar.f374234g;
                ny5Var.f463298d = jVar.f374233f;
                linkedList.add(ny5Var);
            }
            intent.putExtra("PreviewItemObjCallbackAction", i17);
            intent.putExtra("PreviewItemObjCallback", oc5Var.mo14344x5f01b1f6());
            m158354x19263085().setResult(-1, intent);
            m158354x19263085().finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b) a17;
        bVar.O6().m3(m158354x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w(this, bVar));
        bVar.O6().m3(m158354x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z(this));
        P6().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.a0(this));
    }
}
