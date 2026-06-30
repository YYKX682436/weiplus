package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState */
/* loaded from: classes14.dex */
public class C27904xe53918c2 extends com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb {
    private static final java.lang.String TAG = "DetectOnlyState";

    /* renamed from: isLoadResourceOnline */
    private boolean f61856x6923d51 = false;

    /* renamed from: resourceDownloadPath */
    private java.lang.String f61859x6b348ffb = "";

    /* renamed from: needBigFaceMode */
    private boolean f61858x31eef44a = false;

    /* renamed from: minFaceSize */
    private int f61857x6e5c4c70 = 80;

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enterFirst */
    public void mo120658xcdd362b8() {
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: loadStateWith */
    public void mo120730xc7c4b6b1(java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo120730xc7c4b6b1(str, jSONObject);
        try {
            if (jSONObject.has("resource_online")) {
                this.f61856x6923d51 = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.f61859x6b348ffb = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("need_big_face_mode")) {
                this.f61858x31eef44a = jSONObject.getBoolean("need_big_face_mode");
            }
            if (jSONObject.has("min_face_size")) {
                this.f61857x6e5c4c70 = jSONObject.getInt("min_face_size");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
        if (!this.f61856x6923d51) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27884x28705875.m120577xeb57c8f5("YTFaceTrackPro2");
        }
        android.content.Context context = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61787xb485b2a7;
        java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
        if (this.f61856x6923d51) {
            absolutePath = this.f61859x6b348ffb;
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "Use online path:" + absolutePath);
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "Use local path:" + absolutePath);
        }
        java.lang.String[] strArr = {"net1_18.rpnmodel", "net1_18_bin.rpnproto", "net2_36.rpnmodel", "net2_36_bin.rpnproto"};
        if (!this.f61856x6923d51) {
            for (int i17 = 0; i17 < 4; i17++) {
                java.lang.String str2 = strArr[i17];
                android.content.res.AssetManager assets = context.getAssets();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27884x28705875.m120573x5817ac7b(assets, "FaceTrackModels/detector/" + str2, absolutePath + "/" + str2);
            }
        }
        java.lang.String[] strArr2 = {"align.rpdm", "align.stb", "align_bin.rpdc", "eye.rpdm", "eye_bin.rpdc"};
        if (!this.f61856x6923d51) {
            for (int i18 = 0; i18 < 5; i18++) {
                java.lang.String str3 = strArr2[i18];
                android.content.res.AssetManager assets2 = context.getAssets();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27884x28705875.m120573x5817ac7b(assets2, "FaceTrackModels/ufa/" + str3, absolutePath + "/" + str3);
            }
        }
        java.lang.String[] strArr3 = {"rotBasis.bin"};
        if (!this.f61856x6923d51) {
            java.lang.String str4 = strArr3[0];
            android.content.res.AssetManager assets3 = context.getAssets();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27884x28705875.m120573x5817ac7b(assets3, "FaceTrackModels/poseest/" + str4, absolutePath + "/" + str4);
        }
        int m121314x439d2f73 = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121314x439d2f73(absolutePath + "/");
        if (m121314x439d2f73 != 0) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(m121314x439d2f73, "failed to init face trace sdk");
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(m121314x439d2f73) { // from class: com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState.1

                /* renamed from: val$r */
                final /* synthetic */ int f61861x6ac87af;

                {
                    this.f61861x6ac87af = m121314x439d2f73;
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61509xe4062eec));
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61509xe4062eec, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61592x3eaf17b8, "检测初始化失败" + m121314x439d2f73));
                }
            });
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27970xd3d78872 m121333x527f62f7 = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121333x527f62f7();
        java.lang.String str5 = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str5, "big face mode" + this.f61858x31eef44a);
        m121333x527f62f7.f62654xa05ea21a = this.f61858x31eef44a;
        m121333x527f62f7.f62656xed9596f6 = this.f61857x6e5c4c70;
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121347x8955fc6b(m121333x527f62f7);
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.p3242x658188d.C27971x7d063c3a m121335xaa667d15 = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121335xaa667d15();
        m121335xaa667d15.f62658xb6e86d2d = false;
        m121335xaa667d15.f62659xaaea3048 = true;
        m121335xaa667d15.f62657xbfc8b6e1 = -1;
        com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121348x725ce521(m121335xaa667d15);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str5, "Detect version:" + com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.f62624x782db4b8);
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: update */
    public void mo120735xce0038c9(byte[] bArr, int i17, int i18, int i19, long j17) {
        super.mo120735xce0038c9(bArr, i17, i18, i19, j17);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i17, i18, android.graphics.Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(java.nio.ByteBuffer.wrap(bArr));
        android.graphics.Rect[] m121334xfcde1337 = com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121334xfcde1337(com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121322x9cf0d20b().m121336x94d2d4d9(createBitmap, 1));
        if (m121334xfcde1337 == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd, "detecet failed");
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState.2
                {
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61535x8c7929fb);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd));
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "{\"errorcode\":3145728,\"errormsg\":\"检测失败\"}");
                }
            });
            return;
        }
        java.lang.String str = "[";
        for (int i27 = 0; i27 < m121334xfcde1337.length; i27++) {
            android.graphics.Rect rect = m121334xfcde1337[i27];
            int i28 = rect.left;
            int i29 = rect.top;
            str = str + "{\"rect\":{\"x\":" + i28 + ",\"y\":" + i29 + ",\"w\":" + (rect.right - i28) + ",\"h\":" + (rect.bottom - i29) + "}}";
            if (i27 < m121334xfcde1337.length - 1) {
                str = str + ",";
            }
        }
        java.lang.String str2 = "{\"errorcode\":0,\"errormsg\":\"OK\",\"face_count\":" + m121334xfcde1337.length + ",\"face_rects\":" + (str + "]") + "}";
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120663x73197402("errorcode: 0, face_count: " + m121334xfcde1337.length);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(str2) { // from class: com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState.3

            /* renamed from: val$message */
            final /* synthetic */ java.lang.String f61864x92b26584;

            {
                this.f61864x92b26584 = str2;
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61535x8c7929fb);
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61635xd395cc16);
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22);
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, 0);
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str2);
            }
        });
    }
}
