package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1;

/* loaded from: classes11.dex */
public abstract class m {
    public static java.lang.String a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("errCode:" + i17 + ", err:");
        if (i17 == 66) {
            sb6.append("create AudioTrack fail");
        } else if (i17 == 67) {
            sb6.append("decode audio fail");
        } else if (i17 == 69) {
            sb6.append("so file not found");
        } else if (i17 == 70) {
            sb6.append("create temp file fail");
        } else if (i17 == 74) {
            sb6.append("invalid seek or seek fail");
        } else if (i17 == 80) {
            sb6.append("connect network fail");
        } else if (i17 == 101) {
            sb6.append("recognition audio format error");
        } else if (i17 != 102) {
            switch (i17) {
                case 53:
                    sb6.append("file not found");
                    break;
                case 54:
                    sb6.append("file can not read");
                    break;
                case 55:
                    sb6.append("unknow format");
                    break;
                default:
                    switch (i17) {
                        case 62:
                            sb6.append("load or init native decode so fail");
                            break;
                        case 63:
                            sb6.append("get audio info fail");
                            break;
                        case 64:
                            sb6.append("invalid audio info");
                            break;
                        default:
                            switch (i17) {
                                case 500:
                                    sb6.append("error URL format");
                                    break;
                                case 501:
                                    sb6.append("error player to prepare");
                                    break;
                                case 502:
                                    sb6.append("error player to start");
                                    break;
                                case 503:
                                    sb6.append("error player to pause");
                                    break;
                                case 504:
                                    sb6.append("error player to stop");
                                    break;
                                default:
                                    switch (i17) {
                                        case 600:
                                            sb6.append("error create player fail, exceed max count audio players");
                                            break;
                                        case 601:
                                            sb6.append("error, not found audioId");
                                            break;
                                        case 602:
                                            sb6.append("error, not found param");
                                            break;
                                        case 603:
                                            sb6.append("error, ready exist audioId");
                                            break;
                                        case 604:
                                            sb6.append("error, invalid audioID");
                                            break;
                                        case 605:
                                            sb6.append("error, invalid param");
                                            break;
                                        default:
                                            switch (i17) {
                                                case 701:
                                                    sb6.append("error, invalid param");
                                                    break;
                                                case 702:
                                                    sb6.append("error, mmplayer set source occur error");
                                                    break;
                                                case 703:
                                                    sb6.append("error, mmplayer media format error");
                                                    break;
                                                case 704:
                                                    sb6.append("error, mmplayer create MediaCode error");
                                                    break;
                                                case 705:
                                                    sb6.append("error, mmplayer get audio info error");
                                                    break;
                                                case 706:
                                                    sb6.append("error, mmplayer decode error");
                                                    break;
                                                case 707:
                                                    sb6.append("error, mmplayer create audio track orror");
                                                    break;
                                                default:
                                                    sb6.append("unknow exception");
                                                    break;
                                            }
                                    }
                            }
                    }
            }
        } else {
            sb6.append("write AudioTrack data fail");
        }
        return sb6.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0037. Please report as an issue. */
    public static int b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlayerErrorHandler", "getErrCodeType, errorCode: %d", java.lang.Integer.valueOf(i17));
        if (i17 != 66 && i17 != 67 && i17 != 69 && i17 != 70 && i17 != 74) {
            if (i17 == 80) {
                return 10002;
            }
            if (i17 == 101) {
                return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261;
            }
            if (i17 != 102) {
                switch (i17) {
                    case 53:
                    case 54:
                        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6;
                    case 55:
                        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261;
                    default:
                        switch (i17) {
                            case 62:
                                break;
                            case 63:
                            case 64:
                                return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261;
                            default:
                                switch (i17) {
                                    default:
                                        switch (i17) {
                                            case 600:
                                            case 601:
                                            case 602:
                                            case 603:
                                            case 604:
                                            case 605:
                                                break;
                                            default:
                                                switch (i17) {
                                                    case 701:
                                                    case 703:
                                                    case 705:
                                                        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261;
                                                    case 702:
                                                    case 704:
                                                    case 706:
                                                    case 707:
                                                        break;
                                                    default:
                                                        return -1;
                                                }
                                        }
                                    case 500:
                                    case 501:
                                    case 502:
                                    case 503:
                                    case 504:
                                        return 10001;
                                }
                        }
                }
            }
        }
        return 10001;
    }
}
