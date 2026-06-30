package vr1;

/* loaded from: classes14.dex */
public final class b0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f521080d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f521081e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f521082f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f521083g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f521081e = new p012xc85e97e9.p093xedfae76a.j0();
        this.f521082f = jz5.h.b(new vr1.v(activity));
        this.f521083g = jz5.h.b(new vr1.w(activity));
    }

    public final void O6(ym3.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe mvvmList) {
        java.lang.Object qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
        ym3.f fVar = mvvmList.f233590d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.data.BizPCRecentReadDataSource");
        if (((xr1.g) fVar).f537728f) {
            qVar = vr1.p.f521127a;
        } else {
            ym3.p pVar2 = ym3.p.f544714f;
            java.util.ArrayList arrayList = mvvmList.f233598o;
            if (pVar == pVar2 && arrayList.isEmpty()) {
                qVar = vr1.s.f521130a;
            } else {
                ym3.p pVar3 = ym3.p.f544713e;
                qVar = ((pVar == pVar3 || pVar == ym3.p.f544712d) && arrayList.isEmpty()) ? vr1.r.f521129a : ((pVar == pVar3 || pVar == ym3.p.f544712d) && mvvmList.f233595i) ? new vr1.q(vr1.u.f521132e) : (pVar != pVar2 || mvvmList.f233595i) ? new vr1.q(vr1.u.f521131d) : new vr1.q(vr1.u.f521133f);
            }
        }
        this.f521081e.mo7808x76db6cb1(qVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b activityC12994x7e10022b = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b) m158354x19263085;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(vr1.o.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        vr1.o oVar = (vr1.o) a17;
        oVar.P6().f233604u.mo7806x9d92d11c(activityC12994x7e10022b, new vr1.a0(this, oVar));
        android.widget.TextView textView = (android.widget.TextView) ((android.view.View) ((jz5.n) this.f521083g).mo141623x754a37bb()).findViewById(com.p314xaae8f345.mm.R.id.f568073lm3);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b activityC12994x7e10022b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b) m158354x192630852;
        android.app.Activity context2 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(vr1.o.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        vr1.o oVar2 = (vr1.o) a18;
        android.app.Activity context3 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
        if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a19 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(vr1.b0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
        textView.setOnClickListener(new vr1.y(activityC12994x7e10022b2, oVar2, (vr1.b0) a19));
        com.p314xaae8f345.mm.ui.p2740x696c9db.d8.a(textView);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b activityC12994x7e10022b3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b) m158354x192630853;
        android.app.Activity context4 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context4, "context");
        if (!(context4 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a27 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).a(vr1.o.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a27, "get(...)");
        this.f521081e.mo7806x9d92d11c(activityC12994x7e10022b3, new vr1.z((vr1.o) a27, this, activityC12994x7e10022b3));
    }
}
