package sc5;

/* loaded from: classes9.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f488095d;

    public b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f488095d = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc5.f fVar = sc5.f.f488100a;
        java.util.Map a17 = sc5.f.a(fVar, this.f488095d, 3);
        a17.put("exp_params", "");
        sc5.f.c(fVar, "chat_message_click", a17);
    }
}
