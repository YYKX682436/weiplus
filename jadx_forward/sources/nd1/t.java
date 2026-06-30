package nd1;

/* loaded from: classes7.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1104x34628f.C12201x3480ccab f417929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f417930e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1104x34628f.C12201x3480ccab c12201x3480ccab, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        super(0);
        this.f417929d = c12201x3480ccab;
        this.f417930e = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        android.app.Activity activity2 = (android.app.Activity) com.p314xaae8f345.mm.app.w.INSTANCE.f135419h.get();
        android.content.Context context = activity != null ? activity : activity2 != null ? activity2 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiNavigateToWC", "halfRestartAppBrandImpl ipc topActivity=" + activity + ", foregroundActivity=" + activity2);
        nd1.s sVar = nd1.c0.f417806g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        nd1.s.a(sVar, context, this.f417929d);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f417930e;
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true));
        }
        return jz5.f0.f384359a;
    }
}
