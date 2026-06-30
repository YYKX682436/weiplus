package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class uh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f252113d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb f252114e;

    public uh(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb activityC18053x54313abb) {
        this.f252114e = activityC18053x54313abb;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb activityC18053x54313abb = this.f252114e;
        android.text.Editable text = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb.T6(activityC18053x54313abb).getText();
        java.util.List list = this.f252113d;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            text.removeSpan((android.text.style.ForegroundColorSpan) it.next());
        }
        ((java.util.LinkedList) list).clear();
        java.lang.String obj = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb.T6(activityC18053x54313abb).getText().toString();
        ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
        java.util.regex.Matcher matcher = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b0.f272719u.matcher(obj);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(activityC18053x54313abb.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
            ((java.util.LinkedList) list).add(foregroundColorSpan);
            text.setSpan(foregroundColorSpan, start, end, 33);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
    }
}
