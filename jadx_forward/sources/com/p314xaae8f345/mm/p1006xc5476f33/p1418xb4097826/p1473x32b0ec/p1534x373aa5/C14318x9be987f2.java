package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGameWelfareTaskProgressItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView */
/* loaded from: classes8.dex */
public final class C14318x9be987f2 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f197450d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 f197451e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f197452f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f197453g;

    public /* synthetic */ C14318x9be987f2(android.content.Context context, android.util.AttributeSet attributeSet, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r45.s73 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "task"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            r0 = 0
            com.tencent.mm.protobuf.f r1 = r10.m75936x14adae67(r0)
            r45.o73 r1 = (r45.o73) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            java.lang.String r1 = r1.m75945x2fec8307(r3)
            goto L17
        L16:
            r1 = r2
        L17:
            if (r1 == 0) goto L22
            int r1 = r1.length()
            if (r1 != 0) goto L20
            goto L22
        L20:
            r1 = r0
            goto L23
        L22:
            r1 = r3
        L23:
            android.widget.ImageView r4 = r9.f197452f
            r5 = 2
            if (r1 != 0) goto L5f
            com.tencent.mm.protobuf.f r1 = r10.m75936x14adae67(r0)
            r45.o73 r1 = (r45.o73) r1
            if (r1 == 0) goto L38
            boolean r1 = r1.m75933x41a8a7f2(r5)
            if (r1 != r3) goto L38
            r1 = r3
            goto L39
        L38:
            r1 = r0
        L39:
            if (r1 == 0) goto L3c
            goto L5f
        L3c:
            mn2.g1 r1 = mn2.g1.f411508a
            vo0.d r6 = r1.e()
            mn2.n r7 = new mn2.n
            com.tencent.mm.protobuf.f r8 = r10.m75936x14adae67(r0)
            r45.o73 r8 = (r45.o73) r8
            if (r8 == 0) goto L51
            java.lang.String r8 = r8.m75945x2fec8307(r3)
            goto L52
        L51:
            r8 = r2
        L52:
            r7.<init>(r8, r2, r5, r2)
            mn2.f1 r2 = mn2.f1.f411498s
            yo0.i r1 = r1.h(r2)
            r6.c(r7, r4, r1)
            goto L65
        L5f:
            r1 = 2131234183(0x7f080d87, float:1.8084525E38)
            r4.setImageResource(r1)
        L65:
            boolean r1 = r10.m75933x41a8a7f2(r3)
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r2 = r9.f197451e
            if (r1 == 0) goto L96
            r2.setVisibility(r0)
            r1 = 3
            java.lang.String r4 = r10.m75945x2fec8307(r1)
            if (r4 == 0) goto L80
            int r4 = r4.length()
            if (r4 != 0) goto L7e
            goto L80
        L7e:
            r4 = r0
            goto L81
        L80:
            r4 = r3
        L81:
            if (r4 != 0) goto L8e
            java.lang.String r1 = r10.m75945x2fec8307(r1)
            int r1 = android.graphics.Color.parseColor(r1)
            r2.m82114x7d38f3f4(r1)
        L8e:
            int r1 = r10.m75939xb282bd08(r5)
            r2.m82113x3ae760af(r1)
            goto L9b
        L96:
            r1 = 8
            r2.setVisibility(r1)
        L9b:
            android.widget.RelativeLayout r1 = r9.f197450d
            r1.setVisibility(r0)
            r1 = 4
            java.lang.String r10 = r10.m75945x2fec8307(r1)
            java.lang.String r1 = ""
            if (r10 != 0) goto Laa
            r10 = r1
        Laa:
            java.lang.String r2 = "#getLicenseText wording="
            java.lang.String r2 = r2.concat(r10)
            java.lang.String r4 = "FinderLiveGameWelfareTaskProgressItemView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)
            int r2 = r10.length()
            if (r2 != 0) goto Lbc
            goto Lbd
        Lbc:
            r3 = r0
        Lbd:
            if (r3 == 0) goto Lc5
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r1)
            goto Ld3
        Lc5:
            com.tencent.mm.plugin.finder.live.view.k5 r1 = new com.tencent.mm.plugin.finder.live.view.k5
            r1.<init>(r9)
            java.lang.CharSequence r10 = kk1.d.a(r10, r0, r1)
            java.lang.String r0 = "fromHtmlToSpanned(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r0)
        Ld3:
            android.widget.TextView r0 = r9.f197453g
            r0.setText(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14318x9be987f2.a(r45.s73):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14318x9be987f2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.arc, this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566675gp5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f197450d = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566674gp4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f197451e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566673gp3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f197452f = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.gp6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f197453g = (android.widget.TextView) findViewById4;
    }
}
