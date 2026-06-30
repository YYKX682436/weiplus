package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetWriter */
/* loaded from: classes16.dex */
public class C25666xb4e42f63 implements com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.StatusListener, com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25682xe68c577a {

    /* renamed from: MAX_BIT_RATE */
    public static final int f47361x8f90bd8d = 8000000;
    private static final java.lang.String TAG = "AssetWriter";

    /* renamed from: availableMediaTypes */
    private java.util.List<java.lang.Integer> f47362x50c6869e;

    /* renamed from: directoryForTemporaryFiles */
    private java.lang.String f47363x493d84e2;

    /* renamed from: encodeOption */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 f47364xc5684a2b;

    /* renamed from: encoderWriter */
    private com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f f47365xf855d0af;

    /* renamed from: errCode */
    private int f47367xa7c470f2;

    /* renamed from: metadata */
    private java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> f47371xe52d7b2f;

    /* renamed from: outputFileType */
    private java.lang.String f47372x3e2fc6f7;

    /* renamed from: rendSurface */
    private android.view.Surface f47373xecf0f944;

    /* renamed from: renderContext */
    private com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f47374x399b739;

    /* renamed from: renderContextParams */
    private com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff f47375x16878e1f;

    /* renamed from: shouldOptimizeForNetworkUse */
    private boolean f47376xe3cc6252;

    /* renamed from: status */
    private com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535 f47378xcacdcff2;

    /* renamed from: videoOutputPath */
    private java.lang.String f47379xfd6b5ba1;

    /* renamed from: inputs */
    private java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27> f47369xb96fa1e9 = new java.util.ArrayList();

    /* renamed from: inputStatusHashMap */
    private java.util.HashMap<com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535> f47368x498dcd72 = new java.util.HashMap<>();

    /* renamed from: startTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47377x81158a4f = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(0L);

    /* renamed from: endTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47366xa0336a48 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);

    /* renamed from: loggerConfig */
    public com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 f47370xc231f8f2 = com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25801x67b50bf9.f48380x4fbc8495.m97834x1e74d0e3();

    public C25666xb4e42f63(java.lang.String str, java.lang.String str2) {
        this.f47379xfd6b5ba1 = str;
        this.f47372x3e2fc6f7 = str2;
    }

    /* renamed from: updateAssetStatus */
    private void m96571x6d0fa79() {
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27> it = this.f47369xb96fa1e9.iterator();
        boolean z17 = true;
        while (true) {
            boolean z18 = false;
            if (!it.hasNext()) {
                break;
            }
            if (this.f47368x498dcd72.get(it.next()) == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusCompleted) {
                z18 = true;
            }
            z17 &= z18;
        }
        if (z17) {
            this.f47378xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusCancelled;
            return;
        }
        boolean z19 = true;
        for (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27 : this.f47369xb96fa1e9) {
            z19 &= this.f47368x498dcd72.get(c25667x9a895e27) == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusWriting || this.f47368x498dcd72.get(c25667x9a895e27) == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusCompleted;
        }
        if (z19) {
            this.f47378xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusWriting;
            return;
        }
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27> it6 = this.f47369xb96fa1e9.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535 enumC25668xc8009535 = this.f47368x498dcd72.get(it6.next());
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535 enumC25668xc80095352 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusFailed;
            if (enumC25668xc8009535 == enumC25668xc80095352) {
                this.f47378xcacdcff2 = enumC25668xc80095352;
                return;
            }
        }
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27> it7 = this.f47369xb96fa1e9.iterator();
        while (it7.hasNext()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535 enumC25668xc80095353 = this.f47368x498dcd72.get(it7.next());
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535 enumC25668xc80095354 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusCancelled;
            if (enumC25668xc80095353 == enumC25668xc80095354) {
                this.f47378xcacdcff2 = enumC25668xc80095354;
                return;
            }
        }
    }

    /* renamed from: addInput */
    public void m96572xb51e2ba9(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27) {
        if (m96573x92a53f99(c25667x9a895e27)) {
            this.f47369xb96fa1e9.add(c25667x9a895e27);
            c25667x9a895e27.m96615xbaafdc7(this);
        }
    }

    /* renamed from: canAddInput */
    public boolean m96573x92a53f99(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27) {
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27> it = this.f47369xb96fa1e9.iterator();
        while (it.hasNext()) {
            if (it.next().m96620x7f025288() == c25667x9a895e27.m96620x7f025288()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: canApplyOutputSettings */
    public boolean m96574xfbac7562(java.util.HashMap<java.lang.String, java.lang.Object> hashMap, int i17) {
        if (i17 == 1) {
            return com.p314xaae8f345.tav.p2959x5befac44.C25759xbfeccb44.m97436xb5f30f3(hashMap.containsKey("width") ? ((java.lang.Integer) hashMap.get("width")).intValue() : -1, hashMap.containsKey("height") ? ((java.lang.Integer) hashMap.get("height")).intValue() : -1, hashMap.containsKey("frame-rate") ? ((java.lang.Integer) hashMap.get("frame-rate")).intValue() : 30, hashMap.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) ? ((java.lang.Integer) hashMap.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63)).intValue() : 8000000, hashMap.containsKey("mime") ? (java.lang.String) hashMap.get("mime") : "video/avc");
        }
        if (i17 != 2) {
            return false;
        }
        java.lang.String str = hashMap.containsKey("mime") ? (java.lang.String) hashMap.get("mime") : "audio/mp4a-latm";
        if (hashMap.containsKey("aac-profile")) {
            ((java.lang.Integer) hashMap.get("aac-profile")).intValue();
        }
        return com.p314xaae8f345.tav.p2959x5befac44.C25759xbfeccb44.m97435x87bd87ce(hashMap.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) ? ((java.lang.Integer) hashMap.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63)).intValue() : 8000000, hashMap.containsKey("channel-count") ? ((java.lang.Integer) hashMap.get("channel-count")).intValue() : 1, hashMap.containsKey("sample-rate") ? ((java.lang.Integer) hashMap.get("sample-rate")).intValue() : 44100, str);
    }

    /* renamed from: cancelWriting */
    public void m96575xae6a0502() {
        com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f c25764x27f5008f = this.f47365xf855d0af;
        if (c25764x27f5008f != null) {
            c25764x27f5008f.m97518x360802();
            this.f47365xf855d0af = null;
        }
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27> it = this.f47369xb96fa1e9.iterator();
        while (it.hasNext()) {
            this.f47368x498dcd72.put(it.next(), com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusCancelled);
        }
        this.f47378xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusCancelled;
    }

    /* renamed from: createInputSurface */
    public android.view.Surface m96576x4310109f() {
        com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f c25764x27f5008f = this.f47365xf855d0af;
        if (c25764x27f5008f != null) {
            return c25764x27f5008f.m97499x4310109f();
        }
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25682xe68c577a
    /* renamed from: encoderWriter */
    public com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f mo96577xf855d0af() {
        return this.f47365xf855d0af;
    }

    /* renamed from: endSessionAtSourceTime */
    public void m96578xab1976f6(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f47366xa0336a48 = c25736x76b98a57;
    }

    /* renamed from: finishWriting */
    public boolean m96579xed7248c9() {
        com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f c25764x27f5008f = this.f47365xf855d0af;
        boolean m97518x360802 = c25764x27f5008f != null ? c25764x27f5008f.m97518x360802() : false;
        this.f47378xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusCompleted;
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f47374x399b739;
        if (c25779x3338e719 != null) {
            c25779x3338e719.mo97551x41012807();
            this.f47374x399b739 = null;
        }
        android.view.Surface surface = this.f47373xecf0f944;
        if (surface != null) {
            surface.release();
            this.f47373xecf0f944 = null;
        }
        return m97518x360802;
    }

    /* renamed from: getAvailableMediaTypes */
    public java.util.List<java.lang.Integer> m96581xa8f66368() {
        return this.f47362x50c6869e;
    }

    /* renamed from: getDirectoryForTemporaryFiles */
    public java.lang.String m96582xa86b90d8() {
        return this.f47363x493d84e2;
    }

    /* renamed from: getEncodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b m96583x15c7784() {
        com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f c25764x27f5008f = this.f47365xf855d0af;
        if (c25764x27f5008f != null) {
            return c25764x27f5008f.m97506x819956fa();
        }
        return null;
    }

    /* renamed from: getErrCode */
    public int m96584xe591acbc() {
        return this.f47367xa7c470f2;
    }

    /* renamed from: getInputs */
    public java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27> m96585x1e86c4df() {
        return this.f47369xb96fa1e9;
    }

    /* renamed from: getMetadata */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> m96586x6107b8a5() {
        return this.f47371xe52d7b2f;
    }

    /* renamed from: getOutputFileType */
    public java.lang.String m96587x2cc793ed() {
        return this.f47372x3e2fc6f7;
    }

    /* renamed from: getRenderContextParams */
    public com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff m96588x6eb76ae9() {
        return this.f47375x16878e1f;
    }

    /* renamed from: getStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535 m96589x2fe4f2e8() {
        return this.f47378xcacdcff2;
    }

    /* renamed from: getVideoOutputPath */
    public java.lang.String m96590xe1cd2d6b() {
        return this.f47379xfd6b5ba1;
    }

    /* renamed from: isShouldOptimizeForNetworkUse */
    public boolean m96591xd95552c8() {
        return this.f47376xe3cc6252;
    }

    /* renamed from: prepareParallelSegmentInfo */
    public boolean m96592x60565d73(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb c25719xdaa2a3bb) {
        com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f c25764x27f5008f = this.f47365xf855d0af;
        if (c25764x27f5008f == null || c25719xdaa2a3bb == null) {
            return false;
        }
        int m97027x7498cf1c = c25719xdaa2a3bb.m97027x7498cf1c();
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = c25719xdaa2a3bb.f47717x16fae70;
        c25764x27f5008f.m97510x60565d73(m97027x7498cf1c, c25738xead39d26, c25738xead39d26);
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25683x77c631c2
    /* renamed from: renderContext */
    public com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 mo96593x399b739() {
        com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f c25764x27f5008f;
        if (this.f47374x399b739 == null && (c25764x27f5008f = this.f47365xf855d0af) != null) {
            this.f47373xecf0f944 = c25764x27f5008f.m97499x4310109f();
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = new com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719(this.f47365xf855d0af.m97505x7ea32c8e(), this.f47365xf855d0af.m97504x3bf36b5f(), this.f47373xecf0f944);
            this.f47374x399b739 = c25779x3338e719;
            c25779x3338e719.m97637x1cf75088(this.f47375x16878e1f);
        }
        return this.f47374x399b739;
    }

    /* renamed from: reset */
    public void m96594x6761d4f() {
        try {
            this.f47365xf855d0af.m97512x6761d4f();
            this.f47374x399b739 = null;
        } catch (java.io.IOException unused) {
        }
    }

    /* renamed from: setDirectoryForTemporaryFiles */
    public void m96595x982a46e4(java.lang.String str) {
        this.f47363x493d84e2 = str;
    }

    /* renamed from: setEncodeOption */
    public void m96596x5ca3d7ad(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036) {
        this.f47364xc5684a2b = c25679xbb204036;
    }

    /* renamed from: setMetadata */
    public void m96597x5bc019b1(java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> list) {
        this.f47371xe52d7b2f = list;
    }

    /* renamed from: setRenderContextParams */
    public void m96598xbcfc2a5d(com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff c25780x613b55ff) {
        this.f47375x16878e1f = c25780x613b55ff;
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f47374x399b739;
        if (c25779x3338e719 != null) {
            c25779x3338e719.m97637x1cf75088(c25780x613b55ff);
        }
    }

    /* renamed from: setShouldOptimizeForNetworkUse */
    public void m96599x7277e090(boolean z17) {
        this.f47376xe3cc6252 = z17;
    }

    /* renamed from: startSessionAtSourceTime */
    public void m96600x10b0680f(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f47377x81158a4f = c25736x76b98a57;
    }

    /* renamed from: startWriting */
    public boolean m96602x57887a1a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25768xd59ba4f7 interfaceC25768xd59ba4f7) {
        if (this.f47379xfd6b5ba1 == null) {
            return false;
        }
        m96575xae6a0502();
        try {
            com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f c25764x27f5008f = new com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f(this.f47379xfd6b5ba1, interfaceC25768xd59ba4f7);
            this.f47365xf855d0af = c25764x27f5008f;
            c25764x27f5008f.m97514x596d8674(this.f47370xc231f8f2);
            this.f47365xf855d0af.m97513x5ca3d7ad(this.f47364xc5684a2b);
            java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27> it = this.f47369xb96fa1e9.iterator();
            while (it.hasNext()) {
                it.next().m96622xf3d9c872(this);
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "startWriting", e17);
            this.f47368x498dcd72.clear();
            com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f c25764x27f5008f2 = this.f47365xf855d0af;
            if (c25764x27f5008f2 != null) {
                c25764x27f5008f2.m97518x360802();
                this.f47365xf855d0af = null;
            }
            return false;
        }
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.StatusListener
    /* renamed from: statusChanged */
    public void mo96603xb9fbb662(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535 enumC25668xc8009535) {
        this.f47368x498dcd72.put(c25667x9a895e27, enumC25668xc8009535);
        com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535 enumC25668xc80095352 = this.f47378xcacdcff2;
        m96571x6d0fa79();
        com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535 enumC25668xc80095353 = this.f47378xcacdcff2;
        if (enumC25668xc80095352 == enumC25668xc80095353 || enumC25668xc80095353 != com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusWriting) {
            return;
        }
        for (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e272 : this.f47369xb96fa1e9) {
        }
    }

    /* renamed from: finishWriting */
    public boolean m96580xed7248c9(boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f c25764x27f5008f = this.f47365xf855d0af;
        boolean m97519x360802 = c25764x27f5008f != null ? c25764x27f5008f.m97519x360802(z17) : false;
        this.f47378xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusCompleted;
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f47374x399b739;
        if (c25779x3338e719 != null) {
            c25779x3338e719.mo97551x41012807();
            this.f47374x399b739 = null;
        }
        android.view.Surface surface = this.f47373xecf0f944;
        if (surface != null) {
            surface.release();
            this.f47373xecf0f944 = null;
        }
        return m97519x360802;
    }

    /* renamed from: startWriting */
    public boolean m96601x57887a1a() {
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27> it = this.f47369xb96fa1e9.iterator();
        while (it.hasNext()) {
            it.next().m96622xf3d9c872(this);
        }
        return true;
    }
}
