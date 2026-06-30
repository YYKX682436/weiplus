package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class rf implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f251950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sf f251951e;

    public rf(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sf sfVar, int i17) {
        this.f251951e = sfVar;
        this.f251950d = i17;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$14$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$14$1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0195, code lost:
    
        if ((r3 == null || r3.length() == 0) == false) goto L42;
     */
    @Override // ck5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c1(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.rf.c1(java.lang.String):void");
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$14$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sf sfVar = this.f251951e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.l(sfVar.f251990e).getText().toString()));
        int i17 = this.f251950d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCommentFooter", "comment send failed, count over, currentCharacterCount:%d, maxCount:%d", valueOf, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = sfVar.f251990e;
        android.content.Context context = c18037xf8026662.getContext();
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.i(c18037xf8026662), com.p314xaae8f345.mm.R.C30867xcad56011.j9s);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        int ceil = (int) java.lang.Math.ceil(i17 / 2.0d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        db5.t7.m(context, java.lang.String.format(r17, java.lang.Integer.valueOf(ceil)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        ta4.x0 x0Var = c18037xf8026662.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        x0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hitWordLimitToast", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        x0Var.f498393h++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hitWordLimitToast", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$14$1");
    }
}
