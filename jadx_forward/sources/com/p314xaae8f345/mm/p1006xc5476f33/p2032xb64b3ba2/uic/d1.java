package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class d1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f239915d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f239916e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f239917f;

    /* renamed from: g, reason: collision with root package name */
    public in5.w f239918g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f239915d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a1(this));
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 O6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f239915d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo141623x754a37bb;
    }

    public final void P6() {
        android.view.View view;
        android.view.View view2;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.Object a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        android.view.View view3 = null;
        this.f239916e = ed0.r0.n6((ed0.r0) a17, false, 1, null);
        O6().mo7960x6cab2c8d(this.f239916e);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cgw, (android.view.ViewGroup) O6(), false);
        if (inflate != null) {
            inflate.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, -2));
            inflate.getLayoutParams().height = com.p314xaae8f345.mm.ui.zk.a(inflate.getContext(), 84);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.dgo);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(m80379x76847179(), com.p314xaae8f345.mm.R.raw.f79528x70a32311, m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836)));
        } else {
            c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(m80379x76847179(), com.p314xaae8f345.mm.R.raw.f79527xf819b5f8, m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836)));
        }
        c22699x3dcdb352.setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f239916e;
        in5.w O = c22848x6ddd90cf != null ? c22848x6ddd90cf.O(inflate, 0, false) : null;
        this.f239918g = O;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (O == null || (view2 = ((in5.a0) O).f374536d) == null) ? null : (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.dgo);
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(8);
        }
        in5.w wVar = this.f239918g;
        if (wVar != null && (view = ((in5.a0) wVar).f374536d) != null) {
            view3 = view.findViewById(com.p314xaae8f345.mm.R.id.im8);
        }
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        android.view.View view4 = view3;
        yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC", "showLoadingMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC", "showLoadingMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i18 == 6) {
            m158354x19263085().setResult(6, m158359x1e885992());
            m158354x19263085().finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        O6().m7964x8d4ad49c(null);
        O6().i(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b1(this));
        this.f239917f = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m158354x19263085());
        O6().mo7967x900dcbe1(this.f239917f);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 O6 = O6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c1();
        c1Var.e(1, 10);
        O6.m7971xa810ec34(c1Var);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z0(this, null), 3, null);
        P6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class)).f239907f = 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        java.util.List m82898xfb7e5820;
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f239916e;
        if (c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null) {
            return;
        }
        java.util.Iterator it = m82898xfb7e5820.iterator();
        while (it.hasNext()) {
            ((ox3.g) ((ox3.f) it.next())).f431283e = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f239916e;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        }
    }
}
