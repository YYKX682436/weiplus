package bd5;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f19440d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f19441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI f19442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI msgHistoryGalleryPersonRecommendUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f19442f = msgHistoryGalleryPersonRecommendUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        bd5.j jVar = new bd5.j(this.f19442f, continuation);
        jVar.f19441e = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bd5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[LOOP:1: B:27:0x006c->B:42:?, LOOP_END, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd5.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
