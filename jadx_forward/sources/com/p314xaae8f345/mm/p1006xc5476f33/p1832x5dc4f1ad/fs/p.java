package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s f229522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar) {
        super(0);
        this.f229522d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : this.f229522d.f229529c.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a) entry.getValue()).f229479c != null) {
                linkedList.add(str);
            }
        }
        return linkedList;
    }
}
