package vr1;

/* loaded from: classes8.dex */
public final class e implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vr1.o f521089a;

    public e(vr1.o oVar) {
        this.f521089a = oVar;
    }

    @Override // in5.y0
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.w0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        vr1.o oVar = this.f521089a;
        int size = oVar.P6().f233598o.size();
        if (size > 0 && data.f374685e > size - 10) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.g(oVar.P6(), null, 0, 2, null);
        }
        pm0.v.X(new vr1.d(oVar, data));
    }
}
