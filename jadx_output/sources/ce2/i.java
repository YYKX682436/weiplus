package ce2;

/* loaded from: classes3.dex */
public final class i extends dm.o4 {
    public static final ce2.g U1 = new ce2.g(null);
    public static final l75.e0 V1 = dm.o4.initAutoDBInfo(dm.o4.class);

    public final java.lang.String A0() {
        java.lang.String str;
        r45.pa0 pa0Var;
        r45.na0 D0 = D0();
        if (D0 == null || (pa0Var = (r45.pa0) D0.getCustom(1)) == null) {
            str = null;
        } else if (!pa0Var.getBoolean(0) || !pa0Var.getBoolean(4) || (str = pa0Var.getString(3)) == null) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public final r45.na0 D0() {
        if (U0()) {
            return this.field_customGiftInfo;
        }
        return null;
    }

    public final r45.oa0 F0(java.lang.String resourceKey) {
        r45.na0 D0;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(resourceKey, "resourceKey");
        com.tencent.mars.xlog.Log.i("FinderLiveGiftInfo", "getCustomGiftResource resourceKey:".concat(resourceKey));
        java.lang.Object obj = null;
        if ((resourceKey.length() == 0) || (D0 = D0()) == null || (list = D0.getList(2)) == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.o.b(((r45.oa0) next).getString(0), resourceKey)) {
                obj = next;
                break;
            }
        }
        return (r45.oa0) obj;
    }

    public final java.lang.String G0() {
        r45.na0 D0 = D0();
        if (D0 == null) {
            return "";
        }
        r45.pa0 pa0Var = (r45.pa0) D0.getCustom(1);
        if (pa0Var == null || !pa0Var.getBoolean(0) || !pa0Var.getBoolean(4)) {
            return "";
        }
        java.lang.String string = pa0Var.getString(5);
        if (string != null) {
            if (!(string.length() > 0)) {
                string = null;
            }
            if (string != null) {
                return string;
            }
        }
        java.lang.String string2 = pa0Var.getString(3);
        return string2 == null ? "" : string2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String I0() {
        /*
            r4 = this;
            r45.rv1 r0 = new r45.rv1
            r0.<init>()
            byte[] r1 = r4.field_customInfo
            java.lang.String r2 = ""
            r3 = 0
            if (r1 != 0) goto Le
        Lc:
            r0 = r3
            goto L1d
        Le:
            r0.parseFrom(r1)     // Catch: java.lang.Exception -> L12
            goto L1d
        L12:
            r0 = move-exception
            java.lang.String r1 = "safeParser"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.mm.sdk.platformtools.Log.a(r1, r2, r0)
            goto Lc
        L1d:
            if (r0 == 0) goto L24
            r1 = 2
            java.lang.String r3 = r0.getString(r1)
        L24:
            if (r3 != 0) goto L27
            goto L28
        L27:
            r2 = r3
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ce2.i.I0():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String J0() {
        /*
            r7 = this;
            dk2.ef r0 = dk2.ef.f233372a
            boolean r0 = dk2.ef.f233404s
            r1 = 4
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L69
            boolean r0 = r7.U0()
            if (r0 == 0) goto L69
            java.lang.String r0 = r7.y0()
            r45.oa0 r0 = r7.F0(r0)
            r5 = 6
            java.lang.String r6 = ""
            if (r0 == 0) goto L53
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.getString(r4)
            if (r0 == 0) goto L3d
            int r1 = r0.length()
            if (r1 <= 0) goto L32
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L36
            goto L37
        L36:
            r0 = r2
        L37:
            if (r0 != 0) goto L3a
            goto L3d
        L3a:
            r6 = r0
            goto Lc5
        L3d:
            r45.na0 r0 = r7.D0()
            if (r0 == 0) goto L4f
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r5)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto L4f
            java.lang.String r2 = r0.getString(r4)
        L4f:
            if (r2 != 0) goto Lc4
            goto Lc5
        L53:
            r45.na0 r0 = r7.D0()
            if (r0 == 0) goto Lc5
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r5)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto Lc5
            java.lang.String r0 = r0.getString(r4)
            if (r0 != 0) goto L3a
            goto Lc5
        L69:
            r45.yi6 r0 = r7.Q0()
            if (r0 == 0) goto La3
            r5 = 17
            com.tencent.mm.protobuf.f r5 = r0.getCustom(r5)
            r45.gs5 r5 = (r45.gs5) r5
            if (r5 == 0) goto La3
            java.lang.String r5 = r5.getString(r4)
            if (r5 == 0) goto La3
            r45.xi6 r6 = r7.field_switchSkinInfo
            if (r6 == 0) goto L8b
            boolean r1 = r6.getBoolean(r1)
            if (r1 != r3) goto L8b
            r1 = r3
            goto L8c
        L8b:
            r1 = r4
        L8c:
            if (r1 == 0) goto L9b
            int r1 = r5.length()
            if (r1 <= 0) goto L96
            r1 = r3
            goto L97
        L96:
            r1 = r4
        L97:
            if (r1 == 0) goto L9b
            r1 = r3
            goto L9c
        L9b:
            r1 = r4
        L9c:
            if (r1 == 0) goto La0
            r6 = r5
            goto La1
        La0:
            r6 = r2
        La1:
            if (r6 != 0) goto Lc5
        La3:
            if (r0 == 0) goto Lbf
            r1 = 2
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto Lbf
            java.lang.String r0 = r0.getString(r4)
            if (r0 == 0) goto Lbf
            int r1 = r0.length()
            if (r1 <= 0) goto Lbb
            goto Lbc
        Lbb:
            r3 = r4
        Lbc:
            if (r3 == 0) goto Lbf
            r2 = r0
        Lbf:
            if (r2 != 0) goto Lc4
            java.lang.String r6 = r7.field_landscapePagUrl
            goto Lc5
        Lc4:
            r6 = r2
        Lc5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ce2.i.J0():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009a, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String L0() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce2.i.L0():java.lang.String");
    }

    public final float P0() {
        dk2.ef efVar = dk2.ef.f233372a;
        if (dk2.ef.f233404s && U0()) {
            r45.na0 D0 = D0();
            if (D0 != null) {
                return U1.a("", D0.getList(0), (r45.pa0) D0.getCustom(1)) + this.field_price;
            }
            com.tencent.mars.xlog.Log.w("FinderLiveGiftInfo", "getCustomGiftPrice but customGiftInfo is null!");
            return this.field_price;
        }
        r45.yi6 Q0 = Q0();
        if (Q0 != null) {
            java.lang.Float valueOf = java.lang.Float.valueOf(Q0.getFloat(5));
            float floatValue = valueOf.floatValue();
            r45.xi6 xi6Var = this.field_switchSkinInfo;
            if (!((xi6Var != null && xi6Var.getBoolean(4)) && floatValue > this.field_price)) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.floatValue();
            }
        }
        return this.field_price;
    }

    public final r45.yi6 Q0() {
        r45.xi6 xi6Var;
        java.lang.Object obj = null;
        if (!a1() || (xi6Var = this.field_switchSkinInfo) == null) {
            return null;
        }
        java.lang.String string = xi6Var.getString(2);
        if (string == null) {
            string = xi6Var.getString(1);
        }
        java.util.LinkedList list = xi6Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getSwitch_skin_info_list(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.o.b(((r45.yi6) next).getString(0), string)) {
                obj = next;
                break;
            }
        }
        return (r45.yi6) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String R0() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce2.i.R0():java.lang.String");
    }

    public final boolean T0() {
        return pm0.v.z(this.field_flag, 262144);
    }

    public final boolean U0() {
        return pm0.v.z(this.field_flag, 2048);
    }

    public final boolean W0() {
        return pm0.v.z(this.field_flag, 1);
    }

    public final boolean Y0() {
        return pm0.v.z(this.field_flag, 4096);
    }

    public final boolean Z0() {
        return pm0.v.z(this.field_flag, 512);
    }

    public final boolean a1() {
        return pm0.v.z(this.field_flag, 1024);
    }

    public final r45.kv1 c1() {
        r45.kv1 kv1Var = new r45.kv1();
        kv1Var.set(0, this.field_rewardProductId);
        kv1Var.set(1, java.lang.Integer.valueOf(this.field_businessType));
        kv1Var.set(2, this.field_thumbnailFileUrl);
        kv1Var.set(3, this.field_previewPagUrl);
        kv1Var.set(4, this.field_animationPagUrl);
        kv1Var.set(5, this.field_thumbnailMd5);
        kv1Var.set(6, this.field_previewPagMd5);
        kv1Var.set(7, this.field_animationPagMd5);
        kv1Var.set(10, java.lang.Integer.valueOf(this.field_giftType));
        kv1Var.set(8, this.field_name);
        kv1Var.set(9, java.lang.Float.valueOf(this.field_price));
        kv1Var.set(12, java.lang.Integer.valueOf(this.field_flag));
        kv1Var.set(11, java.lang.Integer.valueOf(this.field_unlockIntimacyLevel));
        kv1Var.set(13, this.field_landscapePagUrl);
        kv1Var.set(14, this.field_landscapePagMd5);
        byte[] bArr = this.field_customInfo;
        kv1Var.set(15, bArr != null ? pm0.b0.h(bArr) : null);
        kv1Var.set(16, java.lang.Integer.valueOf(this.field_globalUnlockLevel));
        kv1Var.set(17, this.field_tagColor);
        kv1Var.set(18, this.field_tagText);
        kv1Var.set(23, this.field_batchConfigLive);
        kv1Var.set(24, this.field_description);
        kv1Var.set(25, this.field_jumpInfo);
        kv1Var.set(26, java.lang.Boolean.valueOf(this.field_needUnlock == 1));
        kv1Var.set(27, java.lang.Boolean.valueOf(this.field_disableCombo));
        java.util.LinkedList list = kv1Var.getList(28);
        r45.zq4 zq4Var = this.field_multiAnimationList;
        java.util.List list2 = zq4Var != null ? zq4Var.getList(0) : null;
        if (list2 == null) {
            list2 = kz5.p0.f313996d;
        }
        list.addAll(list2);
        kv1Var.set(29, this.field_switchSkinInfo);
        kv1Var.set(30, this.field_customGiftInfo);
        kv1Var.set(31, java.lang.Integer.valueOf(this.field_freeGiftSeq));
        kv1Var.set(32, this.field_foregroundInfo);
        kv1Var.set(33, java.lang.Boolean.valueOf(this.field_use_rfx_pag));
        kv1Var.set(34, this.field_audienceAiCustomGiftInfo);
        kv1Var.set(35, this.field_designerInfo);
        return kv1Var;
    }

    @Override // dm.o4, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = V1;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public final java.lang.String t0() {
        java.util.LinkedList<r45.ma0> list;
        java.lang.Object obj;
        r45.na0 D0 = D0();
        if (D0 != null && (list = D0.getList(0)) != null) {
            for (r45.ma0 ma0Var : list) {
                boolean z17 = true;
                java.util.LinkedList list2 = ma0Var.getList(1);
                kotlin.jvm.internal.o.f(list2, "getComponent_value_list(...)");
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.f70) obj).getString(0), ma0Var.getString(2))) {
                        break;
                    }
                }
                r45.f70 f70Var = (r45.f70) obj;
                if (f70Var == null || !f70Var.getBoolean(3)) {
                    z17 = false;
                }
                if (z17) {
                    return ma0Var.getString(0);
                }
            }
        }
        return null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id: ");
        sb6.append(this.field_rewardProductId);
        sb6.append(", name:");
        sb6.append(this.field_name);
        sb6.append(", giftIndex:");
        sb6.append(this.field_giftIndex);
        sb6.append(", flag:");
        sb6.append(this.field_flag);
        sb6.append(",url: ");
        sb6.append(this.field_thumbnailFileUrl);
        sb6.append(", isFansGift: ");
        sb6.append(W0());
        sb6.append(", previewUrl:");
        sb6.append(this.field_previewPagUrl);
        sb6.append(", animationUrl:");
        sb6.append(this.field_animationPagUrl);
        sb6.append(", landUrl:");
        sb6.append(this.field_landscapePagUrl);
        sb6.append(", isSwitchSkinGift:");
        sb6.append(a1());
        sb6.append(", hasCustomText:");
        r45.xi6 xi6Var = this.field_switchSkinInfo;
        sb6.append(xi6Var != null ? java.lang.Boolean.valueOf(xi6Var.getBoolean(4)) : null);
        sb6.append(", skinColor:");
        r45.yi6 Q0 = Q0();
        sb6.append(Q0 != null ? Q0.getString(6) : null);
        sb6.append(",customGiftInfo.key:");
        r45.na0 na0Var = this.field_customGiftInfo;
        sb6.append(na0Var != null ? na0Var.getString(7) : null);
        return sb6.toString();
    }

    public final java.util.Map u0() {
        java.util.HashMap hashMap;
        r45.pa0 pa0Var;
        java.util.LinkedList<r45.ma0> list;
        java.lang.Object obj;
        r45.na0 D0 = D0();
        java.lang.String str = "";
        if (D0 == null || (list = D0.getList(0)) == null) {
            hashMap = null;
        } else {
            hashMap = null;
            for (r45.ma0 ma0Var : list) {
                java.util.LinkedList list2 = ma0Var.getList(1);
                kotlin.jvm.internal.o.f(list2, "getComponent_value_list(...)");
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.f70) obj).getString(0), ma0Var.getString(2))) {
                        break;
                    }
                }
                r45.f70 f70Var = (r45.f70) obj;
                if (f70Var != null && f70Var.getBoolean(5)) {
                    com.tencent.mars.xlog.Log.w("FinderLiveGiftInfo", "generateCustomGiftPlayParams but " + ma0Var.getString(0) + " with select key:" + ma0Var.getString(2) + " use pag!");
                    return null;
                }
                if (hashMap == null) {
                    hashMap = new java.util.HashMap();
                }
                java.lang.String string = ma0Var.getString(4);
                if (!(string == null || string.length() == 0)) {
                    java.lang.String string2 = ma0Var.getString(4);
                    if (string2 == null) {
                        string2 = "";
                    }
                    java.lang.String string3 = ma0Var.getString(2);
                    if (string3 == null) {
                        string3 = "";
                    }
                }
            }
        }
        r45.na0 na0Var = this.field_customGiftInfo;
        if (na0Var != null && (pa0Var = (r45.pa0) na0Var.getCustom(1)) != null) {
            if (hashMap == null) {
                hashMap = new java.util.HashMap();
            }
            if (pa0Var.getBoolean(0)) {
                java.lang.String string4 = pa0Var.getString(7);
                if (!(string4 == null || string4.length() == 0)) {
                    if (pa0Var.getBoolean(4)) {
                        java.lang.String string5 = pa0Var.getString(7);
                        if (string5 == null) {
                            string5 = "";
                        }
                        java.lang.String string6 = pa0Var.getString(5);
                        if (string6 != null) {
                            java.lang.String str2 = string6.length() > 0 ? string6 : null;
                            if (str2 != null) {
                                str = str2;
                            }
                        }
                        java.lang.String string7 = pa0Var.getString(3);
                        if (string7 != null) {
                            str = string7;
                        }
                    } else {
                        java.lang.String string8 = pa0Var.getString(7);
                        if (string8 == null) {
                            string8 = "";
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public final r45.mb v0() {
        if (T0()) {
            return this.field_audienceAiCustomGiftInfo;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String w0() {
        /*
            r7 = this;
            dk2.ef r0 = dk2.ef.f233372a
            boolean r0 = dk2.ef.f233404s
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L69
            boolean r0 = r7.U0()
            if (r0 == 0) goto L69
            java.lang.String r0 = r7.y0()
            r45.oa0 r0 = r7.F0(r0)
            r4 = 5
            java.lang.String r5 = ""
            if (r0 == 0) goto L53
            r6 = 3
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r6)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.getString(r3)
            if (r0 == 0) goto L3d
            int r6 = r0.length()
            if (r6 <= 0) goto L32
            goto L33
        L32:
            r2 = r3
        L33:
            if (r2 == 0) goto L36
            goto L37
        L36:
            r0 = r1
        L37:
            if (r0 != 0) goto L3a
            goto L3d
        L3a:
            r5 = r0
            goto Lc5
        L3d:
            r45.na0 r0 = r7.D0()
            if (r0 == 0) goto L4f
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r4)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto L4f
            java.lang.String r1 = r0.getString(r3)
        L4f:
            if (r1 != 0) goto Lc4
            goto Lc5
        L53:
            r45.na0 r0 = r7.D0()
            if (r0 == 0) goto Lc5
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r4)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto Lc5
            java.lang.String r0 = r0.getString(r3)
            if (r0 != 0) goto L3a
            goto Lc5
        L69:
            r45.yi6 r0 = r7.Q0()
            if (r0 == 0) goto La4
            r4 = 16
            com.tencent.mm.protobuf.f r4 = r0.getCustom(r4)
            r45.gs5 r4 = (r45.gs5) r4
            if (r4 == 0) goto La4
            java.lang.String r4 = r4.getString(r3)
            if (r4 == 0) goto La4
            r45.xi6 r5 = r7.field_switchSkinInfo
            if (r5 == 0) goto L8c
            r6 = 4
            boolean r5 = r5.getBoolean(r6)
            if (r5 != r2) goto L8c
            r5 = r2
            goto L8d
        L8c:
            r5 = r3
        L8d:
            if (r5 == 0) goto L9c
            int r5 = r4.length()
            if (r5 <= 0) goto L97
            r5 = r2
            goto L98
        L97:
            r5 = r3
        L98:
            if (r5 == 0) goto L9c
            r5 = r2
            goto L9d
        L9c:
            r5 = r3
        L9d:
            if (r5 == 0) goto La1
            r5 = r4
            goto La2
        La1:
            r5 = r1
        La2:
            if (r5 != 0) goto Lc5
        La4:
            if (r0 == 0) goto Lbf
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r2)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto Lbf
            java.lang.String r0 = r0.getString(r3)
            if (r0 == 0) goto Lbf
            int r4 = r0.length()
            if (r4 <= 0) goto Lbb
            goto Lbc
        Lbb:
            r2 = r3
        Lbc:
            if (r2 == 0) goto Lbf
            r1 = r0
        Lbf:
            if (r1 != 0) goto Lc4
            java.lang.String r5 = r7.field_animationPagUrl
            goto Lc5
        Lc4:
            r5 = r1
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ce2.i.w0():java.lang.String");
    }

    public final java.lang.String y0() {
        java.util.LinkedList<r45.ma0> linkedList;
        java.lang.StringBuilder sb6;
        java.lang.String str;
        r45.na0 D0 = D0();
        if (D0 != null) {
            linkedList = new java.util.LinkedList(D0.getList(0));
            kz5.g0.t(linkedList, ce2.h.f40782d);
        } else {
            linkedList = null;
        }
        if (linkedList != null) {
            sb6 = null;
            for (r45.ma0 ma0Var : linkedList) {
                if (sb6 == null) {
                    r45.na0 D02 = D0();
                    if (D02 == null || (str = D02.getString(7)) == null) {
                        str = "";
                    }
                    sb6 = new java.lang.StringBuilder(str);
                }
                sb6.append("_" + ma0Var.getString(2));
            }
        } else {
            sb6 = null;
        }
        java.lang.String sb7 = sb6 != null ? sb6.toString() : null;
        return sb7 == null ? "" : sb7;
    }

    public final java.util.LinkedList z0() {
        r45.qv1 qv1Var = this.field_batchConfigLive;
        java.util.LinkedList list = qv1Var != null ? qv1Var.getList(0) : null;
        return list == null ? new java.util.LinkedList() : list;
    }
}
