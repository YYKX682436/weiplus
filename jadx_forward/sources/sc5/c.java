package sc5;

/* loaded from: classes9.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f488096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f488097e;

    public c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        this.f488096d = f9Var;
        this.f488097e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc5.f fVar = sc5.f.f488100a;
        sc5.f.c(fVar, "chat_message_event", sc5.f.a(fVar, this.f488096d, this.f488097e));
    }
}
