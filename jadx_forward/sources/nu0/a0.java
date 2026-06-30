package nu0;

/* loaded from: classes5.dex */
public final class a0 implements com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f421389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f421390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f421391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h f421392d;

    public a0(nu0.q0 q0Var, int i17, int i18, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h hVar) {
        this.f421389a = q0Var;
        this.f421390b = i17;
        this.f421391c = i18;
        this.f421392d = hVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h
    public final void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            nu0.q0 q0Var = this.f421389a;
            java.util.ArrayList arrayList = (java.util.ArrayList) q0Var.f421610t;
            int i17 = this.f421390b;
            java.lang.String str2 = (java.lang.String) arrayList.get(i17);
            int i18 = this.f421391c;
            if (i17 < i18) {
                i18--;
            }
            ((java.util.ArrayList) q0Var.f421610t).remove(i17);
            if (i18 < 0 || i18 >= ((java.util.ArrayList) q0Var.f421610t).size()) {
                java.util.List list = q0Var.f421610t;
                ((java.util.ArrayList) list).add(((java.util.ArrayList) list).size(), str2);
            } else {
                ((java.util.ArrayList) q0Var.f421610t).add(i18, str2);
            }
            nu0.q0.W6(q0Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ImageControlUIC", "[moveScene] err:" + str);
        }
        this.f421392d.a(str);
    }
}
