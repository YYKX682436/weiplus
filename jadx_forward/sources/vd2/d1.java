package vd2;

/* loaded from: classes3.dex */
public final class d1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f517228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f517229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f517230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f517231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wk0 f517232e;

    public d1(ss5.d0 d0Var, vd2.f1 f1Var, android.content.Context context, android.content.Intent intent, r45.wk0 wk0Var) {
        this.f517228a = d0Var;
        this.f517229b = f1Var;
        this.f517230c = context;
        this.f517231d = intent;
        this.f517232e = wk0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ss5.d0 d0Var = this.f517228a;
        if (d0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
            d0Var.c(fVar);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && c19792x256d2725 != null) {
            pm0.v.X(new vd2.c1(this.f517229b, this.f517230c, this.f517231d, c19792x256d2725, this.f517232e, this.f517228a));
        } else {
            java.lang.String str = this.f517229b.f517258d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterLiveD error ");
            sb6.append(fVar.f152148a);
            sb6.append(", ");
            sb6.append(fVar.f152149b);
            sb6.append(", ");
            sb6.append(c19792x256d2725 != null ? java.lang.Integer.valueOf(c19792x256d2725.hashCode()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
