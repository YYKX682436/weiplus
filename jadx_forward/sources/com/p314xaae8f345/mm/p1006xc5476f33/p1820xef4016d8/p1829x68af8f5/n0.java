package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes4.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 f227430d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 c16346x4deb5237, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var) {
        this.f227430d = b1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1.f435980j == 4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r1.f153184y1 == 4) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r10 = this;
            com.tencent.mm.plugin.luckymoney.story.b1 r0 = r10.f227430d
            boolean r1 = r0.f227358e
            java.lang.String r2 = "MicroMsg.EnvelopeStoryVideoManager"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L4a
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f227366m
            com.tencent.mm.pluginsdk.ui.tools.f4 r6 = r1.f271281q
            boolean r7 = r6 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4
            r8 = 0
            r9 = 4
            if (r7 == 0) goto L24
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r6 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) r6
            ph3.k r1 = r6.f272983m
            if (r1 == 0) goto L31
            ph3.o r1 = r1.f435961f
            if (r1 == 0) goto L31
            int r1 = r1.f435980j
            if (r1 != r9) goto L31
            goto L30
        L24:
            java.lang.String r6 = "MicroMsg.EnvelopeStoryVideoView"
            java.lang.String r7 = "videoview not VideoPlayerTextureView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r7)
            int r1 = r1.f153184y1
            if (r1 != r9) goto L31
        L30:
            r8 = r3
        L31:
            if (r8 == 0) goto L4a
            java.lang.String r1 = "resume success, keep play"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r1)
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f227366m
            r1.g()
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f227366m
            int r1 = r1.mo61523x898ffe25()
            long r1 = (long) r1
            r0.f227363j = r1
            r0.f227364k = r4
            goto L66
        L4a:
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f227366m
            boolean r1 = r1.mo61531xc00617a4()
            if (r1 == 0) goto L66
            java.lang.String r1 = "resume fail, restart play"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r1)
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f227366m
            r1.mo48239x360802()
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f227366m
            r1.mo48238x68ac462()
            r0.f227363j = r4
            r0.f227364k = r4
        L66:
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f227365l
            r0.set(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.n0.run():void");
    }
}
