package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class m2 {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f72083b = kk.u.d(7);

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.network.p0 f72084a;

    public void a(int i17, byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNotify, datalen=");
        sb6.append(bArr == null ? 0 : bArr.length);
        sb6.append(" cmd= ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", sb6.toString());
        switch (i17) {
            case 5:
                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "old notify");
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 138, f72083b);
                return;
            case 8:
                if (bArr.length > 0) {
                    ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 10, bArr);
                    return;
                }
                return;
            case 24:
                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush new notify [%s]", com.tencent.mm.sdk.platformtools.t8.j(bArr));
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 138, bArr);
                return;
            case 39:
                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do synccheck");
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 39, null);
                return;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 174, bArr);
                return;
            case 120:
                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "MM_PKT_VOIP_REQ");
                if (bArr.length > 0) {
                    ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 120, bArr);
                    return;
                }
                return;
            case 122:
                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush MM_PKT_PUSH_DATA_REQ");
                if (bArr.length > 0) {
                    ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 268369921, bArr);
                    return;
                }
                return;
            case 192:
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 192, bArr);
                return;
            case 241:
                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "jacks do voice notify PUSH");
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 241, bArr);
                return;
            case 244:
                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "pandy do gamesync notify");
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 244, bArr);
                return;
            case zc1.b.CTRL_INDEX /* 271 */:
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", zc1.b.CTRL_INDEX, bArr);
                return;
            case 311:
                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "on notify F2F data");
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 311, bArr);
                return;
            case 3941:
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 3941, bArr);
                return;
            case 6238:
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 6238, bArr);
                return;
            case 10098:
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 10098, bArr);
                return;
            case 268369923:
                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do oob do notify");
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 268369923, bArr);
                return;
            case 1000000205:
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 1000000205, bArr);
                return;
            case 1000000637:
                if (bArr.length > 0) {
                    ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 100017, bArr);
                    return;
                }
                return;
            case 1000000800:
                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 1000000800, bArr);
                return;
            default:
                switch (i17) {
                    case qf1.f.CTRL_INDEX /* 318 */:
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on silence notify");
                        ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", qf1.f.CTRL_INDEX, bArr);
                        return;
                    case 319:
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify");
                        ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 319, bArr);
                        return;
                    case com.tencent.mapsdk.internal.km.f50100e /* 320 */:
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify ACTION_EVENT");
                        ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", com.tencent.mapsdk.internal.km.f50100e, bArr);
                        return;
                    case 321:
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify encryted ACTION_EVENT");
                        ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 321, bArr);
                        return;
                    case 322:
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify ACTION_EVENT_FINDER_REDDOT");
                        ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 322, bArr);
                        return;
                    case com.tencent.mm.plugin.appbrand.jsapi.xe.CTRL_INDEX /* 323 */:
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify ACTION_EVENT_NEWLIFE_REDDOT");
                        ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", com.tencent.mm.plugin.appbrand.jsapi.xe.CTRL_INDEX, bArr);
                        return;
                    default:
                        switch (i17) {
                            case 326:
                                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify ACTION_EVENT_LISTEN_REDDOT");
                                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 326, bArr);
                                return;
                            case 327:
                                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify BIZAPPMSG REDDOT");
                                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 327, bArr);
                                return;
                            case 328:
                                com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify MM_PKT_BYP_NOTIFY_ACTION_COMMON_BIZ");
                                ((com.tencent.mm.booter.CoreService) this.f72084a).e(0, 0, "", 328, bArr);
                                return;
                            default:
                                return;
                        }
                }
        }
    }
}
