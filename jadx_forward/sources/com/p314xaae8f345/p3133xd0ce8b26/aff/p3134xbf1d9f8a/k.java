package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes7.dex */
public class k extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f297409d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f297410e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f297411f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f297412g = new java.util.LinkedList();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k kVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k) fVar;
        return n51.f.a(this.f297409d, kVar.f297409d) && n51.f.a(this.f297410e, kVar.f297410e) && n51.f.a(this.f297411f, kVar.f297411f) && n51.f.a(this.f297412g, kVar.f297412g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j jVar;
        java.util.LinkedList linkedList = this.f297412g;
        java.util.LinkedList linkedList2 = this.f297411f;
        java.util.LinkedList linkedList3 = this.f297410e;
        java.util.LinkedList linkedList4 = this.f297409d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList4);
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            java.util.Iterator it = linkedList3.iterator();
            while (it.hasNext()) {
                linkedList5.add(java.lang.Integer.valueOf(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j) it.next()).f297406d));
            }
            fVar.g(2, 2, linkedList5);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList4) + 0;
            java.util.LinkedList linkedList6 = new java.util.LinkedList();
            java.util.Iterator it6 = linkedList3.iterator();
            while (it6.hasNext()) {
                linkedList6.add(java.lang.Integer.valueOf(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j) it6.next()).f297406d));
            }
            return g17 + b36.f.g(2, 2, linkedList6) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            linkedList4.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            linkedList.add(aVar2.k(intValue));
            return 0;
        }
        switch (aVar2.g(intValue)) {
            case 1:
                jVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j.kAll;
                break;
            case 2:
                jVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j.kFriend;
                break;
            case 3:
                jVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j.kChatRoom;
                break;
            case 4:
                jVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j.kSticky;
                break;
            case 5:
                jVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j.kStar;
                break;
            case 6:
                jVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j.kFoldChatRoom;
                break;
            case 7:
                jVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j.kFriendSnsBlack;
                break;
            default:
                jVar = null;
                break;
        }
        linkedList3.add(jVar);
        return 0;
    }
}
