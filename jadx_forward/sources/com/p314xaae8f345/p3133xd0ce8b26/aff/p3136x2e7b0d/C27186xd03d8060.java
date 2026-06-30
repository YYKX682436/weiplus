package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContext */
/* loaded from: classes16.dex */
public class C27186xd03d8060 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27186xd03d8060.Destructor f59551x5751f3f9;

    /* renamed from: com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContext$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativeHandler */
        long f59552xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f59553xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f59554xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        /* renamed from: jniDestroyCaraNativeFinderPublishProphetContext */
        public static native void m111681xc99380eb(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            m111681xc99380eb(this.f59552xf042a733, this.f59553xb1c7f9d5, this.f59554xc2e4ffd6);
        }
    }

    public C27186xd03d8060(com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27187x7ae5cb51 interfaceC27187x7ae5cb51) {
        this.f60636x11bb50fe = "cara.CaraNativeFinderPublishProphetContext@Attach";
        m111618x428ba3ff("cara.CaraNativeFinderPublishProphetContext@Attach", this.f60638xc2e4ffd6, interfaceC27187x7ae5cb51);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27186xd03d8060 m111617xa74f78c3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27186xd03d8060(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2);
    }

    /* renamed from: jniCreateCaraNativeFinderPublishProphetContext */
    private native void m111618x428ba3ff(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    /* renamed from: jnieditTimeMs */
    private native int m111619x97181962(long j17);

    /* renamed from: jnienterBackgroundOnPostPage */
    private native boolean m111620xae71090f(long j17);

    /* renamed from: jnifileSize */
    private native float m111621x427a5242(long j17);

    /* renamed from: jnihasCleanUpLongDesc */
    private native boolean m111622x28ae887c(long j17);

    /* renamed from: jnihasCleanUpShortDesc */
    private native boolean m111623x6e1a15be(long j17);

    /* renamed from: jnihasClickLongDescTextView */
    private native boolean m111624x5b3a8f92(long j17);

    /* renamed from: jnihasClickShortDescTextView */
    private native boolean m111625xe44c584c(long j17);

    /* renamed from: jnihasExtReading */
    private native boolean m111626x667213e0(long j17);

    /* renamed from: jnihasInvalidWatermark */
    private native boolean m111627xf62fef22(long j17);

    /* renamed from: jnihasOriginalStatementEntry */
    private native boolean m111628xdb0817a9(long j17);

    /* renamed from: jniisSearchMusic */
    private native boolean m111629x3178b64e(long j17);

    /* renamed from: jnilongDescLength */
    private native int m111630x21e0c358(long j17);

    /* renamed from: jninewSelectOnPostPage */
    private native boolean m111631x3dafa665(long j17);

    /* renamed from: jnioriginAudioBitrate */
    private native float m111632xb22cf162(long j17);

    /* renamed from: jnioriginBitrate */
    private native float m111633xa9dd65e2(long j17);

    /* renamed from: jnioriginHight */
    private native int m111634x8fd2dac7(long j17);

    /* renamed from: jnioriginVideoFrameRate */
    private native float m111635xe2b7299d(long j17);

    /* renamed from: jnioriginWidth */
    private native int m111636x90a6317b(long j17);

    /* renamed from: jnipatMusicType */
    private native int m111637x1e3f19c1(long j17);

    /* renamed from: jnipoiType */
    private native int m111638x5f3f715f(long j17);

    /* renamed from: jnipostFromDraft */
    private native boolean m111639x64c61fd2(long j17);

    /* renamed from: jnipredictProbThreshold */
    private native float m111640x6f288b62(long j17);

    /* renamed from: jnishortDescLength */
    private native int m111641xa95302e(long j17);

    /* renamed from: jniuseVideoTemplateInfo */
    private native boolean m111642x8d5010c1(long j17);

    /* renamed from: jnivideoDurationMs */
    private native int m111643x24fb1af0(long j17);

    /* renamed from: jnivideoEmojiNum */
    private native int m111644xdc0b8b76(long j17);

    /* renamed from: jnivideoMusicIdValid */
    private native boolean m111645x1781fcd2(long j17);

    /* renamed from: jnivideoMusicIndex */
    private native int m111646xabdd3243(long j17);

    /* renamed from: jnivideoPlayDuration */
    private native int m111647xa57ed3fe(long j17);

    /* renamed from: jnivideoSourceType */
    private native int m111648x9954be8b(long j17);

    /* renamed from: jnivideoTextNum */
    private native int m111649xb89c2243(long j17);

    /* renamed from: editTimeMs */
    public int m111650x74b507fd() {
        return m111619x97181962(this.f60634xf042a733);
    }

    /* renamed from: enterBackgroundOnPostPage */
    public boolean m111651x94ebb114() {
        return m111620xae71090f(this.f60634xf042a733);
    }

    /* renamed from: fileSize */
    public float m111652xd4282b9d() {
        return m111621x427a5242(this.f60634xf042a733);
    }

    /* renamed from: hasCleanUpLongDesc */
    public boolean m111653xeecac17() {
        return m111622x28ae887c(this.f60634xf042a733);
    }

    /* renamed from: hasCleanUpShortDesc */
    public boolean m111654x4fa06583() {
        return m111623x6e1a15be(this.f60634xf042a733);
    }

    /* renamed from: hasClickLongDescTextView */
    public boolean m111655x9c7852ed() {
        return m111624x5b3a8f92(this.f60634xf042a733);
    }

    /* renamed from: hasClickShortDescTextView */
    public boolean m111656xcac70051() {
        return m111625xe44c584c(this.f60634xf042a733);
    }

    /* renamed from: hasExtReading */
    public boolean m111657xbfccdb65() {
        return m111626x667213e0(this.f60634xf042a733);
    }

    /* renamed from: hasInvalidWatermark */
    public boolean m111658xd7b63ee7() {
        return m111627xf62fef22(this.f60634xf042a733);
    }

    /* renamed from: hasOriginalStatementEntry */
    public boolean m111659xc182bfae() {
        return m111628xdb0817a9(this.f60634xf042a733);
    }

    /* renamed from: isSearchMusic */
    public boolean m111660x8ad37dd3() {
        return m111629x3178b64e(this.f60634xf042a733);
    }

    /* renamed from: longDescLength */
    public int m111661xf3deec73() {
        return m111630x21e0c358(this.f60634xf042a733);
    }

    /* renamed from: newSelectOnPostPage */
    public boolean m111662x1f35f62a() {
        return m111631x3dafa665(this.f60634xf042a733);
    }

    /* renamed from: originAudioBitrate */
    public float m111663x986b14fd() {
        return m111632xb22cf162(this.f60634xf042a733);
    }

    /* renamed from: originBitrate */
    public float m111664x3382d67() {
        return m111633xa9dd65e2(this.f60634xf042a733);
    }

    /* renamed from: originHight */
    public int m111665x65d3bf8c() {
        return m111634x8fd2dac7(this.f60634xf042a733);
    }

    /* renamed from: originVideoFrameRate */
    public float m111666x31fad278() {
        return m111635xe2b7299d(this.f60634xf042a733);
    }

    /* renamed from: originWidth */
    public int m111667x66a71640() {
        return m111636x90a6317b(this.f60634xf042a733);
    }

    /* renamed from: patMusicType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraFinderPatMusicType m111668x85acd9c() {
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraFinderPatMusicType.m111351x382ad972(m111637x1e3f19c1(this.f60634xf042a733));
    }

    /* renamed from: poiType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraFinderPOIType m111669xe81380a4() {
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraFinderPOIType.m111342x382ad972(m111638x5f3f715f(this.f60634xf042a733));
    }

    /* renamed from: postFromDraft */
    public boolean m111670xbe20e757() {
        return m111639x64c61fd2(this.f60634xf042a733);
    }

    /* renamed from: predictProbThreshold */
    public float m111671xbe6c343d() {
        return m111640x6f288b62(this.f60634xf042a733);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27186xd03d8060.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27186xd03d8060.Destructor(this, this.f60634xf042a733);
        this.f59551x5751f3f9 = destructor;
        destructor.f59552xf042a733 = this.f60634xf042a733;
        destructor.f59553xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f59554xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: shortDescLength */
    public int m111672x785c2a73() {
        return m111641xa95302e(this.f60634xf042a733);
    }

    /* renamed from: useVideoTemplateInfo */
    public boolean m111673xdc93b99c() {
        return m111642x8d5010c1(this.f60634xf042a733);
    }

    /* renamed from: videoDurationMs */
    public int m111674x92c21535() {
        return m111643x24fb1af0(this.f60634xf042a733);
    }

    /* renamed from: videoEmojiNum */
    public int m111675x356652fb() {
        return m111644xdc0b8b76(this.f60634xf042a733);
    }

    /* renamed from: videoMusicIdValid */
    public boolean m111676x2f7379d7() {
        return m111645x1781fcd2(this.f60634xf042a733);
    }

    /* renamed from: videoMusicIndex */
    public int m111677x19a42c88() {
        return m111646xabdd3243(this.f60634xf042a733);
    }

    /* renamed from: videoPlayDuration */
    public int m111678xbd705103() {
        return m111647xa57ed3fe(this.f60634xf042a733);
    }

    /* renamed from: videoSourceType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraFinderVideoSourceType m111679x71bb8d0() {
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraFinderVideoSourceType.m111360x382ad972(m111648x9954be8b(this.f60634xf042a733));
    }

    /* renamed from: videoTextNum */
    public int m111680xa2b7d61e() {
        return m111649xb89c2243(this.f60634xf042a733);
    }

    public C27186xd03d8060(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        m111618x428ba3ff(str, str2, null);
    }
}
