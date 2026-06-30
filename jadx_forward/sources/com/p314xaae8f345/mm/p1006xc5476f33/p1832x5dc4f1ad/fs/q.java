package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s f229523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar, java.lang.String str) {
        super(0);
        this.f229523d = sVar;
        this.f229524e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar = this.f229523d;
        sVar.getClass();
        java.lang.String str = this.f229524e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8(str);
        if (!y8Var.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushPkgMergeDirReader", "guardedMergeModule readInfo file, customName:" + sVar.f229527a + ", pkgPath:" + str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.o(sVar);
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 c11663x8e8dee46 : y8Var.j()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = sVar.f229529c;
            java.lang.String fileName = c11663x8e8dee46.f156922e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fileName, "fileName");
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a();
            aVar.f229477a = y8Var;
            aVar.f229478b = y8Var.b();
            aVar.f229479c = c11663x8e8dee46.f156922e;
            aVar.f229480d = c11663x8e8dee46.f156923f;
            aVar.f229481e = c11663x8e8dee46.f156924g;
            oVar.mo146xb9724478(aVar);
            concurrentHashMap.put(fileName, aVar);
        }
        return jz5.f0.f384359a;
    }
}
