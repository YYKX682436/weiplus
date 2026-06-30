package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class x8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f183134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t72.a f183135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var, t72.a aVar) {
        super(0);
        this.f183134d = y8Var;
        this.f183135e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var = this.f183134d;
        int size = y8Var.f183159e.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                break;
            }
            java.util.List list = y8Var.f183159e;
            t72.a aVar = (t72.a) list.get(i17);
            t72.a aVar2 = this.f183135e;
            if (aVar2.f68043xc8a07680 == aVar.f68043xc8a07680) {
                list.set(i17, aVar2);
                y8Var.m8146xced61ae5();
                java.lang.String str = "[updateTag] tag id = " + aVar.f68043xc8a07680 + ", tag name = " + aVar.f68044x225f1eb0;
                int i18 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopMenu", str, null);
                break;
            }
            i17++;
        }
        return jz5.f0.f384359a;
    }
}
