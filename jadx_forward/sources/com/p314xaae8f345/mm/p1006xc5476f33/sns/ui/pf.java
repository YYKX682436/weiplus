package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class pf implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f251747d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 f251748e;

    public pf(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662) {
        this.f251748e = c18037xf8026662;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = this.f251748e;
        android.text.Editable text = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.l(c18037xf8026662).getText();
        java.util.List list = this.f251747d;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            text.removeSpan((android.text.style.ForegroundColorSpan) it.next());
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        java.lang.String obj = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.l(c18037xf8026662).getText().toString();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_enable_moments_chat_emoji_search_sync, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c18037xf8026662.f248634r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (abstractC19636xc6b37291 != null && fj6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = c18037xf8026662.f248634r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            abstractC19636xc6b372912.mo75358x658d5272(obj);
        }
        ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
        java.util.regex.Matcher matcher = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b0.f272719u.matcher(obj);
        while (matcher.find()) {
            matcher.group();
            int start = matcher.start();
            int end = matcher.end();
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(c18037xf8026662.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
            linkedList.add(foregroundColorSpan);
            text.setSpan(foregroundColorSpan, start, end, 33);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
    }
}
