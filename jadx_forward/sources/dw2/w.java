package dw2;

/* loaded from: classes.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 f325702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530) {
        super(1);
        this.f325702d = c14493xfdc11530;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        android.view.View musicViewInManager = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicViewInManager, "musicViewInManager");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530 = this.f325702d;
        if (c14493xfdc11530 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderImgFeedMusicPlayer", "focusView:" + c14493xfdc11530.getId() + ",other:" + musicViewInManager.getId());
            z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14493xfdc11530, musicViewInManager);
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
