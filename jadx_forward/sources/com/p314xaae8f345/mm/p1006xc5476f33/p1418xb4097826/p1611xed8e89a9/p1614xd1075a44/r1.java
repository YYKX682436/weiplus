package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class r1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f206233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 f206234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f206236g;

    public r1(r45.h32 h32Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var, java.lang.String str, yz5.a aVar) {
        this.f206233d = h32Var;
        this.f206234e = s1Var;
        this.f206235f = str;
        this.f206236g = aVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 4) {
            r45.h32 h32Var = this.f206233d;
            h32Var.set(1, 1);
            cl0.g gVar = new cl0.g();
            gVar.s("source_type", 0);
            gVar.o("notice_type", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.f206234e;
            gVar.s("ref_page_type", s1Var.H);
            c50.c1 c1Var = (c50.c1) i95.n0.c(c50.c1.class);
            ml2.i5 i5Var = ml2.i5.f409105g;
            java.lang.String str = s1Var.f206255f;
            java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(3);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
            java.lang.String gVar2 = gVar.toString();
            long e17 = s1Var.e();
            int d17 = s1Var.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1Var);
            c50.c1.l9(c1Var, i5Var, this.f206235f, 0L, 0, str, null, null, null, null, m75945x2fec8307, gVar2, m75945x2fec83072, null, e17, d17, null, 37344, null);
            this.f206236g.mo152xb9724478();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = s1Var.f206251b;
            db5.t7.i(activityC0065xcd7aa112, activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn8), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        }
    }
}
