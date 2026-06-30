package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class b9 implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f215380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 f215381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 f215382c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f215383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215386g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc f215387h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f215388i;

    public b9(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 e9Var, android.widget.TextView textView, android.view.View view, android.view.View view2, android.view.View view3, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc, android.widget.TextView textView2) {
        this.f215380a = h0Var;
        this.f215381b = c15276x168ec665;
        this.f215382c = e9Var;
        this.f215383d = textView;
        this.f215384e = view;
        this.f215385f = view2;
        this.f215386g = view3;
        this.f215387h = c23001x9d3a0bdc;
        this.f215388i = textView2;
    }

    @Override // sr.b
    public void a(int i17) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) this.f215380a.f391656d;
        boolean z17 = interfaceC4987x84e327cb != null && interfaceC4987x84e327cb.E0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 e9Var = this.f215382c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = this.f215381b;
        if (!z17 && i17 != 1) {
            if (i17 == 0 || i17 != -1) {
                return;
            }
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a9(c15276x168ec665, e9Var));
            return;
        }
        c15276x168ec665.setAlpha(1.0f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showEmojiView emojiView height=");
        sb6.append(c15276x168ec665.getHeight());
        sb6.append(" posY=");
        sb6.append(c15276x168ec665.getY());
        sb6.append(" location=");
        int[] iArr = new int[2];
        c15276x168ec665.getLocationInWindow(iArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        for (int i18 = 0; i18 < 2; i18++) {
            arrayList.add(java.lang.Integer.valueOf(iArr[i18]));
        }
        sb6.append(arrayList);
        sb6.append(';');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", sb6.toString());
        android.widget.TextView prefix = this.f215383d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(prefix, "$prefix");
        android.view.View contentContainer = this.f215384e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentContainer, "$contentContainer");
        android.view.View postfixRightLikeIcon = this.f215385f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(postfixRightLikeIcon, "$postfixRightLikeIcon");
        android.view.View postfixContainer = this.f215386g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(postfixContainer, "$postfixContainer");
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc commentText = this.f215387h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(commentText, "$commentText");
        android.widget.TextView commentPostfix = this.f215388i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(commentPostfix, "$commentPostfix");
        e9Var.getClass();
        contentContainer.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c9(contentContainer, prefix, commentPostfix, e9Var, postfixRightLikeIcon, postfixContainer, commentText));
    }
}
