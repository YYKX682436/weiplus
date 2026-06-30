package nt2;

/* loaded from: classes15.dex */
public final class b implements android.os.Parcelable.Creator {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14955x327ee410 a(r45.lu2 lu2Var, int i17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14956x58c15452 c14956x58c15452 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14956x58c15452();
        c14956x58c15452.f207196d = lu2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14955x327ee410 c14955x327ee410 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14955x327ee410();
        c14955x327ee410.f207193e = c14956x58c15452;
        c14955x327ee410.f207194f = i17;
        c14955x327ee410.f207195g = b(list);
        return c14955x327ee410;
    }

    public final java.util.LinkedList b(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.lu2 lu2Var = (r45.lu2) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14956x58c15452 c14956x58c15452 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14956x58c15452();
                c14956x58c15452.f207196d = lu2Var;
                linkedList.add(c14956x58c15452);
            }
        }
        return linkedList;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14955x327ee410 c14955x327ee410 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14955x327ee410();
        c14955x327ee410.f207193e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14956x58c15452) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14956x58c15452.class.getClassLoader());
        c14955x327ee410.f207194f = parcel.readInt();
        parcel.readTypedList(c14955x327ee410.f207195g, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14956x58c15452.f36129x681a0c0c);
        return c14955x327ee410;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14955x327ee410[i17];
    }
}
