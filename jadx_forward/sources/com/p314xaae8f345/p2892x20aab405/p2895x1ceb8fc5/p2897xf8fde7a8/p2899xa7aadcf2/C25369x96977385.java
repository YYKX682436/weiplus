package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2;

/* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.CueItemParser */
/* loaded from: classes13.dex */
public class C25369x96977385 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.AbstractC25367x87d77afa {
    public static final java.lang.String TAG = "CueItemParser";

    /* renamed from: mReader */
    private java.io.LineNumberReader f45823x17b17f90;

    /* renamed from: mTrackInfoList */
    protected java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79> f45824xc5a3656a;

    public C25369x96977385(java.lang.String str) {
        this.f45822x32d9bf = str;
        this.f45824xc5a3656a = new java.util.LinkedList();
    }

    /* renamed from: convertTimeStrToMs */
    private long m93981x42641812(java.lang.String str) {
        java.lang.String[] split = str.split(":");
        long parseLong = java.lang.Long.parseLong(split[0]);
        return (((parseLong * 60) + java.lang.Long.parseLong(split[1])) * 1000) + (java.lang.Long.parseLong(split[2]) * 10);
    }

    /* renamed from: guessCharsetEncoding */
    private java.lang.String m93982x3f3927e8(java.lang.String str) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "CueItemParser.guessCharsetEncoding, filePath: " + str);
        return m93976x3f3927e8(new java.io.FileInputStream(str));
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.AbstractC25367x87d77afa
    /* renamed from: isParseSuccess */
    public boolean mo93977xee35d01a() {
        return !this.f45824xc5a3656a.isEmpty();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.AbstractC25367x87d77afa
    /* renamed from: iterator */
    public java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79> mo93978x467c086e() {
        return this.f45824xc5a3656a.iterator();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.AbstractC25367x87d77afa
    /* renamed from: parse */
    public void mo93979x6581ab3() {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.io.File file;
        int i18;
        boolean z17;
        long j17;
        int i19;
        java.lang.String str3 = "/";
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "CueItemParser.parse, uri: " + this.f45822x32d9bf);
        java.io.File file2 = new java.io.File(this.f45822x32d9bf);
        this.f45824xc5a3656a.clear();
        try {
            try {
                this.f45823x17b17f90 = new java.io.LineNumberReader(new java.io.InputStreamReader(new java.io.FileInputStream(file2), m93982x3f3927e8(this.f45822x32d9bf)));
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c79 = null;
                java.lang.String str4 = null;
                java.lang.String str5 = null;
                java.lang.String str6 = null;
                boolean z18 = false;
                long j18 = 0;
                int i27 = 0;
                boolean z19 = false;
                int i28 = 0;
                while (true) {
                    try {
                        java.lang.String readLine = this.f45823x17b17f90.readLine();
                        i28 = this.f45823x17b17f90.getLineNumber();
                        if (android.text.TextUtils.isEmpty(readLine)) {
                            if (!this.f45824xc5a3656a.isEmpty()) {
                                java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79> list = this.f45824xc5a3656a;
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c792 = list.get(list.size() - 1);
                                if (j18 != 0 && c25358xa2ed4c792.m93895x7511df87() != null && ((java.lang.Long) c25358xa2ed4c792.m93895x7511df87().second).longValue() == 0) {
                                    c25358xa2ed4c792.m93899x12a3340f(j18);
                                }
                                for (int i29 = 0; i29 < this.f45824xc5a3656a.size(); i29++) {
                                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c793 = this.f45824xc5a3656a.get(i29);
                                    if (!android.text.TextUtils.isEmpty(str4) && android.text.TextUtils.isEmpty(c25358xa2ed4c793.m93893x742724b9())) {
                                        c25358xa2ed4c793.m93898x52b53f2d(str4);
                                    }
                                    if (!android.text.TextUtils.isEmpty(str5) && android.text.TextUtils.isEmpty(c25358xa2ed4c793.m93894x1c1b1118())) {
                                        c25358xa2ed4c793.m93901x786ed18c(str5);
                                    }
                                }
                            }
                            try {
                                this.f45823x17b17f90.close();
                                return;
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "LineNumberReader close ex", e17);
                                return;
                            }
                        }
                        if (!z18 && readLine.trim().toUpperCase().startsWith("PERFORMER")) {
                            str5 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.AbstractC25367x87d77afa.m93975x69984c55(readLine);
                        }
                        if (z18) {
                            str = str5;
                        } else {
                            str = str5;
                            if (readLine.trim().toUpperCase().startsWith("TITLE")) {
                                str4 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.AbstractC25367x87d77afa.m93975x69984c55(readLine);
                            }
                        }
                        java.lang.String str7 = str4;
                        if (readLine.trim().toUpperCase().startsWith("FILE")) {
                            if (z18) {
                                z18 = false;
                            }
                            if (j18 != 0 && c25358xa2ed4c79 != null) {
                                c25358xa2ed4c79.m93899x12a3340f(j18);
                            }
                            java.lang.String m93975x69984c55 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.AbstractC25367x87d77afa.m93975x69984c55(readLine);
                            java.lang.String parent = file2.getParent();
                            if (!parent.endsWith(str3)) {
                                parent = parent + str3;
                            }
                            if (m93975x69984c55.startsWith(str3)) {
                                m93975x69984c55 = m93975x69984c55.substring(1);
                            }
                            java.lang.String str8 = parent + m93975x69984c55;
                            if (!new java.io.File(str8).exists()) {
                                throw new java.io.IOException("media file in cue not exist! cue Path: " + this.f45822x32d9bf);
                            }
                            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d c25375x52862c0d = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d();
                            int mo93993x316510 = c25375x52862c0d.mo93993x316510(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(str8));
                            if (mo93993x316510 == 0) {
                                j18 = c25375x52862c0d.mo93985x6e8c46ec().m93540x51e8b0a();
                                str2 = str3;
                                file = file2;
                            } else {
                                str2 = str3;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                file = file2;
                                sb6.append("media item in cue init fail! ret = ");
                                sb6.append(mo93993x316510);
                                sb6.append(" ,path: ");
                                sb6.append(str8);
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, sb6.toString());
                            }
                            c25375x52862c0d.mo93996x41012807();
                            str6 = str8;
                        } else {
                            str2 = str3;
                            file = file2;
                        }
                        if (readLine.trim().toUpperCase().startsWith("TRACK")) {
                            c25358xa2ed4c79 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.AbstractC25357x47859e49.f45739x6698f8e);
                            c25358xa2ed4c79.m93900x4ab94e43(str6);
                            i18 = i27 + 1;
                            z18 = true;
                        } else {
                            i18 = i27;
                        }
                        if (z18 && readLine.trim().toUpperCase().startsWith("TITLE")) {
                            c25358xa2ed4c79.m93903x53bfe316(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.AbstractC25367x87d77afa.m93975x69984c55(readLine));
                        }
                        if (z18 && readLine.trim().toUpperCase().startsWith("PERFORMER")) {
                            c25358xa2ed4c79.m93901x786ed18c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.AbstractC25367x87d77afa.m93975x69984c55(readLine));
                        }
                        if (i18 == 1 && readLine.trim().toUpperCase().startsWith("INDEX")) {
                            if (!readLine.trim().contains(" 01 ")) {
                                throw new java.io.IOException("first item in CUE must only have feature \"INDEX 01\"!");
                            }
                            c25358xa2ed4c79.m93902x845c6269(m93981x42641812(readLine.trim().split(" 01 ")[1].trim()));
                        }
                        if (i18 < 2 || !readLine.trim().toUpperCase().startsWith("INDEX")) {
                            z17 = z18;
                            j17 = j18;
                        } else if (readLine.trim().contains(" 00 ")) {
                            z17 = z18;
                            j17 = j18;
                            this.f45824xc5a3656a.get(i18 - 2).m93899x12a3340f(m93981x42641812(readLine.trim().split(" 00 ")[1].trim()));
                            i19 = 1;
                            z19 = true;
                            if (i18 >= i19 && readLine.trim().toUpperCase().startsWith("INDEX") && readLine.trim().contains(" 01 ")) {
                                this.f45824xc5a3656a.add(c25358xa2ed4c79);
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c794 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.AbstractC25357x47859e49.f45739x6698f8e);
                                c25358xa2ed4c794.m93900x4ab94e43(str6);
                                c25358xa2ed4c79 = c25358xa2ed4c794;
                                z19 = false;
                            }
                            i27 = i18;
                            z18 = z17;
                            str4 = str7;
                            str5 = str;
                            str3 = str2;
                            file2 = file;
                            j18 = j17;
                        } else {
                            z17 = z18;
                            j17 = j18;
                            if (!readLine.trim().contains(" 01 ")) {
                                throw new java.io.IOException("item " + i18 + " in CUE have illegel feature \"INDEX\"!");
                            }
                            java.lang.String trim = readLine.trim().split(" 01 ")[1].trim();
                            c25358xa2ed4c79.m93902x845c6269(m93981x42641812(trim));
                            if (!z19) {
                                this.f45824xc5a3656a.get(i18 - 2).m93899x12a3340f(m93981x42641812(trim));
                            }
                        }
                        i19 = 1;
                        if (i18 >= i19) {
                            this.f45824xc5a3656a.add(c25358xa2ed4c79);
                            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c7942 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.AbstractC25357x47859e49.f45739x6698f8e);
                            c25358xa2ed4c7942.m93900x4ab94e43(str6);
                            c25358xa2ed4c79 = c25358xa2ed4c7942;
                            z19 = false;
                        }
                        i27 = i18;
                        z18 = z17;
                        str4 = str7;
                        str5 = str;
                        str3 = str2;
                        file2 = file;
                        j18 = j17;
                    } catch (java.io.IOException e18) {
                        e = e18;
                        i17 = i28;
                        throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2899xa7aadcf2.C25370x7587fafc("Parse Exception occured", e, i17);
                    }
                }
            } catch (java.io.IOException e19) {
                e = e19;
                i17 = 0;
            }
        } catch (java.lang.Throwable th6) {
            try {
                this.f45823x17b17f90.close();
                throw th6;
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "LineNumberReader close ex", e27);
                throw th6;
            }
        }
    }
}
