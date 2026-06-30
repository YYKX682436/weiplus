package qe5;

/* loaded from: classes12.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.w0 f443722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(qe5.w0 w0Var) {
        super(1);
        this.f443722d = w0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.view.MenuItem item = (android.view.MenuItem) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int itemId = item.getItemId();
        qe5.w0 w0Var = this.f443722d;
        w0Var.getClass();
        jz5.f0 f0Var = jz5.f0.f384359a;
        boolean z17 = true;
        r5 = null;
        jz5.f0 f0Var2 = null;
        if (itemId == 215) {
            kd5.e Y6 = w0Var.Y6();
            java.lang.String str4 = Y6 != null ? Y6.F : null;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 c5688x8d5069c8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8();
            am.dj djVar = c5688x8d5069c8.f136013g;
            djVar.f88004a = 73;
            djVar.f88005b = 1;
            djVar.f88006c = str4;
            c5688x8d5069c8.e();
            w0Var.Z6("apply success");
        } else if (itemId != 216) {
            switch (itemId) {
                case 25:
                    kd5.e Y62 = w0Var.Y6();
                    java.lang.String str5 = Y62 != null ? Y62.F : null;
                    java.lang.String str6 = "current template is " + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 c5688x8d5069c82 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8();
                    am.dj djVar2 = c5688x8d5069c82.f136013g;
                    djVar2.f88004a = 27;
                    djVar2.f88005b = 1;
                    djVar2.f88006c = str5;
                    c5688x8d5069c82.e();
                    w0Var.Z6(str6);
                    com.p314xaae8f345.mm.p2829xfa87f9de.s0.b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
                    break;
                case 26:
                    kd5.e Y63 = w0Var.Y6();
                    java.lang.String str7 = Y63 != null ? Y63.F : null;
                    java.lang.String str8 = "current wxa template is " + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(3);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 c5688x8d5069c83 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8();
                    am.dj djVar3 = c5688x8d5069c83.f136013g;
                    djVar3.f88004a = 40;
                    djVar3.f88005b = 1;
                    djVar3.f88006c = str7;
                    c5688x8d5069c83.e();
                    w0Var.Z6(str8);
                    break;
                case 27:
                    kd5.e Y64 = w0Var.Y6();
                    java.lang.String str9 = Y64 != null ? Y64.F : null;
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd();
                    am.r2 r2Var = c5255x5f3208fd.f135586g;
                    r2Var.f89292a = 35;
                    r2Var.f89293b = 1;
                    r2Var.f89294c = str9;
                    c5255x5f3208fd.e();
                    w0Var.Z6("apply success");
                    break;
                case 28:
                    kd5.e Y65 = w0Var.Y6();
                    java.lang.String str10 = Y65 != null ? Y65.F : null;
                    java.lang.String str11 = "current browse template is " + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 c5688x8d5069c84 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8();
                    am.dj djVar4 = c5688x8d5069c84.f136013g;
                    djVar4.f88004a = 27;
                    djVar4.f88005b = 2;
                    djVar4.f88006c = str10;
                    c5688x8d5069c84.e();
                    w0Var.Z6(str11);
                    break;
                default:
                    switch (itemId) {
                        case 210:
                            kd5.e Y66 = w0Var.Y6();
                            java.lang.String str12 = Y66 != null ? Y66.F : null;
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd();
                            am.r2 r2Var2 = c5255x5f3208fd2.f135586g;
                            r2Var2.f89292a = 62;
                            r2Var2.f89293b = 1;
                            r2Var2.f89294c = str12;
                            c5255x5f3208fd2.e();
                            w0Var.Z6("apply success");
                            break;
                        case 211:
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd();
                            am.r2 r2Var3 = c5255x5f3208fd3.f135586g;
                            r2Var3.f89292a = 62;
                            r2Var3.f89293b = 2;
                            r2Var3.f89294c = null;
                            c5255x5f3208fd3.e();
                            w0Var.Z6("apply success");
                            break;
                        case 212:
                            kd5.e Y67 = w0Var.Y6();
                            java.lang.String str13 = Y67 != null ? Y67.F : null;
                            java.lang.String str14 = "current pardus template is " + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(5);
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 c5688x8d5069c85 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8();
                            am.dj djVar5 = c5688x8d5069c85.f136013g;
                            djVar5.f88004a = 66;
                            djVar5.f88005b = 1;
                            djVar5.f88006c = str13;
                            c5688x8d5069c85.e();
                            w0Var.Z6(str14);
                            break;
                        case 213:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachApplyToUIC", "applyToScanGoods");
                            kd5.e Y68 = w0Var.Y6();
                            java.lang.String str15 = Y68 != null ? Y68.F : null;
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd();
                            am.r2 r2Var4 = c5255x5f3208fd4.f135586g;
                            r2Var4.f89292a = 64;
                            r2Var4.f89293b = 1;
                            r2Var4.f89294c = str15;
                            c5255x5f3208fd4.e();
                            w0Var.Z6("apply success");
                            break;
                        default:
                            java.lang.String str16 = "";
                            switch (itemId) {
                                case 218:
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachApplyToUIC", "applyToImageOcr");
                                    kd5.e Y69 = w0Var.Y6();
                                    java.lang.String str17 = Y69 != null ? Y69.F : null;
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd();
                                    am.r2 r2Var5 = c5255x5f3208fd5.f135586g;
                                    r2Var5.f89292a = 84;
                                    r2Var5.f89293b = 1;
                                    r2Var5.f89294c = str17;
                                    c5255x5f3208fd5.e();
                                    w0Var.Z6("apply success");
                                    break;
                                case 219:
                                    w0Var.V6(87, 1);
                                    break;
                                case 220:
                                    kd5.e Y610 = w0Var.Y6();
                                    java.lang.String str18 = Y610 != null ? Y610.F : null;
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 c5688x8d5069c86 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8();
                                    am.dj djVar6 = c5688x8d5069c86.f136013g;
                                    djVar6.f88004a = 86;
                                    djVar6.f88005b = 2;
                                    djVar6.f88006c = str18;
                                    c5688x8d5069c86.e();
                                    w0Var.Z6("apply to TextStatus");
                                    break;
                                case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23 /* 221 */:
                                    w0Var.V6(92, 1);
                                    break;
                                case com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508 /* 222 */:
                                    w0Var.V6(92, 2);
                                    break;
                                case 223:
                                    kd5.e Y611 = w0Var.Y6();
                                    java.lang.String str19 = Y611 != null ? Y611.F : null;
                                    java.lang.String str20 = "current ftshotsearch template is " + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(9);
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 c5688x8d5069c87 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8();
                                    am.dj djVar7 = c5688x8d5069c87.f136013g;
                                    djVar7.f88004a = 95;
                                    djVar7.f88005b = 1;
                                    djVar7.f88006c = str19;
                                    c5688x8d5069c87.e();
                                    w0Var.Z6(str20);
                                    break;
                                case 224:
                                    w0Var.U6(true);
                                    break;
                                case 225:
                                    w0Var.U6(false);
                                    break;
                                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.f34051x366c91de /* 226 */:
                                    w0Var.W6("");
                                    break;
                                case 227:
                                    w0Var.W6("wx9e221f7828fa7482");
                                    break;
                                case 228:
                                    kd5.e Y612 = w0Var.Y6();
                                    java.lang.String str21 = Y612 != null ? Y612.F : null;
                                    java.lang.String str22 = "current emojisearch template is " + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(10);
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 c5688x8d5069c88 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8();
                                    am.dj djVar8 = c5688x8d5069c88.f136013g;
                                    djVar8.f88004a = 79;
                                    djVar8.f88005b = 2;
                                    djVar8.f88006c = str21;
                                    c5688x8d5069c88.e();
                                    w0Var.Z6(str22);
                                    break;
                                default:
                                    switch (itemId) {
                                        case 230:
                                            w0Var.X6();
                                            break;
                                        case 231:
                                            w0Var.W6("wx2f3fb5db9f226462");
                                            break;
                                        case 232:
                                            w0Var.W6("wxe208ce76dfa39515");
                                            break;
                                        case com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d /* 233 */:
                                            w0Var.T6();
                                            break;
                                        case 234:
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachApplyToUIC", "applyToSelectText");
                                            kd5.e Y613 = w0Var.Y6();
                                            java.lang.String str23 = Y613 != null ? Y613.F : null;
                                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd();
                                            am.r2 r2Var6 = c5255x5f3208fd6.f135586g;
                                            r2Var6.f89292a = 84;
                                            r2Var6.f89293b = 2;
                                            r2Var6.f89294c = str23;
                                            c5255x5f3208fd6.e();
                                            w0Var.Z6("apply success");
                                            break;
                                        case 235:
                                            w0Var.W6("wxf337cbaa27790mb2");
                                            break;
                                        case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j6.f34370x366c91de /* 236 */:
                                            w0Var.W6("MagicAdPublicService");
                                            break;
                                        case 237:
                                            w0Var.W6("MagicBrandService");
                                            break;
                                        case 238:
                                            w0Var.W6("MagicAdBrandService");
                                            break;
                                        case 239:
                                            kd5.e Y614 = w0Var.Y6();
                                            if (Y614 != null && (str = Y614.F) != null) {
                                                java.lang.String D = lp0.b.D();
                                                java.lang.String str24 = D + "runtime_package.zip";
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(D);
                                                try {
                                                    if (!com.p314xaae8f345.mm.vfs.w6.j(D)) {
                                                        com.p314xaae8f345.mm.vfs.w6.u(D);
                                                    }
                                                    java.lang.String concat = D.concat("runtime_package.zip");
                                                    com.p314xaae8f345.mm.vfs.w6.h(concat);
                                                    com.p314xaae8f345.mm.vfs.w6.c(str, concat);
                                                } catch (java.lang.Exception e17) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.AppAttachApplyToUIC", "performFileOperation error: " + e17.getMessage());
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    com.p314xaae8f345.p3210x3857dc.a3.n(w0Var.m80379x76847179(), str24);
                                                    com.p314xaae8f345.mm.vfs.w6.h(str24);
                                                }
                                                if (z17) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachApplyToUIC", "applyToXWebRuntime success");
                                                } else {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.File.AppAttachApplyToUIC", "applyToXWebRuntime failed");
                                                }
                                                f0Var2 = f0Var;
                                            }
                                            if (f0Var2 == null) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.File.AppAttachApplyToUIC", "applyToXWebRuntime, no attach info");
                                                break;
                                            }
                                            break;
                                        case 240:
                                            w0Var.W6("MagicFinderCard");
                                            break;
                                        case 241:
                                            w0Var.W6("MagicSclNativeDemo");
                                            break;
                                        case 242:
                                            w0Var.W6("MagicAdPlayableBasic");
                                            break;
                                        case 243:
                                            w0Var.W6("MagicGameLoading");
                                            break;
                                        case 244:
                                            w0Var.W6(null);
                                            w0Var.X6();
                                            break;
                                        case 245:
                                            w0Var.W6("MagicEmojiCocos");
                                            break;
                                        case 246:
                                            w0Var.W6("MagicNewAdPlayableBasic");
                                            break;
                                        case 247:
                                            w0Var.W6("MagicEcsKFDynamicCard");
                                            break;
                                        case 248:
                                            w0Var.W6("MagicEcsTimeline");
                                            break;
                                        case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cd.f33971x366c91de /* 249 */:
                                            w0Var.W6("MagicEcsPublicService");
                                            break;
                                        case 250:
                                            w0Var.W6("MagicBrushDemo");
                                            break;
                                        case 251:
                                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class))).Di());
                                            sb6.append("mbpkgs/");
                                            kd5.e Y615 = w0Var.Y6();
                                            if (Y615 == null || (str2 = Y615.f388425w) == null) {
                                                str2 = "";
                                            }
                                            sb6.append(str2);
                                            if (!com.p314xaae8f345.mm.vfs.w6.h(sb6.toString())) {
                                                w0Var.Z6("No debug pkg found");
                                                break;
                                            } else {
                                                kd5.e Y616 = w0Var.Y6();
                                                if (Y616 != null && (str3 = Y616.f388425w) != null) {
                                                    str16 = str3;
                                                }
                                                ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).wi(r26.n0.r0(str16, '.', null, 2, null));
                                                w0Var.Z6("Done");
                                                break;
                                            }
                                            break;
                                        case 252:
                                            w0Var.W6("MagicEcsShop");
                                            break;
                                    }
                            }
                    }
            }
        } else {
            kd5.e Y617 = w0Var.Y6();
            java.lang.String str25 = Y617 != null ? Y617.F : null;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 c5688x8d5069c89 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8();
            am.dj djVar9 = c5688x8d5069c89.f136013g;
            djVar9.f88004a = 79;
            djVar9.f88005b = 1;
            djVar9.f88006c = str25;
            c5688x8d5069c89.e();
            w0Var.Z6("apply success");
            w0Var.T6();
        }
        return f0Var;
    }
}
