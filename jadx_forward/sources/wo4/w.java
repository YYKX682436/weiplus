package wo4;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f529825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(wo4.y yVar) {
        super(0);
        this.f529825d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wo4.y yVar = this.f529825d;
        es0.d dVar = yVar.f529832f;
        wo4.v vVar = new wo4.v(yVar);
        try {
            yVar.f529830d = fp.h.c(23) ? new gs0.p(dVar, vVar) : new gs0.l(dVar, vVar);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VLogRemuxer", e17, "remux error", new java.lang.Object[0]);
            yVar.b();
            yz5.r rVar = yVar.f529845s;
            if (rVar != null) {
                rVar.C("", "", java.lang.Boolean.FALSE, 3);
            }
        }
        gs0.b bVar = yVar.f529830d;
        if (bVar != null) {
            android.view.Surface c17 = bVar.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l1 l1Var = yVar.f529828b;
            int i17 = l1Var.f257192d;
            int i18 = l1Var.f257193e;
            wo4.l lVar = new wo4.l(c17, i17, i18, i17, i18, l1Var.f257189a, dVar.f337848e, yVar.f529839m, yVar.f529840n, yVar.f529827a, new wo4.p(yVar, bVar), new wo4.q(bVar));
            yVar.f529831e = lVar;
            boolean z17 = yVar.f529846t;
            vo4.i iVar = lVar.f529808d;
            if (z17) {
                iVar.f520172j = new wo4.k(lVar, new wo4.s(yVar));
            }
            iVar.b(null);
            wo4.l lVar2 = yVar.f529831e;
            if (lVar2 != null) {
                boolean z18 = yVar.f529846t;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDecoder", "startDecode, withSnapshot:" + z18);
                lVar2.f529813i = z18;
                vo4.i.a(lVar2.f529808d, (android.graphics.Bitmap) ((wo4.j) lVar2.f529814j).mo146xb9724478(0L), z18, null, 4, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
