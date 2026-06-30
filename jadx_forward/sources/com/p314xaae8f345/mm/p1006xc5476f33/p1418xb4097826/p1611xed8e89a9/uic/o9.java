package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class o9 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205582e;

    public o9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, android.view.View view) {
        this.f205581d = obVar;
        this.f205582e = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r4.m58741x6c03c64c()) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo525x7bb163d5(java.lang.Object r15) {
        /*
            r14 = this;
            com.tencent.mm.plugin.finder.extension.reddot.z9 r15 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) r15
            com.tencent.mm.plugin.finder.extension.reddot.jb r0 = r15.f186862c
            r1 = 0
            if (r0 == 0) goto La
            java.lang.String r0 = r0.f65883xdec927b
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L18
            int r0 = r0.length()
            if (r0 != 0) goto L16
            goto L18
        L16:
            r0 = r3
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 == 0) goto L24
            r45.f03 r0 = r15.f186861b
            if (r0 == 0) goto L2c
            java.lang.String r0 = r0.f455439z
            if (r0 != 0) goto L30
            goto L2c
        L24:
            com.tencent.mm.plugin.finder.extension.reddot.jb r0 = r15.f186862c
            if (r0 == 0) goto L2a
            java.lang.String r1 = r0.f65883xdec927b
        L2a:
            if (r1 != 0) goto L2f
        L2c:
            java.lang.String r0 = ""
            goto L30
        L2f:
            r0 = r1
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "[initEditLayout] redDotUsername:"
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r4 = ", username:"
            r1.append(r4)
            com.tencent.mm.plugin.finder.profile.uic.ob r4 = r14.f205581d
            java.lang.String r5 = r4.m58741x6c03c64c()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "Finder.FinderProfileHeaderUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r1)
            boolean r1 = r15.f186860a
            if (r1 != r2) goto L57
            r1 = r2
            goto L58
        L57:
            r1 = r3
        L58:
            if (r1 == 0) goto L70
            int r1 = r0.length()
            if (r1 != 0) goto L62
            r1 = r2
            goto L63
        L62:
            r1 = r3
        L63:
            if (r1 != 0) goto L71
            java.lang.String r1 = r4.m58741x6c03c64c()
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r1)
            if (r0 == 0) goto L70
            goto L71
        L70:
            r2 = r3
        L71:
            android.view.View r0 = r14.f205582e
            if (r2 == 0) goto L77
            r1 = r3
            goto L79
        L77:
            r1 = 8
        L79:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.ThreadLocal r5 = zj0.c.f554818a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.add(r1)
            java.util.Collections.reverse(r13)
            java.lang.Object[] r6 = r13.toArray()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$initEditLayout$1"
            java.lang.String r8 = "onChanged"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r0
            yj0.a.d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r13.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$initEditLayout$1"
            java.lang.String r7 = "onChanged"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            yj0.a.f(r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto Lcc
            android.view.View r0 = r14.f205582e
            int r1 = r0.getVisibility()
            if (r1 != 0) goto Lcc
            com.tencent.mm.plugin.finder.profile.uic.n9 r1 = new com.tencent.mm.plugin.finder.profile.uic.n9
            r1.<init>(r15, r4)
            ym5.a1.h(r0, r1)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o9.mo525x7bb163d5(java.lang.Object):void");
    }
}
