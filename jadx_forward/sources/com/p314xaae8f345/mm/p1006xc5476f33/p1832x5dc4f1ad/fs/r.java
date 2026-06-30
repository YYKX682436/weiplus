package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s f229525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar, java.lang.String str) {
        super(0);
        this.f229525d = sVar;
        this.f229526e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar = this.f229525d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sVar.f229529c;
        java.lang.String str = this.f229526e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a) concurrentHashMap.get(str);
        if (aVar != null) {
            return aVar;
        }
        java.lang.String[] strArr = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.i(str)};
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a aVar2 = null;
        for (int i17 = 0; i17 < 2; i17++) {
            java.lang.String str2 = strArr[i17];
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str) && (aVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a) sVar.f229529c.get(str2)) != null) {
                break;
            }
        }
        return aVar2;
    }
}
