package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class qy implements qj5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty f217277a;

    public qy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty tyVar) {
        this.f217277a = tyVar;
    }

    @Override // qj5.q
    public p15.n b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty tyVar = this.f217277a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = tyVar.m158354x19263085();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = tyVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class);
        boolean z18 = false;
        boolean z19 = c15471x9d199e5b != null && c15471x9d199e5b.f215159n;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = tyVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4 s4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4) pf5.z.f435481a.a(activity2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4.class);
        if (s4Var != null && s4Var.P6()) {
            z18 = true;
        }
        if (z18) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty.O6(tyVar, 2);
        }
        if (((m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) && !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) m158354x19263085).m81210x448cda5d()) || z19) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty.O6(tyVar, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = tyVar.f217601e;
        if (abstractC14490x69736cb5 != null) {
            if (!hc2.o0.d(abstractC14490x69736cb5.getFeedObject().getFeedObject()) || abstractC14490x69736cb5.getFeedObject().getFeedObject().m76815x4f546659() == 1 || abstractC14490x69736cb5.getFeedObject().m59327xb219fc91() || abstractC14490x69736cb5.getFeedObject().m59325x2e012816()) {
                return new p15.n();
            }
            long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
            if (m59251x5db1b11 != 0) {
                android.net.Uri.Builder buildUpon = android.net.Uri.parse("https://weixin.qq.com/finderFeed").buildUpon();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(buildUpon, "buildUpon(...)");
                java.lang.String format = java.lang.String.format("0x%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f424562g)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                android.net.Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("version", format).appendQueryParameter("feedid", pm0.v.u(m59251x5db1b11)).appendQueryParameter("nonceid", abstractC14490x69736cb5.getFeedObject().m59276x6c285d75());
                ya2.b2 contact = abstractC14490x69736cb5.getContact();
                appendQueryParameter.appendQueryParameter("nickname", contact != null ? contact.w0() : null).appendQueryParameter("snapshottype", java.lang.String.valueOf(tyVar.Q6()));
                p15.n nVar = new p15.n();
                p15.m mVar = new p15.m();
                mVar.n(buildUpon.toString());
                mVar.l(12);
                nVar.n(mVar);
                return nVar;
            }
        }
        return new p15.n();
    }
}
