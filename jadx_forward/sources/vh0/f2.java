package vh0;

@j95.b
/* loaded from: classes8.dex */
public final class f2 extends i95.w implements vh0.d1 {
    public java.util.List Ai(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return Bi(username, null);
        }
        android.os.Bundle bundle = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(username), vh0.z1.class);
        bundle.setClassLoader(vh0.z1.class.getClassLoader());
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("agreements");
        return parcelableArrayList == null ? kz5.p0.f395529d : parcelableArrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r1 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List Bi(java.lang.String r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh0.f2.Bi(java.lang.String, java.util.List):java.util.List");
    }

    public void Di(java.lang.String username, com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 agreement, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(agreement, "agreement");
        Ni(username, kz5.b0.c(agreement), z17);
    }

    public void Ni(java.lang.String username, java.util.Collection agreements, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(agreements, "agreements");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.setClassLoader(vh0.a2.class.getClassLoader());
            bundle.putString(dm.i4.f66875xa013b0d5, username);
            bundle.putParcelableArrayList("agreements", new java.util.ArrayList<>(agreements));
            bundle.putBoolean("agreed", z17);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, vh0.a2.class, null);
            return;
        }
        java.lang.String k17 = gm0.j1.b().k();
        if (z17) {
            java.util.Collection<com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040> collection = agreements;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
            for (com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 c10697x80773040 : collection) {
                r45.q6 q6Var = new r45.q6();
                q6Var.f465232d = c10697x80773040.f149392d;
                q6Var.f465233e = c10697x80773040.f149395g;
                arrayList.add(q6Var);
            }
            xh0.a.z0().J0(k17, arrayList);
        } else {
            xh0.a.z0().y0(k17);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = agreements.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (!arrayList2.isEmpty()) {
                    com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040[] c10697x80773040Arr = (com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040[]) arrayList2.toArray(new com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040[0]);
                    com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040[] c10697x80773040Arr2 = (com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040[]) java.util.Arrays.copyOf(c10697x80773040Arr, c10697x80773040Arr.length);
                    com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                    lVar.f152199c = "/cgi-bin/micromsg-bin/modserviceagreement";
                    lVar.f152200d = 13262;
                    r45.to4 to4Var = new r45.to4();
                    to4Var.f468166d = z17 ? 1 : 2;
                    java.util.LinkedList linkedList = to4Var.f468167e;
                    for (com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 c10697x807730402 : c10697x80773040Arr2) {
                        r45.r6 r6Var = new r45.r6();
                        r6Var.f466100d = c10697x807730402.f149392d;
                        r6Var.f466101e = c10697x807730402.f149395g;
                        linkedList.add(r6Var);
                    }
                    lVar.f152197a = to4Var;
                    lVar.f152198b = new r45.uo4();
                    com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), vh0.e2.f518385d, false);
                    return;
                }
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 c10697x807730403 = (com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040) next;
            int i19 = c10697x807730403.f149395g;
            if (i19 <= 0 || i19 == Integer.MAX_VALUE) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatBotAgreementService", "[!] agreement " + i17 + " with version " + c10697x807730403.f149395g + " is special and shouldn't notify sign status to server.");
                r4 = 0;
            }
            if (r4 != 0) {
                arrayList2.add(next);
            }
            i17 = i18;
        }
    }

    public boolean wi(android.app.Activity activity, android.view.ViewGroup layout, java.lang.String chatBotUsername, java.util.List agreements) {
        int i17;
        android.app.Activity ui6 = activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatBotUsername, "chatBotUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(agreements, "agreements");
        boolean z17 = false;
        if (agreements.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatBotAgreementService", "[!] agreements is empty, skip attaching.");
            return false;
        }
        android.view.View inflate = activity.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0g, layout, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.vjh);
        textView.setMovementMethod(new zh0.d());
        textView.setHighlightColor(0);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.Iterator it = agreements.iterator();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            boolean z18 = true;
            if (!it.hasNext()) {
                textView.setText(spannableStringBuilder);
                layout.addView(viewGroup);
                return true;
            }
            java.lang.Object next = it.next();
            int i27 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 c10697x80773040 = (com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040) next;
            if (i18 > 0) {
                spannableStringBuilder.append((java.lang.CharSequence) com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
                int i28 = i19 + 3;
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(ui6.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ah7)), i19, i28, 33);
                i17 = i28;
            } else {
                i17 = i19;
            }
            if (c10697x80773040.f149396h || c10697x80773040.f149397i) {
                z18 = z17;
            }
            ai0.h hVar = new ai0.h(ui6, com.p314xaae8f345.mm.R.C30861xcebc809e.d88, 2, z18);
            int i29 = i17;
            ai0.a aVar = new ai0.a(ui6.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5), ui6.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28), false, new vh0.b2(c10697x80773040, hVar, this, chatBotUsername, activity));
            java.lang.String str = "《" + c10697x80773040.f149393e + (char) 12299;
            spannableStringBuilder.append((java.lang.CharSequence) str);
            spannableStringBuilder.setSpan(aVar, i29, i29 + str.length(), 33);
            int length = i29 + str.length();
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            i19 = length + 1;
            spannableStringBuilder.setSpan(hVar, length, i19, 33);
            ui6 = activity;
            z17 = false;
            it = it;
            i18 = i27;
        }
    }
}
