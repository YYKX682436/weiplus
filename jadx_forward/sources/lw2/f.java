package lw2;

/* loaded from: classes2.dex */
public final class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lw2.m f403101a;

    public f(lw2.m mVar) {
        this.f403101a = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gs
    public boolean a(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        lw2.m mVar = this.f403101a;
        return mVar.f403111c && mVar.f403109a.F() && event.getAction() == 0;
    }
}
