package ya2;

/* loaded from: classes10.dex */
public final class t0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f542069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542070b;

    public t0(android.content.Intent intent, android.content.Context context) {
        this.f542069a = intent;
        this.f542070b = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        android.content.Intent intent = this.f542069a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            intent.putExtra("feed_object_id", c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L);
        }
        wn2.f fVar2 = (wn2.f) i95.n0.c(wn2.f.class);
        android.content.Context context = this.f542070b;
        fVar2.Ai(context, intent);
        ya2.e1.f542005a.t(context, intent);
        return jz5.f0.f384359a;
    }
}
