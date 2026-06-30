package sy;

@j95.b
/* loaded from: classes5.dex */
public final class z extends i95.w implements ty.j0 {
    public void Ai(java.lang.String talkerName, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerName, "talkerName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HalfScreenChattingService", "startHalfChatting inner called with: talkerName = ".concat(talkerName));
        if (r26.n0.N(talkerName)) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.Intent.ACTION_HALF_SCREEN_CHATTING");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("Chat_User", talkerName);
        intent2.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        intent2.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, intent);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent2);
    }

    public void wi(android.content.Context activity, java.lang.String talkerName, android.content.Intent extraData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerName, "talkerName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        extraData.putExtra("Chat_User", talkerName);
        if (!extraData.hasExtra("Chat_BackBtnStyle")) {
            extraData.putExtra("Chat_BackBtnStyle", 1);
        }
        ((rb5.m) ((wn.o) i95.n0.c(wn.o.class))).Di(activity, talkerName, extraData);
    }
}
