package vj0;

/* loaded from: classes11.dex */
public final class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f519179d;

    public f(yz5.l lVar) {
        this.f519179d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            java.lang.String string = bundle.getString("BUNDLE_KEY_LAST_INFO");
            if (!(string == null || string.length() == 0)) {
                vj0.i iVar = vj0.i.f519182a;
                w15.a aVar = new w15.a();
                vj0.i.f519183b = aVar;
                aVar.m126728xdc93280d(string);
            }
            this.f519179d.mo146xb9724478(bundle);
        }
    }
}
