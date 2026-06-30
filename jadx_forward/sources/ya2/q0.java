package ya2;

/* loaded from: classes10.dex */
public final class q0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f542056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542057b;

    public q0(android.content.Intent intent, android.content.Context context) {
        this.f542056a = intent;
        this.f542057b = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        ya2.e1 e1Var = ya2.e1.f542005a;
        android.content.Context context = this.f542057b;
        if ((i17 == 0 && fVar.f152149b == 0) || hc2.p.b(i17, fVar.f152149b)) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            java.lang.Long valueOf = c19792x256d2725 != null ? java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()) : null;
            android.content.Intent intent = this.f542056a;
            intent.putExtra("KEY_OBJECT_ID", valueOf);
            e1Var.C(context, intent);
        } else {
            ya2.e1.i(e1Var, context, fVar.f152149b, fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
