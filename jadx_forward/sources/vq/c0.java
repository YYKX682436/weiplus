package vq;

/* loaded from: classes9.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520673d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520673d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor mo78085xb5882a6b = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo78085xb5882a6b();
        if (mo78085xb5882a6b != null) {
            while (mo78085xb5882a6b.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                c21053xdbf1e5f4.mo9015xbf5d97fd(mo78085xb5882a6b);
                arrayList.add(c21053xdbf1e5f4);
            }
            mo78085xb5882a6b.close();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (n22.m.p((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) next)) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it6.next();
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) next2;
                if ((n22.m.p(c21053xdbf1e5f42) || n22.m.k(c21053xdbf1e5f42)) ? false : true) {
                    arrayList3.add(next2);
                }
            }
            com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f520673d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(emojiDebugUI.d, "add emoji, " + arrayList.size());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add emoji, custom ");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                java.lang.Object next3 = it7.next();
                int i17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) next3).f68653x95b20dd4;
                l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
                if (i17 == 81) {
                    arrayList4.add(next3);
                }
            }
            sb6.append(arrayList4.size());
            sb6.append(' ');
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = emojiDebugUI.d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("add emoji, non store custom ");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                java.lang.Object next4 = it8.next();
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f43 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) next4;
                if ((n22.m.p(c21053xdbf1e5f43) || n22.m.k(c21053xdbf1e5f43)) ? false : true) {
                    arrayList5.add(next4);
                }
            }
            sb8.append(arrayList5.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                java.lang.Object next5 = it9.next();
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f44 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) next5;
                if ((n22.m.p(c21053xdbf1e5f44) || n22.m.k(c21053xdbf1e5f44) || !(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f44.f68654xf47770e7) ^ true)) ? false : true) {
                    arrayList6.add(next5);
                }
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.Iterator it10 = arrayList6.iterator();
            while (it10.hasNext()) {
                arrayList7.add(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) it10.next()).mo42933xb5885648());
            }
            java.util.Collections.shuffle(arrayList7);
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            pm0.v.L("EmojiDebugUI_addEmoji", true, new vq.n(arrayList7, emojiDebugUI, new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), c0Var, new java.lang.Object(), new p3321xbce91901.jvm.p3324x21ffc6bd.f0(), com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(emojiDebugUI, emojiDebugUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0d), true, 0, new vq.q(c0Var))));
        }
        return jz5.f0.f384359a;
    }
}
