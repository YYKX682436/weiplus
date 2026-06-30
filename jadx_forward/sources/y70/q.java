package y70;

/* loaded from: classes11.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y70.s f541223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y70.s sVar) {
        super(1);
        this.f541223d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof m70.f)) {
            m70.f fVar = (m70.f) dVar;
            y70.s sVar = this.f541223d;
            if (!sVar.h().e("HAS_SHOWN_KEY", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgShowImagePPC", "MsgImgShowImageBypassAction - showImage");
                sVar.j(state, fVar.f406006b, fVar.f406007c);
            }
        }
        return jz5.f0.f384359a;
    }
}
