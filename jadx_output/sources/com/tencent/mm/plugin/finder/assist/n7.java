package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class n7 {

    /* renamed from: a */
    public static final com.tencent.mm.plugin.finder.assist.n7 f102406a = new com.tencent.mm.plugin.finder.assist.n7();

    /* renamed from: b */
    public static int f102407b;

    public static /* synthetic */ void C(com.tencent.mm.plugin.finder.assist.n7 n7Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, android.os.Bundle bundle, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        android.os.Bundle bundle2 = (i18 & 4) != 0 ? null : bundle;
        if ((i18 & 8) != 0) {
            i17 = 1;
        }
        n7Var.B(appCompatActivity, finderItem, bundle2, i17, (i18 & 16) != 0 ? null : lVar);
    }

    public static /* synthetic */ void F(com.tencent.mm.plugin.finder.assist.n7 n7Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.os.Bundle bundle, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            bundle = null;
        }
        android.os.Bundle bundle2 = bundle;
        if ((i19 & 8) != 0) {
            i17 = 2;
        }
        int i27 = i17;
        if ((i19 & 16) != 0) {
            i18 = 0;
        }
        n7Var.E(appCompatActivity, baseFinderFeed, bundle2, i27, i18);
    }

    public static /* synthetic */ void H(com.tencent.mm.plugin.finder.assist.n7 n7Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.os.Bundle bundle, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            bundle = null;
        }
        if ((i18 & 8) != 0) {
            i17 = 2;
        }
        n7Var.G(appCompatActivity, baseFinderFeed, bundle, i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J(com.tencent.mm.plugin.finder.assist.n7 n7Var, com.tencent.mm.ui.MMActivity context, java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3, r45.ze2 ze2Var, int i18, java.lang.String str4, r45.ht0 ht0Var, java.lang.Boolean bool, r45.ub4 ub4Var, int i19, java.lang.Object obj) {
        int i27;
        zy2.e eVar;
        long longExtra;
        java.lang.String str5 = (i19 & 256) != 0 ? null : str4;
        r45.ht0 ht0Var2 = (i19 & 512) != 0 ? null : ht0Var;
        java.lang.Boolean bool2 = (i19 & 1024) != 0 ? java.lang.Boolean.FALSE : bool;
        r45.ub4 ub4Var2 = (i19 & 2048) != 0 ? null : ub4Var;
        n7Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (hz2.d.f286313a.a(ya.a.SHARE)) {
            return;
        }
        ot0.q qVar = new ot0.q();
        com.tencent.mm.plugin.finder.assist.n7 n7Var2 = f102406a;
        if (i17 != 7) {
            if (i17 == 15) {
                i27 = 7;
                android.content.Intent intent = context.getIntent();
                longExtra = intent != null ? intent.getLongExtra("key_feed_id", 0L) : 0L;
                if (kotlin.jvm.internal.o.b(bool2, java.lang.Boolean.TRUE)) {
                    qVar.D2 = 5;
                } else {
                    qVar.D2 = 4;
                }
                zy2.e eVar2 = new zy2.e();
                eVar2.f477372b = l(n7Var2, str, i17, str2, str3, ze2Var, str5, ht0Var2, java.lang.Long.valueOf(longExtra), null, 256, null);
                eVar = eVar2;
            } else if (i17 != 18) {
                zy2.m mVar = new zy2.m();
                i27 = 7;
                mVar.f477457b = l(n7Var2, str, i17, str2, str3, ze2Var, str5, null, null, null, 384, null);
                eVar = mVar;
            } else {
                i27 = 7;
                qVar.D2 = 6;
                android.content.Intent intent2 = context.getIntent();
                longExtra = intent2 != null ? intent2.getLongExtra("key_feed_id", 0L) : 0L;
                zy2.e eVar3 = new zy2.e();
                eVar3.f477372b = n7Var2.k(str, i17, str2, str3, ze2Var, str5, null, java.lang.Long.valueOf(longExtra), ub4Var2);
                eVar = eVar3;
            }
        } else {
            i27 = 7;
            qVar.D2 = 3;
            zy2.e eVar4 = new zy2.e();
            eVar4.f477372b = l(n7Var2, str, i17, str2, str3, ze2Var, str5, ht0Var2, null, null, 384, null);
            eVar = eVar4;
        }
        qVar.f(eVar);
        qVar.f348666i = i17 != 4 ? (i17 == i27 || i17 == 15 || i17 == 18) ? 75 : 59 : 72;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putExtra("Retr_Msg_Type", i17 != 4 ? i17 != i27 ? i17 != 15 ? i17 != 18 ? 21 : 39 : 32 : 27 : 25);
        intent3.putExtra("Multi_Retr", true);
        intent3.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent3.putExtra("Retr_go_to_chattingUI", false);
        intent3.putExtra("Retr_show_success_tips", true);
        j45.l.w(context, ".ui.transmit.MsgRetransmitUI", intent3, 1001, new com.tencent.mm.plugin.finder.assist.d7(str, i17, j17, ht0Var2, context, i18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K(com.tencent.mm.plugin.finder.assist.n7 n7Var, com.tencent.mm.ui.MMActivity context, java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3, r45.ze2 ze2Var, int i18, java.lang.String str4, r45.ht0 ht0Var, java.lang.Boolean bool, r45.ub4 ub4Var, int i19, java.lang.Object obj) {
        m21.e eVar;
        java.lang.String str5 = (i19 & 256) != 0 ? null : str4;
        r45.ht0 ht0Var2 = (i19 & 512) != 0 ? null : ht0Var;
        java.lang.Boolean bool2 = (i19 & 1024) != 0 ? java.lang.Boolean.FALSE : bool;
        r45.ub4 ub4Var2 = (i19 & 2048) != 0 ? null : ub4Var;
        n7Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (hz2.d.f286313a.a(ya.a.SHARE)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "share topic " + str + " to sns");
        android.content.Intent intent = new android.content.Intent();
        r45.mv2 l17 = l(n7Var, str, i17, str2, str3, ze2Var, str5, ht0Var2, null, ub4Var2, 128, null);
        android.content.Intent intent2 = context.getIntent();
        l17.set(7, pm0.v.u(intent2 != null ? intent2.getLongExtra("key_feed_id", 0L) : 0L));
        int i27 = 18;
        if (i17 == 7) {
            ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsFinderShareActivity", "com.tencent.mm.feature.sns.SnsShareObjectService");
            m21.e eVar2 = new m21.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsFinderShareActivity", "com.tencent.mm.feature.sns.SnsShareObjectService");
            eVar2.f322985a = l17;
            eVar = eVar2;
        } else if (i17 == 15) {
            fe0.n4 n4Var = (fe0.n4) i95.n0.c(fe0.n4.class);
            boolean b17 = kotlin.jvm.internal.o.b(bool2, java.lang.Boolean.TRUE);
            ((ee0.t4) n4Var).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsFinderShareMusicTopic", "com.tencent.mm.feature.sns.SnsShareObjectService");
            m21.j jVar = new m21.j();
            jVar.f322990a = b17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsFinderShareMusicTopic", "com.tencent.mm.feature.sns.SnsShareObjectService");
            jVar.f322991b = l17;
            eVar = jVar;
        } else if (i17 != 18) {
            ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsFinderShareTopic", "com.tencent.mm.feature.sns.SnsShareObjectService");
            m21.n nVar = new m21.n();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsFinderShareTopic", "com.tencent.mm.feature.sns.SnsShareObjectService");
            nVar.f322995a = l17;
            eVar = nVar;
        } else {
            ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsFinderShareTemplate", "com.tencent.mm.feature.sns.SnsShareObjectService");
            m21.m mVar = new m21.m();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsFinderShareTemplate", "com.tencent.mm.feature.sns.SnsShareObjectService");
            mVar.f322994a = l17;
            eVar = mVar;
        }
        intent.putExtra(i17 != 7 ? i17 != 15 ? i17 != 18 ? "ksnsupload_finder_topic_xml" : "ksnsupload_finder_template_xml" : "ksnsupload_finder_music_topic_xml" : "ksnsupload_finder_activity_xml", eVar.a());
        if (i17 == 4) {
            i27 = 22;
        } else if (i17 == 7) {
            i27 = 24;
        } else if (i17 == 15) {
            i27 = 32;
        } else if (i17 == 18) {
            i27 = 41;
        }
        intent.putExtra("Ksnsupload_type", i27);
        intent.putExtra("need_result", true);
        intent.putExtra("K_music_topic_is_audio", bool2);
        j45.l.w(context, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new com.tencent.mm.plugin.finder.assist.e7(context, i17, j17, ht0Var2, str, i18));
    }

    public static void L(com.tencent.mm.plugin.finder.assist.n7 n7Var, android.content.Context context, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = 500;
        }
        n7Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.B4;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 1;
        ((lb2.j) ((jz5.n) gVar).getValue()).l();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_SHARE_EDUCATION_BOTTOMSHEET_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) m17).booleanValue();
        if (!z17 || booleanValue) {
            return;
        }
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
        e3Var.f(com.tencent.mm.R.layout.dod);
        e3Var.a();
        ((android.widget.TextView) e3Var.f131975y.findViewById(com.tencent.mm.R.id.c_x)).setOnClickListener(new com.tencent.mm.plugin.finder.assist.k7(e3Var));
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) e3Var.f131975y.findViewById(com.tencent.mm.R.id.obc)).getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) e3Var.f131975y.findViewById(com.tencent.mm.R.id.c_x)).getPaint(), 0.8f);
        pm0.v.V(j17, new com.tencent.mm.plugin.finder.assist.j7(context, e3Var));
    }

    public static final void a(com.tencent.mm.plugin.finder.assist.n7 n7Var, androidx.appcompat.app.AppCompatActivity activity, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, zy2.i iVar, int i17, yz5.l lVar) {
        n7Var.getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        ot0.q qVar = new ot0.q();
        boolean isMemberFeed = finderItem.isMemberFeed();
        int i18 = finderItem.isNativeDramaFeed() ? 129 : isMemberFeed ? 106 : 51;
        if (((r45.gv2) iVar.f477411b.getCustom(30)) == null) {
            iVar.f477411b.set(30, new r45.gv2());
        }
        r45.gv2 gv2Var = (r45.gv2) iVar.f477411b.getCustom(30);
        if (gv2Var != null) {
            gv2Var.set(0, java.lang.Boolean.valueOf(str.length() > 0));
        }
        qVar.f(iVar);
        qVar.f348666i = i18;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", finderItem.isNativeDramaFeed() ? 42 : isMemberFeed ? 36 : 18);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("Retr_NeedReport", false);
        n7Var.e(activity, finderItem, intent);
        intent.putExtra("custom_send_text", str);
        intent.putExtra("Retr_MsgQuickShare", true);
        intent.putExtra("Select_Conv_User", str2);
        intent.putExtra("Retr_finder_in_stream", true);
        intent.setClassName(activity, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) activity : null;
        com.tencent.mm.ui.vc startActivityForResult = mMFragmentActivity != null ? mMFragmentActivity.startActivityForResult(intent) : null;
        if (startActivityForResult != null) {
            ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = new com.tencent.mm.plugin.finder.assist.c6(finderItem, activity, i17, V6, lVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0443, code lost:
    
        if (r0 == null) goto L434;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[LOOP:1: B:184:0x05f1->B:203:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.kv2 j(com.tencent.mm.plugin.finder.assist.n7 r21, com.tencent.mm.plugin.finder.storage.FinderItem r22, boolean r23, r45.qt2 r24, int r25, java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.n7.j(com.tencent.mm.plugin.finder.assist.n7, com.tencent.mm.plugin.finder.storage.FinderItem, boolean, r45.qt2, int, java.lang.Object):r45.kv2");
    }

    public static /* synthetic */ r45.mv2 l(com.tencent.mm.plugin.finder.assist.n7 n7Var, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, r45.ze2 ze2Var, java.lang.String str4, r45.ht0 ht0Var, java.lang.Long l17, r45.ub4 ub4Var, int i18, java.lang.Object obj) {
        return n7Var.k(str, i17, str2, str3, ze2Var, str4, ht0Var, (i18 & 128) != 0 ? null : l17, (i18 & 256) != 0 ? null : ub4Var);
    }

    public static void t(com.tencent.mm.plugin.finder.assist.n7 n7Var, androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, android.os.Bundle bundle, int i17, boolean z17, r45.mv4 mv4Var, yz5.l lVar, yz5.l lVar2, int i18, java.lang.Object obj) {
        int i19 = (i18 & 8) != 0 ? 1 : i17;
        boolean z18 = (i18 & 16) != 0 ? false : z17;
        r45.mv4 mv4Var2 = (i18 & 32) != 0 ? null : mv4Var;
        yz5.l lVar3 = (i18 & 64) != 0 ? null : lVar;
        yz5.l lVar4 = (i18 & 128) != 0 ? null : lVar2;
        n7Var.getClass();
        if (!hc2.o0.d(finderItem.getFeedObject())) {
            java.lang.String string = activity.getString(com.tencent.mm.R.string.exu);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            hc2.f1.B(activity, string);
            if (lVar3 != null) {
                lVar3.invoke(null);
                return;
            }
            return;
        }
        boolean isNativeDramaFeed = finderItem.isNativeDramaFeed();
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "shareToConversation, id:" + finderItem.getId() + ", pflag:" + finderItem.getFeedObject().getPermissionFlag() + " isNativeDramaFeed:" + isNativeDramaFeed);
        if (finderItem.getFeedObject().getPrivateFlag() == 1) {
            db5.t7.f(activity, activity.getString(com.tencent.mm.R.string.exy), com.tencent.mm.plugin.finder.assist.i6.f102265a);
            if (lVar3 != null) {
                lVar3.invoke(null);
            }
            if (lVar4 != null) {
                lVar4.invoke(null);
                return;
            }
            return;
        }
        jx3.f.INSTANCE.idkeyStat(1278L, 11L, 1L, false);
        if (hz2.d.f286313a.a(ya.a.SHARE)) {
            if (lVar3 != null) {
                lVar3.invoke(null);
            }
            if (lVar4 != null) {
                lVar4.invoke(null);
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        r45.kv2 j17 = j(n7Var, finderItem, false, V6, 2, null);
        j17.set(28, mv4Var2);
        boolean isMemberFeed = finderItem.isMemberFeed();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.assist.k6(finderItem, j17, activity, z18, lVar3, lVar4, isNativeDramaFeed, isMemberFeed, i19, V6, null), 2, null);
    }

    public static void u(com.tencent.mm.plugin.finder.assist.n7 n7Var, com.tencent.mm.ui.MMActivity context, ya2.b2 contact, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        n7Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contact, "contact");
        jx3.f.INSTANCE.idkeyStat(1278L, 13L, 1L, false);
        if (hz2.d.f286313a.a(ya.a.SHARE)) {
            return;
        }
        if ((contact.field_extFlag & 1048576) > 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "shareFinderContactToConversation: forbid share contact, nickname=".concat(contact.w0()));
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.finder.assist.m6(contact, context, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(android.content.Context r21, r45.br2 r22, yz5.l r23, java.lang.String r24, boolean r25, boolean r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.n7.A(android.content.Context, r45.br2, yz5.l, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void B(androidx.appcompat.app.AppCompatActivity context, com.tencent.mm.plugin.finder.storage.FinderItem feedObject, android.os.Bundle bundle, int i17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        if (feedObject.getMediaType() != 9) {
            t(this, context, feedObject, bundle, i17, false, null, null, lVar, 16, null);
            return;
        }
        if (!((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(feedObject.getLiveInfo())) {
            if (!((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ui(feedObject.getLiveInfo())) {
                x(context, feedObject, bundle, i17, 63, 23, lVar);
                return;
            }
        }
        x(context, feedObject, bundle, i17, 88, 31, lVar);
    }

    public final void D(com.tencent.mm.plugin.finder.storage.FinderItem feedObject) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.vd6 vd6Var = new r45.vd6();
        vd6Var.set(0, java.lang.Long.valueOf(feedObject.getId()));
        vd6Var.set(28, feedObject.getDupFlag());
        vd6Var.set(4, feedObject.getObjectNonceId());
        r45.q25 q25Var = new r45.q25();
        q25Var.set(4, 1);
        q25Var.set(7, 1);
        vd6Var.set(3, q25Var);
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = feedObject.getFeedObject();
        if (feedObject2 == null || (str = feedObject2.getSessionBuffer()) == null) {
            str = "";
        }
        vd6Var.set(8, str);
        vd6Var.set(5, feedObject.getUserName());
        vd6Var.set(10, 65);
        r45.nw1 liveInfo = feedObject.getLiveInfo();
        vd6Var.set(19, java.lang.Long.valueOf(liveInfo != null ? liveInfo.getLong(0) : 0L));
        linkedList.add(vd6Var);
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, 65);
        new db2.y2(linkedList, qt2Var).l().H(new com.tencent.mm.plugin.finder.assist.d6(linkedList));
    }

    public final void E(androidx.appcompat.app.AppCompatActivity context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, android.os.Bundle bundle, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        if (feed.getFeedObject().getMediaType() == 9) {
            if (!((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(feed.getFeedObject().getLiveInfo())) {
                if (!((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ui(feed.getFeedObject().getLiveInfo())) {
                    y(context, feed, bundle, i17, 21);
                    return;
                }
            }
            y(context, feed, bundle, i17, 30);
            return;
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) context;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject = feed.getFeedObject();
        if (!hc2.o0.f(feedObject.getFeedObject())) {
            java.lang.String string = mMFragmentActivity.getString(com.tencent.mm.R.string.exu);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            hc2.f1.B(mMFragmentActivity, string);
            return;
        }
        if (feedObject.isPrivate()) {
            db5.t7.f(mMFragmentActivity, mMFragmentActivity.getString(com.tencent.mm.R.string.exy), com.tencent.mm.plugin.finder.assist.z6.f102758a);
            return;
        }
        jx3.f.INSTANCE.idkeyStat(1278L, 12L, 1L, false);
        if (hz2.d.f286313a.a(ya.a.SHARE)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share finderObject ");
        sb6.append(feedObject.getId());
        sb6.append(' ');
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = feedObject.getFeedObject();
        sb6.append(feedObject2 != null ? java.lang.Integer.valueOf(feedObject2.getForward_style()) : null);
        sb6.append(" to sns, pflag:");
        sb6.append(feedObject.getFeedObject().getPermissionFlag());
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", sb6.toString());
        pf5.z zVar = pf5.z.f353948a;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(mMFragmentActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        android.content.Intent intent = new android.content.Intent();
        ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsFinderShareObject", "com.tencent.mm.feature.sns.SnsShareObjectService");
        new r45.kv2();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsFinderShareObject", "com.tencent.mm.feature.sns.SnsShareObjectService");
        r45.kv2 j17 = j(this, feedObject, true, null, 4, null);
        j17.set(28, null);
        j17.set(29, java.lang.Integer.valueOf(V6.getInteger(5)));
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a(mMFragmentActivity).c(zy2.v9.class))).Q6(j17);
        intent.putExtra("ksnsupload_finder_object_xml", zy2.d5.f(j17));
        intent.putExtra("Ksnsupload_link", j17.getString(0));
        if ((j17.getInteger(25) & 4) > 0) {
            intent.putExtra("Ksnsupload_type", 38);
        } else if (j17.getInteger(31) == 2) {
            intent.putExtra("Ksnsupload_type", 45);
            intent.putExtra("Ksnsupload_title", mMFragmentActivity.getString(com.tencent.mm.R.string.giz));
        } else {
            intent.putExtra("Ksnsupload_type", 17);
        }
        intent.putExtra("need_result", true);
        intent.putExtra("finder_post_from_sns_type", i18);
        if (i17 == 5) {
            intent.putExtra("finder_feed_id", feedObject.getId());
            intent.putExtra("ksnsupload_finder_need_report", true);
            V6.set(0, com.tencent.mm.plugin.finder.report.o4.f125221b);
        }
        if (bundle != null) {
            boolean z17 = bundle.getBoolean("key_finder_sns_post_within_30s", false);
            boolean z18 = bundle.getBoolean("need_ban_back_tips", false);
            intent.putExtra("KSnsFrom", z17 ? 22 : 23);
            intent.putExtra("need_ban_back_tips", z18);
        }
        boolean b17 = kotlin.jvm.internal.o.b(feedObject.getUserName(), xy2.c.e(mMFragmentActivity));
        intent.putExtra("sns_upload_is_show_dialog", !b17);
        j45.l.x(mMFragmentActivity, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new com.tencent.mm.plugin.finder.assist.a7(b17, mMFragmentActivity, feedObject, null, i17, V6));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:? A[LOOP:1: B:53:0x01fe->B:113:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022b A[EDGE_INSN: B:66:0x022b->B:67:0x022b BREAK  A[LOOP:1: B:53:0x01fe->B:113:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(androidx.appcompat.app.AppCompatActivity r24, com.tencent.mm.plugin.finder.model.BaseFinderFeed r25, android.os.Bundle r26, int r27) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.n7.G(androidx.appcompat.app.AppCompatActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed, android.os.Bundle, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c2, code lost:
    
        if (((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ui(r13.getLiveInfo()) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(androidx.appcompat.app.AppCompatActivity r12, com.tencent.mm.plugin.finder.storage.FinderItem r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.n7.I(androidx.appcompat.app.AppCompatActivity, com.tencent.mm.plugin.finder.storage.FinderItem):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r18, r45.br2 r19, yz5.l r20, java.lang.String r21, boolean r22, boolean r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.n7.b(android.content.Context, r45.br2, yz5.l, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.mm.protocal.protobuf.FinderObject c(r45.kv2 shareObj) {
        r45.ik2 ik2Var;
        kotlin.jvm.internal.o.g(shareObj, "shareObj");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        finderObject.setId(com.tencent.mm.sdk.platformtools.t8.q0(shareObj.getString(0), 0L));
        finderObject.setObjectNonceId(shareObj.getString(8));
        finderObject.setUsername(shareObj.getString(1));
        finderObject.setNickname(shareObj.getString(2));
        finderObject.setLikeCount(-1);
        finderObject.setFavCount(-1);
        finderObject.setForwardCount(-1);
        finderObject.setCommentCount(-1);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
        finderObjectDesc.setDescription(shareObj.getString(4));
        finderObjectDesc.setMediaType(shareObj.getInteger(5));
        java.util.LinkedList<r45.iv2> list = shareObj.getList(7);
        kotlin.jvm.internal.o.f(list, "getMediaList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.iv2 iv2Var : list) {
            com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = new com.tencent.mm.protocal.protobuf.FinderMedia();
            finderMedia.setMediaType(iv2Var.getInteger(0));
            finderMedia.setUrl(iv2Var.getString(1));
            finderMedia.setCoverUrl(iv2Var.getString(8));
            finderMedia.setThumbUrl(iv2Var.getString(2));
            finderMedia.setFull_thumb_url(iv2Var.getString(6));
            finderMedia.setWidth(iv2Var.getFloat(3));
            finderMedia.setHeight(iv2Var.getFloat(4));
            finderMedia.setVideoDuration(iv2Var.getInteger(5));
            arrayList.add(finderMedia);
        }
        finderObjectDesc.setMedia(new java.util.LinkedList<>(arrayList));
        r45.mv4 mv4Var = (r45.mv4) shareObj.getCustom(28);
        if (mv4Var != null) {
            ik2Var = (r45.ik2) mv4Var.getCustom(2);
            if (ik2Var == null) {
                ik2Var = new r45.ik2();
            }
        } else {
            ik2Var = null;
        }
        finderObjectDesc.setFinder_newlife_desc(ik2Var);
        finderObject.setObjectDesc(finderObjectDesc);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(shareObj.getString(23))) {
            r45.dm2 dm2Var = new r45.dm2();
            r45.cl2 cl2Var = new r45.cl2();
            cl2Var.set(6, hc2.g0.g(shareObj.getString(23)));
            dm2Var.set(4, cl2Var);
            finderObject.setObject_extend(dm2Var);
        }
        r45.mv4 mv4Var2 = (r45.mv4) shareObj.getCustom(28);
        finderObject.setCreatetime(mv4Var2 != null ? mv4Var2.getInteger(0) : 0);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        finderContact.setHeadUrl(shareObj.getString(3));
        finderContact.setNickname(shareObj.getString(2));
        finderContact.setUsername(shareObj.getString(1));
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = new com.tencent.mm.protocal.protobuf.FinderAuthInfo();
        finderAuthInfo.setAuthIconType(shareObj.getInteger(13));
        finderAuthInfo.setAuthIconUrl(shareObj.getString(14));
        finderContact.setAuthInfo(finderAuthInfo);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(shareObj.getString(16)) && !com.tencent.mm.sdk.platformtools.t8.K0(shareObj.getString(15))) {
            finderContact.setBind_info(new java.util.LinkedList<>());
            java.util.LinkedList<r45.zv0> bind_info = finderContact.getBind_info();
            r45.zv0 zv0Var = new r45.zv0();
            zv0Var.set(0, 1);
            r45.fw0 fw0Var = new r45.fw0();
            fw0Var.set(0, new java.util.LinkedList());
            java.util.LinkedList list2 = fw0Var.getList(0);
            r45.xk xkVar = new r45.xk();
            xkVar.set(1, shareObj.getString(15));
            xkVar.set(0, shareObj.getString(12));
            xkVar.set(2, shareObj.getString(16));
            r45.kj kjVar = new r45.kj();
            kjVar.set(0, java.lang.Integer.valueOf(shareObj.getInteger(18)));
            kjVar.set(1, shareObj.getString(19));
            xkVar.set(5, kjVar);
            list2.add(xkVar);
            zv0Var.set(1, fw0Var);
            bind_info.add(zv0Var);
        }
        finderObject.setContact(finderContact);
        return finderObject;
    }

    public final void d(android.content.Context context, o25.y1 quickMenuHelper, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(quickMenuHelper, "quickMenuHelper");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        com.tencent.mm.pluginsdk.forward.m mVar = (com.tencent.mm.pluginsdk.forward.m) quickMenuHelper;
        mVar.wi(context, menu, sheet);
        f102407b = mVar.f188722e;
        java.util.ArrayList Ui = mVar.Ui();
        if (!Ui.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = Ui.iterator();
            while (it.hasNext()) {
                sb6.append(((o25.m2) it.next()).f342560a + '|');
            }
            org.json.JSONObject jSONObject = com.tencent.mm.plugin.finder.report.x3.f125434c;
            if (jSONObject != null) {
                jSONObject.put("icon_recent_forward", sb6.toString());
            }
        }
    }

    public final void e(androidx.appcompat.app.AppCompatActivity context, com.tencent.mm.plugin.finder.storage.FinderItem feedObject, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (context.getIntent().getLongExtra("feed_object_id", 0L) == feedObject.getFeedObject().getId()) {
            intent.putExtra("msg_forward_sns_obj_id", context.getIntent().getStringExtra("KEY_FINDER_SNS_ID"));
            long longExtra = context.getIntent().getLongExtra("KEY_FINDER_MSG_ID", 0L);
            if (longExtra != 0) {
                intent.putExtra("Retr_Msg_Id", longExtra);
            }
            intent.putExtra("Retr_MsgTalker", context.getIntent().getStringExtra("KEY_FINDER_MSG_TALKER"));
        }
    }

    public final pj4.j0 f(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.lang.String description;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f355139d = "5";
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
        if (objectDesc2 != null && (description = objectDesc2.getDescription()) != null && (objectDesc = finderObject.getObjectDesc()) != null) {
            objectDesc.setDescription(com.tencent.mm.plugin.finder.search.l4.f125761a.d(description));
        }
        byte[] byteArray = finderObject.toByteArray();
        j0Var.f355141f = android.util.Base64.encodeToString(byteArray, 0, byteArray.length, 0);
        pj4.s1 s1Var = new pj4.s1();
        s1Var.f355286d = finderObject.getId();
        s1Var.f355287e = finderObject.getObjectNonceId();
        byte[] byteArray2 = s1Var.toByteArray();
        j0Var.f355142g = android.util.Base64.encodeToString(byteArray2, 0, byteArray2.length, 2);
        return j0Var;
    }

    public final r45.dv2 g(r45.ww2 card) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        kotlin.jvm.internal.o.g(card, "card");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList list = card.getList(4);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = null;
            if (!it.hasNext()) {
                java.lang.String u17 = pm0.v.u(card.getLong(14));
                java.lang.String string = card.getString(1);
                java.lang.String string2 = card.getString(13);
                com.tencent.mm.protobuf.g byteString = card.getByteString(6);
                r45.dv2 dv2Var = new r45.dv2();
                dv2Var.set(0, u17);
                dv2Var.set(1, string);
                dv2Var.set(2, string2);
                int size = linkedList.size();
                if (4 <= size) {
                    size = 4;
                }
                for (java.lang.Object obj : linkedList.subList(0, size)) {
                    int i19 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    dv2Var.getList(3).add((java.lang.String) obj);
                    dv2Var.getList(4).add(linkedList2.get(i17));
                    i17 = i19;
                }
                dv2Var.set(5, byteString);
                return dv2Var;
            }
            java.lang.Object next = it.next();
            int i27 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) next;
            if (i18 < 4) {
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                if (objectDesc != null && (media = objectDesc.getMedia()) != null) {
                    finderMedia = media.getFirst();
                }
                if (finderMedia != null) {
                    java.lang.String thumbUrl = finderMedia.getThumbUrl();
                    if (thumbUrl != null) {
                        linkedList.add(thumbUrl);
                    }
                    java.lang.String thumb_url_token = finderMedia.getThumb_url_token();
                    if (thumb_url_token != null) {
                        linkedList2.add(thumb_url_token);
                    }
                }
            }
            i18 = i27;
        }
    }

    public final ot0.q h(r45.kv2 finderShareObject) {
        kotlin.jvm.internal.o.g(finderShareObject, "finderShareObject");
        ot0.q qVar = new ot0.q();
        zy2.i iVar = new zy2.i();
        iVar.f477411b = finderShareObject;
        qVar.f(iVar);
        if (finderShareObject.getInteger(31) == 2) {
            qVar.f348666i = 129;
        } else if ((finderShareObject.getInteger(25) & 4) > 0) {
            qVar.f348666i = 106;
        } else {
            qVar.f348666i = 51;
        }
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        return qVar;
    }

    public final bi4.d1 i(java.lang.String str, java.lang.String str2, long j17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.qc1 qc1Var) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(f(finderObject));
        int i17 = bi4.e.f21039a;
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f355139d = "3";
        j0Var.f355141f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        arrayList.add(j0Var);
        bi4.c1 c1Var = new bi4.c1();
        java.lang.String string = qc1Var != null ? qc1Var.getString(0) : null;
        if (string == null || string.length() == 0) {
            java.lang.String wx_status_icon_id = finderObject.getWx_status_icon_id();
            if (wx_status_icon_id == null || wx_status_icon_id.length() == 0) {
                c1Var.b("1024");
            } else {
                c1Var.b(finderObject.getWx_status_icon_id());
            }
        } else {
            c1Var.b(qc1Var != null ? qc1Var.getString(0) : null);
        }
        c1Var.g(str);
        c1Var.e(str2);
        java.lang.String string2 = qc1Var != null ? qc1Var.getString(2) : null;
        if (string2 == null || string2.length() == 0) {
            c1Var.f("finder@inner");
        } else {
            c1Var.f(qc1Var != null ? qc1Var.getString(2) : null);
        }
        java.lang.String string3 = qc1Var != null ? qc1Var.getString(1) : null;
        if (!(string3 == null || string3.length() == 0)) {
            c1Var.a(qc1Var != null ? qc1Var.getString(1) : null);
        }
        c1Var.d(pm0.v.u(j17));
        c1Var.h(finderObject.getVerify_info_buf());
        c1Var.e("http://wxapp.tc.qq.com/258/20304/stodownload?m=9823aa7c1879309ff7588e09c22144dd&filekey=30340201010420301e020201020402534804109823aa7c1879309ff7588e09c22144dd020207b8040d00000004627466730000000131&hy=SH&storeid=32303231303331383139353930393030306236313937303030303030303037636638353130393030303030313032&bizid=1023");
        c1Var.c(arrayList);
        bi4.d1 d1Var = c1Var.f21034a;
        kotlin.jvm.internal.o.f(d1Var, "build(...)");
        return d1Var;
    }

    public final r45.mv2 k(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, r45.ze2 ze2Var, java.lang.String str4, r45.ht0 ht0Var, java.lang.Long l17, r45.ub4 ub4Var) {
        r45.mv2 mv2Var = new r45.mv2();
        if (l17 != null) {
            mv2Var.set(7, pm0.v.u(l17.longValue()));
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        mv2Var.set(0, str);
        mv2Var.set(1, java.lang.Integer.valueOf(i17));
        if (str2 == null) {
            str2 = "";
        }
        mv2Var.set(2, str2);
        if (str3 == null) {
            str3 = "";
        }
        mv2Var.set(3, str3);
        if (str4 == null) {
            str4 = "";
        }
        mv2Var.set(5, str4);
        r45.hv2 hv2Var = new r45.hv2();
        hv2Var.set(0, ze2Var != null ? ze2Var.getString(5) : null);
        hv2Var.set(1, java.lang.Float.valueOf(ze2Var != null ? ze2Var.getFloat(0) : 0.0f));
        hv2Var.set(2, java.lang.Float.valueOf(ze2Var != null ? ze2Var.getFloat(1) : 0.0f));
        mv2Var.set(4, hv2Var);
        if (ht0Var != null) {
            mv2Var.set(6, ht0Var);
        }
        if (ub4Var != null) {
            mv2Var.set(8, ub4Var);
        }
        return mv2Var;
    }

    public final java.lang.Object m(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ni(str, new com.tencent.mm.plugin.finder.assist.b6(rVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final void n(androidx.appcompat.app.AppCompatActivity context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, r45.qc1 wxStatusPatams) {
        java.lang.String nickName;
        java.lang.String avatarUrl;
        java.lang.String string;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(wxStatusPatams, "wxStatusPatams");
        if (baseFinderFeed == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "[shareAdFeedToStatusInternal] feedid=" + pm0.v.u(baseFinderFeed.getItemId()) + " desc=" + baseFinderFeed.getFeedObject().getDescription());
        com.tencent.mm.protocal.protobuf.FinderContact contact = baseFinderFeed.getFeedObject().getFeedObject().getContact();
        r45.xk a17 = contact != null ? ya2.d.a(contact, true) : null;
        if (a17 == null || (nickName = a17.getString(1)) == null) {
            nickName = baseFinderFeed.getFeedObject().getNickName();
        }
        java.lang.String str = nickName;
        if (a17 == null || (string = a17.getString(2)) == null) {
            ya2.b2 contact2 = baseFinderFeed.getContact();
            avatarUrl = contact2 != null ? contact2.getAvatarUrl() : null;
        } else {
            avatarUrl = string;
        }
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Di(context, i(str, avatarUrl, baseFinderFeed.getItemId(), baseFinderFeed.getFeedObject().getFeedObject(), wxStatusPatams));
    }

    public final void o(com.tencent.mm.ui.MMActivity context, zy2.f objectContent, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(objectContent, "objectContent");
        if (hz2.d.f286313a.a(ya.a.SHARE)) {
            return;
        }
        ot0.q qVar = new ot0.q();
        qVar.f(objectContent);
        qVar.f348666i = 73;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 22);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        j45.l.w(context, ".ui.transmit.MsgRetransmitUI", intent, 1001, new com.tencent.mm.plugin.finder.assist.e6(objectContent, qt2Var));
    }

    public final void p(com.tencent.mm.ui.MMActivity context, m21.a snsShare, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(snsShare, "snsShare");
        if (hz2.d.f286313a.a(ya.a.SHARE)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[shareAlbumToSnsTimeLine] share album to sns. ");
        m21.f fVar = (m21.f) snsShare;
        sb6.append(fVar.f322986a.getString(1));
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ksnsupload_finder_album_xml", fVar.a());
        intent.putExtra("Ksnsupload_type", 20);
        intent.putExtra("need_result", true);
        j45.l.w(context, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new com.tencent.mm.plugin.finder.assist.f6(context, snsShare, qt2Var));
    }

    public final void q(android.content.Context context, r45.ev2 collection, boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(collection, "collection");
        if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
            com.tencent.mars.xlog.Log.w("Finder.FinderShareManager", "context must be MMActivity, context = " + context);
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            return;
        }
        ot0.q qVar = new ot0.q();
        zy2.g gVar = new zy2.g();
        gVar.f477383b = collection;
        qVar.f(gVar);
        qVar.f348666i = z17 ? 119 : 120;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 40);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        if (z18) {
            intent.putExtra("Retr_MsgQuickShare", z18);
            intent.putExtra("Select_Conv_User", str);
            intent.putExtra("custom_send_text", str2);
        }
        j45.l.w((com.tencent.mm.ui.MMActivity) context, ".ui.transmit.MsgRetransmitUI", intent, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_NEED_REENTER, new com.tencent.mm.plugin.finder.assist.g6(gVar, context, collection));
    }

    public final void s(android.content.Context context, r45.ev2 collection, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(collection, "collection");
        if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
            com.tencent.mars.xlog.Log.w("Finder.FinderShareManager", "context must be MMActivity");
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return;
        }
        ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsFinderShareCollection", "com.tencent.mm.feature.sns.SnsShareObjectService");
        new r45.ev2();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsFinderShareCollection", "com.tencent.mm.feature.sns.SnsShareObjectService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        android.content.Intent intent = new android.content.Intent();
        int i17 = z17 ? 42 : 43;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        java.lang.String e17 = zy2.d5.e(collection);
        kotlin.jvm.internal.o.f(e17, "makeContent(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        intent.putExtra("ksnsupload_finder_collection_xml", e17);
        intent.putExtra("Ksnsupload_type", i17);
        intent.putExtra("need_result", true);
        j45.l.w((com.tencent.mm.ui.MMActivity) context, ".plugin.sns.ui.SnsUploadUI", intent, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST, new com.tencent.mm.plugin.finder.assist.h6(context, collection));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(android.content.Context r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.n7.v(android.content.Context, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(android.content.Context r20, r45.zc4 r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.n7.w(android.content.Context, r45.zc4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void x(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, android.os.Bundle bundle, int i17, int i18, int i19, yz5.l lVar) {
        if (!hc2.o0.d(finderItem.getFeedObject())) {
            java.lang.String string = activity.getString(com.tencent.mm.R.string.exu);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            hc2.f1.B(activity, string);
            if (lVar != null) {
                lVar.invoke(null);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share live（msgType:");
        sb6.append(i18);
        sb6.append(",msgRetrType:");
        sb6.append(i19);
        sb6.append((char) 65289);
        sb6.append(finderItem.getId());
        sb6.append(' ');
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = finderItem.getFeedObject();
        sb6.append(feedObject != null ? java.lang.Integer.valueOf(feedObject.getForward_style()) : null);
        sb6.append(" to conversation,liveId:");
        r45.nw1 liveInfo = finderItem.getLiveInfo();
        sb6.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
        sb6.append(",desc:");
        sb6.append(finderItem.getDescription());
        sb6.append(",liveStatus ");
        r45.nw1 liveInfo2 = finderItem.getLiveInfo();
        sb6.append(liveInfo2 != null ? java.lang.Integer.valueOf(liveInfo2.getInteger(2)) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", sb6.toString());
        ot0.q qVar = new ot0.q();
        zy2.c cVar = new zy2.c();
        r45.g92 finderLive = finderItem.getFinderLive();
        kotlin.jvm.internal.o.g(finderLive, "<set-?>");
        cVar.f477359b = finderLive;
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "shareLiveToConversationImpl coverUrl:" + cVar.f477359b.getString(5));
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).Q6(cVar.f477359b);
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).P6(cVar.f477359b);
        java.lang.String string2 = bundle != null ? bundle.getString("instantDiscountActivityKey", "") : null;
        java.lang.String string3 = bundle != null ? bundle.getString("instantDiscountMaskUrl", "") : null;
        r45.g92 g92Var = cVar.f477359b;
        r45.xz3 xz3Var = new r45.xz3();
        xz3Var.set(0, string2);
        xz3Var.set(1, string3);
        g92Var.set(43, xz3Var);
        qVar.f(cVar);
        qVar.f348666i = i18;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        xy2.b bVar = xy2.b.f458155b;
        java.lang.String string4 = cVar.f477359b.getString(1);
        pm0.z.b(bVar, "shareLiveToConversationImpl_username_check", !(string4 == null || string4.length() == 0), null, null, true, false, null, 108, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", i19);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", bundle != null ? bundle.getBoolean("Retr_show_success_tips", true) : true);
        intent.putExtra("Select_Conv_Type", bundle != null ? java.lang.Integer.valueOf(bundle.getInt("Select_Conv_Type")) : null);
        intent.putExtra("search_range", bundle != null ? bundle.getIntArray("search_range") : null);
        intent.putExtra("Retr_finder_in_stream", true);
        intent.putExtra("content_type_forward_to_wework", 12);
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(activity, 14, r45.pk5.class);
        if (pk5Var != null) {
            pk5Var.f383137i = 8;
            pk5Var.f383132d = 2;
            pk5Var.f383140o = (int) (android.os.SystemClock.elapsedRealtime() - pk5Var.f383143r);
            pk5Var.f383138m = "0";
            pk5Var.f383139n = "0";
            pk5Var.f383142q = "";
            pk5Var.f383136h = bundle != null ? bundle.getInt("quick_share_item_count", 0) : 0;
        }
        l35.a.f315443a.a(activity);
        j45.l.x((com.tencent.mm.ui.MMFragmentActivity) activity, ".ui.transmit.MsgRetransmitUI", intent, 1005, new com.tencent.mm.plugin.finder.assist.v6(finderItem, lVar));
    }

    public final void y(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.os.Bundle bundle, int i17, int i18) {
        if (!hc2.o0.f(baseFinderFeed.getFeedObject().getFeedObject())) {
            java.lang.String string = activity.getString(com.tencent.mm.R.string.exu);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            hc2.f1.B(activity, string);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share finderObject snsType:");
        sb6.append(i18);
        sb6.append(", ");
        sb6.append(baseFinderFeed.getFeedObject().getId());
        sb6.append(' ');
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = baseFinderFeed.getFeedObject().getFeedObject();
        sb6.append(feedObject != null ? java.lang.Integer.valueOf(feedObject.getForward_style()) : null);
        sb6.append(" to sns,liveId:");
        r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
        sb6.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
        sb6.append(",desc:");
        sb6.append(baseFinderFeed.getFeedObject().getDescription());
        sb6.append(",liveStatus:");
        r45.nw1 liveInfo2 = baseFinderFeed.getFeedObject().getLiveInfo();
        sb6.append(liveInfo2 != null ? java.lang.Integer.valueOf(liveInfo2.getInteger(2)) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsFinderShareLive", "com.tencent.mm.feature.sns.SnsShareObjectService");
        m21.h hVar = new m21.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsFinderShareLive", "com.tencent.mm.feature.sns.SnsShareObjectService");
        hVar.e(baseFinderFeed.getFeedObject().getFinderLive());
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "shareLiveToSnsTimeLineInternal coverUrl:" + hVar.b().getString(5));
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).P6(hVar.b());
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).Q6(hVar.b());
        intent.putExtra("ksnsupload_finder_live_xml", hVar.a());
        intent.putExtra("Ksnsupload_type", i18);
        intent.putExtra("need_result", true);
        if ((bundle != null ? bundle.getInt("FinderLiveShareExtraScene") : 0) == 1) {
            intent.putExtra("KSnsPostManu", true);
            intent.putExtra("KTouchCameraTime", com.tencent.mm.sdk.platformtools.t8.i1());
            intent.putExtra("sns_comment_type", 1);
            intent.putExtra("Ksnsupload_type", 0);
            intent.putExtra("is_spring", true);
            intent.putExtra("is_from_spring_live", true);
        }
        if (bundle != null) {
            intent.putExtra("need_ban_back_tips", bundle.getBoolean("need_ban_back_tips", false));
        }
        j45.l.x((com.tencent.mm.ui.MMFragmentActivity) activity, ".plugin.sns.ui.SnsUploadUI", intent, 1006, new com.tencent.mm.plugin.finder.assist.w6(bundle, activity, baseFinderFeed));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(android.content.Context r23, r45.br2 r24, yz5.l r25, java.lang.String r26, boolean r27, boolean r28, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.n7.z(android.content.Context, r45.br2, yz5.l, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
