package nq0;

/* loaded from: classes7.dex */
public final class m implements jc3.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nq0.p f420469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iq0.d f420471f;

    public m(nq0.p pVar, java.lang.String str, iq0.d dVar) {
        this.f420469d = pVar;
        this.f420470e = str;
        this.f420471f = dVar;
    }

    @Override // jc3.l0
    public void i1() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f420469d.f420476e;
        java.lang.String str = this.f420470e;
        if (((jc3.i0) concurrentHashMap.remove(str)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicCardStarterFeatureService", "preload biz destroy, bizName: " + str);
        }
        yz5.a aVar = this.f420471f.f375184d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
