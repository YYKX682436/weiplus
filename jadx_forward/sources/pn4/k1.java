package pn4;

/* loaded from: classes4.dex */
public final class k1 extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d, reason: collision with root package name */
    public static int f438671d;

    public final void N6(int i17, java.lang.String targetLan, java.lang.String chatRoomId, java.lang.String prefixContent, int i18, java.lang.String textMsg) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetLan, "targetLan");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomId, "chatRoomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefixContent, "prefixContent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textMsg, "textMsg");
        if ((textMsg.length() == 0) || (c20976x6ba6452a = gm0.j1.b().f354778h.f354678e) == null) {
            return;
        }
        v65.i.b(c20976x6ba6452a, null, new pn4.j1(targetLan, chatRoomId, i17, prefixContent, i18, textMsg, this, null), 1, null);
    }
}
