package nm4;

/* loaded from: classes13.dex */
public final class g implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 f420022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f420023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f420024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420025d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 c18735xc3936731, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, int i17, java.lang.String str) {
        this.f420022a = c18735xc3936731;
        this.f420023b = c22789xd23e9a9b;
        this.f420024c = i17;
        this.f420025d = str;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        boolean z18 = (!z17 || bitmap == null || bitmap.isRecycled()) ? false : true;
        int i17 = this.f420024c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 c18735xc3936731 = this.f420022a;
        if (z18) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(new nm4.d(bitmap, i17));
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731.f256381t;
            c18735xc3936731.d(this.f420023b, linkedList);
        }
        if (i17 == 0) {
            if (z18) {
                java.lang.String str2 = this.f420025d;
                if (str2 == null) {
                    str2 = "";
                }
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731.f256381t;
                c18735xc3936731.e(str2, bitmap);
                return;
            }
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
