package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class py extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public boolean f217169g = true;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty f217170h;

    public py(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty tyVar) {
        this.f217170h = tyVar;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return (event instanceof fc2.t) && ((i17 = ((fc2.t) event).f342518d) == 6 || i17 == 5);
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 I0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 I02;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof fc2.t) {
            fc2.t tVar = (fc2.t) ev6;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty tyVar = this.f217170h;
            int i17 = tVar.f342518d;
            if (i17 != 5) {
                if (i17 == 6 && (I02 = I0(tVar)) != null) {
                    tyVar.f217601e = I02;
                    return;
                }
                return;
            }
            if (!this.f217169g || (I0 = I0(tVar)) == null) {
                return;
            }
            tyVar.f217601e = I0;
            this.f217169g = false;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 I0(fc2.t tVar) {
        android.view.View mo144222x4ff8c0f0;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty tyVar = this.f217170h;
        if (tyVar.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = tyVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            android.view.View m7474xfb86a31b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c().m7474xfb86a31b();
            mo144222x4ff8c0f0 = m7474xfb86a31b != null ? m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.m6e) : null;
        } else {
            mo144222x4ff8c0f0 = tyVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.m6e);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = mo144222x4ff8c0f0 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 ? (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) mo144222x4ff8c0f0 : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = c22801x87cbdc00 != null ? c22801x87cbdc00.m82555x4905e9fa() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m82555x4905e9fa != null ? m82555x4905e9fa.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf == null) {
            return null;
        }
        java.util.Iterator it = c22848x6ddd90cf.m82898xfb7e5820().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((in5.c) obj).mo2128x1ed62e84() == tVar.f342525k) {
                break;
            }
        }
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
        }
        return null;
    }
}
