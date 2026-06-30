package com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd;

/* renamed from: com.tencent.tavkit.component.TAVSourceImageGenerator */
/* loaded from: classes10.dex */
public class C25867x252329dc {
    public static final java.lang.String TAG = "TAVSourceImageGenerator";

    /* renamed from: assetImageGenerator */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8 f48908xdf413ac8;

    public C25867x252329dc(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e61, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        m98476x316510(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25889x1381b9fa(c25875x73210e61).m98645x86121029(), c25732x76648a85);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r6 = r6;
     */
    /* renamed from: checkRequestedTimes */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m98475x820137a0(java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57> r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L7:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L12
            com.tencent.tav.coremedia.CMTime r0 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f
            r6.add(r0)
        L12:
            r0 = 0
        L13:
            int r1 = r6.size()
            if (r0 >= r1) goto L33
            java.lang.Object r1 = r6.get(r0)
            com.tencent.tav.coremedia.CMTime r1 = (com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) r1
            if (r1 == 0) goto L2b
            long r1 = r1.m97232x31040141()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L30
        L2b:
            com.tencent.tav.coremedia.CMTime r1 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f
            r6.set(r0, r1)
        L30:
            int r0 = r0 + 1
            goto L13
        L33:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r6.iterator()
        L40:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            com.tencent.tav.coremedia.CMTime r2 = (com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) r2
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L40
            r0.add(r2)
            goto L40
        L56:
            r6.clear()
            r6.addAll(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25867x252329dc.m98475x820137a0(java.util.List):void");
    }

    /* renamed from: init */
    private void m98476x316510(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 c25876x5fee0d04, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8 c25658x29f502a8 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8(c25876x5fee0d04.m98593x742a913a());
        this.f48908xdf413ac8 = c25658x29f502a8;
        c25658x29f502a8.m96447xd4b4b47f(c25732x76648a85);
        this.f48908xdf413ac8.m96446x507dfc18(true);
        this.f48908xdf413ac8.m96451xfbd38eb1(c25876x5fee0d04.m98595x57d6f9a5());
    }

    /* renamed from: generateThumbnailAtTime */
    public void m98477x638ec777(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorListener imageGeneratorListener) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (c25736x76b98a57 == null || c25736x76b98a57.m97232x31040141() < 0) {
            c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        }
        arrayList.add(c25736x76b98a57);
        m98479xe4a27dc(arrayList, imageGeneratorListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
    
        if (r7.m97232x31040141() < 0) goto L7;
     */
    /* renamed from: generateThumbnailAtTimeSync */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap m98478xe787c2b2(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 r7) {
        /*
            r6 = this;
            com.tencent.tav.core.AssetImageGenerator r0 = r6.f48908xdf413ac8
            r1 = 0
            if (r0 == 0) goto L21
            if (r7 == 0) goto L11
            long r2 = r7.m97232x31040141()     // Catch: java.lang.Exception -> L1a
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L13
        L11:
            com.tencent.tav.coremedia.CMTime r7 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f     // Catch: java.lang.Exception -> L1a
        L13:
            com.tencent.tav.core.AssetImageGenerator r0 = r6.f48908xdf413ac8     // Catch: java.lang.Exception -> L1a
            android.graphics.Bitmap r1 = r0.m96440x99dd0b50(r7, r1)     // Catch: java.lang.Exception -> L1a
            goto L21
        L1a:
            r7 = move-exception
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r7)
            throw r0
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25867x252329dc.m98478xe787c2b2(com.tencent.tav.coremedia.CMTime):android.graphics.Bitmap");
    }

    /* renamed from: generateThumbnailAtTimes */
    public synchronized void m98479xe4a27dc(java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57> list, final com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorListener imageGeneratorListener) {
        m98475x820137a0(list);
        if (!list.isEmpty()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8 c25658x29f502a8 = this.f48908xdf413ac8;
            if (c25658x29f502a8 == null) {
            } else {
                c25658x29f502a8.m96441xa4de9cc3(list, new com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorListener() { // from class: com.tencent.tavkit.component.TAVSourceImageGenerator.1
                    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorListener
                    /* renamed from: onCompletion */
                    public void mo96462xa6db431b(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, android.graphics.Bitmap bitmap, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572, com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.AssetImageGeneratorResult assetImageGeneratorResult) {
                        imageGeneratorListener.mo96462xa6db431b(c25736x76b98a57, bitmap, c25736x76b98a572, assetImageGeneratorResult);
                    }
                });
            }
        }
    }

    /* renamed from: getAssetImageGenerator */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8 m98480x37711792() {
        return this.f48908xdf413ac8;
    }

    public C25867x252329dc(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 c25876x5fee0d04, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        m98476x316510(c25876x5fee0d04, c25732x76648a85);
    }
}
