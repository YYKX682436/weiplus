package ge5;

/* loaded from: classes9.dex */
public enum a implements al5.h2 {
    TEXT_CALLBACK;

    public void a(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType, long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Li.Q0())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AAChattingHelper", "hy: not retrieving correct msg from db. try use old one. msg id: %d", java.lang.Long.valueOf(j17));
        } else if ((Li.w0() & 16) == 0) {
            ge5.d.b(charSequence, Li, 0);
        }
    }
}
