package wj2;

/* loaded from: classes10.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.py1 f528242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj2.w f528243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r45.py1 py1Var, wj2.w wVar) {
        super(0);
        this.f528242d = py1Var;
        this.f528243e = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.py1 py1Var = this.f528242d;
        if (py1Var.m75939xb282bd08(1) > 0) {
            int m75939xb282bd08 = py1Var.m75939xb282bd08(1);
            wj2.w wVar = this.f528243e;
            if (m75939xb282bd08 != wVar.C) {
                wVar.C = py1Var.m75939xb282bd08(1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.m145853xb5886c64(), "doHighLightLikeLive interval:" + wVar.C);
            }
        }
        return jz5.f0.f384359a;
    }
}
