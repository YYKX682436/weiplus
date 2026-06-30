package jm3;

/* loaded from: classes10.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f381891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        super(0);
        this.f381890d = activityC16653xffd2636a;
        this.f381891e = abstractC15633xee433078;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activity = this.f381890d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b data = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) this.f381891e;
        h4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "updateAlbumItem:" + data);
        java.util.ArrayList arrayList = h4Var.f232694e;
        if (arrayList.size() != 0) {
            int i17 = h4Var.f232700n.f233397m;
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            fm3.q qVar = (fm3.q) obj;
            fm3.q qVar2 = new fm3.q();
            fm3.q.f345637p.c(qVar, qVar2);
            java.lang.Object obj2 = h4Var.f232695f.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            qVar2.f345647o = qVar;
            arrayList.set(i17, qVar2);
            qVar2.f345642g = 1;
            qVar2.f345645m = new fm3.m(data);
            java.lang.String n17 = data.n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "uniqueValue(...)");
            java.lang.String str = data.f219963e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getOriginalPath(...)");
            fm3.p pVar = new fm3.p(n17, str, data.f219979x, 0, 0, 24, null);
            pVar.f345631d = data.f219981z;
            pVar.f345632e = data.f219980y;
            qVar2.f345646n = pVar;
            fm3.g0.f345603a.b(i17, qVar2);
            h4Var.T6(i17, qVar2, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e4(h4Var, i17, qVar2));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class)).f232707u = true;
        return jz5.f0.f384359a;
    }
}
