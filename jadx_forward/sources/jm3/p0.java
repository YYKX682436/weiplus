package jm3;

/* loaded from: classes10.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3 f381876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3 t3Var) {
        super(0);
        this.f381875d = activityC16653xffd2636a;
        this.f381876e = t3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activity = this.f381875d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class);
        h4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3 data = this.f381876e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "updateFinderItem:" + data);
        java.util.ArrayList arrayList = h4Var.f232694e;
        if (arrayList.size() != 0) {
            int i17 = h4Var.f232700n.f233397m;
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            fm3.q qVar = (fm3.q) obj;
            fm3.q qVar2 = new fm3.q();
            fm3.h hVar = fm3.q.f345637p;
            hVar.c(qVar, qVar2);
            java.lang.Object obj2 = h4Var.f232695f.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            qVar2.f345647o = qVar;
            arrayList.set(i17, qVar2);
            hVar.a(data, qVar2);
            fm3.g0.f345603a.b(i17, qVar2);
            h4Var.T6(i17, qVar2, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f4(h4Var, i17, qVar2));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class)).f232707u = true;
        return jz5.f0.f384359a;
    }
}
