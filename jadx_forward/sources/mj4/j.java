package mj4;

/* loaded from: classes11.dex */
public final class j implements mj4.i {

    /* renamed from: a, reason: collision with root package name */
    public final mj4.h f408598a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f408599b;

    public j(mj4.h originalItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalItem, "originalItem");
        this.f408598a = originalItem;
        this.f408599b = new java.util.HashMap();
    }

    public mj4.h a() {
        mj4.a aVar = new mj4.a();
        mj4.k kVar = (mj4.k) this.f408598a;
        aVar.f76535x11b86abb = kVar.o();
        aVar.f76532x70371252 = kVar.l();
        aVar.f76533x93e38c45 = kVar.m();
        mj4.a aVar2 = kVar.f408600b;
        java.lang.String str = aVar2.f76531x89b4443b;
        if (str == null) {
            str = "";
        }
        aVar.f76531x89b4443b = str;
        aVar.f76534x2931c158 = kVar.n();
        byte[] bArr = aVar2.f76510x62f74400;
        if (bArr == null) {
            bArr = new byte[0];
        }
        aVar.f76510x62f74400 = bArr;
        aVar.f76517xc80c2659 = kVar.h();
        aVar.f76513x685e8417 = kVar.g();
        aVar.f76525x91a52c19 = aVar2.f76525x91a52c19;
        aVar.f76526xebec90b0 = kVar.j();
        java.lang.String str2 = aVar2.f76522x99b42c2f;
        if (str2 == null) {
            str2 = "";
        }
        aVar.f76522x99b42c2f = str2;
        aVar.f76524x2a6c5918 = kVar.i();
        java.lang.String str3 = aVar2.f76523xb1eeaac7;
        if (str3 == null) {
            str3 = "";
        }
        aVar.f76523xb1eeaac7 = str3;
        java.lang.String str4 = aVar2.f76527x27e44140;
        if (str4 == null) {
            str4 = "";
        }
        aVar.f76527x27e44140 = str4;
        aVar.f76528xbfdbb190 = kVar.k();
        aVar.f76521x1a40548a = aVar2.f76521x1a40548a;
        aVar.f76518xcbc91a31 = aVar2.f76518xcbc91a31;
        aVar.f76536xa3af7397 = aVar2.f76536xa3af7397;
        aVar.f76512x81959a6e = aVar2.f76512x81959a6e;
        aVar.f76515xfe382d11 = aVar2.f76515xfe382d11;
        aVar.f76519x6c32293 = aVar2.f76519x6c32293;
        aVar.f76549x29d3a50c = aVar2.f76549x29d3a50c;
        aVar.f76537xf8037a0e = kVar.p();
        aVar.f76543x99db75a = java.lang.Long.valueOf(kVar.q());
        aVar.f76542x2c5150a7 = aVar2.f76542x2c5150a7;
        aVar.f76541x4409ca66 = aVar2.f76541x4409ca66;
        java.lang.String str5 = aVar2.f76551xcce9dcc5;
        if (str5 == null) {
            str5 = "";
        }
        aVar.f76551xcce9dcc5 = str5;
        java.lang.String str6 = aVar2.f76547xaf1b255c;
        if (str6 == null) {
            str6 = "";
        }
        aVar.f76547xaf1b255c = str6;
        java.lang.String str7 = aVar2.f76546xb6e65660;
        if (str7 == null) {
            str7 = "";
        }
        aVar.f76546xb6e65660 = str7;
        aVar.f76545x3d307269 = aVar2.f76545x3d307269;
        aVar.f76548x1b220e1 = aVar2.f76548x1b220e1;
        java.lang.String str8 = aVar2.f76540x45d6731c;
        if (str8 == null) {
            str8 = "";
        }
        aVar.f76540x45d6731c = str8;
        java.lang.String str9 = aVar2.f76539xbfc4c420;
        aVar.f76539xbfc4c420 = str9 != null ? str9 : "";
        byte[] bArr2 = aVar2.f76514x769010ef;
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        aVar.f76514x769010ef = bArr2;
        aVar.f76550x1164c0dd = kVar.r();
        aVar.f76509x338ecf90 = kVar.c();
        aVar.f76520x6e4d16c5 = aVar2.f76520x6e4d16c5;
        aVar.f76544x776e225b = aVar2.f76544x776e225b;
        aVar.f76511x43d69935 = aVar2.f76511x43d69935;
        aVar.f76508x224bb1b0 = kVar.f();
        aVar.f76538x3d0facbe = aVar2.f76538x3d0facbe;
        aVar.f76516x276d4d8f = aVar2.f76516x276d4d8f;
        byte[] bArr3 = aVar2.f76529x44a884ec;
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        aVar.f76529x44a884ec = bArr3;
        byte[] bArr4 = aVar2.f76530xa1783f3c;
        if (bArr4 == null) {
            bArr4 = new byte[0];
        }
        aVar.f76530xa1783f3c = bArr4;
        aVar.f72763xa3c65b86 = aVar2.f72763xa3c65b86;
        aVar.f408588o2 = kVar.y();
        for (java.util.Map.Entry entry : this.f408599b.entrySet()) {
            java.lang.String str10 = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            switch (str10.hashCode()) {
                case -2120902034:
                    if (str10.equals("field_CreateTime")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76512x81959a6e = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case -1984674757:
                    if (str10.equals("field_SourceID")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76531x89b4443b = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1923285950:
                    if (str10.equals("isOnLocal")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Boolean");
                        aVar.f408588o2 = ((java.lang.Boolean) value).booleanValue();
                        break;
                    } else {
                        break;
                    }
                case -1851446247:
                    if (str10.equals("field_MediaType")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76525x91a52c19 = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case -1813803963:
                    if (str10.equals("field_TopicId")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76533x93e38c45 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1716245457:
                    if (str10.equals("field_MediaAESKey")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76522x99b42c2f = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1585955012:
                    if (str10.equals("field_PublicInfo")) {
                        aVar.f76530xa1783f3c = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case -1548782697:
                    if (str10.equals("field_Visibility")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76536xa3af7397 = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case -1547281530:
                    if (str10.equals("systemRowid")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Long");
                        aVar.f72763xa3c65b86 = ((java.lang.Long) value).longValue();
                        break;
                    } else {
                        break;
                    }
                case -1357175460:
                    if (str10.equals("field_referenceUserName")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76547xaf1b255c = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1309758777:
                    if (str10.equals("field_MediaThumbAESKey")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76523xb1eeaac7 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1226418592:
                    if (str10.equals("field_referenceTextStatusId")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76546xb6e65660 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1077623776:
                    if (str10.equals("field_duplicateTextStatusId")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76539xbfc4c420 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1076121200:
                    if (str10.equals("field_PoiName")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76528xbfdbb190 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -938727847:
                    if (str10.equals("field_IconID")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76517xc80c2659 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -876013007:
                    if (str10.equals("field_Latitude")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Double");
                        aVar.f76518xcbc91a31 = ((java.lang.Double) value).doubleValue();
                        break;
                    } else {
                        break;
                    }
                case -857088827:
                    if (str10.equals("field_visibilityInfo")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76551xcce9dcc5 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -336818000:
                    if (str10.equals("field_MediaUrl")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76526xebec90b0 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -133989874:
                    if (str10.equals("field_backgroundId")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76537xf8037a0e = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -29872879:
                    if (str10.equals("field_ExpireTime")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76515xfe382d11 = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 28451041:
                    if (str10.equals("field_sceneType")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76548x1b220e1 = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 113451667:
                    if (str10.equals("field_LikeCount")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76519x6c32293 = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 161331034:
                    if (str10.equals("field_option")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Long");
                        aVar.f76543x99db75a = (java.lang.Long) value;
                        break;
                    } else {
                        break;
                    }
                case 291815645:
                    if (str10.equals("field_statusExtInfoOriBytes")) {
                        aVar.f76550x1164c0dd = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case 297298619:
                    if (str10.equals("field_UserName")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76535x11b86abb = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 440423562:
                    if (str10.equals("field_Longitude")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Double");
                        aVar.f76521x1a40548a = ((java.lang.Double) value).doubleValue();
                        break;
                    } else {
                        break;
                    }
                case 575386032:
                    if (str10.equals("field_City")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76508x224bb1b0 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 661474703:
                    if (str10.equals("field_HasHb")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76516x276d4d8f = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 669270336:
                    if (str10.equals("field_PoiID")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76527x27e44140 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 691126616:
                    if (str10.equals("field_TopicInfo")) {
                        aVar.f76534x2931c158 = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case 701736204:
                    if (str10.equals("field_state")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76549x29d3a50c = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 711743768:
                    if (str10.equals("field_MediaThumbUrl")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76524x2a6c5918 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 743526567:
                    if (str10.equals("field_mediaWidth")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76542x2c5150a7 = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 864997264:
                    if (str10.equals("field_ClusterId")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76509x338ecf90 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 1024437438:
                    if (str10.equals("field_contentScore")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Float");
                        aVar.f76538x3d0facbe = ((java.lang.Float) value).floatValue();
                        break;
                    } else {
                        break;
                    }
                case 1026585193:
                    if (str10.equals("field_referenceCount")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76545x3d307269 = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 1138137397:
                    if (str10.equals("field_CommentCount")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76511x43d69935 = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 1141492326:
                    if (str10.equals("field_mediaHeight")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76541x4409ca66 = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 1151894764:
                    if (str10.equals("field_PrivateInfo")) {
                        aVar.f76529x44a884ec = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case 1171682076:
                    if (str10.equals("field_duplicateUserName")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76540x45d6731c = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 1660371968:
                    if (str10.equals("field_ClusterShowInfo")) {
                        aVar.f76510x62f74400 = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case 1751024663:
                    if (str10.equals("field_Description")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76513x685e8417 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 1850545861:
                    if (str10.equals("field_LikeCountVersion")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.f76520x6e4d16c5 = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 1882657362:
                    if (str10.equals("field_StatusID")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.f76532x70371252 = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 1989153007:
                    if (str10.equals("field_EmojiInfo")) {
                        aVar.f76514x769010ef = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case 2003706459:
                    if (str10.equals("field_profileSeq")) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Long");
                        aVar.f76544x776e225b = ((java.lang.Long) value).longValue();
                        break;
                    } else {
                        break;
                    }
            }
        }
        return new mj4.k(aVar);
    }

    public mj4.i b(int i17) {
        this.f408599b.put("field_LikeCount", java.lang.Integer.valueOf(i17));
        return this;
    }

    public mj4.i c(boolean z17) {
        this.f408599b.put("isOnLocal", java.lang.Boolean.valueOf(z17));
        return this;
    }

    public mj4.i d(byte[] bArr) {
        this.f408599b.put("field_PrivateInfo", bArr);
        return this;
    }

    public mj4.i e(byte[] bArr) {
        this.f408599b.put("field_PublicInfo", bArr);
        return this;
    }

    public mj4.i f(int i17) {
        this.f408599b.put("field_state", java.lang.Integer.valueOf(i17));
        return this;
    }

    public mj4.i g(java.lang.String statusID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusID, "statusID");
        this.f408599b.put("field_StatusID", statusID);
        return this;
    }

    public mj4.i h(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f408599b.put("field_UserName", userName);
        return this;
    }
}
