package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* renamed from: com.tencent.tinker.loader.TinkerLoader */
/* loaded from: classes13.dex */
public class C26604x9a97c832 extends com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.AbstractC26595xeba5c974 {
    private static final java.lang.String TAG = "Tinker.TinkerLoader";

    /* renamed from: sProcessGuardRef */
    private static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26628x41f2e85 f55470x20fc6a4a;

    /* renamed from: checkSafeModeCount */
    private boolean m104516xdfcefbf7(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 abstractApplicationC26612x4766a891) {
        int m104734x7e090069 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104734x7e090069(abstractApplicationC26612x4766a891);
        if (m104734x7e090069 >= 2) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104760x10df66dd(abstractApplicationC26612x4766a891, 0);
            return false;
        }
        abstractApplicationC26612x4766a891.m104544x25bf4bb5(true);
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104760x10df66dd(abstractApplicationC26612x4766a891, m104734x7e090069 + 1);
        return true;
    }

    /* renamed from: tryCleanObsoletePatches */
    private void m104517x24ff0fef(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 abstractApplicationC26612x4766a891) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "try clean obsolete patches", new java.lang.Object[0]);
        java.io.File m104679xac1dbbfb = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(abstractApplicationC26612x4766a891);
        if (m104679xac1dbbfb == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "tryCleanObsoletePatches:getPatchDirectory == null", new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104726xcd396f71(m104679xac1dbbfb, null);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "tryCleanObsoletePatches: clean end, ok!", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x03c9, code lost:
    
        return;
     */
    /* renamed from: tryLoadPatchFilesInternal */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m104518xb8aa360d(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 r28, android.content.Intent r29, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26628x41f2e85[] r30) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26604x9a97c832.m104518xb8aa360d(com.tencent.tinker.loader.app.TinkerApplication, android.content.Intent, com.tencent.tinker.loader.shareutil.Guard[]):void");
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.AbstractC26595xeba5c974
    /* renamed from: tryLoad */
    public android.content.Intent mo104449xc1a8a541(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 abstractApplicationC26612x4766a891) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26628x41f2e85 c26628x41f2e85;
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.d(TAG, "tryLoad test test", new java.lang.Object[0]);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26628x41f2e85[] c26628x41f2e85Arr = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26628x41f2e85[1];
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        m104518xb8aa360d(abstractApplicationC26612x4766a891, intent, c26628x41f2e85Arr);
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104655x81f2b7a4(intent, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104650xc7992e6f(intent) != 0 && (c26628x41f2e85 = c26628x41f2e85Arr[0]) != null) {
            c26628x41f2e85.close();
        }
        f55470x20fc6a4a = c26628x41f2e85Arr[0];
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104740xbf883707(abstractApplicationC26612x4766a891)) {
            m104517x24ff0fef(abstractApplicationC26612x4766a891);
        }
        return intent;
    }
}
