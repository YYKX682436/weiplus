package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.YtVideoEncoderHelper */
/* loaded from: classes13.dex */
public class C27915x648245ca {
    private static final java.lang.String TAG = "YtVideoEncoderHelper";

    /* renamed from: actionVideoFrames */
    public org.json.JSONArray f62250x6b8f48eb;

    /* renamed from: codecSettingBitRate */
    private int f62251x5dd1bcd3;

    /* renamed from: codecSettingFrameRate */
    private int f62252x69777fb3;

    /* renamed from: codecSettingiFrameInterval */
    private int f62253x4f02343;

    /* renamed from: config */
    public java.lang.String f62254xaf3f8342;

    /* renamed from: innerMp4Path */
    private java.lang.String f62255x86573b80;

    /* renamed from: isReportEncodeVideoError */
    private boolean f62256x5a782821;

    /* renamed from: supportCodecJSONStr */
    private java.lang.String f62257x59b7b8c2;

    /* renamed from: videoEncoder */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27894x3ab176fc f62258x976c1821;

    public C27915x648245ca(java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        this.f62254xaf3f8342 = str2;
        this.f62255x86573b80 = str;
        this.f62251x5dd1bcd3 = i17;
        this.f62252x69777fb3 = i18;
        this.f62253x4f02343 = i19;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27894x3ab176fc c27894x3ab176fc = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27894x3ab176fc();
        this.f62258x976c1821 = c27894x3ab176fc;
        c27894x3ab176fc.m120682x59d95fdd();
    }

    /* renamed from: conservationVideo */
    private void m120945x45b85d1e(byte[][] bArr, int i17, int i18) {
        int i19;
        java.lang.String[] split = this.f62254xaf3f8342.split("&");
        if (split.length > 0) {
            i19 = 0;
            for (java.lang.String str : split) {
                java.lang.String[] split2 = str.split("=");
                if (split2.length > 1 && split2[0].equals("action_video_shorten_strategy")) {
                    i19 = java.lang.Integer.parseInt(split2[1]);
                }
            }
        } else {
            i19 = 0;
        }
        if (i19 != 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (split.length > 0) {
                for (java.lang.String str2 : split) {
                    java.lang.String[] split3 = str2.split("=");
                    if (split3.length > 1 && !split3[0].equals("action_video_shorten_strategy") && !split3[0].equals("reflect_images_shorten_strategy")) {
                        sb6.append(split3[0]);
                        sb6.append("=");
                        sb6.append(split3[1]);
                        sb6.append("&");
                    }
                }
            }
            sb6.append("reflect_images_shorten_strategy=1&action_video_shorten_strategy=1");
            this.f62254xaf3f8342 = sb6.toString();
        }
        this.f62257x59b7b8c2 = this.f62258x976c1821.m120683xb1e7958c();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805 m120703x9cf0d20b = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b();
        if (m120703x9cf0d20b != null) {
            m120703x9cf0d20b.f61720x59b7b8c2 = this.f62257x59b7b8c2;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i27 = 0; i27 < bArr.length; i27++) {
            if (i19 == 1 || i27 % 2 == 0) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca c27890x2eae4aca = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca(bArr[i27], i17, i18);
                try {
                    byte[] m120629x12e69300 = c27890x2eae4aca.m120629x12e69300(80);
                    c27890x2eae4aca.f61647x723a620d = m120629x12e69300;
                    byte[] encode = android.util.Base64.encode(m120629x12e69300, 2);
                    c27890x2eae4aca.f61647x723a620d = encode;
                    c27890x2eae4aca.f61645x5b9b5c43 = com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.jni.C27976x9bccb0c3.m121368x5f75c063(encode);
                    jSONArray.put(c27890x2eae4aca.m120623xcc313de3());
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "bgr to jpeg error" + android.util.Log.getStackTraceString(e17));
                    m120947x616d8888(this.f62257x59b7b8c2);
                }
            }
        }
        m120954x9a59dca9(jSONArray);
    }

    /* renamed from: reEncodeVideo */
    private int m120946x14f10fd2(byte[][] bArr, int i17, int i18, byte[] bArr2) {
        java.lang.String str = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(str, "re encode video start");
        try {
            this.f62258x976c1821.m120678xd2bef135();
            if (m120948x34b115ac(i17, i18) != 0) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(str, "re encode video error:-1");
                return -1;
            }
            m120949x25eab671(bArr, i17, i18, bArr2);
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(str, "re encode video ok");
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "re encode video error:-2" + android.util.Log.getStackTraceString(e17));
            return -2;
        }
    }

    /* renamed from: sendEncodeData */
    private void m120947x616d8888(java.lang.String str) {
        if (this.f62256x5a782821) {
            return;
        }
        this.f62256x5a782821 = true;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "supportCodecJSONStr:" + str);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(str) { // from class: com.tencent.youtu.sdkkitframework.liveness.YtVideoEncoderHelper.1

            /* renamed from: val$supportCodecJSONStr */
            final /* synthetic */ java.lang.String f62260x6889cabf;

            {
                this.f62260x6889cabf = str;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str);
                    jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61503x7e520f3c);
                } catch (org.json.JSONException unused) {
                }
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61545x271770a1, jSONObject.toString());
            }
        });
    }

    /* renamed from: startVideoEncoding */
    private int m120948x34b115ac(int i17, int i18) {
        boolean z17 = false;
        int i19 = 0;
        while (!z17) {
            try {
                i19 = this.f62258x976c1821.m120686x80967a9e();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "color format type=" + com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27894x3ab176fc.m120669xbb3124ee(i19) + android.util.Log.getStackTraceString(e17));
            }
            if (i19 == -1) {
                return -1;
            }
            this.f62258x976c1821.m120687x6d92d3d5(i17, i18, new java.io.File(this.f62255x86573b80), this.f62251x5dd1bcd3, this.f62252x69777fb3, this.f62253x4f02343, i19);
            z17 = true;
        }
        return 0;
    }

    /* renamed from: videoEncode */
    private void m120949x25eab671(byte[][] bArr, int i17, int i18, byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            this.f62258x976c1821.m120685x712aa2dc(new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca(bArr3, i17, i18));
            this.f62258x976c1821.m120679xb2963e16(this.f62252x69777fb3, bArr2);
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "videoEncoder done");
    }

    /* renamed from: getSupportCodecJSONStr */
    public java.lang.String m120950xb1e7958c() {
        return this.f62257x59b7b8c2;
    }

    /* renamed from: getVideData */
    public byte[] m120951xc06781b4() {
        byte[] bArr;
        byte[] bArr2;
        java.io.FileInputStream fileInputStream;
        try {
            fileInputStream = new java.io.FileInputStream(new java.io.File(this.f62255x86573b80));
            bArr2 = fileInputStream.available() != 0 ? new byte[fileInputStream.available()] : null;
        } catch (java.lang.Exception e17) {
            e = e17;
            bArr = null;
        }
        try {
            fileInputStream.read(bArr2);
            fileInputStream.close();
        } catch (java.lang.Exception e18) {
            bArr = bArr2;
            e = e18;
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "video io read error! " + android.util.Log.getStackTraceString(e));
            bArr2 = bArr;
            if (bArr2 != null) {
            }
            return null;
        }
        if (bArr2 != null || bArr2.length == 0) {
            return null;
        }
        return bArr2;
    }

    /* renamed from: makeActionVideoData */
    public void m120952x74ab5961(byte[][] bArr, int i17, int i18) {
        if (this.f62258x976c1821 == null) {
            this.f62258x976c1821 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27894x3ab176fc();
        }
        if (!this.f62258x976c1821.m120684x10ef0924() && m120948x34b115ac(i17, i18) != 0) {
            m120945x45b85d1e(bArr, i17, i18);
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "sunny-start video encode error");
            return;
        }
        byte[] bArr2 = new byte[((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27894x3ab176fc.f61676xc761e729 * i18) * 3) / 2];
        try {
            m120949x25eab671(bArr, i17, i18, bArr2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "encode video error! " + android.util.Log.getStackTraceString(e17));
            int i19 = -2;
            while (i19 == -2) {
                i19 = m120946x14f10fd2(bArr, i17, i18, bArr2);
            }
            if (i19 != 0) {
                m120945x45b85d1e(bArr, i17, i18);
            }
        }
    }

    /* renamed from: reset */
    public void m120953x6761d4f() {
        this.f62258x976c1821.m120677x426084a3();
    }

    /* renamed from: setActionVideoFrames */
    public void m120954x9a59dca9(org.json.JSONArray jSONArray) {
        if (this.f62250x6b8f48eb == null) {
            this.f62250x6b8f48eb = jSONArray;
            return;
        }
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                this.f62250x6b8f48eb.put(jSONArray.get(i17));
            } catch (org.json.JSONException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }

    /* renamed from: stop */
    public void m120955x360802() {
        this.f62258x976c1821.m120688x20107775();
    }

    /* renamed from: unload */
    public void m120956xcde7deff() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27894x3ab176fc c27894x3ab176fc = this.f62258x976c1821;
        if (c27894x3ab176fc != null) {
            try {
                try {
                    c27894x3ab176fc.m120677x426084a3();
                    this.f62258x976c1821.m120688x20107775();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "video release error:" + android.util.Log.getStackTraceString(e17));
                }
            } finally {
                this.f62258x976c1821 = null;
            }
        }
    }
}
