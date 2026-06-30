package kk1;

/* loaded from: classes12.dex */
public class b implements android.text.Html.TagHandler {

    /* renamed from: a, reason: collision with root package name */
    public final kk1.c f390012a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f390013b;

    public b(kk1.c cVar, boolean z17) {
        this.f390012a = cVar;
        this.f390013b = z17;
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z17, java.lang.String str, android.text.Editable editable, org.xml.sax.XMLReader xMLReader) {
        if ("a".equalsIgnoreCase(str)) {
            boolean z18 = this.f390013b;
            kk1.c cVar = this.f390012a;
            if (z17) {
                int length = editable.length();
                editable.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p1213x3107ab.C12736x29c08888("", cVar, z18), length, length, 17);
                return;
            }
            int length2 = editable.length();
            java.lang.Object[] spans = editable.getSpans(0, editable.length(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p1213x3107ab.C12736x29c08888.class);
            java.lang.Object obj = null;
            if (spans.length != 0) {
                int length3 = spans.length;
                while (true) {
                    if (length3 <= 0) {
                        break;
                    }
                    length3--;
                    if (editable.getSpanFlags(spans[length3]) == 17) {
                        obj = spans[length3];
                        break;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p1213x3107ab.C12736x29c08888 c12736x29c08888 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p1213x3107ab.C12736x29c08888) obj;
            int spanStart = editable.getSpanStart(c12736x29c08888);
            java.lang.String charSequence = editable.subSequence(spanStart, length2).toString();
            editable.removeSpan(c12736x29c08888);
            if (spanStart != length2) {
                editable.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p1213x3107ab.C12736x29c08888(charSequence, cVar, z18), spanStart, length2, 33);
            }
        }
    }
}
