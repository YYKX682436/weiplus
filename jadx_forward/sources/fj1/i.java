package fj1;

/* loaded from: classes4.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.j f344653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fj1.j jVar) {
        super(0);
        this.f344653d = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.f344653d.f344640a.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ej1.a aVar = (ej1.a) entry.getValue();
            yz5.a aVar2 = aVar.f334809b;
            if (aVar2 == null || (k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0) aVar2.mo152xb9724478()) == null) {
                k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0) aVar.f334808a.newInstance();
            }
            hashMap.put(str, k0Var);
        }
        return hashMap;
    }
}
