package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class mf implements com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f131950a;

    private mf(boolean z17) {
        this.f131950a = z17;
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mf a(boolean z17) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mf(z17);
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3
    /* renamed from: onRequest */
    public final void mo36059x90f4f3b0(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        if (this.f131950a) {
            java.lang.String str = c4329xa3f02252.url;
            if (str.startsWith("http://")) {
                str = str.replaceFirst("http://", "https://");
            }
            c4329xa3f02252.url = str;
        }
    }
}
