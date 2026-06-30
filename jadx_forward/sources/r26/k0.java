package r26;

/* loaded from: classes10.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f450435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f450436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.util.List list, boolean z17) {
        super(2);
        this.f450435d = list;
        this.f450436e = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        jz5.l lVar;
        java.lang.Object obj4;
        java.lang.CharSequence $receiver = (java.lang.CharSequence) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g($receiver, "$this$$receiver");
        boolean z17 = this.f450436e;
        java.util.List list = this.f450435d;
        if (z17 || list.size() != 1) {
            if (intValue < 0) {
                intValue = 0;
            }
            e06.k kVar = new e06.k(intValue, $receiver.length());
            boolean z18 = $receiver instanceof java.lang.String;
            int i17 = kVar.f327744f;
            int i18 = kVar.f327743e;
            if (z18) {
                if ((i17 > 0 && intValue <= i18) || (i17 < 0 && i18 <= intValue)) {
                    while (true) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            java.lang.String str = (java.lang.String) obj4;
                            if (r26.i0.r(str, 0, (java.lang.String) $receiver, intValue, str.length(), z17)) {
                                break;
                            }
                        }
                        java.lang.String str2 = (java.lang.String) obj4;
                        if (str2 == null) {
                            if (intValue == i18) {
                                break;
                            }
                            intValue += i17;
                        } else {
                            lVar = new jz5.l(java.lang.Integer.valueOf(intValue), str2);
                            break;
                        }
                    }
                }
                lVar = null;
            } else {
                if ((i17 > 0 && intValue <= i18) || (i17 < 0 && i18 <= intValue)) {
                    int i19 = intValue;
                    while (true) {
                        java.util.Iterator it6 = list.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it6.next();
                            java.lang.String str3 = (java.lang.String) obj3;
                            if (r26.n0.U(str3, 0, $receiver, i19, str3.length(), z17)) {
                                break;
                            }
                        }
                        java.lang.String str4 = (java.lang.String) obj3;
                        if (str4 == null) {
                            if (i19 == i18) {
                                break;
                            }
                            i19 += i17;
                        } else {
                            lVar = new jz5.l(java.lang.Integer.valueOf(i19), str4);
                            break;
                        }
                    }
                }
                lVar = null;
            }
        } else {
            java.lang.String str5 = (java.lang.String) kz5.n0.y0(list);
            int L = r26.n0.L($receiver, str5, intValue, false, 4, null);
            if (L >= 0) {
                lVar = new jz5.l(java.lang.Integer.valueOf(L), str5);
            }
            lVar = null;
        }
        if (lVar == null) {
            return null;
        }
        return new jz5.l(lVar.f384366d, java.lang.Integer.valueOf(((java.lang.String) lVar.f384367e).length()));
    }
}
