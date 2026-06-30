package rf4;

/* loaded from: classes4.dex */
public final class a2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f476553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 f476554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f476555f;

    public a2(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331, int i17) {
        this.f476553d = z17;
        this.f476554e = c18486xb54a9331;
        this.f476555f = i17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        java.util.List arrayList;
        java.util.List arrayList2;
        java.util.List arrayList3;
        java.lang.String stringBuffer;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (this.f476553d) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331 = this.f476554e;
        android.view.View view = c18486xb54a9331.f253547i;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateOpen$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateOpen$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = c18486xb54a9331.f253553r;
        java.util.ArrayList arrayList5 = c18486xb54a9331.f253551p;
        int i17 = this.f476555f;
        if (z17) {
            c18486xb54a9331.f253544f.m8316x940d026a(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList5.get(0);
            if4.a aVar = c18486xb54a9331.f253552q;
            if (aVar == null || (arrayList2 = aVar.f372775j) == null) {
                arrayList2 = new java.util.ArrayList();
            }
            c18485x239212ef.c(arrayList2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList5.get(1);
            if4.a aVar2 = c18486xb54a9331.f253552q;
            if (aVar2 == null || (arrayList3 = aVar2.f372773h) == null) {
                arrayList3 = new java.util.ArrayList();
            }
            c18485x239212ef2.c(arrayList3);
            if (i17 == 0) {
                mf4.d dVar = mf4.d.f407693a;
                long j17 = c18486xb54a9331.f253558w;
                if (j17 == 0) {
                    stringBuffer = "";
                } else {
                    java.lang.String bigInteger = new java.math.BigInteger(java.lang.Long.toBinaryString(j17), 2).toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bigInteger, "toString(...)");
                    java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(bigInteger);
                    while (stringBuffer2.length() < 25) {
                        stringBuffer2.insert(0, "0");
                    }
                    stringBuffer = stringBuffer2.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer, "toString(...)");
                }
                if (mf4.d.f407700h) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6935x89ce03dd c6935x89ce03dd = mf4.d.f407694b;
                    c6935x89ce03dd.f142449d = 8L;
                    c6935x89ce03dd.f142450e = c6935x89ce03dd.b("StoryId", stringBuffer, true);
                    dVar.b();
                }
                mf4.d.f407700h = false;
            } else {
                java.lang.String str = "";
                if (i17 == 1) {
                    mf4.d dVar2 = mf4.d.f407693a;
                    long j18 = c18486xb54a9331.f253558w;
                    if (j18 != 0) {
                        java.lang.String bigInteger2 = new java.math.BigInteger(java.lang.Long.toBinaryString(j18), 2).toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bigInteger2, "toString(...)");
                        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer(bigInteger2);
                        while (stringBuffer3.length() < 25) {
                            stringBuffer3.insert(0, "0");
                        }
                        java.lang.String stringBuffer4 = stringBuffer3.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer4, "toString(...)");
                        str = stringBuffer4;
                    }
                    if (mf4.d.f407701i) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6935x89ce03dd c6935x89ce03dd2 = mf4.d.f407694b;
                        c6935x89ce03dd2.f142449d = 5L;
                        c6935x89ce03dd2.f142450e = c6935x89ce03dd2.b("StoryId", str, true);
                        dVar2.b();
                    }
                    mf4.d.f407701i = false;
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList5.get(i17);
            if4.a aVar3 = c18486xb54a9331.f253552q;
            if (aVar3 == null || (arrayList = aVar3.f372773h) == null) {
                arrayList = new java.util.ArrayList();
            }
            c18485x239212ef3.c(arrayList);
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 commentInputView = c18486xb54a9331.getCommentInputView();
            java.lang.CharSequence charSequence = c18486xb54a9331.f253560y;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083.f253517x;
            commentInputView.d(charSequence, "", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 commentInputView2 = c18486xb54a9331.getCommentInputView();
            if4.a aVar4 = c18486xb54a9331.f253552q;
            java.util.LinkedList linkedList = aVar4 != null ? aVar4.f372773h : null;
            commentInputView2.e(0, linkedList == null || linkedList.isEmpty());
            c18486xb54a9331.f253555t = c18486xb54a9331.f253556u;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18476x97dac0b0 c18476x97dac0b0 = c18486xb54a9331.f253549n;
        c18476x97dac0b0.f253453w = true;
        c18476x97dac0b0.f253454x = i17;
        if (c18476x97dac0b0.f253448r) {
            android.widget.TextView textView = c18476x97dac0b0.f253444n;
            textView.setBackground(null);
            android.widget.TextView textView2 = c18476x97dac0b0.f253445o;
            textView2.setBackground(null);
            if (i17 == 0) {
                c18476x97dac0b0.a(textView);
                c18476x97dac0b0.c(textView2);
                c18476x97dac0b0.d(false, textView);
            } else if (i17 == 1) {
                c18476x97dac0b0.a(textView2);
                c18476x97dac0b0.c(textView);
                c18476x97dac0b0.d(false, textView2);
            }
        } else {
            android.view.View view2 = c18476x97dac0b0.f253447q;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgOpened", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgOpened", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yz5.q onMsgPanelStateCallback = c18486xb54a9331.getOnMsgPanelStateCallback();
        if (onMsgPanelStateCallback != null) {
            onMsgPanelStateCallback.mo147xb9724478(3, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(c18486xb54a9331.f253553r));
        }
    }
}
