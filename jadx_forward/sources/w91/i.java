package w91;

/* loaded from: classes13.dex */
public class i implements w91.d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f525601a;

    public i(boolean z17) {
        this.f525601a = z17;
    }

    @Override // w91.d
    public java.lang.String a() {
        return this.f525601a ? "M-SEARCH * HTTP/1.1\r\nST:ssdp:all\r\nHOST: [FF0x::C]:1900\r\nMX: 3\r\nMAN: \"ssdp:discover\"\r\n\r\n" : "M-SEARCH * HTTP/1.1\r\nST:ssdp:all\r\nHOST: 239.255.255.250:1900\r\nMX: 3\r\nMAN: \"ssdp:discover\"\r\n\r\n";
    }
}
