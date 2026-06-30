package vw2;

/* loaded from: classes2.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.o f522359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vw2.n f522360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f522361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p093xedfae76a.o oVar, vw2.n nVar, java.util.List list) {
        super(0);
        this.f522359d = oVar;
        this.f522360e = nVar;
        this.f522361f = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final p012xc85e97e9.p093xedfae76a.o oVar = this.f522359d;
        oVar.a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.finder.view.animation.btncarousel.ToolbarButtonCarouselAnimationHelper$1$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                java.util.Map map = vw2.n.f522399e;
                java.util.Iterator it = ((java.util.LinkedHashMap) vw2.n.f522401g).entrySet().iterator();
                while (it.hasNext()) {
                    ((android.animation.Animator) ((java.util.Map.Entry) it.next()).getValue()).cancel();
                }
                ((java.util.LinkedHashMap) vw2.n.f522401g).clear();
                ((java.util.LinkedHashMap) vw2.n.f522400f).clear();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ToolbarButtonCarouselAnimationHelper", "removeAllHolders");
                p012xc85e97e9.p093xedfae76a.o.this.c(this);
            }
        });
        ((java.util.ArrayList) this.f522360e.f522405d).addAll(this.f522361f);
        return jz5.f0.f384359a;
    }
}
