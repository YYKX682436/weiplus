package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class z6 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f214985d;

    public z6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34) {
        this.f214985d = c15270x6d877a34;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$9", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i17 == 67 && keyEvent.getAction() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f214985d;
            int selectionEnd = c15270x6d877a34.m61859xdb574fcd().getSelectionEnd();
            android.text.Editable text = c15270x6d877a34.m61859xdb574fcd().getText();
            int i18 = selectionEnd - 1;
            if (i18 < 0) {
                i18 = 0;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.String.valueOf(text != null ? text.subSequence(i18, selectionEnd) : null), "\u2005")) {
                java.lang.CharSequence subSequence = text.subSequence(0, selectionEnd);
                int length = subSequence.length() - 1;
                while (true) {
                    if (-1 >= length) {
                        break;
                    }
                    int size = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d().size();
                    int i19 = 0;
                    while (true) {
                        if (i19 >= size) {
                            z17 = false;
                            break;
                        }
                        if (subSequence.charAt(length) == ((java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d().get(i19)).charAt(0) && subSequence.charAt(length) != '@') {
                            z17 = true;
                            break;
                        }
                        i19++;
                    }
                    if (z17) {
                        break;
                    }
                    if (subSequence.charAt(length) == '@') {
                        i18 = length;
                        break;
                    }
                    length--;
                }
                if (i18 != -1) {
                    c15270x6d877a34.m61859xdb574fcd().setText(c15270x6d877a34.m61859xdb574fcd().getText().replace(i18, selectionEnd, ""));
                    c15270x6d877a34.m61859xdb574fcd().mo81549xf579a34a(i18);
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$9", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$9", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
