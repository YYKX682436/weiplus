package rc5;

/* loaded from: classes11.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final android.content.BroadcastReceiver f475730a = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.ui.chatting.half.HalfScreenChattingStarter$msgReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
            bm5.f1.a();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6 c4678x1d1a4af6 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495;
            c4678x1d1a4af6.mo40975xf7b3660d();
            intent.toString();
            android.content.Intent intent2 = (android.content.Intent) intent.getParcelableExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
            if (c4678x1d1a4af6.mo40975xf7b3660d()) {
                android.content.BroadcastReceiver broadcastReceiver = rc5.z.f475730a;
                if (intent2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfScreenChattingStarter", "startHalfScreenAct err extraData is null");
                    return;
                }
                intent2.setExtrasClassLoader(rc5.z.class.getClassLoader());
                java.lang.String stringExtra = intent2.getStringExtra("Chat_User");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b : "", stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HalfScreenChattingStarter", "curTalker is same, do nothing");
                    return;
                }
                android.content.Context n17 = com.p314xaae8f345.mm.app.w.f135406r.n();
                if (n17 == null) {
                    return;
                }
                ((rb5.m) ((wn.o) i95.n0.c(wn.p.f528912a.getClass()))).Di(n17, stringExtra, intent2);
            }
        }
    };
}
