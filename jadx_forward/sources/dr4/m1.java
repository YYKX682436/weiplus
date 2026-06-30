package dr4;

/* loaded from: classes14.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(dr4.p1 p1Var) {
        super(0);
        this.f324201d = p1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        dr4.p1 p1Var;
        java.lang.String str;
        long j18;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        long j19;
        long j27;
        dr4.p1 p1Var2;
        java.lang.Object obj;
        rq4.n nVar;
        java.lang.Integer num;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.Long l17;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.String str10;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.Long l18;
        java.lang.String str13;
        sq4.b bVar;
        long j28;
        long j29;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.lang.Object obj13;
        java.lang.Object obj14;
        java.lang.Object obj15;
        java.lang.Object obj16;
        java.lang.Long l19;
        java.lang.Object obj17;
        java.lang.Long l27;
        dr4.p1 p1Var3 = this.f324201d;
        xq4.a aVar = p1Var3.f324237c;
        if (aVar != null) {
            try {
                ((zq4.b) aVar).e();
            } catch (java.lang.Exception e17) {
                e17.toString();
            }
            p1Var3.f324237c = null;
        }
        if (p1Var3.D) {
            p1Var3.D = false;
            rq4.j jVar = qq4.c.f447523d;
            if (jVar != null) {
                long j37 = p1Var3.I;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                jVar.o(true, java.lang.System.currentTimeMillis() - j37);
            }
        }
        p1Var3.I = 0L;
        rq4.n nVar2 = new rq4.n();
        qq4.c.f447526g = nVar2;
        nVar2.f480564a = r26.i0.t(java.lang.String.valueOf(gq4.v.wi().f447512m), ",", ";", false);
        long j38 = gq4.v.wi().f447517r;
        if (j38 != 0) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            j17 = java.lang.System.currentTimeMillis() - j38;
        } else {
            j17 = 0;
        }
        rq4.c cVar = qq4.c.f447520a;
        if (cVar != null) {
            java.util.HashMap hashMap = cVar.f480473b;
            sq4.b bVar2 = (sq4.b) hashMap.get(cVar.f480478g);
            if (bVar2 != null) {
                bVar2.a();
            }
            sq4.b bVar3 = (sq4.b) hashMap.get(cVar.f480477f);
            if (bVar3 != null) {
                bVar3.a();
            }
            sq4.b bVar4 = (sq4.b) hashMap.get(cVar.f480476e);
            if (bVar4 != null) {
                bVar4.a();
            }
            boolean z19 = cVar.f480475d;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7012x4f94050e c7012x4f94050e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7012x4f94050e();
            c7012x4f94050e.f143251i = z19 ? 1L : 0L;
            rq4.a aVar2 = cVar.f480472a;
            c7012x4f94050e.f143255m = c7012x4f94050e.b("CameraSdk", java.lang.String.valueOf(aVar2 != null ? java.lang.Integer.valueOf(aVar2.f480470d) : null), true);
            java.util.HashMap hashMap2 = cVar.f480474c;
            if (hashMap2.get("InitCameraError") != null) {
                str = "CameraSdk";
                j28 = 1;
            } else {
                str = "CameraSdk";
                j28 = 0;
            }
            c7012x4f94050e.f143248f = j28;
            sq4.b bVar5 = (sq4.b) hashMap2.get("PreviewSizeError");
            if (bVar5 != null) {
                c7012x4f94050e.f143254l = c7012x4f94050e.b("PreviewSizeError", bVar5.f492912g, true);
            }
            if (hashMap2.get("SwitchPreviewError") != null) {
                p1Var = p1Var3;
                j29 = 1;
            } else {
                p1Var = p1Var3;
                j29 = 0;
            }
            c7012x4f94050e.f143253k = j29;
            c7012x4f94050e.f143246d = java.lang.Math.max(100 - (hashMap2.size() * 20), 0);
            c7012x4f94050e.f143263u = cVar.f480480i;
            c7012x4f94050e.f143249g = hashMap2.get("StartPreviewError") != null ? 1L : 0L;
            j18 = j17;
            c7012x4f94050e.f143250h = hashMap2.get("StopPreviewError") != null ? 1L : 0L;
            c7012x4f94050e.f143252j = hashMap2.get("SwitchCameraError") != null ? 1L : 0L;
            c7012x4f94050e.f143265w = cVar.f480481j;
            c7012x4f94050e.f143264v = cVar.f480482k;
            sq4.b bVar6 = (sq4.b) hashMap.get("SwitchCamera_1");
            int i17 = bVar6 != null ? bVar6.c().f492917a : 0;
            sq4.b bVar7 = (sq4.b) hashMap.get("SwitchCamera_0");
            c7012x4f94050e.f143256n = i17 + (bVar7 != null ? bVar7.c().f492917a : 0);
            sq4.b bVar8 = (sq4.b) hashMap.get("SwitchPreview");
            c7012x4f94050e.f143257o = bVar8 != null ? bVar8.c().f492917a : 0;
            sq4.b bVar9 = (sq4.b) hashMap.get("CameraPreviewSizeChanged_640*480");
            if (bVar9 != null) {
                obj10 = "CameraPreviewSizeChanged_640*480";
                sq4.c c17 = bVar9.c();
                obj11 = "StartPreviewError";
                c7012x4f94050e.f143260r = c17.f492918b;
            } else {
                obj10 = "CameraPreviewSizeChanged_640*480";
                obj11 = "StartPreviewError";
            }
            sq4.b bVar10 = (sq4.b) hashMap.get("CameraPreviewSizeChanged_1280*720");
            if (bVar10 != null) {
                obj12 = "CameraPreviewSizeChanged_1280*720";
                c7012x4f94050e.f143261s = bVar10.c().f492918b;
            } else {
                obj12 = "CameraPreviewSizeChanged_1280*720";
            }
            sq4.b bVar11 = (sq4.b) hashMap.get("CameraPreviewSizeChanged_1920*1080");
            if (bVar11 != null) {
                obj13 = "CameraPreviewSizeChanged_1920*1080";
                c7012x4f94050e.f143262t = bVar11.c().f492918b;
            } else {
                obj13 = "CameraPreviewSizeChanged_1920*1080";
            }
            c7012x4f94050e.f143258p = 0L;
            c7012x4f94050e.f143259q = 0L;
            c7012x4f94050e.f143247e = java.lang.System.currentTimeMillis() - gq4.v.wi().f447516q;
            c7012x4f94050e.f143266x = cVar.f480483l;
            c7012x4f94050e.k();
            rq4.n nVar3 = qq4.c.f447526g;
            if (nVar3 == null) {
                obj14 = "SwitchCameraError";
                obj15 = obj10;
            } else {
                cl0.g gVar = new cl0.g();
                obj14 = "SwitchCameraError";
                gVar.o("rating", java.lang.Math.max(100 - (hashMap2.size() * 20), 0));
                java.lang.String gVar2 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                obj15 = obj10;
                nVar3.f480565b = r26.i0.t(gVar2, ",", ";", false);
            }
            rq4.n nVar4 = qq4.c.f447526g;
            if (nVar4 == null) {
                str2 = "rating";
            } else {
                sq4.b bVar12 = (sq4.b) hashMap.get("SwitchCamera_1");
                int i18 = bVar12 != null ? bVar12.c().f492917a : 0;
                sq4.b bVar13 = (sq4.b) hashMap.get("SwitchCamera_0");
                int i19 = bVar13 != null ? bVar13.c().f492917a : 0;
                int i27 = i18 + i19;
                sq4.b bVar14 = (sq4.b) hashMap.get("SwitchPreview");
                int i28 = bVar14 != null ? bVar14.c().f492917a : 0;
                cl0.g gVar3 = new cl0.g();
                str2 = "rating";
                gVar3.o("switchIDTimes", i27);
                gVar3.o("switchFrontTimes", i18);
                gVar3.o("switchBackTimes", i19);
                gVar3.o("switchPreviewTimes", i28);
                java.lang.String gVar4 = gVar3.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
                nVar4.f480566c = r26.i0.t(gVar4, ",", ";", false);
            }
            if (qq4.c.f447526g != null) {
                sq4.b bVar15 = (sq4.b) hashMap.get(obj15);
                if (bVar15 != null) {
                    l19 = java.lang.Long.valueOf(bVar15.c().f492918b);
                    obj16 = obj12;
                } else {
                    obj16 = obj12;
                    l19 = null;
                }
                sq4.b bVar16 = (sq4.b) hashMap.get(obj16);
                if (bVar16 != null) {
                    l27 = java.lang.Long.valueOf(bVar16.c().f492918b);
                    obj17 = obj13;
                } else {
                    obj17 = obj13;
                    l27 = null;
                }
                sq4.b bVar17 = (sq4.b) hashMap.get(obj17);
                java.lang.Long valueOf = bVar17 != null ? java.lang.Long.valueOf(bVar17.c().f492918b) : null;
                cl0.g gVar5 = new cl0.g();
                gVar5.p("totalFrontIdTime", 0L);
                gVar5.p("totalBackIdTime", 0L);
                gVar5.h("total480PTime", l19);
                gVar5.h("total720PTime", l27);
                gVar5.h("total1080PTime", valueOf);
                java.lang.String gVar6 = gVar5.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, "toString(...)");
                r26.i0.t(gVar6, ",", ";", false);
            }
            if (qq4.c.f447526g != null) {
                cl0.g gVar7 = new cl0.g();
                gVar7.p("switchCost", cVar.f480481j);
                gVar7.p("switchPreview720Cost", 0L);
                gVar7.p("startPreviewCost", cVar.f480483l);
                gVar7.p("switchPreview1080Cost", 0L);
                java.lang.String gVar8 = gVar7.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar8, "toString(...)");
                r26.i0.t(gVar8, ",", ";", false);
            }
            rq4.n nVar5 = qq4.c.f447526g;
            if (nVar5 != null) {
                cl0.g gVar9 = new cl0.g();
                gVar9.o(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, hashMap2.get("InitCameraError") != null ? 1 : 0);
                gVar9.o("startPreview", hashMap2.get(obj11) != null ? 1 : 0);
                gVar9.o("stopPreview", hashMap2.get("StopPreviewError") != null ? 1 : 0);
                gVar9.o("switchCamera", hashMap2.get(obj14) != null ? 1 : 0);
                gVar9.o("switchPreview", hashMap2.get("SwitchPreviewError") != null ? 1 : 0);
                sq4.b bVar18 = (sq4.b) hashMap2.get("PreviewSizeError");
                gVar9.h("previewSize", bVar18 != null ? bVar18.f492912g : null);
                gVar9.r("leak", cVar.f480475d);
                java.lang.String gVar10 = gVar9.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar10, "toString(...)");
                nVar5.f480567d = r26.i0.t(gVar10, ",", ";", false);
            }
            qq4.c.f447520a = null;
        } else {
            p1Var = p1Var3;
            str = "CameraSdk";
            j18 = j17;
            str2 = "rating";
        }
        rq4.d dVar = qq4.c.f447524e;
        if (dVar != null) {
            java.util.HashMap hashMap3 = dVar.f480484a;
            sq4.b bVar19 = (sq4.b) hashMap3.get(dVar.f480486c);
            if (bVar19 != null) {
                bVar19.a();
            }
            sq4.b bVar20 = (sq4.b) hashMap3.get(dVar.f480486c);
            java.util.HashMap hashMap4 = dVar.f480485b;
            if (bVar20 != null && (str13 = bVar20.f492912g) != null && (bVar = (sq4.b) hashMap4.get("EncodeBadFrame_".concat(str13))) != null) {
                bVar.a();
            }
            sq4.b bVar21 = (sq4.b) hashMap3.get(dVar.f480487d);
            if (bVar21 != null) {
                bVar21.a();
            }
            sq4.b bVar22 = (sq4.b) hashMap4.get("EncoderSourceTimeoutNotFrame");
            if (bVar22 != null) {
                bVar22.a();
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7013x420ccf85 c7013x420ccf85 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7013x420ccf85();
            sq4.b bVar23 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_320");
            if (bVar23 != null) {
                sq4.c c18 = bVar23.c();
                c7013x420ccf85.f143269f = c18.f492917a;
                c7013x420ccf85.f143268e = (int) c18.f492918b;
            }
            sq4.b bVar24 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_480");
            if (bVar24 != null) {
                sq4.c c19 = bVar24.c();
                c7013x420ccf85.f143271h = c19.f492917a;
                c7013x420ccf85.f143270g = (int) c19.f492918b;
            }
            sq4.b bVar25 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_640");
            if (bVar25 != null) {
                sq4.c c27 = bVar25.c();
                c7013x420ccf85.f143273j = c27.f492917a;
                c7013x420ccf85.f143272i = (int) c27.f492918b;
            }
            sq4.b bVar26 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_1280");
            if (bVar26 != null) {
                sq4.c c28 = bVar26.c();
                c7013x420ccf85.f143275l = c28.f492917a;
                c7013x420ccf85.f143274k = (int) c28.f492918b;
            }
            sq4.b bVar27 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_1920");
            if (bVar27 != null) {
                sq4.c c29 = bVar27.c();
                c7013x420ccf85.f143277n = c29.f492917a;
                obj2 = "EncoderDrawSizeChanged_480";
                c7013x420ccf85.f143276m = (int) c29.f492918b;
            } else {
                obj2 = "EncoderDrawSizeChanged_480";
            }
            sq4.b bVar28 = (sq4.b) hashMap3.get("EncoderModeChangeSoft");
            if (bVar28 != null) {
                sq4.c c37 = bVar28.c();
                obj3 = "EncoderModeChangeSoft";
                c7013x420ccf85.f143278o = (int) c37.f492918b;
                c7013x420ccf85.f143280q = c37.f492917a;
            } else {
                obj3 = "EncoderModeChangeSoft";
            }
            sq4.b bVar29 = (sq4.b) hashMap3.get("EncoderModeChangeHard");
            if (bVar29 != null) {
                sq4.c c38 = bVar29.c();
                obj4 = "EncoderModeChangeHard";
                c7013x420ccf85.f143279p = (int) c38.f492918b;
                c7013x420ccf85.f143281r = c38.f492917a;
            } else {
                obj4 = "EncoderModeChangeHard";
            }
            sq4.b bVar30 = (sq4.b) hashMap4.get("EncoderSourceTimeoutNotFrame");
            if (bVar30 != null) {
                sq4.c c39 = bVar30.c();
                c7013x420ccf85.f143284u = (int) c39.f492918b;
                c7013x420ccf85.f143285v = c39.f492917a;
            }
            sq4.b bVar31 = (sq4.b) hashMap4.get("EncodeBadFrame_EncoderModeChangeSoft");
            if (bVar31 != null) {
                c7013x420ccf85.f143282s = bVar31.c().f492917a;
            }
            sq4.b bVar32 = (sq4.b) hashMap4.get("EncodeBadFrame_EncoderModeChangeHard");
            if (bVar32 != null) {
                c7013x420ccf85.f143283t = bVar32.c().f492917a;
            }
            java.lang.Object obj18 = obj2;
            c7013x420ccf85.f143288y = c7013x420ccf85.b("encodeFrameRate", r26.i0.t(dVar.d(), ",", ";", false), true);
            c7013x420ccf85.f143287x = c7013x420ccf85.b("encodeBitrate", r26.i0.t(dVar.c(), ",", ";", false), true);
            c7013x420ccf85.f143267d = java.lang.Math.max(100 - (hashMap4.size() * 20), 0);
            long j39 = gq4.v.wi().f447517r;
            if (j39 == 0) {
                c7013x420ccf85.f143286w = 0;
                obj5 = "EncodeBadFrame_EncoderModeChangeHard";
            } else {
                obj5 = "EncodeBadFrame_EncoderModeChangeHard";
                c7013x420ccf85.f143286w = (int) (java.lang.System.currentTimeMillis() - j39);
            }
            c7013x420ccf85.k();
            rq4.n nVar6 = qq4.c.f447526g;
            if (nVar6 == null) {
                obj6 = obj5;
                str10 = str2;
            } else {
                cl0.g gVar11 = new cl0.g();
                obj6 = obj5;
                str10 = str2;
                gVar11.o(str10, java.lang.Math.max(100 - (hashMap4.size() * 20), 0));
                gVar11.h("encodeBitrate", dVar.c());
                gVar11.h("encodeFrameRate", dVar.d());
                java.lang.String gVar12 = gVar11.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar12, "toString(...)");
                nVar6.f480568e = r26.i0.t(gVar12, ",", ";", false);
            }
            rq4.n nVar7 = qq4.c.f447526g;
            str2 = str10;
            if (nVar7 == null) {
                obj7 = "EncoderDrawSizeChanged_320";
                obj8 = obj18;
                obj9 = obj3;
            } else {
                cl0.g gVar13 = new cl0.g();
                sq4.b bVar33 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_320");
                obj7 = "EncoderDrawSizeChanged_320";
                gVar13.h("320", bVar33 != null ? java.lang.Integer.valueOf(bVar33.c().f492917a) : null);
                sq4.b bVar34 = (sq4.b) hashMap3.get(obj18);
                obj8 = obj18;
                gVar13.h("480", bVar34 != null ? java.lang.Integer.valueOf(bVar34.c().f492917a) : null);
                sq4.b bVar35 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_640");
                gVar13.h("640", bVar35 != null ? java.lang.Integer.valueOf(bVar35.c().f492917a) : null);
                sq4.b bVar36 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_1280");
                gVar13.h("720", bVar36 != null ? java.lang.Integer.valueOf(bVar36.c().f492917a) : null);
                sq4.b bVar37 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_1920");
                gVar13.h("1080", bVar37 != null ? java.lang.Integer.valueOf(bVar37.c().f492917a) : null);
                java.lang.Object obj19 = obj3;
                sq4.b bVar38 = (sq4.b) hashMap3.get(obj19);
                obj9 = obj19;
                gVar13.h("hard", bVar38 != null ? java.lang.Integer.valueOf(bVar38.c().f492917a) : null);
                sq4.b bVar39 = (sq4.b) hashMap3.get(obj4);
                gVar13.h("soft", bVar39 != null ? java.lang.Integer.valueOf(bVar39.c().f492917a) : null);
                java.lang.String gVar14 = gVar13.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar14, "toString(...)");
                nVar7.f480569f = r26.i0.t(gVar14, ",", ";", false);
            }
            rq4.n nVar8 = qq4.c.f447526g;
            if (nVar8 == null) {
                str3 = ",";
                str4 = ";";
            } else {
                cl0.g gVar15 = new cl0.g();
                sq4.b bVar40 = (sq4.b) hashMap3.get(obj7);
                if (bVar40 != null) {
                    str11 = ",";
                    str12 = ";";
                    l18 = java.lang.Long.valueOf(bVar40.c().f492918b);
                } else {
                    str11 = ",";
                    str12 = ";";
                    l18 = null;
                }
                gVar15.h("320", l18);
                sq4.b bVar41 = (sq4.b) hashMap3.get(obj8);
                gVar15.h("480", bVar41 != null ? java.lang.Long.valueOf(bVar41.c().f492918b) : null);
                sq4.b bVar42 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_640");
                gVar15.h("640", bVar42 != null ? java.lang.Long.valueOf(bVar42.c().f492918b) : null);
                sq4.b bVar43 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_1280");
                gVar15.h("720", bVar43 != null ? java.lang.Long.valueOf(bVar43.c().f492918b) : null);
                sq4.b bVar44 = (sq4.b) hashMap3.get("EncoderDrawSizeChanged_1920");
                gVar15.h("1080", bVar44 != null ? java.lang.Long.valueOf(bVar44.c().f492918b) : null);
                sq4.b bVar45 = (sq4.b) hashMap3.get(obj9);
                gVar15.h("hard", bVar45 != null ? java.lang.Long.valueOf(bVar45.c().f492918b) : null);
                sq4.b bVar46 = (sq4.b) hashMap3.get(obj4);
                gVar15.h("soft", bVar46 != null ? java.lang.Long.valueOf(bVar46.c().f492918b) : null);
                java.lang.String gVar16 = gVar15.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar16, "toString(...)");
                str3 = str11;
                str4 = str12;
                nVar8.f480570g = r26.i0.t(gVar16, str3, str4, false);
            }
            rq4.n nVar9 = qq4.c.f447526g;
            if (nVar9 != null) {
                cl0.g gVar17 = new cl0.g();
                sq4.b bVar47 = (sq4.b) hashMap4.get("EncoderSourceTimeoutNotFrame");
                if (bVar47 != null) {
                    sq4.c c47 = bVar47.c();
                    gVar17.o("total", (int) c47.f492918b);
                    gVar17.o("times", c47.f492917a);
                }
                cl0.g gVar18 = new cl0.g();
                sq4.b bVar48 = (sq4.b) hashMap4.get("EncodeBadFrame_EncoderModeChangeSoft");
                if (bVar48 != null) {
                    sq4.c c48 = bVar48.c();
                    gVar18.o("total", (int) c48.f492918b);
                    gVar18.o("times", c48.f492917a);
                }
                cl0.g gVar19 = new cl0.g();
                sq4.b bVar49 = (sq4.b) hashMap4.get(obj6);
                if (bVar49 != null) {
                    sq4.c c49 = bVar49.c();
                    gVar19.o("total", (int) c49.f492918b);
                    gVar19.o("times", c49.f492917a);
                }
                cl0.g gVar20 = new cl0.g();
                java.lang.String gVar21 = gVar17.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar21, "toString(...)");
                gVar20.h("notframe", r26.i0.t(gVar21, str3, str4, false));
                java.lang.String gVar22 = gVar18.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar22, "toString(...)");
                gVar20.h("softBadFrame", r26.i0.t(gVar22, str3, str4, false));
                java.lang.String gVar23 = gVar19.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar23, "toString(...)");
                gVar20.h("hardBadFrame", r26.i0.t(gVar23, str3, str4, false));
                java.lang.String gVar24 = gVar20.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar24, "toString(...)");
                nVar9.f480571h = r26.i0.t(gVar24, str3, str4, false);
            }
            qq4.c.f447524e = null;
        } else {
            str3 = ",";
            str4 = ";";
        }
        rq4.e eVar = qq4.c.f447521b;
        if (eVar != null) {
            long j47 = gq4.v.wi().f447516q;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7019x1202308a c7019x1202308a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7019x1202308a();
            java.util.HashMap hashMap5 = eVar.f480494a;
            sq4.b bVar50 = (sq4.b) hashMap5.get(eVar.f480495b);
            if (bVar50 != null) {
                bVar50.a();
            }
            sq4.b bVar51 = (sq4.b) hashMap5.get("EnterFullscreen");
            if (bVar51 != null) {
                sq4.c c57 = bVar51.c();
                c7019x1202308a.f143325e = c57.f492917a;
                c7019x1202308a.f143326f = (int) c57.f492918b;
            }
            sq4.b bVar52 = (sq4.b) hashMap5.get("EnterMiniScreen");
            if (bVar52 != null) {
                sq4.c c58 = bVar52.c();
                c7019x1202308a.f143327g = c58.f492917a;
                c7019x1202308a.f143328h = (int) c58.f492918b;
            }
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c7019x1202308a.f143324d = (int) (java.lang.System.currentTimeMillis() - j47);
            sq4.b bVar53 = (sq4.b) hashMap5.get("RotateDevice_0");
            if (bVar53 != null) {
                sq4.c c59 = bVar53.c();
                c7019x1202308a.f143329i = c59.f492917a;
                c7019x1202308a.f143333m = (int) c59.f492918b;
            }
            sq4.b bVar54 = (sq4.b) hashMap5.get("RotateDevice_90");
            if (bVar54 != null) {
                sq4.c c67 = bVar54.c();
                c7019x1202308a.f143330j = c67.f492917a;
                c7019x1202308a.f143334n = (int) c67.f492918b;
            }
            sq4.b bVar55 = (sq4.b) hashMap5.get("RotateDevice_180");
            if (bVar55 != null) {
                sq4.c c68 = bVar55.c();
                c7019x1202308a.f143331k = c68.f492917a;
                c7019x1202308a.f143335o = (int) c68.f492918b;
            }
            sq4.b bVar56 = (sq4.b) hashMap5.get("RotateDevice_270");
            if (bVar56 != null) {
                sq4.c c69 = bVar56.c();
                c7019x1202308a.f143332l = c69.f492917a;
                c7019x1202308a.f143336p = (int) c69.f492918b;
            }
            c7019x1202308a.k();
            rq4.n nVar10 = qq4.c.f447526g;
            if (nVar10 == null) {
                obj = "EnterFullscreen";
            } else {
                cl0.g gVar25 = new cl0.g();
                sq4.b bVar57 = (sq4.b) hashMap5.get("EnterFullscreen");
                obj = "EnterFullscreen";
                if (bVar57 != null) {
                    num = java.lang.Integer.valueOf(bVar57.c().f492917a);
                    nVar = nVar10;
                } else {
                    nVar = nVar10;
                    num = null;
                }
                gVar25.h("enterFull", num);
                sq4.b bVar58 = (sq4.b) hashMap5.get("EnterMiniScreen");
                gVar25.h("enterMini", bVar58 != null ? java.lang.Integer.valueOf(bVar58.c().f492917a) : null);
                sq4.b bVar59 = (sq4.b) hashMap5.get("RotateDevice_0");
                gVar25.h("rotate0", bVar59 != null ? java.lang.Integer.valueOf(bVar59.c().f492917a) : null);
                sq4.b bVar60 = (sq4.b) hashMap5.get("RotateDevice_90");
                gVar25.h("rotate90", bVar60 != null ? java.lang.Integer.valueOf(bVar60.c().f492917a) : null);
                sq4.b bVar61 = (sq4.b) hashMap5.get("RotateDevice_180");
                gVar25.h("rotate180", bVar61 != null ? java.lang.Integer.valueOf(bVar61.c().f492917a) : null);
                sq4.b bVar62 = (sq4.b) hashMap5.get("RotateDevice_270");
                gVar25.h("rotate270", bVar62 != null ? java.lang.Integer.valueOf(bVar62.c().f492917a) : null);
                java.lang.String gVar26 = gVar25.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar26, "toString(...)");
                nVar.f480578o = r26.i0.t(gVar26, str3, str4, false);
            }
            rq4.n nVar11 = qq4.c.f447526g;
            if (nVar11 == null) {
                str5 = str4;
                str6 = str3;
            } else {
                cl0.g gVar27 = new cl0.g();
                sq4.b bVar63 = (sq4.b) hashMap5.get(obj);
                if (bVar63 != null) {
                    str8 = str3;
                    str9 = str4;
                    l17 = java.lang.Long.valueOf(bVar63.c().f492918b);
                } else {
                    str8 = str3;
                    str9 = str4;
                    l17 = null;
                }
                gVar27.h("full", l17);
                sq4.b bVar64 = (sq4.b) hashMap5.get("EnterMiniScreen");
                gVar27.h("mini", bVar64 != null ? java.lang.Long.valueOf(bVar64.c().f492918b) : null);
                sq4.b bVar65 = (sq4.b) hashMap5.get("RotateDevice_0");
                gVar27.h("rotate0", bVar65 != null ? java.lang.Long.valueOf(bVar65.c().f492918b) : null);
                sq4.b bVar66 = (sq4.b) hashMap5.get("RotateDevice_90");
                gVar27.h("rotate90", bVar66 != null ? java.lang.Long.valueOf(bVar66.c().f492918b) : null);
                sq4.b bVar67 = (sq4.b) hashMap5.get("RotateDevice_180");
                gVar27.h("rotate180", bVar67 != null ? java.lang.Long.valueOf(bVar67.c().f492918b) : null);
                sq4.b bVar68 = (sq4.b) hashMap5.get("RotateDevice_270");
                gVar27.h("rotate270", bVar68 != null ? java.lang.Long.valueOf(bVar68.c().f492918b) : null);
                java.lang.String gVar28 = gVar27.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar28, "toString(...)");
                str6 = str8;
                str5 = str9;
                nVar11.f480579p = r26.i0.t(gVar28, str6, str5, false);
            }
            hashMap5.clear();
            qq4.c.f447521b = null;
        } else {
            str5 = str4;
            str6 = str3;
        }
        rq4.l lVar = qq4.c.f447522c;
        if (lVar != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7022xcdd22ab9 c7022xcdd22ab9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7022xcdd22ab9();
            c7022xcdd22ab9.f143386f = c7022xcdd22ab9.b(str, "1", true);
            c7022xcdd22ab9.f143385e = 1L;
            boolean z28 = lVar.f480547a;
            c7022xcdd22ab9.f143384d = z28 ? 1L : 0L;
            c7022xcdd22ab9.f143387g = lVar.f480548b ? 1L : 0L;
            c7022xcdd22ab9.k();
            rq4.n nVar12 = qq4.c.f447526g;
            if (nVar12 != null) {
                cl0.g gVar29 = new cl0.g();
                gVar29.r("faceBeauty", z28);
                gVar29.r("cameraSdk", z28);
                java.lang.String gVar30 = gVar29.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar30, "toString(...)");
                nVar12.f480572i = r26.i0.t(gVar30, str6, str5, false);
            }
            qq4.c.f447522c = null;
        }
        rq4.j jVar2 = qq4.c.f447523d;
        if (jVar2 != null) {
            jVar2.a();
            rq4.n nVar13 = qq4.c.f447526g;
            if (nVar13 == null) {
                str7 = str2;
            } else {
                cl0.g gVar31 = new cl0.g();
                str7 = str2;
                gVar31.o(str7, java.lang.Math.max(100 - (jVar2.f480523c.size() * 20), 0));
                java.lang.String gVar32 = gVar31.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar32, "toString(...)");
                nVar13.f480580q = r26.i0.t(gVar32, str6, str5, false);
            }
            rq4.n nVar14 = qq4.c.f447526g;
            if (nVar14 != null) {
                cl0.g gVar33 = new cl0.g();
                java.util.HashMap hashMap6 = jVar2.f480522b;
                sq4.b bVar69 = (sq4.b) hashMap6.get("DecodeChangeHard");
                gVar33.h("decodeHard", bVar69 != null ? java.lang.Integer.valueOf(bVar69.c().f492917a) : null);
                sq4.b bVar70 = (sq4.b) hashMap6.get("DecodeChangeSoft");
                gVar33.h("decodeSoft", bVar70 != null ? java.lang.Integer.valueOf(bVar70.c().f492917a) : null);
                java.lang.String gVar34 = gVar33.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar34, "toString(...)");
                nVar14.f480581r = r26.i0.t(gVar34, str6, str5, false);
            }
            rq4.n nVar15 = qq4.c.f447526g;
            if (nVar15 != null) {
                nVar15.f480582s = jVar2.i();
            }
            rq4.n nVar16 = qq4.c.f447526g;
            if (nVar16 != null) {
                nVar16.f480583t = jVar2.c();
            }
            rq4.n nVar17 = qq4.c.f447526g;
            if (nVar17 != null) {
                nVar17.f480584u = jVar2.f();
            }
            rq4.n nVar18 = qq4.c.f447526g;
            if (nVar18 != null) {
                nVar18.f480585v = jVar2.d();
            }
            rq4.n nVar19 = qq4.c.f447526g;
            if (nVar19 != null) {
                nVar19.f480586w = jVar2.g();
            }
            rq4.n nVar20 = qq4.c.f447526g;
            if (nVar20 != null) {
                nVar20.f480587x = jVar2.b();
            }
            rq4.n nVar21 = qq4.c.f447526g;
            if (nVar21 != null) {
                nVar21.f480588y = jVar2.e();
            }
            rq4.n nVar22 = qq4.c.f447526g;
            if (nVar22 != null) {
                nVar22.f480589z = jVar2.h();
            }
            qq4.c.f447523d = null;
        } else {
            str7 = str2;
        }
        rq4.i iVar = qq4.c.f447525f;
        if (iVar != null) {
            iVar.a();
            rq4.n nVar23 = qq4.c.f447526g;
            if (nVar23 != null) {
                cl0.g gVar35 = new cl0.g();
                gVar35.o(str7, java.lang.Math.max(100 - (iVar.f480503d.size() * 20), 0));
                java.lang.String gVar36 = gVar35.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar36, "toString(...)");
                nVar23.f480573j = r26.i0.t(gVar36, str6, str5, false);
            }
            rq4.n nVar24 = qq4.c.f447526g;
            if (nVar24 != null) {
                cl0.g gVar37 = new cl0.g();
                int[] iArr = iVar.f480507h;
                gVar37.o("localMax", java.lang.Math.max(kz5.z.K(iArr), kz5.z.e0(iArr)));
                gVar37.o("localMin", java.lang.Integer.min(kz5.z.K(iArr), kz5.z.e0(iArr)));
                gVar37.o("localAvg", iVar.f480508i);
                int[] iArr2 = iVar.f480510k;
                gVar37.o("remoteMax", java.lang.Math.max(kz5.z.K(iArr2), kz5.z.e0(iArr2)));
                gVar37.o("remoteMin", java.lang.Integer.min(kz5.z.K(iArr2), kz5.z.e0(iArr2)));
                gVar37.o("remoteAvg", iVar.f480511l);
                int[] iArr3 = iVar.f480500a;
                gVar37.o("encodeMax", java.lang.Math.max(kz5.z.K(iArr3), kz5.z.e0(iArr3)));
                gVar37.o("encodeMin", java.lang.Integer.min(kz5.z.K(iArr3), kz5.z.e0(iArr3)));
                gVar37.o("encodeAvg", iVar.f480501b);
                java.lang.String gVar38 = gVar37.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar38, "toString(...)");
                nVar24.f480574k = r26.i0.t(gVar38, str6, str5, false);
            }
            rq4.n nVar25 = qq4.c.f447526g;
            if (nVar25 != null) {
                nVar25.f480575l = iVar.d();
            }
            rq4.n nVar26 = qq4.c.f447526g;
            if (nVar26 != null) {
                nVar26.f480576m = iVar.c();
            }
            rq4.n nVar27 = qq4.c.f447526g;
            if (nVar27 != null) {
                nVar27.f480577n = iVar.b();
            }
            j19 = 0;
            iVar.f480513n = 0L;
            iVar.f480514o = 0L;
            iVar.f480515p = 0L;
            qq4.c.f447525f = null;
        } else {
            j19 = 0;
        }
        long j48 = gq4.v.wi().f447516q;
        if (j48 != j19) {
            boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            j27 = java.lang.System.currentTimeMillis() - j48;
        } else {
            j27 = 0;
        }
        rq4.n nVar28 = qq4.c.f447526g;
        if (nVar28 != null) {
            nVar28.a(j27, j18);
        }
        qq4.a.f447499a.clear();
        if (vq4.b0.f520813k) {
            p1Var2 = p1Var;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = p1Var2.B;
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "render thread is " + ((java.lang.String) entry.getKey()));
                ((pq4.c) entry.getValue()).d();
            }
            p1Var2.C = 0L;
            concurrentHashMap.clear();
        } else {
            p1Var2 = p1Var;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = gq4.v.wi().f447511l;
            java.util.Iterator it = concurrentHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                ((pq4.c) ((java.util.Map.Entry) it.next()).getValue()).d();
            }
            concurrentHashMap2.clear();
        }
        p1Var2.f324249o.d();
        new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18928x8aba1cc4(2).e();
        return jz5.f0.f384359a;
    }
}
