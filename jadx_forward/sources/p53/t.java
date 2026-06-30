package p53;

/* loaded from: classes5.dex */
public class t implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        a43.k kVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        synchronized (a43.k.class) {
            if (a43.k.f82755c == null) {
                a43.k.f82755c = new a43.k();
            }
            kVar = a43.k.f82755c;
        }
        kVar.a(bundle.getString("url"), bundle.getString("savePath"), 0, new p53.s(this, rVar));
    }
}
