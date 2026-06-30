package vq4;

/* loaded from: classes12.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f520917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f520918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z17, rh.c1 c1Var) {
        super(1);
        this.f520917d = z17;
        this.f520918e = c1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subJson, "$this$subJson");
        rh.c1 c1Var = this.f520918e;
        boolean z17 = this.f520917d;
        vq4.x.a(subJson, com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20061xcc101583, new vq4.s(c1Var, z17));
        vq4.x.a(subJson, "app", new vq4.t(c1Var));
        if (z17) {
            vq4.x.a(subJson, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, new vq4.u(c1Var));
        }
        return jz5.f0.f384359a;
    }
}
