package yk5;

/* loaded from: classes11.dex */
public class w implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22593x47ef56eb f544451d;

    public w(com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22593x47ef56eb activityC22593x47ef56eb) {
        this.f544451d = activityC22593x47ef56eb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/voicesearch/VoiceSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22593x47ef56eb activityC22593x47ef56eb = this.f544451d;
        if (!activityC22593x47ef56eb.f292715o) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(activityC22593x47ef56eb.f292714n);
            sb6.append(",");
            sb6.append(activityC22593x47ef56eb.f292712i);
            sb6.append(",");
            java.lang.String[] strArr = activityC22593x47ef56eb.f292709f;
            sb6.append(strArr == null ? 0 : strArr.length);
            sb6.append(",");
            sb6.append(i17);
            g0Var.mo68478xbd3cda5f(10452, sb6.toString());
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 item = activityC22593x47ef56eb.f292708e.getItem(i17);
        java.lang.String d17 = item.d1();
        java.lang.String g27 = item.g2();
        if (d17 != null && d17.length() > 0) {
            int i18 = activityC22593x47ef56eb.f292713m;
            if (i18 == 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_User", d17);
                activityC22593x47ef56eb.setResult(-1, intent);
                activityC22593x47ef56eb.finish();
            } else {
                if (i18 == 1 || c01.e2.U(d17) || c01.e2.G(d17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(d17) || c01.e2.M(d17)) {
                    str = "MicroMsg.VoiceSearchResultUI";
                    z17 = 1;
                } else {
                    android.database.Cursor[] cursorArr = new android.database.Cursor[2];
                    cursorArr[0] = c01.d9.b().A().a(c01.e2.f118654e, null, g27);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (cursorArr[0].moveToNext()) {
                        try {
                            android.database.Cursor cursor = cursorArr[0];
                            java.lang.String string = cursor.getString(cursor.getColumnIndex(dm.i4.f66875xa013b0d5));
                            arrayList2.add(string);
                            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(string)) {
                                arrayList3.add(string);
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoiceSearchResultUI", e17, "", new java.lang.Object[0]);
                        }
                    }
                    str = "MicroMsg.VoiceSearchResultUI";
                    z17 = 1;
                    android.database.Cursor c17 = c01.d9.b().z().c(g27, "@micromsg.with.all.biz.qq.com", null, arrayList2, false, true, true, 2, arrayList3);
                    cursorArr[1] = c17;
                    int count = c17.getCount();
                    int count2 = cursorArr[0].getCount();
                    cursorArr[0].close();
                    cursorArr[1].close();
                    if (!(count + count2 <= 1)) {
                        android.content.Intent intent2 = new android.content.Intent(activityC22593x47ef56eb, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22592xd42f1efc.class);
                        intent2.putExtra("SearchConversationResult_User", g27);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(intent2);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(activityC22593x47ef56eb, arrayList4.toArray(), "com/tencent/mm/ui/voicesearch/VoiceSearchResultUI", "dealSelectContact", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activityC22593x47ef56eb.startActivity((android.content.Intent) arrayList4.get(0));
                        yj0.a.f(activityC22593x47ef56eb, "com/tencent/mm/ui/voicesearch/VoiceSearchResultUI", "dealSelectContact", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                int i19 = activityC22593x47ef56eb.f292713m;
                if (i19 == z17) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("Contact_User", d17);
                    if (c01.e2.M(d17)) {
                        intent3.putExtra("Is_group_card", z17);
                    }
                    if (d17.length() > 0) {
                        com.p314xaae8f345.mm.ui.p2690x38b72420.g1.c(intent3, d17);
                        if (activityC22593x47ef56eb.f292716p) {
                            activityC22593x47ef56eb.m78604xa4df9991(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class, new android.content.Intent().putExtra("Chat_User", d17).putExtra("finish_direct", z17));
                            activityC22593x47ef56eb.finish();
                        } else {
                            j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent3, null);
                        }
                    }
                } else if (i19 == 2) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "username is null ".concat(d17));
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.f4(d17)) {
                        if ((c01.z1.n() & 2) == 0 ? z17 : false) {
                            j45.l.j(activityC22593x47ef56eb.mo55332x76847179(), "tmessage", ".ui.TConversationUI", new android.content.Intent().putExtra("finish_direct", z17), null);
                        } else {
                            j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.u4(d17)) {
                        j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.W3(d17)) {
                        j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.v4(d17)) {
                        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).h(d17);
                        j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.t4(d17)) {
                        if ((c01.z1.n() & z17) == 0 ? z17 : false) {
                            activityC22593x47ef56eb.m78604xa4df9991(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class, new android.content.Intent().putExtra("Chat_User", d17).putExtra("finish_direct", z17));
                        } else {
                            j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.w4(d17)) {
                        if (c01.z1.E()) {
                            android.content.Intent intent4 = new android.content.Intent();
                            intent4.putExtra("type", 20);
                            j45.l.j(activityC22593x47ef56eb, "readerapp", ".ui.ReaderAppUI", intent4, null);
                        } else {
                            j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.x4(d17)) {
                        if ((c01.z1.n() & 262144) == 0 ? z17 : false) {
                            android.content.Intent intent5 = new android.content.Intent();
                            intent5.putExtra("type", 11);
                            j45.l.j(activityC22593x47ef56eb, "readerapp", ".ui.ReaderAppUI", intent5, null);
                        } else {
                            j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.Q3(d17)) {
                        j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.d4(d17)) {
                        if (c01.z1.D()) {
                            j45.l.j(activityC22593x47ef56eb, "masssend", ".ui.MassSendHistoryUI", new android.content.Intent().putExtra("finish_direct", z17), null);
                        } else {
                            j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.e4(d17)) {
                        if ((c01.z1.n() & 16) == 0 ? z17 : false) {
                            activityC22593x47ef56eb.m78604xa4df9991(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class, new android.content.Intent().putExtra("Chat_User", d17).putExtra("finish_direct", z17));
                        } else {
                            j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else {
                        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.c4(d17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.C4(d17)) {
                            if (!(d17.equalsIgnoreCase("feedsapp") ? z17 : false)) {
                                if (!(d17.equalsIgnoreCase("voipapp") ? z17 : false)) {
                                    if (!(d17.equalsIgnoreCase("voicevoipapp") ? z17 : false) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y3(d17)) {
                                        if (!(d17.equalsIgnoreCase("qqfriend") ? z17 : false)) {
                                            activityC22593x47ef56eb.m78604xa4df9991(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class, new android.content.Intent().putExtra("Chat_User", d17).putExtra("finish_direct", z17));
                                        }
                                    }
                                }
                            }
                        }
                        j45.l.j(activityC22593x47ef56eb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/voicesearch/VoiceSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
