package c43;

/* loaded from: classes8.dex */
public class s0 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f38476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.x f38477e;

    public s0(c43.x xVar, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.f38477e = xVar;
        this.f38476d = jumpInfo;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onDoubleTap(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c43.s0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo;
        c43.x xVar = this.f38477e;
        if (xVar.M != null && !xVar.s()) {
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = ((y33.e) xVar.M).field_jumpInfo;
            if (jumpInfo2 != null && jumpInfo2.jump_type == 1 && (jumpInfo = this.f38476d) != null && !com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo.jump_url)) {
                java.lang.String str = jumpInfo.preload_id;
                if (str == null) {
                    str = "";
                }
                if (str.equals(((y33.e) xVar.M).field_jumpInfo.preload_id)) {
                    com.tencent.mm.plugin.game.luggage.p1.a(jumpInfo.jump_url, new c43.m0(xVar, jumpInfo));
                    com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
                    long j17 = xVar.f38494i;
                    long j18 = xVar.f38493h;
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
                    fVar.g(4L, 2L, j17, j18, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0L, xVar.X);
                }
            }
            s33.y.h(xVar.f38492g, ((y33.e) xVar.M).field_jumpInfo);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = ((y33.e) xVar.M).field_jumpInfo;
            if (jumpInfo3 != null) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatItemVH", "user userdata url: %s", jumpInfo3.jump_url);
            }
            com.tencent.mm.game.report.f fVar2 = com.tencent.mm.game.report.g.f68195a;
            long j172 = xVar.f38494i;
            long j182 = xVar.f38493h;
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack2 = xVar.f38495m;
            fVar2.g(4L, 2L, j172, j182, chatroomMsgPack2.seq, chatroomMsgPack2.from_username, 0L, xVar.X);
        }
        return super.onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
