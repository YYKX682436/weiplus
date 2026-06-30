package mb2;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mb2.c f406870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(mb2.c cVar) {
        super(1);
        this.f406870d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.xb1 it = (r45.xb1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConfigItem", "[FinderConfigItem] addFinderInitListener");
        mb2.c cVar = this.f406870d;
        cVar.f406872f = it;
        cVar.a();
        yz5.a aVar = cVar.f406868c;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
