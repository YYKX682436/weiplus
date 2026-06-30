package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s f229519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar, java.lang.String str) {
        super(0);
        this.f229519d = sVar;
        this.f229520e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar = this.f229519d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sVar.f229529c;
        java.lang.String str = this.f229520e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a) concurrentHashMap.get(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = aVar != null ? aVar.f229477a : null;
        if (y8Var != null) {
            return y8Var;
        }
        for (java.util.Map.Entry entry : sVar.f229529c.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a aVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a) entry.getValue();
            if (r26.i0.A(str2, str, false, 2, null)) {
                return aVar2.f229477a;
            }
        }
        return null;
    }
}
