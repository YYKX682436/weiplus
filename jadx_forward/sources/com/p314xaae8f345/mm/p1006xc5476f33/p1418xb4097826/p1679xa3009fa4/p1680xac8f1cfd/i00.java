package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public abstract class i00 {
    public static final java.lang.String a(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null) {
            return "null";
        }
        if (fVar instanceof bw5.gg) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{FinderGetOftenReadAuthorReq with finderUsername=");
            bw5.gg ggVar = (bw5.gg) fVar;
            boolean[] zArr = ggVar.f109372i;
            sb6.append(zArr[3] ? ggVar.f109368e : "");
            sb6.append(", lastBuffer=");
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = zArr[6] ? ggVar.f109371h : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
            sb6.append(gVar != null ? gVar.f273689a.length : -1);
            sb6.append(" bytes, location=(");
            sb6.append(ggVar.f109369f);
            sb6.append(", ");
            sb6.append(ggVar.f109370g);
            sb6.append(") }");
            return sb6.toString();
        }
        if (!(fVar instanceof bw5.ig)) {
            java.lang.String jSONObject = pm0.b0.g(fVar).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("{FinderGetOftenReadAuthorResp with ");
        bw5.ig igVar = (bw5.ig) fVar;
        java.util.LinkedList linkedList = igVar.f110104d;
        sb7.append(linkedList.size());
        sb7.append(" items [");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            bw5.ae b17 = ((bw5.hg) it.next()).b();
            arrayList.add(b17.Z[2] ? b17.f106678e : "");
        }
        sb7.append(arrayList);
        sb7.append("], continueFlag=");
        sb7.append(igVar.f110105e);
        sb7.append(", lastBuffer=");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m12152x44e5026c = igVar.m12152x44e5026c();
        sb7.append(m12152x44e5026c != null ? m12152x44e5026c.f273689a.length : -1);
        sb7.append(" bytes, fromSessionId=");
        sb7.append((igVar.f110109i[5] ? igVar.f110107g : "").length());
        sb7.append(" }");
        return sb7.toString();
    }
}
