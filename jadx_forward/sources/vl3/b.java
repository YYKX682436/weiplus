package vl3;

/* loaded from: classes13.dex */
public class b implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25397x444b4112 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f519415a = new java.util.concurrent.ConcurrentHashMap();

    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d("MicroMsg.MMMediaHTTPService", "setReferrer, originUrl: " + str + ", referrer: " + str2);
        if (str2 == null) {
            str2 = "";
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f519415a).put(str, str2);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25397x444b4112
    /* renamed from: makeHTTPConnection */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 mo94097x1dba5ef4() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.MMMediaHTTPService", "makeHTTPConnection");
        return new vl3.a(java.util.Collections.unmodifiableMap(this.f519415a));
    }
}
