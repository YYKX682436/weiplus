package com.tencent.mars.stn;

/* loaded from: classes6.dex */
public enum ErrCmdType {
    kEctOK(0),
    kEctFalse(1),
    kEctDial(2),
    kEctDns(3),
    kEctSocket(4),
    kEctHttp(5),
    kEctNetMsgXP(6),
    kEctEnDecode(7),
    kEctServer(8),
    kEctLocal(9),
    kEctCanceld(10);

    protected final int value;

    ErrCmdType(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.stn.ErrCmdType forNumber(int i17) {
        switch (i17) {
            case 0:
                return kEctOK;
            case 1:
                return kEctFalse;
            case 2:
                return kEctDial;
            case 3:
                return kEctDns;
            case 4:
                return kEctSocket;
            case 5:
                return kEctHttp;
            case 6:
                return kEctNetMsgXP;
            case 7:
                return kEctEnDecode;
            case 8:
                return kEctServer;
            case 9:
                return kEctLocal;
            case 10:
                return kEctCanceld;
            default:
                return kEctOK;
        }
    }

    public int getValue() {
        return this.value;
    }
}
