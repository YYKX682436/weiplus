package com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826;

/* renamed from: com.tencent.wechat.aff.finder.FinderPrefetchManager */
/* loaded from: classes8.dex */
public class C27311x43a2d090 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27311x43a2d090 f59628x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27311x43a2d090();

    public C27311x43a2d090() {
        m119450xee932d13("finder.FinderPrefetchManager@Get", null);
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27311x43a2d090 m112842x9cf0d20b() {
        return f59628x21169495;
    }

    /* renamed from: canShowEduTipsWithKey */
    public boolean m112843xefa19018(bw5.ms0 ms0Var) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("canShowEduTipsWithKey");
            c27687xa835a820.m119504xd8dd29ef(ms0Var.f111915d);
            return new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119473xd7c8d5b2();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.canShowEduTipsWithKey failed", e17);
        }
    }

    /* renamed from: hasEnoughValidLocalFeeds */
    public boolean m112844x6bc3acfc(bw5.qs0 qs0Var, bw5.os0 os0Var, int i17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("hasEnoughValidLocalFeeds");
            c27687xa835a820.m119504xd8dd29ef(qs0Var.f113812d);
            c27687xa835a820.m119504xd8dd29ef(os0Var.f112918d);
            c27687xa835a820.m119510x55370fd8(i17);
            return new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119473xd7c8d5b2();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.hasEnoughValidLocalFeeds failed", e17);
        }
    }

    /* renamed from: init */
    public void m112845x316510(java.lang.String str) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
            c27687xa835a820.m119508x542d00d0(str);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.init failed", e17);
        }
    }

    /* renamed from: localFeedArray */
    public java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f> m112846x3b87d830(bw5.qs0 qs0Var, bw5.os0 os0Var, int i17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("localFeedArray");
            c27687xa835a820.m119504xd8dd29ef(qs0Var.f113812d);
            c27687xa835a820.m119504xd8dd29ef(os0Var.f112918d);
            c27687xa835a820.m119510x55370fd8(i17);
            return com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119635x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f.m112791x7c90cfc0(), new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119476x14fee6b3());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.localFeedArray failed", e17);
        }
    }

    /* renamed from: localFeedArrayWithFeedSource */
    public java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f> m112847x1266690f(long j17, bw5.os0 os0Var, int i17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("localFeedArrayWithFeedSource");
            c27687xa835a820.m119512x55371037(j17);
            c27687xa835a820.m119504xd8dd29ef(os0Var.f112918d);
            c27687xa835a820.m119510x55370fd8(i17);
            return com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119635x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f.m112791x7c90cfc0(), new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119476x14fee6b3());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.localFeedArrayWithFeedSource failed", e17);
        }
    }

    /* renamed from: markEduTipsNeverShowWithKey */
    public void m112848xcf03c271(bw5.ms0 ms0Var) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("markEduTipsNeverShowWithKey");
            c27687xa835a820.m119504xd8dd29ef(ms0Var.f111915d);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.markEduTipsNeverShowWithKey failed", e17);
        }
    }

    /* renamed from: markShowOnceEduTipsWithKey */
    public void m112849xba8311b6(bw5.ms0 ms0Var) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("markShowOnceEduTipsWithKey");
            c27687xa835a820.m119504xd8dd29ef(ms0Var.f111915d);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.markShowOnceEduTipsWithKey failed", e17);
        }
    }

    /* renamed from: removeAllLocalBackupFeeds */
    public void m112850x1d99ee25() {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("removeAllLocalBackupFeeds");
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.removeAllLocalBackupFeeds failed", e17);
        }
    }

    /* renamed from: removeLocalBackupFeeds */
    public void m112851xa47eee2c(java.util.ArrayList<java.lang.String> arrayList) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("removeLocalBackupFeeds");
            c27687xa835a820.m119509x81443d8e(arrayList);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.removeLocalBackupFeeds failed", e17);
        }
    }

    /* renamed from: resetEduTipsRecordWithKey */
    public void m112852x3481ca9(bw5.ms0 ms0Var) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("resetEduTipsRecordWithKey");
            c27687xa835a820.m119504xd8dd29ef(ms0Var.f111915d);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.resetEduTipsRecordWithKey failed", e17);
        }
    }

    /* renamed from: updateEduTipsSvrFlag */
    public void m112853xf655dbb6(bw5.tr trVar) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("updateEduTipsSvrFlag");
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(trVar));
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.updateEduTipsSvrFlag failed", e17);
        }
    }

    /* renamed from: updateLocalBackupFeed */
    public void m112854x48f38442(java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f> arrayList, bw5.os0 os0Var, long j17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("updateLocalBackupFeed");
            c27687xa835a820.m119499x3320ea8a(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119632xd1dc376e(arrayList));
            c27687xa835a820.m119504xd8dd29ef(os0Var.f112918d);
            c27687xa835a820.m119512x55371037(j17);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderPrefetchManager.updateLocalBackupFeed failed", e17);
        }
    }
}
