package rx4;

/* loaded from: classes8.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.u0 f482787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(rx4.u0 u0Var) {
        super(1);
        this.f482787d = u0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.n8 n8Var = (bw5.n8) obj;
        java.lang.String str = this.f482787d.f482813d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryPreloadBannerCgi done, ret=");
        sb6.append(n8Var != null ? n8Var.f112072f : -1);
        sb6.append(", errMsg=");
        java.lang.String m12558x17ec12d2 = n8Var != null ? n8Var.m12558x17ec12d2() : null;
        if (m12558x17ec12d2 == null) {
            m12558x17ec12d2 = "";
        }
        sb6.append(m12558x17ec12d2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        return jz5.f0.f384359a;
    }
}
