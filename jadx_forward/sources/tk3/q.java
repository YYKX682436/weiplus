package tk3;

/* loaded from: classes8.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f501473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f501474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f501475f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(tk3.t tVar, float f17, float f18) {
        super(0);
        this.f501473d = tVar;
        this.f501474e = f17;
        this.f501475f = f18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tk3.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e;
        tk3.t tVar = this.f501473d;
        if (tVar.p() && (dVar = tVar.f501482d) != null && (c16608xd141945e = dVar.f501446a) != null) {
            float f17 = this.f501475f;
            tk3.c cVar = new tk3.c(dVar, f17);
            ck3.t tVar2 = c16608xd141945e.f232072g;
            if (tVar2 != null) {
                tVar2.h(true, cVar, this.f501474e, f17);
            }
        }
        return jz5.f0.f384359a;
    }
}
