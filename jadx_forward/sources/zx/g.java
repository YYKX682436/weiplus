package zx;

/* loaded from: classes14.dex */
public final class g implements p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10501xa4ff92d f558484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx.t f558485e;

    public g(com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10501xa4ff92d c10501xa4ff92d, zx.t tVar) {
        this.f558484d = c10501xa4ff92d;
        this.f558485e = tVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void R3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10501xa4ff92d c10501xa4ff92d = this.f558484d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c10501xa4ff92d.f146821f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
        int m8183xf806b362 = c1163xf1deaba4.w0(view).m8183xf806b362();
        if (m8183xf806b362 >= 0) {
            zx.u uVar = (zx.u) this.f558485e.f558498d.get(m8183xf806b362);
            if (uVar.f558504c) {
                return;
            }
            xx.y brandDataReporter = c10501xa4ff92d.getBrandDataReporter();
            if (brandDataReporter != null) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l lVar = uVar.f558505d;
                java.lang.String b17 = lVar.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getTraceId(...)");
                long j17 = lVar.f297874d;
                xx.b bVar = lVar.f297880m ? xx.b.f539304f : xx.b.f539303e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportCommentExp");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_room_comment_exp", brandDataReporter.a(brandDataReporter.f539370j, new xx.o(b17, j17, bVar)), 36708);
            }
            uVar.f558504c = true;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void p3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }
}
