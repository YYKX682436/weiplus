package oz4;

/* loaded from: classes12.dex */
public class f extends oz4.e<java.lang.Boolean, com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2450x688f269.C19517x8b6eadfe> {
    @Override // oz4.v
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a, java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        mz4.t tVar = new mz4.t(c19515x154ec45a);
        int i17 = tVar.a() ? 18 : 34;
        android.text.Editable text = c19515x154ec45a.getText();
        java.util.Iterator it = d(text, tVar, oz4.u.SPAN_FLAGS).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2450x688f269.C19517x8b6eadfe c19517x8b6eadfe = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2450x688f269.C19517x8b6eadfe) next;
            c19517x8b6eadfe.getClass();
            boolean equals = java.lang.Boolean.TRUE.equals(bool);
            int spanStart = text.getSpanStart(next);
            int i18 = tVar.f414883d;
            if (spanStart < i18) {
                if (equals) {
                    tVar.b(i18 - spanStart, 0);
                    i17 = 34;
                } else {
                    c19517x8b6eadfe.getClass();
                    text.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2450x688f269.C19517x8b6eadfe(), spanStart, tVar.f414883d, 33);
                }
            }
            int spanEnd = text.getSpanEnd(next);
            int i19 = tVar.f414884e;
            if (spanEnd > i19) {
                if (equals) {
                    tVar.b(0, spanEnd - i19);
                } else {
                    c19517x8b6eadfe.getClass();
                    text.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2450x688f269.C19517x8b6eadfe(), tVar.f414884e, spanEnd, 34);
                }
            }
            text.removeSpan(next);
        }
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        text.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2450x688f269.C19517x8b6eadfe(), tVar.f414883d, tVar.f414884e, i17);
    }

    @Override // oz4.v
    public int b() {
        return 0;
    }

    @Override // oz4.e
    public boolean f(java.lang.Object obj) {
        return obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2450x688f269.C19517x8b6eadfe;
    }
}
