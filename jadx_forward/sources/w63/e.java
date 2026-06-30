package w63;

/* loaded from: classes5.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        y63.a L0;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5758x9367a256 c5758x9367a256 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5758x9367a256) abstractC20979x809547d1;
        if (c5758x9367a256 != null) {
            am.ol olVar = c5758x9367a256.f136076g;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(olVar.f89089b) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(olVar.f89090c)) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(olVar.f89088a);
                java.lang.String str = olVar.f89089b;
                java.lang.String str2 = olVar.f89090c;
                am.pl plVar = c5758x9367a256.f136077h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NotifyGroupSolitatireInsertEventIListener", "NotifyGroupSolitatireEvent %s %s %s %s %s", valueOf, str, str2, java.lang.Long.valueOf(plVar.f89163b), java.lang.Long.valueOf(plVar.f89162a));
                int i17 = olVar.f89088a;
                if (i17 == 0 && plVar.f89162a != 0) {
                    y63.a L02 = ((t63.e) i95.n0.c(t63.e.class)).Bi().L0(olVar.f89089b, olVar.f89090c, true);
                    if (L02 != null && L02.f66137xae937411 == 0) {
                        L02.f66137xae937411 = plVar.f89162a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NotifyGroupSolitatireInsertEventIListener", "NotifyGroupSolitatireEvent username:%s key:%s msgId:%s ret:%s", olVar.f89089b, olVar.f89090c, java.lang.Long.valueOf(plVar.f89162a), java.lang.Boolean.valueOf(((t63.e) i95.n0.c(t63.e.class)).Bi().W0(L02, true)));
                    }
                } else if (i17 == 1 && plVar.f89163b != 0 && (L0 = ((t63.e) i95.n0.c(t63.e.class)).Bi().L0(olVar.f89089b, olVar.f89090c, true)) != null && L0.f66140xd09be28e == 0) {
                    L0.f66140xd09be28e = plVar.f89163b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NotifyGroupSolitatireInsertEventIListener", "NotifyGroupSolitatireEvent username:%s key:%s msgSvrId:%s ret:%s", olVar.f89089b, olVar.f89090c, java.lang.Long.valueOf(plVar.f89163b), java.lang.Boolean.valueOf(((t63.e) i95.n0.c(t63.e.class)).Bi().W0(L0, true)));
                }
            }
        }
        return true;
    }
}
