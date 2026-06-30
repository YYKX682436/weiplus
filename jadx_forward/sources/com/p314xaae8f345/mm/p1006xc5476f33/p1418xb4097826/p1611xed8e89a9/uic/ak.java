package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes.dex */
public final class ak extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f205077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(java.util.List list) {
        super(1);
        this.f205077d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        so2.j5 feed = (so2.j5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        java.util.Iterator it = this.f205077d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it.next()).mo2128x1ed62e84() == feed.mo2128x1ed62e84()) {
                break;
            }
            i17++;
        }
        return java.lang.Boolean.valueOf(i17 >= 0);
    }
}
