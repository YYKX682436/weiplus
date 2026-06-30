package com.p314xaae8f345.p542x3306d5.stn;

/* renamed from: com.tencent.mars.stn.ErrCmdType */
/* loaded from: classes6.dex */
public enum EnumC4591xb875d68f {
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


    /* renamed from: value */
    protected final int f19564x6ac9171;

    EnumC4591xb875d68f(int i17) {
        this.f19564x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.stn.EnumC4591xb875d68f m40429x382ad972(int i17) {
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

    /* renamed from: getValue */
    public int m40432x754a37bb() {
        return this.f19564x6ac9171;
    }
}
