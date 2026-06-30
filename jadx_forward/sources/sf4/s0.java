package sf4;

/* loaded from: classes4.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489110d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502) {
        this.f489110d = c18497x85806502;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f489110d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18495x53f31c35 c18495x53f31c35 = c18497x85806502.f253627n;
        if (c18495x53f31c35 == null || c18495x53f31c35.getVideoItem() == null) {
            return;
        }
        nf4.l i18 = ef4.w.f334001t.i();
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18495x53f31c35 c18495x53f31c352 = c18497x85806502.f253627n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18495x53f31c352);
        if4.h videoItem = c18495x53f31c352.getVideoItem();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(videoItem);
        nf4.k kVar = nf4.l.f418391m;
        long j17 = videoItem.f372787b;
        nf4.j J0 = j17 >= 0 ? i18.J0((int) j17) : i18.L0(j17);
        if (J0 != null) {
            J0.f69408x56b3c014++;
            i17 = i18.f418405h.p("MMStoryInfo", J0.mo9763xeb27878e(), "storyID=?", new java.lang.String[]{"" + j17});
        } else {
            i17 = -1;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.f253618l1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("storyId :");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18495x53f31c35 c18495x53f31c353 = c18497x85806502.f253627n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18495x53f31c353);
        if4.h videoItem2 = c18495x53f31c353.getVideoItem();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(videoItem2);
        sb6.append(videoItem2.f372787b);
        sb6.append(" read times + 1  ,result:");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryGalleryView", sb6.toString());
    }
}
