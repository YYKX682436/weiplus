package i31;

/* loaded from: classes9.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i31.i f369638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i31.b f369639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f369640f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i31.i iVar, i31.b bVar, java.lang.String str) {
        super(1);
        this.f369638d = iVar;
        this.f369639e = bVar;
        this.f369640f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = (com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3) obj;
        i31.i iVar = this.f369638d;
        iVar.f369643d = c11162xe78737a3;
        i31.b bVar = this.f369639e;
        if (c11162xe78737a3 == null) {
            ((m31.j) bVar).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSubscribeMsgManagerUI", "getSubscribeMsgList ERROR");
        } else {
            ((m31.j) bVar).a(c11162xe78737a3);
        }
        iVar.h(c11162xe78737a3, this.f369640f);
        iVar.i(0);
        return jz5.f0.f384359a;
    }
}
