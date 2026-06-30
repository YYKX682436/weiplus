package yx2;

/* loaded from: classes15.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f549388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 f549389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f549390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 c15435x142f8d24, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        super(0);
        this.f549388d = context;
        this.f549389e = c15435x142f8d24;
        this.f549390f = c19792x256d2725;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yx2.f fVar;
        yx2.f fVar2;
        boolean m62949x70d6ab57;
        android.content.Context context = this.f549388d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 c15435x142f8d24 = this.f549389e;
            fVar = c15435x142f8d24.finderDetailLoader;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f549390f;
            fVar.c(c19792x256d2725);
            fVar2 = c15435x142f8d24.finderDetailLoader;
            fVar2.a();
            c15435x142f8d24.m62945xda61da5b(context, c19792x256d2725);
            m62949x70d6ab57 = c15435x142f8d24.m62949x70d6ab57();
            if (m62949x70d6ab57) {
                c15435x142f8d24.m62961x8f9379a7();
            }
        }
        return jz5.f0.f384359a;
    }
}
