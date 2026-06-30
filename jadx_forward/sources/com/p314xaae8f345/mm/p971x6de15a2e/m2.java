package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class m2 {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f153616b = kk.u.d(7);

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.p0 f153617a;

    public void a(int i17, byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNotify, datalen=");
        sb6.append(bArr == null ? 0 : bArr.length);
        sb6.append(" cmd= ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", sb6.toString());
        switch (i17) {
            case 5:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "old notify");
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 138, f153616b);
                return;
            case 8:
                if (bArr.length > 0) {
                    ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 10, bArr);
                    return;
                }
                return;
            case 24:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush new notify [%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr));
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 138, bArr);
                return;
            case 39:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do synccheck");
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 39, null);
                return;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 174, bArr);
                return;
            case 120:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "MM_PKT_VOIP_REQ");
                if (bArr.length > 0) {
                    ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 120, bArr);
                    return;
                }
                return;
            case 122:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush MM_PKT_PUSH_DATA_REQ");
                if (bArr.length > 0) {
                    ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 268369921, bArr);
                    return;
                }
                return;
            case 192:
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 192, bArr);
                return;
            case 241:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "jacks do voice notify PUSH");
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 241, bArr);
                return;
            case 244:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "pandy do gamesync notify");
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 244, bArr);
                return;
            case zc1.b.f77555x366c91de /* 271 */:
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", zc1.b.f77555x366c91de, bArr);
                return;
            case 311:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "on notify F2F data");
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 311, bArr);
                return;
            case 3941:
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 3941, bArr);
                return;
            case 6238:
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 6238, bArr);
                return;
            case 10098:
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 10098, bArr);
                return;
            case 268369923:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do oob do notify");
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 268369923, bArr);
                return;
            case 1000000205:
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 1000000205, bArr);
                return;
            case 1000000637:
                if (bArr.length > 0) {
                    ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 100017, bArr);
                    return;
                }
                return;
            case 1000000800:
                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 1000000800, bArr);
                return;
            default:
                switch (i17) {
                    case qf1.f.f76475x366c91de /* 318 */:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on silence notify");
                        ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", qf1.f.f76475x366c91de, bArr);
                        return;
                    case 319:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify");
                        ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 319, bArr);
                        return;
                    case com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e /* 320 */:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify ACTION_EVENT");
                        ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, bArr);
                        return;
                    case 321:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify encryted ACTION_EVENT");
                        ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 321, bArr);
                        return;
                    case 322:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify ACTION_EVENT_FINDER_REDDOT");
                        ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 322, bArr);
                        return;
                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xe.f35014x366c91de /* 323 */:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify ACTION_EVENT_NEWLIFE_REDDOT");
                        ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xe.f35014x366c91de, bArr);
                        return;
                    default:
                        switch (i17) {
                            case 326:
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify ACTION_EVENT_LISTEN_REDDOT");
                                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 326, bArr);
                                return;
                            case 327:
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify BIZAPPMSG REDDOT");
                                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 327, bArr);
                                return;
                            case 328:
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify MM_PKT_BYP_NOTIFY_ACTION_COMMON_BIZ");
                                ((com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6) this.f153617a).e(0, 0, "", 328, bArr);
                                return;
                            default:
                                return;
                        }
                }
        }
    }
}
