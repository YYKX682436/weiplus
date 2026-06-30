package w91;

/* loaded from: classes13.dex */
public class n extends w91.f {
    public n(java.lang.String str, java.lang.String str2) {
        super(str, "");
        this.f525596a = w91.e.SUBSCRIBE;
        c("Nt", "upnp:event");
        c("Timeout", "Second-10800");
        c("Callback", "<" + str2 + ">");
    }

    @Override // w91.d
    public java.lang.String a() {
        return "";
    }

    @Override // w91.f
    public java.lang.String b() {
        return "SUBSCRIBE";
    }
}
