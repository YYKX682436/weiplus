package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b
/* loaded from: classes12.dex */
public final class c4 extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147740d = "MicroMsg.EmoticonAPICollectionJsApiService";

    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 Ai(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 y17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().y(str);
        if (y17 == null) {
            y17 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            y17.f68671x4b6e68b9 = str;
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().o(str, 65, 0, 0);
            if (str2 != null) {
                r45.ri0 ri0Var = new r45.ri0();
                byte[] nj6 = nj(str2);
                if (nj6 != null) {
                    try {
                        ri0Var.mo11468x92b714fd(nj6);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                n22.m.a(ri0Var, y17);
                ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().m(y17);
            }
        }
        return y17;
    }

    public final java.lang.String Bi(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        java.lang.String str = c21053xdbf1e5f4.N0() + "_gif";
        if (com.p314xaae8f345.mm.vfs.w6.k(str) <= 0) {
            java.lang.String str2 = "convert wxam to gif for md5: " + c21053xdbf1e5f4.mo42933xb5885648();
            java.lang.String str3 = this.f147740d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
            byte[] wi6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).wi(c21053xdbf1e5f4);
            if (wi6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "failed to decode gif. delete origin file and return empty for user to retry");
                java.lang.String N0 = c21053xdbf1e5f4.N0();
                if (!com.p314xaae8f345.mm.vfs.w6.j(N0)) {
                    return "";
                }
                com.p314xaae8f345.mm.vfs.w6.h(N0);
                return "";
            }
            com.p314xaae8f345.mm.vfs.w6.S(str, wi6, 0, wi6.length);
        }
        return str;
    }

    public final void Di(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.add(str);
        intent.putStringArrayListExtra("k_outside_expose_proof_item_list", arrayList);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            intent.putExtra("k_username", str3);
        } else {
            intent.putExtra("k_username", str2);
        }
        intent.putExtra("k_expose_msg_id", j17);
        intent.putExtra("k_expose_msg_type", 47);
        intent.putExtra("showShare", false);
        java.lang.String KExposeH5Url = com.p314xaae8f345.mm.ui.n2.f290931a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KExposeH5Url, "KExposeH5Url");
        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{51}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public void Ni(android.content.Context context, java.lang.Object obj, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (obj instanceof d22.k0) {
            ((d22.k0) obj).b(context);
            return;
        }
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("emojiInfoBuf");
            int optInt = jSONObject.optInt("emotionScene");
            java.lang.String optString2 = jSONObject.optString("sdkSessionId");
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            r45.ri0 ri0Var = new r45.ri0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            byte[] nj6 = nj(optString);
            if (nj6 != null) {
                try {
                    ri0Var.mo11468x92b714fd(nj6);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            n22.m.a(ri0Var, c21053xdbf1e5f4);
            java.lang.String mo42933xb5885648 = c21053xdbf1e5f4.mo42933xb5885648();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
            if (mo42933xb5885648.length() > 0) {
                d22.k0 k0Var = new d22.k0(c21053xdbf1e5f4);
                k0Var.f445756a = optInt;
                k0Var.f445759d = optString2;
                k0Var.b(context);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ri(android.content.Context r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, int r35, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r36) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4.Ri(android.content.Context, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ui(java.lang.String r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.d3
            if (r0 == 0) goto L13
            r0 = r7
            com.tencent.mm.feature.emoji.d3 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.d3) r0
            int r1 = r0.f147759i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147759i = r1
            goto L18
        L13:
            com.tencent.mm.feature.emoji.d3 r0 = new com.tencent.mm.feature.emoji.d3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f147757g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f147759i
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f147756f
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.Object r1 = r0.f147755e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f147754d
            com.tencent.mm.feature.emoji.c4 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)     // Catch: i22.r0 -> L33
            goto L5d
        L33:
            r7 = move-exception
            goto L98
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            z12.p r2 = new z12.p     // Catch: i22.r0 -> L93
            r2.<init>(r6)     // Catch: i22.r0 -> L93
            r0.f147754d = r5     // Catch: i22.r0 -> L93
            r0.f147755e = r6     // Catch: i22.r0 -> L93
            r0.f147756f = r7     // Catch: i22.r0 -> L93
            r0.f147759i = r3     // Catch: i22.r0 -> L93
            java.lang.Object r0 = i22.w0.a(r2, r0)     // Catch: i22.r0 -> L93
            if (r0 != r1) goto L59
            return r1
        L59:
            r1 = r6
            r6 = r7
            r7 = r0
            r0 = r5
        L5d:
            z12.p r7 = (z12.p) r7     // Catch: i22.r0 -> L33
            com.tencent.mm.modelbase.o r0 = r7.f550877d
            com.tencent.mm.modelbase.n r0 = r0.f152244b
            com.tencent.mm.protobuf.f r0 = r0.f152233a
            r45.qe3 r0 = (r45.qe3) r0
            java.lang.String r0 = r0.f465421g
            java.lang.String r2 = "desc"
            r6.put(r2, r0)
            com.tencent.mm.modelbase.o r7 = r7.f550877d
            com.tencent.mm.modelbase.n r0 = r7.f152244b
            com.tencent.mm.protobuf.f r0 = r0.f152233a
            r45.qe3 r0 = (r45.qe3) r0
            java.lang.String r0 = r0.f465421g
            java.lang.String r2 = "serverDesc"
            r6.put(r2, r0)
            java.lang.String r0 = "pid"
            r6.put(r0, r1)
            com.tencent.mm.modelbase.n r7 = r7.f152244b
            com.tencent.mm.protobuf.f r7 = r7.f152233a
            r45.qe3 r7 = (r45.qe3) r7
            int r7 = r7.f465422h
            java.lang.String r0 = "showButton"
            r6.put(r0, r7)
            return r6
        L93:
            r6 = move-exception
            r0 = r5
            r4 = r7
            r7 = r6
            r6 = r4
        L98:
            java.lang.String r0 = r0.f147740d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "emoticonPackButtonDesc Failed to send net scene: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4.Ui(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Vi(java.lang.String r10, java.util.List r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4.Vi(java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Zi(java.lang.String md52, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb aj6 = aj(md52, str);
        if (aj6 != null) {
            return aj6;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
        c21053xdbf1e5f4.f68671x4b6e68b9 = md52;
        return c21053xdbf1e5f4;
    }

    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb aj(java.lang.String md52, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 y17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().y(md52);
        if (y17 == null) {
            y17 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            y17.f68671x4b6e68b9 = md52;
            if (str == null) {
                return null;
            }
            r45.ri0 ri0Var = new r45.ri0();
            byte[] nj6 = nj(str);
            if (nj6 != null) {
                try {
                    ri0Var.mo11468x92b714fd(nj6);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ri0Var.f466419d, y17.mo42933xb5885648())) {
                return null;
            }
            n22.m.a(ri0Var, y17);
        }
        return y17;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object bj(java.lang.String r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f3
            if (r0 == 0) goto L13
            r0 = r7
            com.tencent.mm.feature.emoji.f3 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f3) r0
            int r1 = r0.f147796i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147796i = r1
            goto L18
        L13:
            com.tencent.mm.feature.emoji.f3 r0 = new com.tencent.mm.feature.emoji.f3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f147794g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f147796i
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f147793f
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.Object r1 = r0.f147792e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f147791d
            com.tencent.mm.feature.emoji.c4 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)     // Catch: i22.r0 -> L33
            goto L63
        L33:
            r7 = move-exception
            goto L7e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            boolean r2 = r5.mj(r6, r7)
            if (r2 != 0) goto L92
            z12.o r2 = new z12.o     // Catch: i22.r0 -> L79
            r2.<init>(r6)     // Catch: i22.r0 -> L79
            r0.f147791d = r5     // Catch: i22.r0 -> L79
            r0.f147792e = r6     // Catch: i22.r0 -> L79
            r0.f147793f = r7     // Catch: i22.r0 -> L79
            r0.f147796i = r3     // Catch: i22.r0 -> L79
            java.lang.Object r0 = i22.w0.a(r2, r0)     // Catch: i22.r0 -> L79
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r1 = r6
            r6 = r7
            r7 = r0
            r0 = r5
        L63:
            z12.o r7 = (z12.o) r7     // Catch: i22.r0 -> L33
            r45.ee3 r7 = r7.H()
            r45.v75 r7 = r7.f454890d
            byte[] r7 = r7.mo14344x5f01b1f6()
            r0 = 2
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r0)
            r6.put(r1, r7)
            r7 = r6
            goto L92
        L79:
            r6 = move-exception
            r0 = r5
            r4 = r7
            r7 = r6
            r6 = r4
        L7e:
            java.lang.String r0 = r0.f147740d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getEmoticonDesigner Failed to send net scene: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            return r6
        L92:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4.bj(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object cj(java.lang.String r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g3
            if (r0 == 0) goto L13
            r0 = r8
            com.tencent.mm.feature.emoji.g3 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g3) r0
            int r1 = r0.f147816i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147816i = r1
            goto L18
        L13:
            com.tencent.mm.feature.emoji.g3 r0 = new com.tencent.mm.feature.emoji.g3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f147814g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f147816i
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f147813f
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Object r1 = r0.f147812e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f147811d
            com.tencent.mm.feature.emoji.c4 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)     // Catch: i22.r0 -> L33
            goto L75
        L33:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r1
            r1 = r0
            r0 = r5
            goto L8c
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "getEmoticonDesignerByNetwork "
            r8.<init>(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = r6.f147740d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            z12.o r2 = new z12.o     // Catch: i22.r0 -> L8a
            r2.<init>(r7)     // Catch: i22.r0 -> L8a
            r0.f147811d = r6     // Catch: i22.r0 -> L8a
            r0.f147812e = r7     // Catch: i22.r0 -> L8a
            r0.f147813f = r8     // Catch: i22.r0 -> L8a
            r0.f147816i = r3     // Catch: i22.r0 -> L8a
            java.lang.Object r0 = i22.w0.a(r2, r0)     // Catch: i22.r0 -> L8a
            if (r0 != r1) goto L71
            return r1
        L71:
            r1 = r7
            r7 = r8
            r8 = r0
            r0 = r6
        L75:
            z12.o r8 = (z12.o) r8     // Catch: i22.r0 -> L33
            r45.ee3 r8 = r8.H()
            r45.v75 r8 = r8.f454890d
            byte[] r8 = r8.mo14344x5f01b1f6()
            r0 = 2
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r0)
            r7.put(r1, r8)
            return r7
        L8a:
            r0 = move-exception
            r1 = r6
        L8c:
            java.lang.String r2 = r1.f147740d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getEmoticonDesignerByNetwork Failed to send net scene: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            boolean r7 = r1.mj(r7, r8)
            if (r7 != 0) goto Lac
            java.lang.String r7 = r1.f147740d
            java.lang.String r0 = "local is empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r0)
        Lac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4.cj(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fj(java.lang.String r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4.fj(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object hj(int r5, long r6, int r8, java.lang.String r9, int r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4.hj(int, long, int, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void ij(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, boolean z17, yz5.l callBack) {
        java.lang.String Bi;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callBack, "callBack");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (emojiInfo instanceof com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) {
            h0Var.f391656d = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) emojiInfo;
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            h0Var.f391656d = c21053xdbf1e5f4;
            c21053xdbf1e5f4.f68671x4b6e68b9 = emojiInfo.mo42933xb5885648();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).f68642xf11e6e15 = emojiInfo.mo42927x1061ea06();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).f68654xf47770e7 = emojiInfo.l0();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).f68659x5efe714f = emojiInfo.J1();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).f68660x7650f4b9 = emojiInfo.g1();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).f68661x765114aa = emojiInfo.Z();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).f68688x29e035ee = emojiInfo.x0();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).f68687x159b18b6 = emojiInfo.mo42928x1743c361();
        }
        if (!((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).E0()) {
            zq.h.f556505a.f((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d, true, new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.j3(this, h0Var, z17, callBack));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f147740d, "already have local downloaded emoticon. md5:" + ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).mo42933xb5885648());
        if (z17) {
            Bi = ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d).T();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Bi, "getDecryptPath(...)");
        } else {
            Bi = Bi((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) h0Var.f391656d);
            if (Bi.length() == 0) {
                callBack.mo146xb9724478("");
                return;
            }
        }
        callBack.mo146xb9724478(Bi);
    }

    public final boolean mj(java.lang.String str, org.json.JSONObject jSONObject) {
        r45.v75 v75Var;
        z85.r rVar;
        r45.ee3 y07;
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)) != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
            synchronized (f17.f276696a) {
                rVar = f17.f276705j;
            }
            if (rVar != null && (y07 = rVar.y0(str)) != null) {
                v75Var = y07.f454890d;
                if (v75Var != null || v75Var.f469497d == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v75Var.f469498e)) {
                    return false;
                }
                jSONObject.put(str, android.util.Base64.encodeToString(v75Var.mo14344x5f01b1f6(), 2));
                return true;
            }
        }
        v75Var = null;
        if (v75Var != null) {
            return false;
        }
        jSONObject.put(str, android.util.Base64.encodeToString(v75Var.mo14344x5f01b1f6(), 2));
        return true;
    }

    public final byte[] nj(java.lang.String str) {
        try {
            return android.util.Base64.decode(str, 2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("getEmojiInfo decode base64 fail.", "", e17);
            return null;
        }
    }

    public void oj(android.content.Context context, java.lang.String md52, java.lang.String str, java.lang.Integer num, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        java.lang.String concat = "goToEmoticonPreview: ".concat(md52);
        java.lang.String str2 = this.f147740d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, concat);
        qk.u uVar = new qk.u(md52, Zi(md52, str));
        uVar.f445688a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1(num, 44);
        uVar.f445692e = z17;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "unable to get emoticon liteapp feature service");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(context, uVar);
        }
    }

    public void pj(android.content.Context context, java.lang.String md52, java.lang.String str, int i17, java.lang.String str2, java.lang.Long l17, java.lang.Integer num, java.lang.Boolean bool, yz5.a aVar, yz5.a aVar2, yz5.a aVar3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Zi(md52, str);
        j22.a.d(c21053xdbf1e5f4, 0, 0, 0L, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f147740d, "showSinglePage: md5:" + md52 + ", scene:" + i17 + ", addEmojiSource:" + num + ", showEntry:" + bool + ", liteAppId:" + str2 + ", liteAppUuid:" + l17);
        n22.f.d(n22.f.f415823a, context, c21053xdbf1e5f4, bool != null ? bool.booleanValue() : false, aVar, new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.a4(aVar2, l17, md52), null, 0, 0L, i17, num != null ? num.intValue() : 0, 0L, null, aVar3, null, null, 27872, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object qj(android.content.Context r5, long r6, java.lang.String r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b4
            if (r5 == 0) goto L13
            r5 = r9
            com.tencent.mm.feature.emoji.b4 r5 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b4) r5
            int r0 = r5.f147723i
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f147723i = r0
            goto L18
        L13:
            com.tencent.mm.feature.emoji.b4 r5 = new com.tencent.mm.feature.emoji.b4
            r5.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r5.f147721g
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f147723i
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 != r3) goto L35
            long r6 = r5.f147720f
            java.lang.Object r8 = r5.f147719e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r5.f147718d
            com.tencent.mm.feature.emoji.c4 r5 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: i22.r0 -> L33
            goto L56
        L33:
            r6 = move-exception
            goto L94
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            z12.w r9 = new z12.w
            r1 = 2
            r9.<init>(r8, r1)
            r5.f147718d = r4     // Catch: i22.r0 -> L92
            r5.f147719e = r8     // Catch: i22.r0 -> L92
            r5.f147720f = r6     // Catch: i22.r0 -> L92
            r5.f147723i = r3     // Catch: i22.r0 -> L92
            java.lang.Object r9 = i22.w0.a(r9, r5)     // Catch: i22.r0 -> L92
            if (r9 != r0) goto L55
            return r0
        L55:
            r5 = r4
        L56:
            z12.w r9 = (z12.w) r9     // Catch: i22.r0 -> L33
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r0 = "status"
            r9.put(r0, r3)
            r5.put(r8, r9)
            java.lang.Class<q80.g0> r9 = q80.g0.class
            i95.m r9 = i95.n0.c(r9)
            q80.g0 r9 = (q80.g0) r9
            java.lang.String r0 = "onStoreEmoticonDownloadUpdate"
            com.tencent.mm.feature.lite.i r9 = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) r9
            r9.Vj(r6, r0, r5)
            java.lang.Class<com.tencent.mm.feature.emoji.b0> r5 = com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class
            i95.m r5 = i95.n0.c(r5)
            com.tencent.mm.feature.emoji.b0 r5 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) r5
            r5.getClass()
            com.tencent.mm.storage.n5 r5 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f()
            z85.d r5 = r5.b()
            r5.L0(r8)
            return r2
        L92:
            r6 = move-exception
            r5 = r4
        L94:
            java.lang.String r5 = r5.f147740d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "uninstallEmoticon Failed to send net scene: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4.qj(android.content.Context, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean wi(android.content.Context context, java.lang.String md52, java.lang.String str, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        gr.v vVar = gr.v.f356229a;
        vVar.a(false);
        if (!vVar.b().getBoolean("custom_full", false)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ni().V(context, Ai(md52, str), i17 + 1000000, null, i18, true, false, false, null, null, null, z17);
            return true;
        }
        n22.c.a(4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0g));
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byz));
        u1Var.b(new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.w2(context, i18));
        u1Var.q(false);
        return false;
    }
}
