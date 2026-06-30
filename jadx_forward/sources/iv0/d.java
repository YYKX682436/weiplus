package iv0;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv0.w f376596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(iv0.w wVar) {
        super(2);
        this.f376596d = wVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mv0.b bVar;
        int intValue = ((java.lang.Number) obj).intValue();
        mv0.a data = (mv0.a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        iv0.w wVar = this.f376596d;
        iv0.c cVar = (iv0.c) wVar.f150773i;
        if (cVar != null) {
            iv0.b bVar2 = wVar.f376626q;
            bVar2.getClass();
            java.util.ArrayList arrayList = bVar2.f357503d;
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((mv0.a) it.next()).f413062c) {
                    break;
                }
                i17++;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue2 = valueOf.intValue();
                java.lang.Object remove = arrayList.remove(intValue2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
                arrayList.add(intValue2, mv0.a.a((mv0.a) remove, null, 0, false, 3, null));
                bVar2.m8147xed6e4d18(intValue2);
            }
            arrayList.remove(intValue);
            arrayList.add(intValue, mv0.a.a(data, null, 0, true, 3, null));
            bVar2.m8147xed6e4d18(intValue);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar2 = data.f413060a.f413063a;
            ex0.a0 a0Var = wVar.p7().f358175r;
            if (cVar2 != ((a0Var == null || (bVar = a0Var.f338636m) == null) ? null : bVar.f413063a)) {
                pf5.e.m158344xbe96bc24(wVar, null, null, new iv0.q(wVar, data, cVar, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
