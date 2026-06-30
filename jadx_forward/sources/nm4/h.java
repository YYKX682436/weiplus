package nm4;

/* loaded from: classes13.dex */
public final class h implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 f420026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.lm6 f420027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f420028c;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 c18735xc3936731, r45.lm6 lm6Var, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f420026a = c18735xc3936731;
        this.f420027b = lm6Var;
        this.f420028c = c22789xd23e9a9b;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731.f256381t;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 c18735xc3936731 = this.f420026a;
        c18735xc3936731.getClass();
        boolean z18 = (!z17 || bitmap == null || bitmap.isRecycled()) ? false : true;
        r45.lm6 lm6Var = this.f420027b;
        if (lm6Var.f461173g == 2) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f420028c;
            if (z18) {
                c18735xc3936731.f(c22789xd23e9a9b, bitmap);
                java.lang.String str2 = lm6Var.f461172f;
                if (str2 == null) {
                    str2 = "";
                }
                c18735xc3936731.e(str2, bitmap);
                return;
            }
            c18735xc3936731.f(c22789xd23e9a9b, bitmap);
            android.view.View view2 = c18735xc3936731.f256392q;
            if (view2 != null) {
                view2.setBackground(null);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryPagCoverBg");
                throw null;
            }
        }
    }
}
