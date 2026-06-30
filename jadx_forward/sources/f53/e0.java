package f53;

/* loaded from: classes5.dex */
public final class e0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341176d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341176d = activityC15905x15a0ec7b;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341176d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a = activityC15905x15a0ec7b.f221556s;
        boolean z17 = c15697x4d5ad03a != null && c15697x4d5ad03a.f36423xc2614a97;
        f53.s sVar = activityC15905x15a0ec7b.D;
        if (z17) {
            if (activityC15905x15a0ec7b.f221561x) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC15905x15a0ec7b.f221545e;
                if (c22621x7603e017 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                    throw null;
                }
                activityC15905x15a0ec7b.V6(c22621x7603e017.getSelectionStart(), false, "");
                activityC15905x15a0ec7b.f221561x = false;
            }
            if (activityC15905x15a0ec7b.f221562y) {
                activityC15905x15a0ec7b.Y6();
                activityC15905x15a0ec7b.f221562y = false;
            }
            if (sVar.f341220a) {
                activityC15905x15a0ec7b.W6().n1(sVar.f341221b);
            }
        }
        if (editable != null) {
            if (!(r26.n0.u0(editable.toString()).toString().length() == 0)) {
                android.widget.Button button = activityC15905x15a0ec7b.f221550m;
                if (button == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btSendComment");
                    throw null;
                }
                button.setEnabled(true);
                android.widget.Button button2 = activityC15905x15a0ec7b.f221550m;
                if (button2 != null) {
                    button2.setVisibility(0);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btSendComment");
                    throw null;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a2 = activityC15905x15a0ec7b.f221556s;
            if (c15697x4d5ad03a2 != null && c15697x4d5ad03a2.f36423xc2614a97) {
                sVar.f341223d.clear();
                ((java.util.ArrayList) sVar.f341222c).clear();
                sVar.f341224e.clear();
                activityC15905x15a0ec7b.W6().m64588xa582aeec(sVar.f341222c);
                activityC15905x15a0ec7b.W6().n1("");
                android.view.View view = activityC15905x15a0ec7b.f221552o;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("atSomeoneLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.Button button3 = activityC15905x15a0ec7b.f221550m;
            if (button3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btSendComment");
                throw null;
            }
            button3.setEnabled(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a3 = activityC15905x15a0ec7b.f221556s;
            if (c15697x4d5ad03a3 != null && c15697x4d5ad03a3.f36428x374037b) {
                android.widget.ImageView imageView = activityC15905x15a0ec7b.f221548h;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivPicIcon");
                    throw null;
                }
                imageView.setVisibility(8);
            } else {
                android.widget.ImageView imageView2 = activityC15905x15a0ec7b.f221548h;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivPicIcon");
                    throw null;
                }
                imageView2.setVisibility(0);
            }
            android.widget.Button button4 = activityC15905x15a0ec7b.f221550m;
            if (button4 != null) {
                button4.setVisibility(8);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btSendComment");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r6.f36423xc2614a97 == true) goto L8;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void beforeTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r5 = r4.f341176d
            com.tencent.mm.plugin.game.api.GameInputConfig r6 = r5.f221556s
            r7 = 0
            if (r6 == 0) goto Ld
            boolean r6 = r6.f36423xc2614a97
            r8 = 1
            if (r6 != r8) goto Ld
            goto Le
        Ld:
            r8 = r7
        Le:
            if (r8 != 0) goto L11
            return
        L11:
            com.tencent.mm.ui.widget.MMEditText r6 = r5.f221545e
            java.lang.String r8 = "gameCommentInputTxt"
            r0 = 0
            if (r6 == 0) goto L6a
            android.text.Editable r6 = r6.getText()
            java.lang.String r1 = "getText(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r1)
            com.tencent.mm.ui.widget.MMEditText r2 = r5.f221545e
            if (r2 == 0) goto L66
            int r2 = r2.getSelectionStart()
            java.lang.CharSequence r6 = r6.subSequence(r7, r2)
            java.lang.String r6 = r6.toString()
            r2 = 8197(0x2005, float:1.1486E-41)
            r3 = 2
            boolean r6 = r26.n0.E(r6, r2, r7, r3, r0)
            r5.f221561x = r6
            com.tencent.mm.ui.widget.MMEditText r6 = r5.f221545e
            if (r6 == 0) goto L62
            android.text.Editable r6 = r6.getText()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r1)
            com.tencent.mm.ui.widget.MMEditText r1 = r5.f221545e
            if (r1 == 0) goto L5e
            int r8 = r1.getSelectionStart()
            java.lang.CharSequence r6 = r6.subSequence(r7, r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "@"
            boolean r6 = r26.i0.o(r6, r8, r7, r3, r0)
            r5.f221562y = r6
            return
        L5e:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r8)
            throw r0
        L62:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r8)
            throw r0
        L66:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r8)
            throw r0
        L6a:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f53.e0.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341176d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a = activityC15905x15a0ec7b.f221556s;
        if (!(c15697x4d5ad03a != null && c15697x4d5ad03a.f36423xc2614a97)) {
            return;
        }
        f53.s sVar = activityC15905x15a0ec7b.D;
        if (i19 != 0) {
            activityC15905x15a0ec7b.f221561x = false;
            activityC15905x15a0ec7b.f221562y = false;
            java.lang.String substring = java.lang.String.valueOf(charSequence).substring(i17, i17 + i19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            if (!r26.n0.C(substring, (char) 8197, false, 2, null)) {
                for (java.util.Map.Entry entry : sVar.f341224e.entrySet()) {
                    if (i17 <= ((java.lang.Number) ((jz5.l) entry.getValue()).f384366d).intValue()) {
                        entry.setValue(new jz5.l(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry.getValue()).f384366d).intValue() + i19), java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry.getValue()).f384367e).intValue() + i19)));
                    }
                }
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(substring, " ") || (!sVar.f341220a && !r26.n0.C(substring, (char) 8197, false, 2, null))) {
                android.view.View view = activityC15905x15a0ec7b.f221552o;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("atSomeoneLayout");
                    throw null;
                }
                if (view.getVisibility() == 0) {
                    activityC15905x15a0ec7b.Y6();
                    return;
                }
            }
            if (sVar.f341220a) {
                java.lang.String str = sVar.f341221b + substring;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                sVar.f341221b = str;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(substring, "@")) {
                android.view.View view2 = activityC15905x15a0ec7b.f221552o;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("atSomeoneLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "updateAtPosInfo", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "updateAtPosInfo", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.f341221b = "";
                sVar.f341220a = true;
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(activityC15905x15a0ec7b.mo55332x76847179(), 101, 1, 0, 1, 0, null);
                return;
            }
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sVar.f341221b, "")) {
            if (sVar.f341221b.length() - i18 <= 0) {
                sVar.f341221b = "";
                return;
            }
            java.lang.String str2 = sVar.f341221b;
            java.lang.String substring2 = str2.substring(0, str2.length() - i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            sVar.f341221b = substring2;
            return;
        }
        java.util.Iterator it = sVar.f341224e.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.List<java.lang.String> list = sVar.f341222c;
            if (!hasNext) {
                activityC15905x15a0ec7b.W6().m64588xa582aeec(list);
                sVar.f341220a = false;
                return;
            }
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            java.util.Map.Entry entry2 = (java.util.Map.Entry) next;
            int intValue = ((java.lang.Number) ((jz5.l) entry2.getValue()).f384366d).intValue();
            java.util.HashMap hashMap = sVar.f341223d;
            if (intValue >= i17) {
                if (((java.lang.Number) ((jz5.l) entry2.getValue()).f384366d).intValue() >= i17 + i18) {
                    entry2.setValue(new jz5.l(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry2.getValue()).f384366d).intValue() - i18), java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry2.getValue()).f384367e).intValue() - i18)));
                } else {
                    it.remove();
                    ((java.util.ArrayList) list).remove(entry2.getKey());
                    java.lang.Integer num = (java.lang.Integer) hashMap.get(entry2.getKey());
                    if (num != null) {
                        activityC15905x15a0ec7b.W6().l1(num.intValue());
                    }
                    hashMap.remove(entry2.getKey());
                }
            } else if (((java.lang.Number) ((jz5.l) entry2.getValue()).f384367e).intValue() >= i17 + i18) {
                it.remove();
                ((java.util.ArrayList) list).remove(entry2.getKey());
                java.lang.Integer num2 = (java.lang.Integer) hashMap.get(entry2.getKey());
                if (num2 != null) {
                    activityC15905x15a0ec7b.W6().l1(num2.intValue());
                }
                hashMap.remove(entry2.getKey());
            }
        }
    }
}
