package mb2;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mb2.k f406881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(mb2.k kVar) {
        super(1);
        this.f406881d = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.xb1 it = (r45.xb1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConfigItem", "[ServerExptConfig] addFinderInitListener");
        mb2.k kVar = this.f406881d;
        kVar.a();
        yz5.a aVar = kVar.f406868c;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
