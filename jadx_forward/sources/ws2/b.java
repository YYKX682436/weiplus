package ws2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f530539a;

    /* renamed from: b, reason: collision with root package name */
    public final zs2.d f530540b;

    /* renamed from: c, reason: collision with root package name */
    public final ws2.a f530541c;

    public b(gk2.e eVar, int i17, boolean z17, zs2.d dVar, ws2.a aVar) {
        this.f530539a = eVar;
        this.f530540b = dVar;
        this.f530541c = aVar;
        ct2.d dVar2 = (ct2.d) a(ct2.d.class);
        if (dVar2 != null) {
            dVar2.f303785s = i17;
            dVar2.f303781o = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMsgOffsetSlice", "init scene:" + i17 + ", enableBulletMsg:" + z17);
        }
    }

    public final p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        gk2.e eVar = this.f530539a;
        if (eVar != null) {
            return eVar.a(bu6);
        }
        return null;
    }
}
