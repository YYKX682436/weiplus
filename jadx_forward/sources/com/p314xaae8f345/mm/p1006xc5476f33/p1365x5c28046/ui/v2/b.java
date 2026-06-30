package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes15.dex */
public class b extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 f179884a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 abstractC13342x6ac9a618) {
        this.f179884a = abstractC13342x6ac9a618;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        java.lang.String string;
        java.lang.String string2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 abstractC13342x6ac9a618 = this.f179884a;
        abstractC13342x6ac9a618.getClass();
        switch (message.what) {
            case 131074:
                j12.b bVar = abstractC13342x6ac9a618.f179779u;
                if (bVar == null) {
                    return;
                }
                bVar.notifyDataSetChanged();
                return;
            case 131075:
                if (abstractC13342x6ac9a618.f179779u == null || message.getData() == null || (string = message.getData().getString("product_id")) == null) {
                    return;
                }
                abstractC13342x6ac9a618.f179779u.r(string, message.getData().getInt("progress"));
                return;
            case 131076:
                if (abstractC13342x6ac9a618.f179779u == null || message.getData() == null || (string2 = message.getData().getString("product_id")) == null) {
                    return;
                }
                abstractC13342x6ac9a618.f179779u.s(string2, message.getData().getInt("status"));
                return;
            case 131077:
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49 c13370x510fae49 = abstractC13342x6ac9a618.f179769h;
                if (c13370x510fae49 != null) {
                    c13370x510fae49.c();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
