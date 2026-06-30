package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class w implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.y f243871a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.y yVar) {
        this.f243871a = yVar;
    }

    @Override // bb5.e
    public int a() {
        return this.f243871a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.y yVar = this.f243871a;
            if (i17 < yVar.getCount()) {
                c34.r rVar = (c34.r) yVar.getItem(i17);
                if (rVar == null) {
                    return null;
                }
                return rVar.f66444xdec927b;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeFriendAdapter", "pos is invalid");
        return null;
    }
}
