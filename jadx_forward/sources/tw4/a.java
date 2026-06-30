package tw4;

/* loaded from: classes8.dex */
public class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            return;
        }
        java.lang.String string = bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        java.lang.String string2 = bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        java.util.LinkedList b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.b();
        tw4.b bVar = new tw4.b();
        bVar.f504014b = string;
        try {
            bVar.f504013a = new org.json.JSONObject(string2);
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                ((sd.u0) it.next()).f488188i.c(bVar);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
