package g90;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f351203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f351204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f351205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f351206g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f351207h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f351208i;

    public d(g90.s sVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, int i19, java.util.ArrayList arrayList) {
        this.f351203d = sVar;
        this.f351204e = f9Var;
        this.f351205f = i17;
        this.f351206g = i18;
        this.f351207h = i19;
        this.f351208i = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f351203d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f351204e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("pic_video_menu_open_type", java.lang.Integer.valueOf(this.f351205f));
        lVarArr[1] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(this.f351206g));
        lVarArr[2] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f384367e).booleanValue() ? 1 : 2));
        lVarArr[3] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f351207h));
        java.util.ArrayList arrayList = this.f351208i;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        kz5.n0.f0(arrayList, spannableStringBuilder, "#", null, null, 0, null, null, 124, null);
        lVarArr[4] = new jz5.l("pic_video_menu_btn", spannableStringBuilder);
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Hj("chat_pic_video_menu_btn", "view_exp", i17, 32337);
    }
}
