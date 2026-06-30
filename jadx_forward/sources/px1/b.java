package px1;

/* loaded from: classes12.dex */
public class b extends px1.e<java.lang.Boolean, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1342x688f269.C13159x75d53f8f> {
    @Override // px1.u
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a, java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        nx1.p pVar = new nx1.p(c13158x154ec45a);
        int i17 = pVar.a() ? 18 : 34;
        android.text.Editable text = c13158x154ec45a.getText();
        java.util.Iterator it = d(text, pVar, px1.r.SPAN_FLAGS).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1342x688f269.C13159x75d53f8f c13159x75d53f8f = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1342x688f269.C13159x75d53f8f) next;
            c13159x75d53f8f.getClass();
            boolean equals = java.lang.Boolean.TRUE.equals(bool);
            int spanStart = text.getSpanStart(next);
            int i18 = pVar.f422848d;
            if (spanStart < i18) {
                if (equals) {
                    pVar.f422848d = java.lang.Math.max(0, i18 - (i18 - spanStart));
                    pVar.f422849e += 0;
                    i17 = 34;
                } else {
                    c13159x75d53f8f.getClass();
                    text.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1342x688f269.C13159x75d53f8f(), spanStart, pVar.f422848d, 33);
                }
            }
            int spanEnd = text.getSpanEnd(next);
            int i19 = pVar.f422849e;
            if (spanEnd > i19) {
                if (equals) {
                    pVar.f422848d = java.lang.Math.max(0, pVar.f422848d - 0);
                    pVar.f422849e += spanEnd - i19;
                } else {
                    c13159x75d53f8f.getClass();
                    text.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1342x688f269.C13159x75d53f8f(), pVar.f422849e, spanEnd, 34);
                }
            }
            text.removeSpan(next);
        }
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        text.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1342x688f269.C13159x75d53f8f(), pVar.f422848d, pVar.f422849e, i17);
    }

    @Override // px1.u
    public int b() {
        return 0;
    }
}
