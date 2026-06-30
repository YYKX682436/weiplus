package pr;

/* loaded from: classes15.dex */
public final class w implements pr.e0 {
    @Override // pr.e0
    public void a(int i17) {
        com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10444x1291fbaf c17 = pr.k0.f439256q.c(0);
        android.content.Intent intent = new android.content.Intent();
        int i18 = com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10446x2405cf9e.f146463a;
        intent.setAction("com.tencent.mm.Emoji_Update");
        intent.putExtra("type", "TYPE_UPDATE_EMOJI_SYNC");
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, c17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }
}
