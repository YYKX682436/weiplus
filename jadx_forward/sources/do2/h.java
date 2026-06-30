package do2;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f f323617d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f c14446xd52a323f) {
        this.f323617d = c14446xd52a323f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        do2.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f.f202579s;
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f c14446xd52a323f = this.f323617d;
        android.util.Size a17 = cVar.a(resources, c14446xd52a323f.getShapeType());
        c14446xd52a323f.getPhotoIV().getLayoutParams().width = a17.getWidth();
        c14446xd52a323f.getPhotoIV().getLayoutParams().height = a17.getHeight();
        c14446xd52a323f.getPhotoIV().requestLayout();
    }
}
