package cw2;

/* loaded from: classes4.dex */
public final class p9 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19743xb3657be5 {
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15198x17d381a L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15198x17d381a c15198x17d381a) {
        super(context);
        this.L = c15198x17d381a;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19743xb3657be5
    /* renamed from: getBusinessType */
    public int mo75821x38d97590() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19743xb3657be5, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoPath */
    public void mo69327xab3268fe(java.lang.String str) {
        java.lang.String m61520x16b3d939;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setVideoPath] ");
        m61520x16b3d939 = this.L.m61520x16b3d939();
        sb6.append(m61520x16b3d939);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoView", sb6.toString());
        super.mo69327xab3268fe(str);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19743xb3657be5, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: stop */
    public void mo69303x360802() {
        java.lang.String m61520x16b3d939;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[stop] ");
        m61520x16b3d939 = this.L.m61520x16b3d939();
        sb6.append(m61520x16b3d939);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoView", sb6.toString());
        super.mo69303x360802();
    }
}
