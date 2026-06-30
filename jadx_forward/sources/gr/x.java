package gr;

/* loaded from: classes12.dex */
public final class x implements qr.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr.y f356232a;

    public x(gr.y yVar) {
        this.f356232a = yVar;
    }

    @Override // qr.i
    /* renamed from: onResult */
    public final void mo44657x57429edc(int i17, java.lang.String str) {
        gr.y yVar = this.f356232a;
        if (i17 == 0) {
            yVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUploadLogic", "deal success " + str);
            s25.a aVar = yVar.f356235c;
            if (str != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, yVar.f356233a.mo42933xb5885648())) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) aVar).N(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(N, "getEmojiByMd5(...)");
                yVar.f356233a = N;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = yVar.f356233a;
            ((y12.h) aVar).getClass();
            wq.a.f().d(c21053xdbf1e5f4, false);
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().i(yVar.f356233a);
            gr.w wVar = yVar.f356234b;
            if (wVar != null) {
                ((qr.f) wVar).a(0, str, yVar.f356233a.f68641x3342accf);
                return;
            }
            return;
        }
        if (i17 != 2 && i17 != 11) {
            switch (i17) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = yVar.f356233a;
                    int i18 = c21053xdbf1e5f42.f68651xd681f13a;
                    if (i18 >= 5) {
                        i17 = 9;
                        break;
                    } else {
                        c21053xdbf1e5f42.f68651xd681f13a = i18 + 1;
                        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(yVar.f356233a);
                        if (i17 != 1) {
                            i17 = 0;
                            break;
                        } else {
                            i17 = 1;
                            break;
                        }
                    }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiUploadLogic", "deal fail " + str + ", errType:" + i17);
        gr.w wVar2 = yVar.f356234b;
        if (wVar2 != null) {
            ((qr.f) wVar2).a(i17, null, null);
        }
    }
}
