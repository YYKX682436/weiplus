package xe3;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe3.p f535493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f535494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xe3.p pVar, int i17) {
        super(1);
        this.f535493d = pVar;
        this.f535494e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xe3.f it = (xe3.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "destroy " + it);
        rh3.r rVar = it.f535477d;
        rVar.mo162432x360802();
        rVar.mo162427x41012807();
        xe3.p pVar = this.f535493d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = pVar.f535495d;
        int i17 = this.f535494e;
        concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        pVar.f535496e.remove(java.lang.Integer.valueOf(i17));
        return jz5.f0.f384359a;
    }
}
