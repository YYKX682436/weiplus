package com.tencent.mm.network;

/* loaded from: classes12.dex */
public interface z0 extends android.os.IInterface {
    com.tencent.mm.network.ReqInfo Ag(int i17);

    void Bg(com.tencent.mm.network.k0 k0Var, int i17, int i18);

    com.tencent.mm.network.BufToRespRes Cc(int i17, byte[] bArr);

    void G2(com.tencent.mm.network.k0 k0Var, int i17, int i18, java.lang.String str);

    com.tencent.mm.network.ReqInfo Qc();

    void Re(com.tencent.mm.network.r rVar, com.tencent.mm.network.k0 k0Var, int i17, int i18);

    void S6(int i17);

    int Zc();

    com.tencent.mm.network.ReqToBufRes g9(int i17, byte[] bArr, java.lang.String str, int i18, int i19, int i27, int i28, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i29, boolean z17, byte[] bArr5, boolean z18, int i37, boolean z19, boolean z27, boolean z28);

    int getNewExtFlags();

    o45.hg getReqObj();

    o45.kg getRespObj();

    byte[] getTransHeader();

    int getType();

    java.lang.String getUri();

    boolean isSingleSession();

    int o2();

    com.tencent.mm.network.RespInfo of(byte[] bArr);

    java.lang.String s7();

    void setEncryptAlgo(int i17);

    void setReqHost(java.lang.String str);

    void setSingleSession(boolean z17);

    java.lang.String vh();

    void wa(java.util.Map map);
}
