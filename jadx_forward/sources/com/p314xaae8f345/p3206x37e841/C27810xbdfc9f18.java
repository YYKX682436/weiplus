package com.p314xaae8f345.p3206x37e841;

/* renamed from: com.tencent.wxmm.v2stqos */
/* loaded from: classes13.dex */
public class C27810xbdfc9f18 {
    private static final java.lang.String TAG = "WXMM.Voip[stqos]";

    /* renamed from: cFps */
    public byte f61093x2e1586;

    /* renamed from: cHPPMaxLyr */
    public byte f61094xb2ea49e6;

    /* renamed from: cIPeriod */
    public byte f61095xd003a1a7;

    /* renamed from: cIReqFlag */
    public byte f61096x9a1efe04;

    /* renamed from: cQPmax */
    public byte f61097xad8b3862;

    /* renamed from: cQPmin */
    public byte f61098xad8b3950;

    /* renamed from: cRSLevel */
    public byte f61099xafd43c00;

    /* renamed from: cResolution */
    public byte f61100xabe4756f;

    /* renamed from: cRsvd1 */
    public byte f61101xada95abf;

    /* renamed from: cRsvd2 */
    public byte f61102xada95ac0;

    /* renamed from: cSkipFlag */
    public byte f61103xda2bd30e;

    /* renamed from: cSwitch */
    public byte f61104x9698d77;

    /* renamed from: iKbps */
    public short f61105x5eb39a3;
    public byte[] s2p = new byte[14];

    /* renamed from: parseS2PData */
    public void m120078xa8284728() {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(this.s2p);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.f61105x5eb39a3 = wrap.getShort();
        this.f61093x2e1586 = wrap.get();
        this.f61095xd003a1a7 = wrap.get();
        this.f61099xafd43c00 = wrap.get();
        this.f61098xad8b3950 = wrap.get();
        this.f61097xad8b3862 = wrap.get();
        this.f61094xb2ea49e6 = wrap.get();
        this.f61104x9698d77 = wrap.get();
        this.f61100xabe4756f = wrap.get();
        this.f61101xada95abf = wrap.get();
        this.f61102xada95ac0 = wrap.get();
        this.f61103xda2bd30e = wrap.get();
        this.f61096x9a1efe04 = wrap.get();
    }

    /* renamed from: printS2P */
    public void m120079xba7af024() {
    }
}
