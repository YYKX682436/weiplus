package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes3.dex */
public final class c4 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea f211750d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea c15151xe87c41ea) {
        this.f211750d = c15151xe87c41ea;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.lang.CharSequence charSequence;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        int i18 = 0;
        if (i17 == 67 && keyEvent.getAction() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea c15151xe87c41ea = this.f211750d;
            int selectionEnd = c15151xe87c41ea.m61120xdb574fcd().getSelectionEnd();
            android.text.Editable text = c15151xe87c41ea.m61120xdb574fcd().getText();
            if (text != null) {
                int i19 = selectionEnd - 1;
                if (i19 < 0) {
                    i19 = 0;
                }
                charSequence = text.subSequence(i19, selectionEnd);
            } else {
                charSequence = null;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.String.valueOf(charSequence), "\u2005")) {
                java.lang.CharSequence subSequence = text.subSequence(0, selectionEnd);
                int length = subSequence.length() - 1;
                while (true) {
                    if (-1 >= length) {
                        break;
                    }
                    if (subSequence.charAt(length) == '@') {
                        i18 = length;
                        break;
                    }
                    length--;
                }
                c15151xe87c41ea.m61120xdb574fcd().setText(c15151xe87c41ea.m61120xdb574fcd().getText().replace(i18, selectionEnd, ""));
                c15151xe87c41ea.m61120xdb574fcd().mo81549xf579a34a(i18);
                yj0.a.i(true, this, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
