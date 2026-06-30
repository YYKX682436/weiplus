package po1;

/* loaded from: classes5.dex */
public final class a implements android.os.Parcelable.Creator {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i affRange) {
        jz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(affRange, "affRange");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m mVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m) affRange.f297374d.get(0);
        if (mVar.f297433f.size() > 0) {
            java.util.LinkedList linkedList = mVar.f297433f;
            lVar = new jz5.l(java.lang.Long.valueOf(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l) linkedList.get(0)).f297417d), java.lang.Long.valueOf(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l) linkedList.get(0)).f297418e));
        } else {
            lVar = new jz5.l(0L, 0L);
        }
        long longValue = ((java.lang.Number) lVar.f384366d).longValue();
        long longValue2 = ((java.lang.Number) lVar.f384367e).longValue();
        if (mVar.f297431d.f297410e.contains(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j.kAll)) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k kVar = mVar.f297432e;
            return (kVar == null || !kVar.f297410e.contains(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j.kFoldChatRoom)) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9(po1.b.f438822d, null, null, longValue, longValue2, 6, null) : new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9(po1.b.f438824f, null, null, longValue, longValue2, 6, null);
        }
        po1.b bVar = po1.b.f438823e;
        java.util.LinkedList linkedList2 = mVar.f297431d.f297411f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList2, "getInSpecialLabel(...)");
        java.util.List V0 = kz5.n0.V0(linkedList2);
        java.util.LinkedList linkedList3 = mVar.f297431d.f297409d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList3, "getIsExactUsername(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9(bVar, V0, kz5.n0.V0(linkedList3), longValue, longValue2);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0 || readInt >= ((kz5.b) po1.b.f438826h).d()) {
            po1.b bVar = po1.b.f438822d;
            readInt = 0;
        }
        po1.b bVar2 = (po1.b) ((rz5.c) po1.b.f438826h).get(readInt);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            for (java.lang.String str : r26.n0.e0(readString, new char[]{','}, false, 0, 6, null)) {
                java.lang.Integer valueOf = str.length() > 0 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)) : null;
                if (valueOf != null) {
                    arrayList.add(valueOf);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        parcel.readStringList(arrayList2);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9(bVar2, arrayList, arrayList2, parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9[i17];
    }
}
