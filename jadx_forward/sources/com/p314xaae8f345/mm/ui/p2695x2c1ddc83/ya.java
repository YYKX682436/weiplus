package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public class ya extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 {

    /* renamed from: J, reason: collision with root package name */
    public final java.util.Set f289809J;
    public final boolean K;
    public final o11.g L;

    public ya(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.ui.y9 y9Var) {
        super(context, y9Var);
        this.f289809J = new java.util.HashSet();
        boolean a17 = te5.s1.f500280a.a();
        this.K = a17;
        if (a17) {
            o11.f fVar = new o11.f();
            fVar.f423629t = true;
            fVar.f423619j = 132;
            fVar.f423620k = 132;
            fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.bgo;
            this.L = fVar.a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2
    public void E() {
        android.database.Cursor j17 = j();
        if (j17 != null) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.za zaVar = null;
            if (!j17.isClosed() && j17.moveToFirst()) {
                java.util.HashSet hashSet = new java.util.HashSet();
                do {
                    int columnIndex = j17.getColumnIndex("talker");
                    java.lang.String string = columnIndex >= 0 ? j17.getString(columnIndex) : null;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        hashSet.add(string);
                    }
                } while (j17.moveToNext());
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.za zaVar2 = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.za(null);
                if (!hashSet.isEmpty()) {
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str)) {
                            zaVar2.f289847a++;
                        } else {
                            if (str == null) {
                                str = "";
                            }
                            if (str.startsWith("gh_")) {
                                zaVar2.f289848b++;
                            } else {
                                zaVar2.f289849c++;
                            }
                        }
                    }
                }
                zaVar = zaVar2;
            }
            if (zaVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21825, 4, null, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), java.lang.String.format(java.util.Locale.US, "%d:%d:%d", java.lang.Integer.valueOf(zaVar.f289848b), java.lang.Integer.valueOf(zaVar.f289847a), java.lang.Integer.valueOf(zaVar.f289849c)), null, 0, 0, 0, 0, te5.v1.f500291b);
            }
        }
        super.E();
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var;
        java.lang.String str;
        android.view.View view2 = super.getView(i17, view, viewGroup);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2) view2.getTag();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) getItem(i17);
        java.lang.String str2 = null;
        boolean z17 = this.K;
        if (z17 && l4Var2 != null) {
            android.widget.ImageView imageView = n2Var.f289418b;
            java.lang.String h17 = l4Var2.h1();
            java.lang.String j17 = l4Var2.j();
            java.util.List list = cm5.k.f124973a;
            if ("offline_scan_result".equals(h17)) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c0b);
            } else if (h17 != null && !((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(h17) && !android.text.TextUtils.isEmpty(j17)) {
                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(j17, "msg", null);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.type"), 0) != 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.show_icon_and_display_name"), 0) == 0 ? !h17.startsWith("follow_live") || (str = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.title.avatar")) == null : (str = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.icon_url")) == null : (str = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.app.avatar_url")) == null) {
                    str = "";
                }
                if (!android.text.TextUtils.isEmpty(str)) {
                    n11.a.b().h(str, imageView, this.L);
                }
            }
        }
        if (n2Var.f289419c.m79231xfb85ada3() != null && l4Var2 != null) {
            java.lang.String charSequence = n2Var.f289419c.m79231xfb85ada3().toString();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(l4Var2.h1())) {
                k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(l4Var2.h1());
                if (Bi != null) {
                    str2 = Bi.f68913x21f9b213;
                }
            } else {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String h18 = l4Var2.h1();
                ((sg3.a) v0Var).getClass();
                java.lang.String e17 = c01.a2.e(h18);
                android.content.Context context = view2.getContext();
                if (z17 && (l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) getItem(i17)) != null) {
                    str2 = cm5.k.b(l4Var.h1(), l4Var.j(), context);
                }
                if (android.text.TextUtils.isEmpty(str2)) {
                    str2 = e17;
                }
            }
            if (!(charSequence != null ? charSequence : "").equals(str2)) {
                n2Var.f289419c.m79270x765074af(str2);
            }
        }
        return view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // com.p314xaae8f345.mm.ui.z9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            r7 = this;
            r7.c()
            c01.f r0 = c01.d9.b()
            st0.e r0 = r0.v()
            com.tencent.mm.storage.z9 r0 = (com.p314xaae8f345.mm.p2621x8fb0427b.z9) r0
            java.lang.String r1 = ") AS subquery LEFT JOIN message AS message ON message.msgId = subquery.msgId"
            java.lang.String r2 = "SELECT message.content,subquery.talker,subquery.msgId,subquery.createTime,subquery.digest FROM ("
            java.lang.String r3 = "SELECT talker,msgId,MAX(createTime) AS createTime,digest FROM NotifyMessageRecord WHERE talker IS NOT NULL AND LENGTH(talker) > 0 AND talker != 'notifymessage' GROUP BY talker ORDER BY createTime DESC"
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L38
            r5.<init>()     // Catch: java.lang.Exception -> L38
            boolean r6 = r0.f277943e
            if (r6 == 0) goto L20
            r5.append(r2)     // Catch: java.lang.Exception -> L38
        L20:
            r5.append(r3)     // Catch: java.lang.Exception -> L38
            if (r6 == 0) goto L28
            r5.append(r1)     // Catch: java.lang.Exception -> L38
        L28:
            l75.k0 r0 = r0.f277942d     // Catch: java.lang.Exception -> L38
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L38
            android.database.Cursor r0 = r0.B(r1, r4)     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L48
            r0.moveToFirst()     // Catch: java.lang.Exception -> L38
            goto L49
        L38:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.NotifyMessageRecordStorage"
            java.lang.String r2 = "dz[getNotifyMsgConversationCursor] exception %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r2, r0)
        L48:
            r0 = r4
        L49:
            r7.s(r0)
            com.tencent.mm.ui.y9 r0 = r7.f294144h
            if (r0 == 0) goto L53
            r0.b(r4)
        L53:
            r7.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ya.q():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2, com.p314xaae8f345.mm.ui.z9
    /* renamed from: t */
    public com.p314xaae8f345.mm.p2621x8fb0427b.l4 d(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, android.database.Cursor cursor) {
        if (l4Var == null) {
            l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        }
        int columnIndex = cursor.getColumnIndex("talker");
        l4Var.b2(columnIndex >= 0 ? cursor.getString(columnIndex) : null);
        if (this.K) {
            int columnIndex2 = cursor.getColumnIndex("content");
            l4Var.l1(columnIndex2 >= 0 ? cursor.getString(columnIndex2) : null);
        }
        int columnIndex3 = cursor.getColumnIndex("createTime");
        l4Var.n1(columnIndex3 >= 0 ? cursor.getLong(columnIndex3) : 0L);
        int columnIndex4 = cursor.getColumnIndex("digest");
        l4Var.o1(columnIndex4 >= 0 ? cursor.getString(columnIndex4) : null);
        l4Var.T1("notifymessage");
        l4Var.W1(2);
        l4Var.M1(1);
        l4Var.Y1(0);
        l4Var.S1(java.lang.Integer.toString(1));
        l4Var.p1("");
        return l4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2
    public void x(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17, int i17, boolean z18, android.view.View view) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l4Var.h1())) {
            return;
        }
        ((java.util.HashSet) this.f289809J).add(l4Var.h1());
    }
}
