package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

/* loaded from: classes2.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w f204938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f204939b;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w wVar, long j17) {
        this.f204938a = wVar;
        this.f204939b = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w wVar = this.f204938a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var = wVar.f205982f;
            if (b0Var != null) {
                java.util.LinkedList m75941xfb821914 = ((r45.uo2) fVar.f152151d).m75941xfb821914(1);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLoadSearch] list size=");
                sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
                sb6.append(" queryTime=");
                long j17 = this.f204939b;
                sb6.append(j17);
                sb6.append(", lastQueryTime=");
                sb6.append(b0Var.f204858s);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfilePoiListView", sb6.toString());
                if (j17 > b0Var.f204858s) {
                    b0Var.f204858s = j17;
                    if (m75941xfb821914 != null) {
                        java.util.LinkedList linkedList = b0Var.f204851i;
                        boolean isEmpty = linkedList.isEmpty();
                        java.util.LinkedList linkedList2 = b0Var.f204850h;
                        if (isEmpty) {
                            linkedList.addAll(linkedList2);
                        }
                        linkedList2.clear();
                        linkedList2.addAll(m75941xfb821914);
                        b0Var.c(linkedList2.size());
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.z zVar = b0Var.f204852m;
                        if (zVar == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                            throw null;
                        }
                        zVar.m8146xced61ae5();
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.UserPoiHandler", "[requestPoiSearch] poi_list size=" + ((r45.uo2) fVar.f152151d).m75941xfb821914(1).size());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.UserPoiHandler", "[requestPoiSearch] errType=" + fVar.f152148a + " errCode=" + fVar.f152149b + " errMsg=" + fVar.f152150c);
        }
        if (wVar.f205985i != 0) {
            wVar.f(true);
        }
        return jz5.f0.f384359a;
    }
}
