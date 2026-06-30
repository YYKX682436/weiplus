package gr;

/* loaded from: classes12.dex */
public final class o {
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a(java.util.List emojiGroupInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiGroupInfoList, "emojiGroupInfoList");
        java.util.LinkedList<gr.p> linkedList = new java.util.LinkedList();
        java.util.HashMap hashMap = new java.util.HashMap();
        s25.b Bi = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi();
        java.util.Iterator it = emojiGroupInfoList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) it.next();
            java.lang.String str = c21051xbc71d247.f68380x29449433;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 k17 = Bi.k(str);
            if (k17 == null) {
                gr.p pVar = new gr.p(null);
                pVar.f356208b.add(c21051xbc71d247);
                linkedList.add(pVar);
            } else {
                gr.p pVar2 = (gr.p) hashMap.get(str);
                if (pVar2 == null) {
                    pVar2 = new gr.p(k17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    hashMap.put(str, pVar2);
                    linkedList.add(pVar2);
                }
                pVar2.f356208b.add(c21051xbc71d247);
            }
        }
        for (gr.p pVar3 : linkedList) {
            if (pVar3.f356208b.size() == 1) {
                pVar3.f356207a = null;
            }
        }
        return linkedList;
    }
}
