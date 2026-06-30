package fr4;

/* loaded from: classes10.dex */
public final class a0 implements le0.r {

    /* renamed from: a, reason: collision with root package name */
    public static final fr4.a0 f347334a = new fr4.a0();

    @Override // le0.r
    public final void a(android.content.Context context, le0.t tVar) {
        if (context instanceof android.app.Activity) {
            java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("Chat_User");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
            if (stringExtra != null && stringExtra.endsWith("@zhugemsg")) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1) tVar).f272777w = kz5.p1.d(Integer.MAX_VALUE);
            }
        }
    }
}
