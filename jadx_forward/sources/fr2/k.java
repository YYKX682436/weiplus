package fr2;

/* loaded from: classes2.dex */
public final class k extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr2.p f347262a;

    public k(fr2.p pVar) {
        this.f347262a = pVar;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.x1 x1Var = ml2.x1.f409752z;
            android.app.Activity context = this.f347262a.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) {
                str = "";
            }
            ((b92.d1) zbVar).wi(new ml2.f0(null, null, 0, "", 0L, 0L, x1Var, str, 0, "", null, false, false, 0, null, null, null, null, 0L, null, 0, 0L, 0, null, null, null, 67107840, null));
        }
    }
}
