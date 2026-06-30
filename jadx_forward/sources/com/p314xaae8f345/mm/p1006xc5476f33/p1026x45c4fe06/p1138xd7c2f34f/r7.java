package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class r7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f166638d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(java.util.HashMap hashMap) {
        super(0);
        this.f166638d = hashMap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Set<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6> keySet = this.f166638d.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var : keySet) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5 x5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f166943a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z6Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "removePreGetDownloadUrlResult " + z6Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f166944b.remove(z6Var);
        }
        return jz5.f0.f384359a;
    }
}
