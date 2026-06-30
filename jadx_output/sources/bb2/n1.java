package bb2;

/* loaded from: classes10.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wp.a f18924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(bb2.w1 w1Var, wp.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18923d = w1Var;
        this.f18924e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bb2.n1(this.f18923d, this.f18924e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bb2.n1 n1Var = (bb2.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bb2.w1 w1Var = (bb2.w1) new java.lang.ref.WeakReference(this.f18923d).get();
        if (w1Var != null) {
            java.lang.Object obj2 = this.f18924e.f448354y;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FinderBulletInfo");
            bb2.o oVar = (bb2.o) obj2;
            bb2.m0 m0Var = bb2.m0.f18918a;
            android.view.View view = w1Var.f19036a;
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.content.Context context2 = view.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("bs_id", pm0.v.u(oVar.f18926a.getLong(0)));
            jSONObject.put("feedid", pm0.v.u(w1Var.e().getItemId()));
            m0Var.a(context, V6, "bullet_screen", false, jSONObject, w1Var.f19046k, oVar.f18926a.getInteger(6));
        }
        return jz5.f0.f302826a;
    }
}
