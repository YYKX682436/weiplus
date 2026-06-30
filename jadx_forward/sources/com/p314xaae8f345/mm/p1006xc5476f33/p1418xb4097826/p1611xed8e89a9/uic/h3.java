package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class h3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.k0 f205285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 f205286e;

    public h3(so2.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 j3Var) {
        this.f205285d = k0Var;
        this.f205286e = j3Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1001) {
            so2.k0 k0Var = this.f205285d;
            boolean u07 = k0Var.f491985d.u0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = k0Var.f491985d;
            if (!u07) {
                long j17 = x80Var.f66236x88be67a1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.a90.f207926a.a(j17);
                java.lang.String u17 = pm0.v.u(j17);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f205286e.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4.a7((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4) a17, "draftdelete", 1, u17, 0, null, 24, null);
                return;
            }
            long j18 = x80Var.f66236x88be67a1;
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String u18 = pm0.v.u(j18);
            c66.q qVar = c66.q.f121026a;
            try {
                ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) c66.q.f121040o).mo141623x754a37bb()).m107088x90df30e9(ni0.b.f418724c.eq(u18));
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.WCFinderWCDB", "deleteFinderAsyncAIGCDraftItem fail");
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5464x5322afbe c5464x5322afbe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5464x5322afbe();
            am.ab abVar = c5464x5322afbe.f135803g;
            abVar.f87677a = 110;
            abVar.f87678b = j18;
            c5464x5322afbe.e();
        }
    }
}
