package vr3;

/* loaded from: classes8.dex */
public final class a implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.el5 f521152d;

    /* renamed from: e, reason: collision with root package name */
    public final as3.b f521153e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f521154f;

    public a(r45.el5 info, as3.b baseReportInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseReportInfo, "baseReportInfo");
        this.f521152d = info;
        this.f521153e = baseReportInfo;
        this.f521154f = "MicroMsg.BizFollowMoreItemData";
    }

    public final cl0.g a() {
        cl0.g gVar = new cl0.g();
        as3.b bVar = this.f521153e;
        gVar.h("BizUin", bVar.f95022a);
        gVar.o("Scene", bVar.f95023b);
        gVar.o("subscene", 1);
        r45.el5 el5Var = this.f521152d;
        gVar.h("RecReason", el5Var.f455127e);
        gVar.o("Rec_BizUin", el5Var.f455126d.f451604h);
        gVar.h("RecInfo", el5Var.f455128f);
        gVar.h("sessionid_", bVar.f95024c);
        gVar.o("log_id", 25574);
        return gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (obj instanceof vr3.a) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f521152d.f455126d.f451601e.hashCode(), ((vr3.a) obj).f521152d.f455126d.f451601e.hashCode());
        }
        return 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f521152d.f455126d.f451601e.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
