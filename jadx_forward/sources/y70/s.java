package y70;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly70/s;", "Lg75/f0;", "Lm70/e;", "Lm70/g;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "feature-img_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class s extends g75.f0<m70.e, m70.g> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0, g75.t
    public void c() {
        super.c();
        f(new y70.q(this));
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        m70.e eVar = (m70.e) bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgShowImagePPC", "MsgImgShowImageAction - showImage");
        j(zVar, eVar.f406004b, eVar.f406005c);
        h().l("HAS_SHOWN_KEY", java.lang.Boolean.TRUE);
        return new m70.g();
    }

    public final void j(g75.z zVar, java.lang.String str, android.graphics.Bitmap bitmap) {
        y70.r rVar = new y70.r(this, str, bitmap);
        if (zVar.e("Common_MakeSureUIThread", false)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a.d(rVar);
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(rVar);
        }
    }
}
