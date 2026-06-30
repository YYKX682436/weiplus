package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes12.dex */
public final class c4 extends i95.w implements com.tencent.mm.feature.emoji.api.o6 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f66207d = "MicroMsg.EmoticonAPICollectionJsApiService";

    public final com.tencent.mm.storage.emotion.EmojiInfo Ai(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.storage.emotion.EmojiInfo y17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().y(str);
        if (y17 == null) {
            y17 = new com.tencent.mm.storage.emotion.EmojiInfo();
            y17.field_md5 = str;
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().o(str, 65, 0, 0);
            if (str2 != null) {
                r45.ri0 ri0Var = new r45.ri0();
                byte[] nj6 = nj(str2);
                if (nj6 != null) {
                    try {
                        ri0Var.parseFrom(nj6);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                n22.m.a(ri0Var, y17);
                ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().m(y17);
            }
        }
        return y17;
    }

    public final java.lang.String Bi(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        java.lang.String str = emojiInfo.N0() + "_gif";
        if (com.tencent.mm.vfs.w6.k(str) <= 0) {
            java.lang.String str2 = "convert wxam to gif for md5: " + emojiInfo.getMd5();
            java.lang.String str3 = this.f66207d;
            com.tencent.mars.xlog.Log.i(str3, str2);
            byte[] wi6 = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).wi(emojiInfo);
            if (wi6 == null) {
                com.tencent.mars.xlog.Log.e(str3, "failed to decode gif. delete origin file and return empty for user to retry");
                java.lang.String N0 = emojiInfo.N0();
                if (!com.tencent.mm.vfs.w6.j(N0)) {
                    return "";
                }
                com.tencent.mm.vfs.w6.h(N0);
                return "";
            }
            com.tencent.mm.vfs.w6.S(str, wi6, 0, wi6.length);
        }
        return str;
    }

    public final void Di(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.add(str);
        intent.putStringArrayListExtra("k_outside_expose_proof_item_list", arrayList);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            intent.putExtra("k_username", str3);
        } else {
            intent.putExtra("k_username", str2);
        }
        intent.putExtra("k_expose_msg_id", j17);
        intent.putExtra("k_expose_msg_type", 47);
        intent.putExtra("showShare", false);
        java.lang.String KExposeH5Url = com.tencent.mm.ui.n2.f209398a;
        kotlin.jvm.internal.o.f(KExposeH5Url, "KExposeH5Url");
        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{51}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public void Ni(android.content.Context context, java.lang.Object obj, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(context, "context");
        if (obj instanceof d22.k0) {
            ((d22.k0) obj).b(context);
            return;
        }
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("emojiInfoBuf");
            int optInt = jSONObject.optInt("emotionScene");
            java.lang.String optString2 = jSONObject.optString("sdkSessionId");
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            r45.ri0 ri0Var = new r45.ri0();
            kotlin.jvm.internal.o.d(optString);
            byte[] nj6 = nj(optString);
            if (nj6 != null) {
                try {
                    ri0Var.parseFrom(nj6);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            n22.m.a(ri0Var, emojiInfo);
            java.lang.String md52 = emojiInfo.getMd5();
            kotlin.jvm.internal.o.f(md52, "getMd5(...)");
            if (md52.length() > 0) {
                d22.k0 k0Var = new d22.k0(emojiInfo);
                k0Var.f364223a = optInt;
                k0Var.f364226d = optString2;
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
    public java.lang.Object Ri(android.content.Context r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, int r35, kotlin.coroutines.Continuation r36) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.c4.Ri(android.content.Context, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ui(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.tencent.mm.feature.emoji.d3
            if (r0 == 0) goto L13
            r0 = r7
            com.tencent.mm.feature.emoji.d3 r0 = (com.tencent.mm.feature.emoji.d3) r0
            int r1 = r0.f66226i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66226i = r1
            goto L18
        L13:
            com.tencent.mm.feature.emoji.d3 r0 = new com.tencent.mm.feature.emoji.d3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f66224g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f66226i
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f66223f
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.Object r1 = r0.f66222e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f66221d
            com.tencent.mm.feature.emoji.c4 r0 = (com.tencent.mm.feature.emoji.c4) r0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: i22.r0 -> L33
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
            kotlin.ResultKt.throwOnFailure(r7)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            z12.p r2 = new z12.p     // Catch: i22.r0 -> L93
            r2.<init>(r6)     // Catch: i22.r0 -> L93
            r0.f66221d = r5     // Catch: i22.r0 -> L93
            r0.f66222e = r6     // Catch: i22.r0 -> L93
            r0.f66223f = r7     // Catch: i22.r0 -> L93
            r0.f66226i = r3     // Catch: i22.r0 -> L93
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
            com.tencent.mm.modelbase.o r0 = r7.f469344d
            com.tencent.mm.modelbase.n r0 = r0.f70711b
            com.tencent.mm.protobuf.f r0 = r0.f70700a
            r45.qe3 r0 = (r45.qe3) r0
            java.lang.String r0 = r0.f383888g
            java.lang.String r2 = "desc"
            r6.put(r2, r0)
            com.tencent.mm.modelbase.o r7 = r7.f469344d
            com.tencent.mm.modelbase.n r0 = r7.f70711b
            com.tencent.mm.protobuf.f r0 = r0.f70700a
            r45.qe3 r0 = (r45.qe3) r0
            java.lang.String r0 = r0.f383888g
            java.lang.String r2 = "serverDesc"
            r6.put(r2, r0)
            java.lang.String r0 = "pid"
            r6.put(r0, r1)
            com.tencent.mm.modelbase.n r7 = r7.f70711b
            com.tencent.mm.protobuf.f r7 = r7.f70700a
            r45.qe3 r7 = (r45.qe3) r7
            int r7 = r7.f383889h
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
            java.lang.String r0 = r0.f66207d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "emoticonPackButtonDesc Failed to send net scene: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.c4.Ui(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Vi(java.lang.String r10, java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.c4.Vi(java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public com.tencent.mm.api.IEmojiInfo Zi(java.lang.String md52, java.lang.String str) {
        kotlin.jvm.internal.o.g(md52, "md5");
        com.tencent.mm.api.IEmojiInfo aj6 = aj(md52, str);
        if (aj6 != null) {
            return aj6;
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
        emojiInfo.field_md5 = md52;
        return emojiInfo;
    }

    public com.tencent.mm.api.IEmojiInfo aj(java.lang.String md52, java.lang.String str) {
        kotlin.jvm.internal.o.g(md52, "md5");
        com.tencent.mm.storage.emotion.EmojiInfo y17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().y(md52);
        if (y17 == null) {
            y17 = new com.tencent.mm.storage.emotion.EmojiInfo();
            y17.field_md5 = md52;
            if (str == null) {
                return null;
            }
            r45.ri0 ri0Var = new r45.ri0();
            byte[] nj6 = nj(str);
            if (nj6 != null) {
                try {
                    ri0Var.parseFrom(nj6);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            if (!kotlin.jvm.internal.o.b(ri0Var.f384886d, y17.getMd5())) {
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
    public java.lang.Object bj(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.tencent.mm.feature.emoji.f3
            if (r0 == 0) goto L13
            r0 = r7
            com.tencent.mm.feature.emoji.f3 r0 = (com.tencent.mm.feature.emoji.f3) r0
            int r1 = r0.f66263i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66263i = r1
            goto L18
        L13:
            com.tencent.mm.feature.emoji.f3 r0 = new com.tencent.mm.feature.emoji.f3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f66261g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f66263i
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f66260f
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.Object r1 = r0.f66259e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f66258d
            com.tencent.mm.feature.emoji.c4 r0 = (com.tencent.mm.feature.emoji.c4) r0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: i22.r0 -> L33
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
            kotlin.ResultKt.throwOnFailure(r7)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            boolean r2 = r5.mj(r6, r7)
            if (r2 != 0) goto L92
            z12.o r2 = new z12.o     // Catch: i22.r0 -> L79
            r2.<init>(r6)     // Catch: i22.r0 -> L79
            r0.f66258d = r5     // Catch: i22.r0 -> L79
            r0.f66259e = r6     // Catch: i22.r0 -> L79
            r0.f66260f = r7     // Catch: i22.r0 -> L79
            r0.f66263i = r3     // Catch: i22.r0 -> L79
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
            r45.v75 r7 = r7.f373357d
            byte[] r7 = r7.toByteArray()
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
            java.lang.String r0 = r0.f66207d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getEmoticonDesigner Failed to send net scene: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r7)
            return r6
        L92:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.c4.bj(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object cj(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.tencent.mm.feature.emoji.g3
            if (r0 == 0) goto L13
            r0 = r8
            com.tencent.mm.feature.emoji.g3 r0 = (com.tencent.mm.feature.emoji.g3) r0
            int r1 = r0.f66283i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66283i = r1
            goto L18
        L13:
            com.tencent.mm.feature.emoji.g3 r0 = new com.tencent.mm.feature.emoji.g3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f66281g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f66283i
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f66280f
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Object r1 = r0.f66279e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f66278d
            com.tencent.mm.feature.emoji.c4 r0 = (com.tencent.mm.feature.emoji.c4) r0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: i22.r0 -> L33
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
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "getEmoticonDesignerByNetwork "
            r8.<init>(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = r6.f66207d
            com.tencent.mars.xlog.Log.i(r2, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            z12.o r2 = new z12.o     // Catch: i22.r0 -> L8a
            r2.<init>(r7)     // Catch: i22.r0 -> L8a
            r0.f66278d = r6     // Catch: i22.r0 -> L8a
            r0.f66279e = r7     // Catch: i22.r0 -> L8a
            r0.f66280f = r8     // Catch: i22.r0 -> L8a
            r0.f66283i = r3     // Catch: i22.r0 -> L8a
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
            r45.v75 r8 = r8.f373357d
            byte[] r8 = r8.toByteArray()
            r0 = 2
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r0)
            r7.put(r1, r8)
            return r7
        L8a:
            r0 = move-exception
            r1 = r6
        L8c:
            java.lang.String r2 = r1.f66207d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getEmoticonDesignerByNetwork Failed to send net scene: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            boolean r7 = r1.mj(r7, r8)
            if (r7 != 0) goto Lac
            java.lang.String r7 = r1.f66207d
            java.lang.String r0 = "local is empty"
            com.tencent.mars.xlog.Log.i(r7, r0)
        Lac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.c4.cj(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fj(java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.c4.fj(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object hj(int r5, long r6, int r8, java.lang.String r9, int r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.c4.hj(int, long, int, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void ij(com.tencent.mm.api.IEmojiInfo emojiInfo, boolean z17, yz5.l callBack) {
        java.lang.String Bi;
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(callBack, "callBack");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (emojiInfo instanceof com.tencent.mm.storage.emotion.EmojiInfo) {
            h0Var.f310123d = (com.tencent.mm.storage.emotion.EmojiInfo) emojiInfo;
        } else {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = new com.tencent.mm.storage.emotion.EmojiInfo();
            h0Var.f310123d = emojiInfo2;
            emojiInfo2.field_md5 = emojiInfo.getMd5();
            ((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).field_aeskey = emojiInfo.getAesKey();
            ((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).field_cdnUrl = emojiInfo.l0();
            ((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).field_encrypturl = emojiInfo.J1();
            ((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).field_externMd5 = emojiInfo.g1();
            ((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).field_externUrl = emojiInfo.Z();
            ((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).field_tpurl = emojiInfo.x0();
            ((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).field_tpauthkey = emojiInfo.getAuthKey();
        }
        if (!((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).E0()) {
            zq.h.f474972a.f((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d, true, new com.tencent.mm.feature.emoji.j3(this, h0Var, z17, callBack));
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f66207d, "already have local downloaded emoticon. md5:" + ((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).getMd5());
        if (z17) {
            Bi = ((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).T();
            kotlin.jvm.internal.o.f(Bi, "getDecryptPath(...)");
        } else {
            Bi = Bi((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d);
            if (Bi.length() == 0) {
                callBack.invoke("");
                return;
            }
        }
        callBack.invoke(Bi);
    }

    public final boolean mj(java.lang.String str, org.json.JSONObject jSONObject) {
        r45.v75 v75Var;
        z85.r rVar;
        r45.ee3 y07;
        if (((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)) != null) {
            com.tencent.mm.storage.n5 f17 = com.tencent.mm.storage.n5.f();
            synchronized (f17.f195163a) {
                rVar = f17.f195172j;
            }
            if (rVar != null && (y07 = rVar.y0(str)) != null) {
                v75Var = y07.f373357d;
                if (v75Var != null || v75Var.f387964d == 0 || com.tencent.mm.sdk.platformtools.t8.K0(v75Var.f387965e)) {
                    return false;
                }
                jSONObject.put(str, android.util.Base64.encodeToString(v75Var.toByteArray(), 2));
                return true;
            }
        }
        v75Var = null;
        if (v75Var != null) {
            return false;
        }
        jSONObject.put(str, android.util.Base64.encodeToString(v75Var.toByteArray(), 2));
        return true;
    }

    public final byte[] nj(java.lang.String str) {
        try {
            return android.util.Base64.decode(str, 2);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("getEmojiInfo decode base64 fail.", "", e17);
            return null;
        }
    }

    public void oj(android.content.Context context, java.lang.String md52, java.lang.String str, java.lang.Integer num, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(md52, "md5");
        java.lang.String concat = "goToEmoticonPreview: ".concat(md52);
        java.lang.String str2 = this.f66207d;
        com.tencent.mars.xlog.Log.i(str2, concat);
        qk.u uVar = new qk.u(md52, Zi(md52, str));
        uVar.f364155a = com.tencent.mm.sdk.platformtools.t8.j1(num, 44);
        uVar.f364159e = z17;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e(str2, "unable to get emoticon liteapp feature service");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, uVar);
        }
    }

    public void pj(android.content.Context context, java.lang.String md52, java.lang.String str, int i17, java.lang.String str2, java.lang.Long l17, java.lang.Integer num, java.lang.Boolean bool, yz5.a aVar, yz5.a aVar2, yz5.a aVar3) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(md52, "md5");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) Zi(md52, str);
        j22.a.d(emojiInfo, 0, 0, 0L, i17);
        com.tencent.mars.xlog.Log.i(this.f66207d, "showSinglePage: md5:" + md52 + ", scene:" + i17 + ", addEmojiSource:" + num + ", showEntry:" + bool + ", liteAppId:" + str2 + ", liteAppUuid:" + l17);
        n22.f.d(n22.f.f334290a, context, emojiInfo, bool != null ? bool.booleanValue() : false, aVar, new com.tencent.mm.feature.emoji.a4(aVar2, l17, md52), null, 0, 0L, i17, num != null ? num.intValue() : 0, 0L, null, aVar3, null, null, 27872, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object qj(android.content.Context r5, long r6, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof com.tencent.mm.feature.emoji.b4
            if (r5 == 0) goto L13
            r5 = r9
            com.tencent.mm.feature.emoji.b4 r5 = (com.tencent.mm.feature.emoji.b4) r5
            int r0 = r5.f66190i
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f66190i = r0
            goto L18
        L13:
            com.tencent.mm.feature.emoji.b4 r5 = new com.tencent.mm.feature.emoji.b4
            r5.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r5.f66188g
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f66190i
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 != r3) goto L35
            long r6 = r5.f66187f
            java.lang.Object r8 = r5.f66186e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r5.f66185d
            com.tencent.mm.feature.emoji.c4 r5 = (com.tencent.mm.feature.emoji.c4) r5
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: i22.r0 -> L33
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
            kotlin.ResultKt.throwOnFailure(r9)
            z12.w r9 = new z12.w
            r1 = 2
            r9.<init>(r8, r1)
            r5.f66185d = r4     // Catch: i22.r0 -> L92
            r5.f66186e = r8     // Catch: i22.r0 -> L92
            r5.f66187f = r6     // Catch: i22.r0 -> L92
            r5.f66190i = r3     // Catch: i22.r0 -> L92
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
            com.tencent.mm.feature.lite.i r9 = (com.tencent.mm.feature.lite.i) r9
            r9.Vj(r6, r0, r5)
            java.lang.Class<com.tencent.mm.feature.emoji.b0> r5 = com.tencent.mm.feature.emoji.b0.class
            i95.m r5 = i95.n0.c(r5)
            com.tencent.mm.feature.emoji.b0 r5 = (com.tencent.mm.feature.emoji.b0) r5
            r5.getClass()
            com.tencent.mm.storage.n5 r5 = com.tencent.mm.storage.n5.f()
            z85.d r5 = r5.b()
            r5.L0(r8)
            return r2
        L92:
            r6 = move-exception
            r5 = r4
        L94:
            java.lang.String r5 = r5.f66207d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "uninstallEmoticon Failed to send net scene: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.mars.xlog.Log.i(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.c4.qj(android.content.Context, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean wi(android.content.Context context, java.lang.String md52, java.lang.String str, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(md52, "md5");
        gr.v vVar = gr.v.f274696a;
        vVar.a(false);
        if (!vVar.b().getBoolean("custom_full", false)) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().V(context, Ai(md52, str), i17 + 1000000, null, i18, true, false, false, null, null, null, z17);
            return true;
        }
        n22.c.a(4);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getString(com.tencent.mm.R.string.c0g));
        u1Var.n(context.getString(com.tencent.mm.R.string.byz));
        u1Var.b(new com.tencent.mm.feature.emoji.w2(context, i18));
        u1Var.q(false);
        return false;
    }
}
