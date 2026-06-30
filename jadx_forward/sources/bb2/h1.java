package bb2;

/* loaded from: classes10.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(bb2.w1 w1Var) {
        super(1);
        this.f100415d = w1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wp.i danmaku = (wp.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmaku, "danmaku");
        yp.o oVar = danmaku.H;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(oVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.BulletViewHolder");
        bb2.b bVar = (bb2.b) oVar;
        java.lang.Object obj2 = danmaku.f529887y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FinderBulletInfo");
        bb2.o oVar2 = (bb2.o) obj2;
        bb2.w1 w1Var = this.f100415d;
        android.content.Context context = w1Var.f100569a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class);
        if (c15442xfd56d647 != null) {
            c15442xfd56d647.b7(w1Var.e(), oVar2.f100459a);
        }
        bVar.g(oVar2);
        w1Var.d().f520385d.N1(danmaku, bVar);
        return jz5.f0.f384359a;
    }
}
