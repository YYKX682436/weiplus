package zx;

/* loaded from: classes14.dex */
public final class s implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx.t f558494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx.u f558495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f558496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zx.r f558497g;

    public s(zx.t tVar, zx.u uVar, boolean z17, zx.r rVar) {
        this.f558494d = tVar;
        this.f558495e = uVar;
        this.f558496f = z17;
        this.f558497g = rVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/chatbot/brand/ui/view/QueryAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        zx.p pVar = this.f558494d.f558501g;
        if (pVar != null) {
            zx.r rVar = this.f558497g;
            rVar.m8183xf806b362();
            android.view.View view2 = rVar.f558493d;
            zx.e eVar = (zx.e) pVar;
            zx.u item = this.f558495e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
            boolean z17 = this.f558496f;
            zx.t tVar = eVar.f558480a;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l lVar = item.f558505d;
            if (!z17) {
                java.lang.String b17 = lVar.b();
                java.lang.String str = tVar.f558500f;
                if (!android.text.TextUtils.equals(str, b17)) {
                    int x17 = str != null ? tVar.x(str) : -1;
                    tVar.f558500f = b17;
                    int x18 = b17 != null ? tVar.x(b17) : -1;
                    if (x17 >= 0) {
                        tVar.m8147xed6e4d18(x17);
                    }
                    if (x18 >= 0 && x18 != x17) {
                        tVar.m8147xed6e4d18(x18);
                    }
                }
            }
            rl5.r rVar2 = new rl5.r(view2.getContext(), view2);
            com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10501xa4ff92d c10501xa4ff92d = eVar.f558481b;
            rVar2.f478888y = new zx.b(c10501xa4ff92d);
            rVar2.f478887x = new zx.c(c10501xa4ff92d, item);
            rVar2.L = new zx.d(z17, tVar, item);
            rVar2.C = true;
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            rVar2.n(iArr[0] + (view2.getWidth() / 2), iArr[1]);
            xx.y brandDataReporter = c10501xa4ff92d.getBrandDataReporter();
            if (brandDataReporter != null) {
                java.lang.String b18 = lVar.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getTraceId(...)");
                long j17 = lVar.f297874d;
                xx.b bVar = lVar.f297880m ? xx.b.f539304f : xx.b.f539303e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportCommentClk");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_room_comment_clk", brandDataReporter.a(brandDataReporter.f539370j, new xx.n(b18, j17, bVar)), 36708);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/feature/chatbot/brand/ui/view/QueryAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
