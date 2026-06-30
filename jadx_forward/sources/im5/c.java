package im5;

/* loaded from: classes7.dex */
public class c implements im5.b, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f374245d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f374246e = true;

    @Override // im5.a
    /* renamed from: dead */
    public synchronized void mo10668x2efc64() {
        if (this.f374246e) {
            java.util.Iterator it = ((java.util.ArrayList) this.f374245d).iterator();
            while (it.hasNext()) {
                im5.a aVar = (im5.a) ((java.lang.ref.WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.mo10668x2efc64();
                }
            }
            ((java.util.ArrayList) this.f374245d).clear();
            this.f374246e = false;
        }
    }

    @Override // im5.b
    /* renamed from: keep */
    public synchronized void mo46316x322b85(im5.a aVar) {
        if (!this.f374246e) {
            iz5.a.d(null, aVar);
            aVar.mo10668x2efc64();
        } else {
            ((java.util.ArrayList) this.f374245d).add(new java.lang.ref.WeakReference(aVar));
        }
    }
}
