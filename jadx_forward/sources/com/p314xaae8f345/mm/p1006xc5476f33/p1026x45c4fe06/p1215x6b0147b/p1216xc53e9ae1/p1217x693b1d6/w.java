package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6;

/* loaded from: classes15.dex */
public final class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l {
    public final java.lang.String M;
    public boolean N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context) {
        super(context, null, false, false, false, 30, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.M = "MicroMsg.WebViewThumbMediaPlayer";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l
    public void R(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player, int i17, long j17, long j18, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        java.util.Objects.toString(obj);
        java.lang.String str = this.M;
        try {
            if (i17 == 252) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "TP_PLAYER_INFO_LONG1_ADAPTIVE_SWITCH_DEF_END：arg1: " + j17 + ", arg2: " + j18 + ", extraObject: " + obj);
                F(java.lang.String.valueOf(j17));
            } else {
                if (i17 != 1006 || obj == null) {
                    return;
                }
                if (obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo) {
                    X(((com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo) obj).f50884xf0e1e4de);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
        }
    }

    public final void X(java.lang.String str) {
        try {
            if (this.N) {
                this.N = false;
                if (str == null) {
                    return;
                }
                java.lang.Object opt = new org.json.JSONObject(str).opt("hitDownloaded");
                if (opt != null && (opt instanceof java.lang.Integer)) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(opt, 1)) {
                        H(true);
                    } else {
                        H(false);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.M, e17, "", new java.lang.Object[0]);
        }
    }

    public final void Y(java.lang.String str, java.lang.String str2, int i17) {
        int i18 = i17 == 1 ? 1 : 0;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "setDataSource, player is not available");
            return;
        }
        try {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p.f172433a.a(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.M, "setDataSource, path: " + str + ", fileId:" + a17 + ", videoType:" + i17);
            this.N = true;
            interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(102, 1000L).m101062xac7b1a0a(504, 1L));
            com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder m101226xb4088fb7 = new com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder().m101226xb4088fb7(a17);
            com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13 = new com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13(i18);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (!(str2 == null || str2.length() == 0)) {
                hashMap.put("Referrer", str2);
            }
            c26231xafaedb13.m101448xb7d81b82(kz5.b0.c(hashMap));
            interfaceC26164x73fc6bc6.mo100974xab2f6987(m101226xb4088fb7.m101224x10a74e5(c26231xafaedb13).m101222x59bc66e());
            interfaceC26164x73fc6bc6.mo100945x683d6267(str);
            this.f542695a = 1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "setDataSource, fail since " + e17);
            O(e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l, ye1.e
    public void m(java.lang.String path, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        Y(path, str, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l, ye1.e
    public void y(java.lang.String str, int i17) {
        if (str == null) {
            return;
        }
        Y(str, null, i17);
    }
}
